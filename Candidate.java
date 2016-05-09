
public class Candidate {
	private String name;
	private static int id=0;
	private int uid;
	private int votes=0;
	private String age;
	Party p;
	Candidate(Party p,String name,String age){
		id++;
		uid=id;
		this.p=p;
		this.name=name;
		this.age=age;
		p.register(id,this);
	}
	public int getid() {
		return this.uid;
	}
	public String getname() {
		return name;
	}
	public void gotvote(){
		votes++;
		p.gotvote();
	}
	public int getvote(){
		return votes;
	}
	public String getage() {
		// TODO Auto-generated method stub
		return age;
	}
	public String getpartyname() {
		// TODO Auto-generated method stub
		return p.getname();
	}
}
