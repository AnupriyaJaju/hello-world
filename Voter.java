import java.util.Random;

public class Voter {
	
	private int id;
	Candidate c1;
	Candidate c2;
	public Voter(String id){
		int x = Integer.parseInt(id);
		this.id=x;
		
	}
	
	public int getVote(){
		Random ran = new Random();
		int min = 1;
		int max = 2;
		int votePref = ran.nextInt(max-min + 1) + min;
		return votePref;
	}

	public void getDetails1(Candidate c) {
		this.c1=c;
		
	}

	public void getDetails2(Candidate c) {
		this.c2=c;
		
	}
}
