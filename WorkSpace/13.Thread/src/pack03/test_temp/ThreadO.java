package pack03.test_temp;


public class ThreadO implements Runnable {
//	public ThreadO() {
//		setName("ThreadO");
//	}

	@Override
	public void run() {
		for (int i = 1; i < 101; i++) {
			System.out.println( i + " 실행중" );
		}try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("기타 오류");
		}
		
	}

}
