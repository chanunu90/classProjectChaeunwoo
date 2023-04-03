package chapter09;

public class SystemCurrentTimeMillis {

	public static void main(String[] args) {
		
		//특정 작업의 처리 시간 체크 : 성능 체크
		long startTime = System.currentTimeMillis();
		long sTime = System.nanoTime();
		
		System.out.println(startTime);
		
		
		//걍 아무거나 돌림
		int sum = 0;
		for(int i=0; i<10000000; i++) {
			int n1 = 1;
			int n2 = 2;
			sum += i;
		}
		
		// 작업 종료 시간을 변수에 저장
		long endTime = System.currentTimeMillis();
		long eTime = System.nanoTime();
		
		
		// 실행 시간은 종료 시간에서 시작시간을 뺴준다
		long result1 = endTime - startTime;
		long result2 = eTime - sTime;
		
		System.out.println("실행 시간은 : " + result1 + "ms");
		System.out.println("실행 시간은 : " + result2 + "ns");
		
	}

}
