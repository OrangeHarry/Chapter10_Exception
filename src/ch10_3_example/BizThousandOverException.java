package ch10_3_example;

class MyClass extends Object{
}
//��� Ŭ������ Object�� ��ӹ޾�

public class BizThousandOverException extends Exception {//ObjectŬ������ �ڵ� ��� �޵��� throws�� �ѱ� Ŭ������ Exception�� ��ӹ޴´�.
	@Override
	public 
	String toString() {
		return "������� 1000�� �ѽ��ϴ�. Ȯ�� ���!!";
	}
	
	@Override
		public String getMessage() {
			return "�Է¿���";
		}
	
}
