package ch10_1_exception_class;

public class NumberFormatExceptionExample {
	public static void main(String[] args) {
		String data1 = "100";
		String data2 = "a200";

		int value1 = Integer.parseInt(data1);
		
		try {
			int value2 = Integer.parseInt(data2); // NumberFormatException발생
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}

//		int result = value1 + value2;
//		System.out.println(data1 + "+" + data2 + "=" + result);
		System.out.println("프로그램 종료");
	}
}
