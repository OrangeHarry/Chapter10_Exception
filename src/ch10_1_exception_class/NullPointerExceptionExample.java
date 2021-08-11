package ch10_1_exception_class;

public class NullPointerExceptionExample {
	public static void main(String[] args) {
		String data1 = "hello";
		String data2 = null;
		String data3 = "";
		String data4 = " ";

		try {
			System.out.println(data1.length());
//			System.out.println(data2.length());
			System.out.println(data3.length());
			System.out.println(data4.length());
		} catch (NullPointerException e) {
			System.out.println("예외발생!!");
			System.out.println("e.toString() = " + e.toString());
			System.out.println("e.getMessage() = " + e.getMessage());
			System.out.print("e.printStackTrace() = ");
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("에외 발생실행");
		}
		System.out.println("\n프로그램 종료");
	}
}
