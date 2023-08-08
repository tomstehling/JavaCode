import java.io.Serializable;

public class Score implements Serializable{
	
	private static final long serialVersionUID = 17111997;
	private String nickName;
	private Integer punkte;
	
	public Score(String nickName, Integer punkte) {
		this.nickName = nickName;
		this.punkte = punkte;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public Integer getPunkte() {
		return punkte;
	}

	public void setPunkte(Integer punkte) {
		this.punkte = punkte;
	}
	
	
}
