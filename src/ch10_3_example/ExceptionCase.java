package ch10_3_example;

import java.util.Scanner;
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
public class ExceptionCase {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("a/b...a?>");
		int n1 = sc.nextInt();
		System.out.print("a/b...b?>");
		int n2 = sc.nextInt();

		try {
			System.out.printf("%d / %d = %d\n", n1, n2, n1 / n2);
		} catch (ArithmeticException e) {
			System.out.println("0���� ���� �� �����ϴ�.");
		} finally {
			System.out.println("���α׷�����");
		}
	}
}