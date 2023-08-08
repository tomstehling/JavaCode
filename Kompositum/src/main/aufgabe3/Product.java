package main.aufgabe3;

import java.util.ArrayList;
import java.util.List;

public class Product extends Component {
    private List<Component> components = new ArrayList<>();

    public Product(String name, Integer price) {
        super(name, price);
    }

    @Override
    public void add(Component component) {
        components.add(component);
    }

    @Override
    public void remove(Component component) {
        components.remove(component);
    }

    @Override
    public boolean contains(Component c) {
        if (components.contains(c)) {
            return true;
        }
        for (Component component : components) {
            if (component.contains(c)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Integer fetchTotalPrice() {
        Integer totalPrice = price;
        for (Component component : components) {
            totalPrice += component.fetchTotalPrice();
        }
        return totalPrice;
    }

	@Override
	public List<Material> fetchMaterialList() {
        List<Material> materialList = new ArrayList<>();
        for (Component component : components) {
        	materialList.addAll(component.fetchMaterialList());        	
        	
        }
        return materialList;
    }
}