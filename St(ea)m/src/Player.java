
public class Player extends BaseUserManager{
	
	
	public void AddUser(String nationalityId, String firstName, String lastName, String year, float discount, String[] games) {
		System.out.println("Oyuncu eklendi.");
		System.out.println(nationalityId);
	}


	@Override
	public void AddUser(User user) {
		// TODO Auto-generated method stub
		
	}}
