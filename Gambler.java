import java.util.Random;
class Gambler{
	int tempEverydayStake=100;
	int everyGameBet=1;
	public void winLosse(){
		Random r1=new Random();
		int winCal=everyGameBet;
		int looseCal=everyGameBet;
		int day=1;
		int dayEarn=0;
		int totalStake=0;
		int everyDayStake=0;
		int totalEarning=0;
		for (int i=0; i<20; i++){
				
				tempEverydayStake=dayEarn+100;
				totalStake +=tempEverydayStake;
				
				System.out.println("++++++++++++++");
				System.out.println("DAY "+day+" Stake-->"+tempEverydayStake);
				//System.out.println("staketotal---------------"+totalStake);
				
				int fPer=tempEverydayStake/2;
				//System.out.println("percentage"+fPer);
               			int winPer=fPer+tempEverydayStake;
				 //System.out.println("win percentage"+winPer);
        	        	int loosePer=tempEverydayStake-fPer;
				 //System.out.println("loss percentage"+loosePer);
	
				while(tempEverydayStake>loosePer && tempEverydayStake<winPer){
						int check=r1.nextInt(2);
				
						if(check==0){
							//System.out.println("WIN");
							tempEverydayStake=tempEverydayStake+winCal;
							//System.out.println("changed amount after a win"+tempEverydayStake);
						}	
						else{
							//System.out.println("LOSSE");
				
							tempEverydayStake=tempEverydayStake-looseCal;
							//System.out.println("changed amount after a loose"+tempEverydayStake);

						}	
						//System.out.println("earning"+tempEverydayStake);
				}
				//System.out.println("earning"+tempEverydayStake);
				System.out.println("DAY"+day+" EARNING-->"+tempEverydayStake);
				dayEarn=tempEverydayStake;
				day++;
				totalEarning +=tempEverydayStake;

			}
		 System.out.println("total stake::"+totalStake);
		 System.out.println("total earning::"+totalEarning);
		 if (totalStake>totalEarning){
			System.out.println("LOOSE");
			int amtLoose=totalStake-totalEarning;
			System.out.println("total amt lost="+amtLoose);
		 }
		 else{
			 System.out.println("PROFIT");
		 	int amtWon=totalEarning-totalStake;
			System.out.println("total amt won="+amtWon);
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
