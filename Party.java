import java.util.ArrayList;

public class Party {
	
	private String name;
	private int max_age;
	private int min_age;
	private int no_of_candidates=0;
	private int gotvotes=0;
	  ArrayList<Candidate> c = new ArrayList();
	public Party(String name,String maxage,String minage){
		this.name=name;
		int x = Integer.parseInt(maxage);
		this.max_age=x;
		int y = Integer.parseInt(minage);
		this.min_age=y;
		
	}
	public int partyEnter(Candidate cr){
		int z = Integer.parseInt(cr.getage());
		if(z>min_age&&z<max_age){
			c.add(cr);
			return 1;
		}
		else return 0;
	}

	public String getname(){
		return name;
	}
	public void register(int id,Candidate cr){
		int z = Integer.parseInt(cr.getage());
			if(z>min_age&&z<max_age){
				c.add(cr);
			}
	}


	public void gotvote() {
		gotvotes++;
		
	}
	public int getvotes(){
		return gotvotes;
	}
}
