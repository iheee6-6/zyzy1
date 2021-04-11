package programmers1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

public class test4_music {
	    public int[] solution(String[] genres, int[] plays) {
	        int[] answer = {};
	    	HashMap<String,Integer> map = new HashMap<>();
	    	HashMap<String,Integer> map2 = new HashMap<>();
	    	int maxGn=0;
	    	String maxG="";
	    	for(int i =0;i<genres.length;i++) {
	    		map.put(genres[i], map.getOrDefault(genres[i],0)+plays[i]);
	    		
	    		map2.put(genres[i], plays[i]);
	    	}
	    	
	    	for(String m:map.keySet()) {
	    		if(maxGn<map.get(m)) 
	    			{
	    				maxG=m;
	    				maxGn=map.get(m);
	    			}
	    	}
	    	
	    	
			//list.forEach(System.out::println);
			
	    	for(String m:map2.keySet()) {
	    		if(m==maxG) {
	    			List<Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
	    			list.sort(Entry.comparingByValue());
	    			list.forEach()
	    		}
	    	}
	    	
	        return answer;
	    }

		
	    
}
