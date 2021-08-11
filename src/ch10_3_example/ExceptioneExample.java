package ch10_3_example;

public class ExceptioneExample {
//	public static void main(String[] args) throws BizThousandOverException, BizNegativeNumberException, BizDivideByZeroException {//�̰� ���� ������ ��ɾ��°ž�...
//		System.out.println(Calculator.add(1, 2));
//		System.out.println(Calculator.sub(5, 3));
//		System.out.println(Calculator.multi(1, 3));
//		System.out.println(Calculator.div(1, 1));
//	}
	public static void main(String[] args) {

		try {
			System.out.println(Calculator.add(5, 2));
			System.out.println(Calculator.div(100, 0));

		} catch (BizThousandOverException e) {
			System.out.println(e.toString()); // �̾� �ѱ�� Ŭ�������� �����Ǹ� �ؼ� �� ���� �ֱ���
			System.out.println(e.getMessage()); //
		} catch (BizNegativeNumberException e) {
			System.out.println(e.toString());
		} catch (BizDivideByZeroException e) {
			System.out.println(e.toString());
		} finally {// ������ �������� ��� �鸮�� ��(���ܳ� �����̳�)
			System.out.println("�Է°��� Ȯ���ϼ���~");
		}

//	System.out.println(Calculator.sub(5, 3)); �ϳ��ϳ� catch�� �����ϳ�.....�׷��� �ؾ��� ���� �ʱް����� ���״ϱ�
//	System.out.println(Calculator.multi(1, 3));
//	System.out.println(Calculator.div(1, 1));
		System.out.println("���α׷� ���� ����");
	}
}
