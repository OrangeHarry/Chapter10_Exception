//package ch10_3_example;
//
//import java.lang.reflect.Method;
//import java.util.Scanner;
//
//public class ExceptionCase {
//	public static void main(String[] args) {
//		// �� ������ ����ڷκ��� �Է¹ޱ� ��)3,4 3/4������ �����ϰ�
//		// �Է¹��� ���ڿ� ������ ����� ����Ͻÿ�
//
//		Scanner scanner = new Scanner(System.in);
//
//		try {
//			System.out.print("ù��° �Է� �� = ");
//			double x = Double.parseDouble(scanner.nextLine());
//
//			System.out.print("�ι�° �Է� �� = ");
//			double y = Double.parseDouble(scanner.nextLine());
//
//			if(Double.isInfinite(x/y)) { // is�ΰ� ���ϱ� boolean�̳�, �̰Ŷ� �ؿ��Ŷ� �Ѵٰ���
//				throw new ArithmeticException();
//			}
////			if (y == 0) {
////				throw new ArithmeticException(); // ���ܷ� �ν��� ���Ҷ��� �̷��� ������ ���ؼ� ������ �͵� ����̾�!!
////			}
//			System.out.println("������ �� = " + x / y);
//
//		} catch (NumberFormatException e) {
//			System.out.println("�Է°��� ���ڿ��� ����� �Ұ����մϴ�.");
//		} catch (ArithmeticException e) {
//			System.out.println("0���� ���� �� �����ϴ�.");
//		} catch (Exception e) {
//			e.printStackTrace();
//			System.out.println("���ܹ߻�!!");
//		} finally {
//			System.out.println("���α׷� ����");
//		}
//	}
//}
//
////����� ���
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
////		} catch (ArithmeticException e) { //���� �����⿡ 0�� �����ϸ� �ȵȴٴ� ���� Ŭ����
////			System.out.println("0���� ���� �� �����ϴ�.");
////		} finally {
////			System.out.println("���α׷�����");
////		}
////	}
//=======
//package ch10_3_example;
//
//import java.util.Scanner;
//
//public class ExceptionCase {
//	public static void main(String[] args) {
//		// �� ������ ����ڷκ��� �Է¹ޱ� ��)3,4 3/4������ �����ϰ�
//		// �Է¹��� ���ڿ� ������ ����� ����Ͻÿ�
//
//		Scanner scanner = new Scanner(System.in);
//	
//		try {
//			System.out.print("ù��° �Է� �� = ");
//			int x = Integer.parseInt(scanner.nextLine());
//			System.out.print("�ι�° �Է� �� = ");
//			int y = Integer.parseInt(scanner.nextLine());
//			System.out.println("������ �� = " + x / y);
//		} catch (NumberFormatException e) {
//			System.out.println("�Է°��� ���ڿ��� ����� �Ұ����մϴ�.");
//		} finally {
//		}
//		System.out.println("���α׷� ����");
//	}
//}

//����� ���
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
//			System.out.println("0���� ���� �� �����ϴ�.");
//		} finally {
//			System.out.println("���α׷�����");
//		}
//	}
//}