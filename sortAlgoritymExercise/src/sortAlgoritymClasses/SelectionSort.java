/**
 * 선택 정렬 클래스
 * @author KCH
 * create_date : 2025.11.11
 */



package sortAlgoritymClasses;

import java.util.List;

import common.TimeRecord;

public class SelectionSort extends CommonFunction implements SortFunctions{
	
	private List<Integer> list;
	
	private TimeRecord time = new TimeRecord();
	
	public SelectionSort(List<Integer> list) {
		this.list = list;
	}

	@Override
	public List<Integer> ASCsort() {
		
		//처음 값 가지고 나머지 수 모두와 비교
		//처음 값보다 작으면서 제일 작은 수를 처음 값과 위치 변경
		
		System.out.println("선택정렬 오름차순");
		
		int count = 1;
		//boolean flag = true;
		
		//정렬 시작시간 기록
		this.time.startTime();
		
		for(int i=0;i<list.size();i++) {
			
			int tempNum = 0;
			Integer minNum = 0;
			Integer minNumIndex = null;
			
			for(int j=0;j<list.size();j++) {
				
				//현재값과 다른 값의 비교
				//(현재값보다 작은 값을 임시변수에 넣음)
				if(list.get(i) > list.get(j) || minNum > list.get(j)) {
					//System.out.println("값 비교중!");
					minNum = list.get(j);
					minNumIndex = j;
				}

			
			}
			
			//최소값이 있다면 최소값과 현재 값 위치 변경
			if(minNum != null && minNumIndex != null) {
				tempNum = list.get(i);
				list.set(i, minNum);
				list.set(minNumIndex, tempNum);
			}
			for(int k:list) {
				System.out.print(k + " ");
			}
			System.out.println("");
		}
		
		//정렬 끝 시간 기록
		this.time.endTime();
		//정렬 소요시간 계산 및 출력
		this.time.timeTaken();
		
		return this.list;
	}

	@Override
	public List<Integer> DESCSort() {
		
		System.out.println("선택정렬 내림차순");
		
		return this.list;
	}
	
}
