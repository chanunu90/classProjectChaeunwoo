package chapter09;

public class RandomTest {

	public static void main(String[] args) {
		double num = 0.0; 
		int[] list = new int[6];
		
		int count = 0;
		while(count <= 5) {
			num = Math.random()*45+1;
			
			for(int i:list) {
				if((int)i == (int)num) {
					num = Math.random()*10+1;
					continue;
				}		
			}
			list[count] = (int)num;
			System.out.println(list[count]);
			count++;
		}
	}
}
