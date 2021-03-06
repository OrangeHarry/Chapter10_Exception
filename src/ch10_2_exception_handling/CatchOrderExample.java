package ch10_2_exception_handling;

public class CatchOrderExample {
	public static void main(String[] args) {
		try {
			String data1 = args[0];
			String data2 = args[1];
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			int result = value1 + value2;
			System.out.printf("%d +%d = %d\n", value1, value2, result);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("실행 매개값의 변수가 부족합니다.");
		} catch (Exception e) { //얘는 그냥 최강자이니깐 항상 맨 밑에다가 두자 (당연한 얘기지 얘는 그냥 예외 그 자체잖아)
			System.out.println("실행에 문제가 있습니다.");
		} finally {
			System.out.println("다시 실행하세요");
		}
		System.out.println("프로그램을 종료합니다.");
	}
}
