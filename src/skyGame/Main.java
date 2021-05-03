package skyGame;

public class Main {
	public static void main(String[] args) {
		Gamer gamer1 = new Gamer();
		gamer1.setFirstName("Skyman");
		gamer1.setDateOfBirth(1984);
		gamer1.setLastName("Sky");
		gamer1.setNationalIdentity("12345");
		
		GamerManager gamerManager = new GamerManager(new PersonCheckManager());
		gamerManager.add(gamer1);
		gamerManager.list(gamer1);
		gamerManager.update(gamer1);
		gamerManager.delete(gamer1);
		
		Game game1 = new Game();
		game1.setName("Skysoldier of Fortune");
		game1.setPrice(300);
		
		SpecialOffer specialOffer1 = new SpecialOffer();
		specialOffer1.setName("Black Fridate");
		specialOffer1.setDiscountPercentage(0.20);
		
		GameManager gameManager = new GameManager(gamer1,specialOffer1);
		gameManager.sell(game1);
		
		
		
	}
		
}
