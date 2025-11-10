
/**
 * 난수 생성용 클래스
 * @author KCH
 * create_date : 2025.11.10
 */

package common;

import java.util.ArrayList;
import java.util.List;

public class RandomNumberGenerater {
	
	private List<Integer> numbers = new ArrayList<>(); 
	
	public List<Integer> randomNumberGenerater(int num) {
		
		//boolean flag = false;
		
		for(int i=0;i<num;i++) {
			int randomNum = (int)(Math.random()*256);
			numbers.add(randomNum);
		}
		
		printRandomNums(num);
		
		return this.numbers;
	}
	private void printRandomNums(int num) {
		System.out.println("생성된 난수");
		for(int nums:numbers) {
			System.out.print(nums+" ");
		}
	}
	
}
