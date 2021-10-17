import java.util.Random;
class Gambler{
	int tempEverydayStake=100;
	int everyGameBet=1;
	public void winLosse(){
		int afterBet=0;
		Random r1=new Random();

		for (int i=1; i<=20; i++)
		{	
			tempEverydayStake=afterBet+100;
			int stakeCheck=tempEverydayStake;
			System.out.println("bet amount for day "+i+" is:"+tempEverydayStake);

			int fPer=tempEverydayStake/2;
        	        int winPer=tempEverydayStake+fPer;
               		int loosePer=tempEverydayStake-fPer;

			while(tempEverydayStake>loosePer && tempEverydayStake<winPer)
			{
				int winLoose=r1.nextInt(2);
				if(winLoose==1)
				{
					//System.out.println("win");
					afterBet=tempEverydayStake+everyGameBet;
				}
				else
				{
					//System.out.println("loose");
					afterBet=tempEverydayStake-everyGameBet;
				}
				tempEverydayStake=afterBet;
				//System.out.println("after play="+afterBet);
			}
			System.out.println("day "+i+" after the bet amount:"+tempEverydayStake);

			if(stakeCheck<afterBet)
			{
				int profit=afterBet-stakeCheck;
				System.out.println("day "+i+" in profit:"+profit);
			}
			else
			{
				int loose=stakeCheck-afterBet;
				System.out.println("day "+i+" in loose:"+loose);
			}
			
		}

	}
	
	public static void main(String[] args){
		Gambler g1=new Gambler();
		System.out.println("WELCOME");
		System.out.println("*******");
		System.out.println("The user can start for the day is:"+g1.tempEverydayStake+"$");
		System.out.println("Minimum amount user can bet every game is:"+g1.everyGameBet+"$");
		g1.winLosse();
		
	}
}
