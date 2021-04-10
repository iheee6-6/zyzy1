package programmers1;

public class main {

	public static void main(String[] args) {
		String[][] phone_book= {{"yellowhat", "headgear"}, {"bluesunglasses", "eyewear"}, {"green_turban", "headgear"}};
		test3_mafia t = new test3_mafia();
		int answer = t.solution(phone_book);
	
		System.out.println(answer);
	}

}

