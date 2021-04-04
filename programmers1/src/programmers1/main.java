package programmers1;

public class main {

	public static void main(String[] args) {
		String[]phone_book= {"119", "123", "1234"};
		test2_phone t = new test2_phone();
		boolean answer = t.solution(phone_book);
	
		System.out.println(answer);
	}

}

