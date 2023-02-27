package kr.or.ksmart.A;
public class AA01 {
	public static void main(String[] args) {
		// 메서드 호출 (작성순서 2번) (실행순서1번)
		a();
		a();
		b();
	}

	//01)하나의 패키지내 하나의 클래스내에서 리턴 없고 입력 없는 메서드 선언 (작성순서 1번) (실행순서2번)
	public static void a() {
		System.out.println("01 a 메서드 실행");
	}
	
	public static void b() {
		System.out.println("02 b 메서드 실행");
	}
}
