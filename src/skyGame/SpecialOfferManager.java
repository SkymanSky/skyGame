package skyGame;

public class SpecialOfferManager {
	
	public void add(SpecialOffer specialOffer) {
		System.out.println("Kampanya eklendi: "+specialOffer.getName());
	}
	
	public void list(SpecialOffer specialOffer) {
		System.out.println("Kampanya listelendi: "+specialOffer.getName());
	}
	
	public void update(SpecialOffer specialOffer) {
		System.out.println("Kampanya guncellendi: "+specialOffer.getName());
	}
	
	public void delete(SpecialOffer specialOffer) {
		System.out.println("Kampanya silindi: "+specialOffer.getName());
	}

}
