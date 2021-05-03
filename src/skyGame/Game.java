package skyGame;

public class Game {
	
	private int id;
	private double price;
	private double discountedPrice;
	private double discount;
	private String name;
	private String description;
	private String publisher;
	private String developer;
	private int categoryId;
	
	public Game() {
		
	}

	public Game(int id, String name, String description, String publisher, String developer, int categoryId, double price, double discountedPrice) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.publisher = publisher;
		this.developer = developer;
		this.categoryId = categoryId;
		this.price= price;
		this.discountedPrice=discountedPrice;
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getDeveloper() {
		return developer;
	}

	public void setDeveloper(String developer) {
		this.developer = developer;
	}

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getDiscountedPrice() {
		return discountedPrice=this.price-this.price*this.discount;
	}
	

}
