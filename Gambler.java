import java.util.Random;
class Gambler{
	int everydayStake=100;
	int everyGameBet=1;
	public void winLosse(){
		Random r1=new Random();
		int check=r1.nextInt(2);
		if(check==0){
			System.out.println("WIN");
		}
		else
			System.out.println("LOSSE");
	}

	public static void main(String[] args){
		Gambler g1=new Gambler();
		System.out.println("WELCOME");
		System.out.println("*******");
		System.out.println("The user can start for the day is:"+g1.everydayStake+"$");
		System.out.println("Minimum amount user can bet every game is:"+g1.everyGameBet+"$");
		g1.winLosse();
		
	}
}
