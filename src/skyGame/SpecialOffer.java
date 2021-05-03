package skyGame;

public class SpecialOffer {
	private int id;
	private String name;
	private double discountPercentage;
	
	public SpecialOffer() {
		
	}

	public SpecialOffer(int id, String name, double discountPercentage) {
		super();
		this.id = id;
		this.name = name;
		this.discountPercentage = discountPercentage;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getDiscountPercentage() {
		return discountPercentage;
	}

	public void setDiscountPercentage(double discountPercentage) {
		this.discountPercentage = discountPercentage;
	}
	
}
