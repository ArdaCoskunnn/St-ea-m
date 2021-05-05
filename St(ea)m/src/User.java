import java.util.ArrayList;

public class User extends BaseUserManager{
	String nationalityId;
	String firstName;
	String lastName;
	String year;
	float balance;
	public ArrayList<String> games = new ArrayList<>();
	
	public User(String nationalityId, String firstName, String lastName, String year, float balance, BaseUserManager baseUserManager) {	
		UserCheckManager userCheckManager = new UserCheckManager();
		if(userCheckManager.IsRealPerson(nationalityId, firstName, lastName, year)) {
			this.nationalityId = nationalityId;
			this.firstName = firstName;
			this.lastName = lastName;
			this.year = year;
			this.balance = balance;
			baseUserManager.AddUser(this.nationalityId, this.firstName, this.lastName, this.year, this.balance);
			System.out.println("Oyuncu başarıyla listeye eklendi.");
		}
		else {
			System.out.println("Girdiğiniz bilgilerde bir hata var. Lütfen girdiğiniz kullanıcının özelliklerini doğru giriniz.");
		}
			
	}

	/*@Override
	public void AddUser(String nationalityId, String firstName, String lastName, String year, float balance, BaseUserManager baseUserManager) {
		UserCheckManager userCheckManager = new UserCheckManager();
		if(userCheckManager.IsRealPerson(nationalityId, firstName, lastName, year)) {
			this.nationalityId = nationalityId;
			this.firstName = firstName;
			this.lastName = lastName;
			this.year = year;
			this.balance = balance;
			baseUserManager.AddUser(this.nationalityId, this.firstName, this.lastName, this.year, this.balance);
			System.out.println(".");
		}
		else {
			System.out.println("Girdiğiniz bilgilerde bir hata var. Lütfen girdiğiniz kullanıcının özelliklerini doğru giriniz.");
		}
		
	}*/

	@Override
	public void AddUser(User user) {
		// TODO Auto-generated method stub
		
	}
}
