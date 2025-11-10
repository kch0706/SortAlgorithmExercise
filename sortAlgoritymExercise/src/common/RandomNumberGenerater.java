package common;

import java.util.ArrayList;
import java.util.List;

public class RandomNumberGenerater {
	
	private List<Integer> numbers = new ArrayList<>(); 
	//기본타입을 제네릭으로 쓸 수 없는 이유 : 기본타입은 Object타입을 상속받지 않기 때문에
	//제네릭의 타입을 컴파일 시 (바이트코드로 변환 시) Object 타입으로 변환하여 사용
	
	public boolean randomNumberGenerater(int num) {
		
		boolean flag = false;
		
		for(int i=0;i<num;i++) {
			int randomNum = (int)(Math.random())+1;
			numbers.add(randomNum);
		}
		return true;
	}
	
}
