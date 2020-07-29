package Assignment5;

public abstract class Cricket {
	 private int maxOvers;
	private int targetScore;
	private int currentOver;
	private int currentScore;
	
	public abstract double calcCurrentRunrate(int currentScore,int currentOvers);
	public abstract double calcReqdRunrate(int currentScore,int currentOvers);
	public Cricket(int maxOvers, int targetScore) {
		super();
		this.maxOvers = maxOvers;
		this.targetScore = targetScore;
	}
	public int getMaxOvers() {
		return maxOvers;
	}
	
	public int getTargetScore() {
		return targetScore;
	}
	
	public int getCurrentOver() {
		return currentOver;
	}
	public void setCurrentOver(int currentOver) {
		this.currentOver = currentOver;
	}
	public int getCurrentScore() {
		return currentScore;
	}
	public void setCurrentScore(int currentScore) {
		this.currentScore = currentScore;
	}
	
	
	

}
