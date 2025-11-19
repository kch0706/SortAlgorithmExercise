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

		//1. 처음 값을 메모리에 저장
		//2. 처음 값과 나머지 값들을 비교
		//3. 만약 처음 값이 비교하는 수보다 작고 메모리의 수가 비교하는 수보다 작다면 
		//메모리의 수에 비교하는 수를 대입
		//4. 더이상 비교할 수가 없고 메모리의 수가 제일 작으면 메모리의 수를 현재 값과 위치변경
		//5. 정렬 된 수를 제외한 나머지 수들을 다시 비교
		
		System.out.println("선택정렬 오름차순");
		
		int count = 1;
		
		//정렬 시작시간 기록
		this.time.startTime();
		
		for(int i=0;i<list.size();i++) {
			
			//int nowNum = list.get(i);
			int minNum = 0;
			int minNumIndex = 0;
			int compNum = 0;
			int tempNum = 0;
			
			for(int j=i;j<list.size();j++) {
				
				compNum = list.get(j);
				
				if(i==j) {
					minNum = compNum;
				}
				
				if(minNum>compNum) {
					minNum = compNum;
					minNumIndex = j;
				}
				
				//System.out.print(minNum+" ");
			}
			//System.out.println("");
			
			if(list.get(i)!=minNum) {

				tempNum = list.get(i);
				list.set(i, minNum);
				list.set(minNumIndex, tempNum);
				
			}
			System.out.println(count+" 번 째 정렬 결과");
			for(int k:list) {
				System.out.print(k+" ");
			}
			System.out.println("");
			count++;
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
