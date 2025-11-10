package common;

public class TimeRecord {
	
	private long startTime;
	private long endTime;
	
	private double startTimeToMiliSeconds;
	private double endTimeToMiliSeconds;
	
	private int timeTakenToMiliSeconds;
	
	//시작 시간 기록
	public long startTime() {
		//long 타입의 변수로 System.nanoTime()을 사용하여 시간을 넣을 수 있다. -> 정렬 시 걸린 시간 작성시 사용
		this.startTime = System.nanoTime();
		
		return this.startTime;
	}
	
	//끝난 시간 기록
	public long endTime() {
		
		this.endTime = System.nanoTime();
		
		return this.endTime;
	}
	
	//소요 시간 계산 및 밀리초 단위 변환
	public long timeTaken() {
		
		this.startTimeToMiliSeconds = (this.startTime/1000)/1000;
		this.endTimeToMiliSeconds = ((this.endTime/1000)/1000);
		
		this.timeTakenToMiliSeconds 
		= (int)(this.endTimeToMiliSeconds - this.startTimeToMiliSeconds);
		
		return this.timeTakenToMiliSeconds;
	}
	
}
