import java.io.*;

import java.util.*;
public class PollStation{
	int i,j;
	Scanner voter_input=new Scanner(new File("Voter.txt"));
	int no_of_voters=voter_input.nextInt();
	Voter v[]=new Voter[no_of_voters];
	for(i=0;i<no_of_voters;i++){
		Candidate pref1=null,pref2=null;
		voter_input.nextLine();
		String voter_Logs=voter_input.nextLine();
		String voter_details[]=new String[3];
		voter_details=voter_Logs.split(",");
		v[i]=new Voter(voter_details[0],name1,name2);
		
		
		for(j=0;j<no_of_candi;j++){
			if(voter_details[1].equals(c[j].getname())){
				v[i].getDetails1(c[j]);
				pref1=c[j];
			}
			if(voter_details[2].equals(c[j].getname())){
				v[i].getDetails2(c[j]);
				pref2=c[j];
			}
			else
				continue;
		}
	}
	
	}
	
	
	
	public void vote(String voter_id,String voter_vote){
		
		
		
	}
}
