package ch10_2_exception_handling;

public class TryCatchFinallyExample {
	public static void main(String[] args) {
		try {
			Class clazz = Class.forName("java.lang.String2");
		} catch (ClassNotFoundException e) {
//			e.printStackTrace();
			System.out.println("�ش� Ŭ������ �������� �ʽ��ϴ�.");
		}
		System.out.println("���α׷� ����");
	}
}
