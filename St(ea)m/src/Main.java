
public class Main {

	public static void main(String[] args) {
		
		User arda = new User("10376564372", "Arda", "COSKUN", "2006", 10000f, new Player());
		User ertug = new User("blablablabla", "Ertug", "KAYMAK", "2006", 200f, new Player());
		
		GameManager pta5 = new GameManager("Pta5", "0", 100f, 0f);
		GameManager cesego = new GameManager("CeSeGo", "0", 50f, 0f);
		
		pta5.GameBuy(arda, arda.balance);
		cesego.GameBuy(arda, arda.balance);
		
		cesego.GameBuy(ertug, ertug.balance);
		
		System.out.println("Ardanın oyunları: " + arda.games);
		System.out.println("Ertugun oyunları: " + ertug.games);
	}

}
