
public enum coffee {
	Expresso(8),Latte(5),Nescafe(6),Cappuccino(10);
	private int beans;
	private coffee(int beans) {
		this.beans=beans;
	}
	public String preparecoffee() {
		return "Your coffee is getting prepared";
	}
	public double calculatecost() {
		return beans*20;
	}
}
