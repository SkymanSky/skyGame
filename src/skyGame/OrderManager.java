package skyGame;

public class OrderManager {
	
	private Gamer gamer;
	private SpecialOffer specialOffer;
	
	public OrderManager(Gamer gamer,SpecialOffer specialOffer){
		this.gamer=gamer;
		this.specialOffer=specialOffer;
	}
	
	public void sell(Game game) {
		System.out.println(game.getName()+" isimli oyun "+gamer.getFirstName()+" isimli kullaniciya satilmistir.");
		System.out.println("Oyun fiyat: "+ game.getPrice());
		System.out.println("Oyun kampanyali fiyat: "+ (game.getPrice()-game.getPrice()*specialOffer.getDiscountPercentage()));
	}

}
