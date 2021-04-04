package programmers1;

import java.util.Stack;
public class test1 {
	  public String solution(String[] participant, String[] completion) {
	        String answer = "";
	        Stack<String> stack = new Stack<>();
	        for(String str:participant){
	            stack.add(str);
	        }

	        for(int i =0;i<participant.length;i++){
	            for(int j=0;j<completion.length;j++){
	                if(completion[j]==participant[i]){
	                  stack.remove(stack.indexOf(participant[i]));
	                  break;
	                }
	            }
	           
	        }
	        answer=stack.peek();
	        return answer;
	    }
}
