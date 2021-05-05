
public class GameManager {
	String gameName;
	String gameId;
	float gamePrice;
	float gamePriceDiscount;
	
	public GameManager(String gameName, String gameId, float gamePrice, float gamePriceDiscount) {
		this.gameName = gameName;
		this.gameId = gameId;
		this.gamePrice = gamePrice;
		this.gamePriceDiscount = gamePriceDiscount;
		System.out.println(gameName);
	}
	
	public void GameBuy(User user, float balance) {
		
		if((user.balance - (this.gamePrice - gamePriceDiscount)) >= 0) {
			
			user.balance -= (this.gamePrice - gamePriceDiscount);
			
			user.games.add(gameName);
			
		}
		else {
			System.out.println("Bu oyunu almak için yeterli paranız yok.");
		}
	}
}
