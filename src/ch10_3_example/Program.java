package ch10_3_example;

public class Program {
	public static void main(String[] args) {
/*
* 오류
*   -구문오류 : 치명적이지 않음(문법오류 : 컴파일 시 수정가능)
*   -논리오류 : 매우치명적 (개발자 코딩 오류(문법적인 문제제외) )
*   -예     외  : 입력값, 입출력관련, 물리적 장치 사용
*   
*   [예외를 처리한다?]
*   - 무엇을 처리?
*   - 어디서 처리?
*   
*   예시) 파일 입출력 시 API 이용
*   : API 함수에서 예외를 알아서 처리한다면?
*   
*   write() {               관리프로그램
*   권한               오류발생                        try
*   파일존재        ------->          write();
*   파일용량             보고            
*   ....    throw 예외객체               catch
*                             오류처리
*    }
*   
*/
try {
	lib.write();
} catch (InterruptedException e) {
	// TODO: handle exception
	e.printStackTrace();
}
	
	System.out.println("프로그램 종료");
	}
	
	static class lib{
		public static void write() throws InterruptedException {
			Thread.sleep(1000);
			
		}
	}
}
