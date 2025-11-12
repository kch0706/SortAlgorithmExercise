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
		
		System.out.println("선택정렬 오름차순");
		
		int startNum = 0;
		int count = 1;
		boolean flag = true;
		
		this.time.startTime();
		
		while(flag) {
			
			int checkNum = list.get(0);
			
			for(int i=0;i<list.size();i++) {
				
			}
			
		}
		
		return this.list;
	}

	@Override
	public List<Integer> DESCSort() {
		
		System.out.println("선택정렬 내림차순");
		
		return this.list;
	}
	
}
