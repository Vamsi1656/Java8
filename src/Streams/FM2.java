package Streams;

import java.util.*;
import java.util.stream.Collectors;

public class FM2 {

	public static void main(String[] args) {
		
		
		List<String> teamA=Arrays.asList("Rohit","Gill","Virat");
		List<String> teamB=Arrays.asList("Shreyas","KLRahul","Hardik");
		List<String> teamC=Arrays.asList("Jaddu","Ashwin","Kuldeep");
		List<String> teamD=Arrays.asList("Bumrah","Siraj","Surya");
		
        List<List<String>>FinalWorldCupTeam=new ArrayList<>();
        FinalWorldCupTeam.add(teamA);
        FinalWorldCupTeam.add(teamB);
        FinalWorldCupTeam.add(teamC);
        FinalWorldCupTeam.add(teamD);
        
//        for(List<String> team:FinalWorldCupTeam) {
//        	
//        	for(String name:team) {
//        		System.out.println(name);
//        	}
//        }
        
        List<String> WCPlayers=FinalWorldCupTeam.stream().flatMap(plist->plist.stream()).collect(Collectors.toList());
        System.out.println(WCPlayers);
	}

}
