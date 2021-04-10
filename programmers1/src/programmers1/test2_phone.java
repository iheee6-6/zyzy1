package programmers1;
import java.util.HashMap; 
import java.util.HashSet; 

public class test2_phone {

	  /*  public boolean solution(String[] phone_book) {
	        HashMap<String,Integer> map = new HashMap<String, Integer>();
	        
	        for(String part:phone_book){
	            Integer integer = map.getOrDefault(part,0);
	            map.put(part,++integer);
	        }

        	System.out.println(map);
	        for(String part:phone_book){
	            for(String mpart:map.keySet()){
	                if(!mpart.equals(part))
	                    {
	                    if(mpart.indexOf(part)>-1)
	                        return false;
	                    }
	                    
	            }
	        }
	        
	        return true;
	    }*/
	
	    public boolean solution(String[] phone_book) { 
	        HashMap<String, String> m1 = new HashMap<>(); 
	        HashSet<String> t = new HashSet<>();
	        for(int i=0; i<phone_book.length; i++) {
	            t.add(phone_book[i]); 
	        } 
	        for ( String source : phone_book) {
	             for( int i=1; i<= source.length(); i++) {
	                 if(!source.substring(0,i).equals(source)) {
	                    m1.put(source.substring(0,i), source); 
	                 }
	             } 
	        } 
	        for(String s1 : t) {
	             if(m1.containsKey(s1)) {
	                return false; 
	             } 
	        } 
	        return true; 
	    } 
	

	}



