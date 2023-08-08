package test.bankaccount;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import main.bankaccount.BankAccount;
import main.bankaccount.Person;

public class BankAccountTest {

	/**
	 * Test if bank account is not overdrawn. 
	 */
	@RepeatedTest(5)
	public void testBankAccountBalanceEqualsZero() throws InterruptedException {
		// Arrange
		BankAccount sharedAccount = new BankAccount(1000);
		List<Person> persons = createTestPersons(sharedAccount);
		List<Thread> threads = createThreadsFor(persons);
		startAllThreads(threads);
		joinAllThreads(threads);

		// Act
		int actualBankAccountBalance = sharedAccount.getBalance();
		
		
		
		// Assert
		Integer expectedBankAccountBalance = 0;
		assertEquals(expectedBankAccountBalance, actualBankAccountBalance, "The bank account was overdrawn.");
	}

	/**
	 * Test for race conditions.
	 */
	@RepeatedTest(5)
	public void testTotalAmountSpentByAllPersons() throws InterruptedException {
		// Arrange
		Integer expectedTotalAmountOfMoney = 1000;
		BankAccount sharedAccount = new BankAccount(expectedTotalAmountOfMoney);
		List<Person> persons = createTestPersons(sharedAccount);
		List<Thread> threads = createThreadsFor(persons);
		startAllThreads(threads);
		joinAllThreads(threads);
		
		// Act
		int actualTotalAmountSpentByAll = persons.stream().mapToInt(person -> person.getTotalAmountSpent()).sum();
		
		// Assert
		assertEquals(expectedTotalAmountOfMoney, actualTotalAmountSpentByAll, "All persons together spent more money than existed (race condition).");
	}
	
	/**
	 * Test for serial execution (one person spends all the money).
	 */
	@Test
	public void testForSerialExecution() throws InterruptedException {
		// Arrange
		Integer expectedTotalAmountOfMoney = 1000;
		BankAccount sharedAccount = new BankAccount(expectedTotalAmountOfMoney);
		List<Person> persons = createTestPersons(sharedAccount);
		List<Thread> threads = createThreadsFor(persons);
		startAllThreads(threads);
		joinAllThreads(threads);
		
		// Act
		boolean greedyPersonExists = persons.stream().anyMatch(person -> Objects.equals(expectedTotalAmountOfMoney, person.getTotalAmountSpent()));	
		
		// Assert
		assertFalse(greedyPersonExists, "No parallel execution. One person spent all the money.");
	}

	/**
	 * Creates a couple of persons who share the given bank account.
	 * 
	 * @param sharedAccount The bank account shared by all persons.
	 */
	private List<Person> createTestPersons(BankAccount sharedAccount) {
		return List.of(
			new Person("Karl", sharedAccount, 1), 
			new Person("Eva", sharedAccount, 1),
			new Person("Paul", sharedAccount, 1), 
			new Person("Tam", sharedAccount, 1)
		);
	}

	/**
	 * Create a thread for each given person, then run and join each thread.
	 * 
	 * @param persons for whom a new thread is to be created.
	 */
	private List<Thread> createThreadsFor(List<Person> persons) {
		return persons.stream().map(person -> new Thread(person)).collect(Collectors.toList());
	}
	
	/**
	 * Starts each thread in the given list.
	 * 
	 * @param threads to be started.
	 */
	private void startAllThreads(List<Thread> threads) {
		threads.forEach(thread -> thread.start());
	}

	/**
	 * Joins each thread in the given list (wait for each to finish).
	 * 
	 * @param threads to wait for to be finish.
	 * @throws InterruptedException if a thread is interrupted.
	 */
	private void joinAllThreads(List<Thread> threads) throws InterruptedException {
		for (Thread thread : threads) {
			thread.join();
		}
	}
}
