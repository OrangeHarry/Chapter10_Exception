package ch10_3_example;

public class Calculator {

	// ���������� x+y ���� 1000�� ������ ����!! �������� ����!!
	public static int add(int x, int y) throws BizThousandOverException, BizNegativeNumberException {// throws�� ������ Ŭ���� �̸��� ��Ȳ�� �°� ���� ���� ���� ��
																			                         // throws�� ������ ������ ���ܸ� ������ ������ ����
		if (x + y > 1000) {
			throw new BizThousandOverException();
		}
		if (x + y < 0) {
			throw new BizNegativeNumberException();
		}
		return x + y;
	}
	
	//���������� x-y���� �����̸� ����!
	public static int sub(int x, int y) throws BizNegativeNumberException {
		if(x-y<0) {
			throw new BizNegativeNumberException();
		}
		return x - y;
	}
	
	public static int multi(int x, int y) {
		return x * y;
	}
	
	//���������� y�� ���� 0�̸� ����
	public static int div(int x, int y) throws BizDivideByZeroException{
		if(y == 0) {
			throw new BizDivideByZeroException();
		}
		return x / y;
	}
}
