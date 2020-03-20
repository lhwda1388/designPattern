package designPattern.web.singleton;

/**
 * 늦은 초기화 : getInstance()를 호출했을때 인스턴스화
 * 스레드 안전 : 스레드 환경에서 synchronized 로 인스턴스화 동시 수행 방지
 */
public class SingletonSync {
	private static SingletonSync instance = null;
	// private 선언으로 new생성 불가
	private SingletonSync() {}
	public static SingletonSync getInstance() {
		if (instance == null) {
			synchronized (SingletonSync.class) {
				if (instance == null) instance = new SingletonSync();
			}
		}
		System.out.println(instance);
		return instance;
	}
}
