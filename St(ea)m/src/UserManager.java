
public class UserManager {

	public void User(String nationalityId, String firstName, String lastName, String year) {
		UserCheckManager userCheckManager = new UserCheckManager();
		if (userCheckManager.IsRealPerson(nationalityId, firstName, lastName, year)) {
			
			
			
		}
		else {
			System.out.println("Girdiginiz bilgiler hatali!");
		}
		
	}
}
