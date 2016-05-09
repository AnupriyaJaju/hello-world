import java.util.*;
import java.io.*;
public class Election {

	public static void main(String[] args) throws FileNotFoundException {
		int i,j;
		Scanner party_input=new Scanner(new File("Party.txt"));
		Scanner candi_input=new Scanner(new File("Candidate.txt"));
		int no_of_party=party_input.nextInt();
		Party p[]=new Party[no_of_party];
		party_input.nextLine();
		for(i=0;i<no_of_party;i++){
			String party_Logs=party_input.nextLine();
			String party_details[]=new String[3];
			party_details=party_Logs.split(",");
			p[i]=new Party(party_details[0],party_details[1],party_details[2]);
		}
		
		
		int no_of_candi=candi_input.nextInt();
		Candidate c[]=new Candidate[no_of_candi];
		candi_input.nextLine();
		for(i=0;i<no_of_candi;i++){
			String candi_Logs=candi_input.nextLine();
			String candi_details[]=new String[3];
			candi_details=candi_Logs.split(",");
			
			for(j=0;j<no_of_party;j++){
				if(candi_details[1].equals(p[j].getname())){
					c[i]=new Candidate(p[j],candi_details[0],candi_details[2]);
					p[j].register(c[i].getid(),c[i]);
					break;
				}
				else
					continue;
			}
		}
		
		Scanner voter_input=new Scanner(new File("Voter.txt"));
		int no_of_voters=voter_input.nextInt();
		Voter v[]=new Voter[no_of_voters];
		voter_input.nextLine();
		for(i=0;i<no_of_voters;i++){
			Candidate pref1=null,pref2=null;
			String voter_Logs=voter_input.nextLine();
			String voter_details[]=new String[3];
			voter_details=voter_Logs.split(",");
			v[i]=new Voter(voter_details[0]);
			
			int voter_vote=v[i].getVote();
				if(voter_vote==1){
					pref1.gotvote();
				}
				else if(voter_vote==2){
					pref2.gotvote();
				}
		}
		
		
	Party maxp=p[0];
		int max=p[0].getvotes();
		for(i=0;i<no_of_party;i++){
			if(p[i].getvotes()>max){
				max=p[i].getvotes();
				maxp=p[i];
			}
			else continue;
		}
		
		System.out.println("*******************Party won************************* ");
		System.out.println(maxp.getname()+"   "+maxp.getvotes());
		Candidate temp;
		for(i=0;i<no_of_candi;i++){
			for(j=i+1;j<no_of_candi;j++){
				if(c[i].getvote()<c[j].getvote()){
					temp=c[i];
					c[i]=c[j];
					c[j]=temp;
				}
			}
		}
		for(i=0;i<no_of_candi;i++){
			if(c[i].getpartyname().equals(maxp.getname())){
				System.out.println(c[i].getname()+"     "+c[i].getvote());
				break;
			}
			else continue;
		}
		
		
	}
}
