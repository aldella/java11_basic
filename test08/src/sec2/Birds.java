package sec2;

public class Birds extends Animal{
	int wings;
	boolean fly;
	
	public int getWings() {
		return wings;
	}
	public void setWings(int wings) {
		this.wings = wings;
	}
	public boolean isFly() {
		return fly;
	}
	public void setFly(boolean fly) {
		this.fly = fly;
	}
	@Override
	public String toString() {
		return "Birds [wings=" + wings + ", fly=" + fly + "]";
	}
	
}
