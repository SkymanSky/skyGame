package skyGame;

public class PersonCheckManager implements PersonCheckService {
	public boolean checkIfRealPerson(Gamer gamer) {
		if(gamer.getDateOfBirth()==1984 && gamer.getFirstName()=="Skyman" && gamer.getLastName()=="Sky" && gamer.getNationalIdentity()=="12345") {
			return true;
		}else {
			return false;
		}
	}
}
