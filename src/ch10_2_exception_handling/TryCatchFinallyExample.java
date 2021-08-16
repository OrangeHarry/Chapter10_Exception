package ch10_2_exception_handling;

public class TryCatchFinallyExample {
	public static void main(String[] args) {
		try {
			Class clazz = Class.forName("java.lang.String2");
		} catch (ClassNotFoundException e) {
//			e.printStackTrace();
			System.out.println("해당 클래스는 존재하지 않습니다.");
		}
		System.out.println("프로그램 종료");
	}
}
