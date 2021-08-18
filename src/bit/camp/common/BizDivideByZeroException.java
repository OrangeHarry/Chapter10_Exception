package bit.camp.common;

public class BizDivideByZeroException extends Exception {
	@Override
	public String toString() {
		return "0으로 나눌 수가 없습니다.";
	}
}
