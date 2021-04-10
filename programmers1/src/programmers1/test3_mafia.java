package programmers1;

import java.util.HashMap;
import java.util.HashSet;
public class test3_mafia {

	 public int solution(String[][] clothes) {
	        HashMap<String,Integer> map = new HashMap<>();
	        HashSet<String> set = new HashSet<>();
	        HashSet<Integer> set2 = new HashSet<>();
	        for(int i=0;i<clothes.length;i++)
	        {
	        	set.add(clothes[i][1]);
	        	for(String s: set) {
			        if(clothes[i][1]==s) {
			        	if(map.containsKey(s))
			        		map.put(s, map.get(s)+1);
			        	else 
			        		map.put(s, 1);
			        }
			    }
	        }
	        int answer=1;
        	
        	for(String mapE:map.keySet()) {
        		set2.add(map.get(mapE));
        	}
        	
        	for(Integer s:set2) {
        		answer=(s+1)*answer;
        	}
	        return answer-1;
	       
	    }
}
