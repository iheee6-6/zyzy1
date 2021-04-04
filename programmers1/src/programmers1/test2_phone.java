package programmers1;
import java.util.*;

public class test2_phone {

	    public boolean solution(String[] phone_book) {
	        boolean answer = true;
	        HashMap<String,Integer> map = new HashMap<String, Integer>();
	        
	        for(String part:phone_book){
	            Integer integer = map.getOrDefault(part,0);
	            map.put(part,++integer);
	        }

        	System.out.println(map);
	        for(String part:phone_book){
	            Integer num =0;
	            for(String mpart:map.keySet()){
	                if(!mpart.equals(part))
	                    {
	                    if(mpart.indexOf(part)>-1)
	                        num=1;
	                        answer=false;
	                        return answer;
	                    }
	                    
	            }
	        }
	        
	        return answer;
	    }
	}



