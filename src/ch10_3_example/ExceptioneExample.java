package ch10_3_example;

public class ExceptioneExample {
//	public static void main(String[] args) throws BizThousandOverException, BizNegativeNumberException, BizDivideByZeroException {//이거 나만 편하지 양심없는거야...
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
			System.out.println(e.toString()); // 이야 넘기는 클래스에서 재정의를 해서 쓸 수가 있구나
			System.out.println(e.getMessage()); //
		} catch (BizNegativeNumberException e) {
			System.out.println(e.toString());
		} catch (BizDivideByZeroException e) {
			System.out.println(e.toString());
		} finally {// 무조건 마지막에 모두 들리는 곳(예외나 정상이나)
			System.out.println("입력값을 확인하세요~");
		}

//	System.out.println(Calculator.sub(5, 3)); 하나하나 catch를 언제하냐.....그래도 해야지 내가 초급개발자 일테니깐
//	System.out.println(Calculator.multi(1, 3));
//	System.out.println(Calculator.div(1, 1));
		System.out.println("프로그램 정상 종료");
	}
}
