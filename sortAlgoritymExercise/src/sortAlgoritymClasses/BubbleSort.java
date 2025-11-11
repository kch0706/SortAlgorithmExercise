/**
 * 버블 정렬 클래스
 * @author KCH
 * create_date : 2025.11.10
 * 
 */
/*
 * 제미나이 피드백
 * 1. 반복 범위 축소 로직 구현
 * 2. 정렬 완료 플래그(check) 수정
 * - this.list.size()-2 -> 배열 크기가 1인 경우 문제
 * 3. 가독성 개선
 * - 교환 로직 분리(메소드로 분리)
 * - 주석 제거
 * 4. 코드 품질
 * - 최종 결과만을 출력하는 것이 좋음
 * 
 */

package sortAlgoritymClasses;

import java.util.List;

import common.TimeRecord;

import java.util.ArrayList;

public class BubbleSort extends CommonFunction implements SortFunctions{
	
	private List<Integer> list;
	
	private TimeRecord time = new TimeRecord();
	
	public BubbleSort(List<Integer> list) {
		this.list = list;
	}

	@Override
	public List<Integer> ASCsort() {
		
		System.out.println("버블정렬 오름차순");
		
		int check = 0;
		int count = 1;
		boolean flag = true;
		
		//시작시간 기록
		this.time.startTime();
		
		while(flag) {

			check = 0;
			
			for(int i=1;i<this.list.size();i++) {
				//초기값 넣고
				//초기값이랑 현재값이랑 비교
				//초기값이 크면 초기값과 현재값 자리 바꾸기
				//초기값이 작으면 그냥 두기
				//모든 비교값이 정상적이면 반복 중지
				
				int prevNum = this.list.get(i-1);
				int nowNum = this.list.get(i);
				int tempNum = 0;
				
				if(prevNum>nowNum) {
					tempNum = prevNum;
					this.list.set(i-1, nowNum);
					this.list.set(i, tempNum);
					//System.out.println("이동 발생!");
				}
				else {
					check ++;
					//System.out.println("이동 미발생!");
				}

				System.out.println(count+" 번 째 정렬 결과");
				for(int listIndex:list) {
					System.out.print(listIndex+" ");
				}
				System.out.println("");

				count++;
			}
			
			System.out.println("");
			
			flag = check>this.list.size()-2? false:true;
			
		}
		
		//끝 시간 기록
		this.time.endTime();
		this.time.timeTaken();
		
		return this.list;
	}

	@Override
	public List<Integer> DESCSort() {
		
		System.out.println("버블정렬 내림차순");
		
		int check = 0;
		int count = 1;
		boolean flag = true;
		
		//시작시간 기록
		this.time.startTime();
		
		while(flag) {
			
			check = 0;
			
			for(int i=1;i<this.list.size();i++) {
				
				int prevNum = this.list.get(i-1);
				int nowNum = this.list.get(i);
				int tempNum = 0;
				//System.out.println(prevNum+","+nowNum);
				if(prevNum<nowNum) {
					tempNum = nowNum;
					this.list.set(i, prevNum);
					this.list.set(i-1, tempNum);
					//System.out.println("이동 발생!");
				}
				else {
					check ++;
					//System.out.println("이동 미발생");
				}

				System.out.println(count+" 번 째 정렬 결과");
				for(int listIndex:list) {
					System.out.print(listIndex+" ");
				}
				System.out.println("");

				count++;
				
			}
			
			System.out.println("");
			
			flag = check>this.list.size()-2? false:true;
			
		}
		
		//끝 시간 기록
		this.time.endTime();
		this.time.timeTaken();
		
		return this.list;
	}

	
}
