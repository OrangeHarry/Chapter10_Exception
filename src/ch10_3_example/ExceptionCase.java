//package ch10_3_example;
//
//import java.lang.reflect.Method;
//import java.util.Scanner;
//
//public class ExceptionCase {
//	public static void main(String[] args) {
//		// 두 정수를 사용자로부터 입력받기 예)3,4 3/4나누기 실행하고
//		// 입력받은 숫자와 나누기 결과를 출력하시오
//
//		Scanner scanner = new Scanner(System.in);
//
//		try {
//			System.out.print("첫번째 입력 값 = ");
//			double x = Double.parseDouble(scanner.nextLine());
//
//			System.out.print("두번째 입력 값 = ");
//			double y = Double.parseDouble(scanner.nextLine());
//
//			if(Double.isInfinite(x/y)) { // is인거 보니깐 boolean이네, 이거랑 밑에거랑 둘다가능
//				throw new ArithmeticException();
//			}
////			if (y == 0) {
////				throw new ArithmeticException(); // 예외로 인식을 못할때는 이렇게 조건을 정해서 던지는 것도 방법이야!!
////			}
//			System.out.println("나누기 값 = " + x / y);
//
//		} catch (NumberFormatException e) {
//			System.out.println("입력값이 문자여서 계산이 불가능합니다.");
//		} catch (ArithmeticException e) {
//			System.out.println("0으로 나눌 수 없습니다.");
//		} catch (Exception e) {
//			e.printStackTrace();
//			System.out.println("예외발생!!");
//		} finally {
//			System.out.println("프로그램 종료");
//		}
//	}
//}
//
////강사님 답안
////public class ExceptionCase {
////	public static void main(String[] args) {
////		Scanner sc = new Scanner(System.in);
////
////
////		try {
////		System.out.print("a/b...a?>");
////		int n1 = sc.nextInt();
////		System.out.print("a/b...b?>");
////		int n2 = sc.nextInt();
////			System.out.printf("%d / %d = %d\n", n1, n2, n1 / n2);
////		} catch (ArithmeticException e) { //정수 나누기에 0을 대입하면 안된다는 예외 클래스
////			System.out.println("0으로 나눌 수 없습니다.");
////		} finally {
////			System.out.println("프로그램종료");
////		}
////	}
//=======
//package ch10_3_example;
//
//import java.util.Scanner;
//
//public class ExceptionCase {
//	public static void main(String[] args) {
//		// 두 정수를 사용자로부터 입력받기 예)3,4 3/4나누기 실행하고
//		// 입력받은 숫자와 나누기 결과를 출력하시오
//
//		Scanner scanner = new Scanner(System.in);
//	
//		try {
//			System.out.print("첫번째 입력 값 = ");
//			int x = Integer.parseInt(scanner.nextLine());
//			System.out.print("두번째 입력 값 = ");
//			int y = Integer.parseInt(scanner.nextLine());
//			System.out.println("나누기 값 = " + x / y);
//		} catch (NumberFormatException e) {
//			System.out.println("입력값이 문자여서 계산이 불가능합니다.");
//		} finally {
//		}
//		System.out.println("프로그램 종료");
//	}
//}

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