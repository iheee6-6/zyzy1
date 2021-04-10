package programmers1;

import java.util.HashMap;
import java.util.HashSet;
public class test3_mafia {

//	 public int solution(String[][] clothes) {
//	        HashMap<String,Integer> map = new HashMap<>();
//	        HashSet<String> set = new HashSet<>();
//	        HashSet<Integer> set2 = new HashSet<>();
//	        for(int i=0;i<clothes.length;i++)
//	        {
//	        	set.add(clothes[i][1]);
//	        	for(String s: set) {
//			        if(clothes[i][1]==s) {
//			        	if(map.containsKey(s))
//			        		map.put(s, map.get(s)+1);
//			        	else 
//			        		map.put(s, 1);
//			        }
//			    }
//	        }
//	        int answer=1;
//        	
//        	for(String mapE:map.keySet()) {
//        		set2.add(map.get(mapE));
//        	}
//        	
//        	for(Integer s:set2) {
//        		answer=(s+1)*answer;
//        	}
//	        return answer-1;
//	       
//	    }
	 
	
	 public int solution(String[][] clothes) {
		  HashMap<String, Integer> map = new HashMap<String, Integer>();
	      int answer = 1;
	      
	      for(int i=0; i<clothes.length; i++){
	          // 현재 의상의 종류가 존재하지 않으면 1개 넣고, 존재하면 +1
	          if(map.get(clothes[i][1]) == null)  map.put(clothes[i][1], 1);
	          else    map.put(clothes[i][1], map.get(clothes[i][1]) + 1);
	      }
	      
	      for(String keys : map.keySet())
	          answer *= (map.get(keys) + 1);
	      
	      return answer-1;
	 }
}
