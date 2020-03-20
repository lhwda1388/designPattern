package designPattern.web.singleton;
/**
 * enum 클래스 통한 싱글톤
 * Thread-safety와 Serialization이 보장
 * Reflection을통한 private 생성자 생성공격에도 안전
 * 싱글톤 구현에 가장좋은 방법.
 */
public enum SingletonEnum {
	INSTANCE;
	
	public static SingletonEnum getInstance() {
		return INSTANCE;
	}

}
