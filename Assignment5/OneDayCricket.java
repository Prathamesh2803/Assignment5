package Assignment5;

public class OneDayCricket extends Cricket {
	
	
	public OneDayCricket(int targetScore) {
		super(50,targetScore);
	}
	
	public double calcCurrentRunrate(int currentScore,int currentOver) {
		return currentScore/currentOver;
	}
	
	public double calcReqdRunrate(int remainingRuns,int remainingOver) {
		return remainingRuns/remainingOver;
	}
	

}

