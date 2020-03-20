package designPattern.web.singleton;

/**
 * 싱글톤 패턴 
 * 인스턴스를 1개만 만들 수 있는 패턴
 * 인스턴스 생성을 외부에서 new로 할수 없고 내부에서 하는 구조로 1개만 생성되게 통제.
 * 인스턴스가 여러개가 필요 없는경우
 * ex) db 커넥션..
 */
public class SingletonBasic {
	private static final SingletonBasic instance = new SingletonBasic();
	// private 선언으로 new생성 불가
	private SingletonBasic() {}
	
	public static SingletonBasic getInstance() {
		return instance;
	}
}
