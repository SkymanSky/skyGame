package skyGame;

public class GamerManager implements GamerService{
	
	PersonCheckService personCheckService;
	
	public GamerManager(PersonCheckService personCheckService) {
		super();
		this.personCheckService = personCheckService;
	}

	
	public void add(Gamer gamer) {
		if(personCheckService.checkIfRealPerson(gamer)) {
			System.out.println("Oyuncu eklendi: "+gamer.getFirstName());
		}else {
			System.out.println("Kimlik no dogrulanmadi."+gamer.getFirstName());
		}
	}
	
	public void list(Gamer gamer) {
		System.out.println("Oyuncu listelendi: "+gamer.getFirstName());
	}
	
	public void update(Gamer gamer) {
		System.out.println("Oyuncu bilgileri guncellendi: "+gamer.getFirstName());
	}
	
	public void delete(Gamer gamer) {
		System.out.println("Oyuncu silindi: "+gamer.getFirstName());
	}

}
