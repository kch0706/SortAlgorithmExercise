
/**
 * 정렬 기능 인터페이스
 * @author KCH
 * create_date : 2025.11.10
 */

package sortAlgoritymClasses;

import java.util.List;

public interface SortFunctions {
	
	//오름차순 정렬 및 정렬 결과를 리턴하는 메소드
	public List<Integer> ASCsort();
	
	//내림차순 정렬 및 정렬 결과를 리턴하는 메소드
	public List<Integer> DESCSort();
	
}
