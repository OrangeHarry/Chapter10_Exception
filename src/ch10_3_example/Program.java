package ch10_3_example;

public class Program {
	public static void main(String[] args) {
/*
* ����
*   -�������� : ġ�������� ����(�������� : ������ �� ��������)
*   -������ : �ſ�ġ���� (������ �ڵ� ����(�������� ��������) )
*   -��     ��  : �Է°�, ����°���, ������ ��ġ ���
*   
*   [���ܸ� ó���Ѵ�?]
*   - ������ ó��?
*   - ��� ó��?
*   
*   ����) ���� ����� �� API �̿�
*   : API �Լ����� ���ܸ� �˾Ƽ� ó���Ѵٸ�?
*   
*   write() {               �������α׷�
*   ����               �����߻�                        try
*   ��������        ------->          write();
*   ���Ͽ뷮             ����            
*   ....    throw ���ܰ�ü               catch
*                             ����ó��
*    }
*   
*/
try {
	lib.write();
} catch (InterruptedException e) {
	// TODO: handle exception
	e.printStackTrace();
}
	
	System.out.println("���α׷� ����");
	}
	
	static class lib{
		public static void write() throws InterruptedException {
			Thread.sleep(1000);
			
		}
	}
}
