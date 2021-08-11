package ch10_3_example;

import java.util.Scanner;

public class ExceptionCase {
	public static void main(String[] args) {
		// 두 정수를 사용자로부터 입력받기 예)3,4 3/4나누기 실행하고
		// 입력받은 숫자와 나누기 결과를 출력하시오

		Scanner scanner = new Scanner(System.in);
	
		try {
			System.out.print("첫번째 입력 값 = ");
			int x = Integer.parseInt(scanner.nextLine());
			System.out.print("두번째 입력 값 = ");
			int y = Integer.parseInt(scanner.nextLine());
			System.out.println("나누기 값 = " + x / y);
		} catch (NumberFormatException e) {
			System.out.println("입력값이 문자여서 계산이 불가능합니다.");
		} finally {
		}
		System.out.println("프로그램 종료");
	}
}

//강사님 답안
//public class ExceptionCase {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//
//		System.out.print("a/b...a?>");
//		int n1 = sc.nextInt();
//		System.out.print("a/b...b?>");
//		int n2 = sc.nextInt();
//
//		try {
//			System.out.printf("%d / %d = %d\n", n1, n2, n1 / n2);
//		} catch (ArithmeticException e) {
//			System.out.println("0으로 나눌 수 없습니다.");
//		} finally {
//			System.out.println("프로그램종료");
//		}
//	}
//}