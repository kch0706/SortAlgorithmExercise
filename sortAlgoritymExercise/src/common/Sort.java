
/**
 * 실제 정렬용 클래스
 * @author KCH
 * create_date : 2025.11.10
 */

/*
 * 필요 기능
 * - 시작시간 기록 메소드
 * - 끝 시간 기록 메소드
 * - 걸린 시간 계산 메소드
 * 
 * - 난수 생성 및 정수화 메소드
 * 
 * - 정렬 메소드
 * 
 */

package common;

import java.util.List;

import sortAlgoritymClasses.BubbleSort;
import sortAlgoritymClasses.SelectionSort;
import sortAlgoritymClasses.SortFunctions;

public class Sort {

	public static void main(String[] args) {

		System.out.println("정렬하기!\n");
		
		RandomNumberGenerater random = new RandomNumberGenerater();
		
		int amount = 20;
		
		String sortMethod = "ASC";
		
		List<Integer> list = random.randomNumberGenerater(amount);
		
		//SortFunctions sort = new BubbleSort(list);
		SortFunctions sort = new SelectionSort(list);
		
		if(sortMethod.equals("ASC")) {
			list = sort.ASCsort();
		}
		else if(sortMethod.equals("DESC")) {
			list = sort.DESCSort();
		}
		else {
			System.out.println("sortMethod값을 수정 해 주세요.");
		}
		
		
		System.out.println("\n최종 정렬 결과");
		for(int i:list) {
			System.out.print(i+" ");
		}
		
	}

}
