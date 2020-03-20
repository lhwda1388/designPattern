package designPattern.web.singleton;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SingleTonTest {

	@Test
	public void singleTonBasic() {
		SingletonBasic sb1 = SingletonBasic.getInstance();
		SingletonBasic sb2 = SingletonBasic.getInstance();
		// 동일함 확인
		assertEquals(sb1, sb2);
	}
	
	@Test
	public void singleTonSynTest() {
		Thread t1 = new Thread(() -> {
			SingletonSync sb1 = SingletonSync.getInstance();
		});
		Thread t2 = new Thread(() -> {
			SingletonSync sb2 = SingletonSync.getInstance();
		});
		t1.run();
		t2.run();
	}
	
	@Test
	public void singletonEnum() {
		SingletonEnum sb1 = SingletonEnum.getInstance();
		SingletonEnum sb2 = SingletonEnum.getInstance();
		
		assertEquals(sb1, sb2);
		
	}
	

}
