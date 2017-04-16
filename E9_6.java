
public class E9_6 {
	private long startTime;
	private long endTime;
	
	public E9_6(){
		this.startTime = System.currentTimeMillis();
	}
	public void start(){
		this.startTime = System.currentTimeMillis();
	}
	public void end(){
		this.endTime = System.currentTimeMillis();
	}
	public long getElapsenTime(){
		return endTime - startTime;
	}
	public long getEndTime(){
		return endTime;
	}
	public long getStartTime(){
		return startTime;
	}
	public void setStartTime(long startTime){
		this.startTime = startTime;
	}
	public void setEndTime(long endTime){
		this.endTime = endTime;
	}
	
	public static void main(String[] args) {
		E9_6 stopWatch = new E9_6();
		stopWatch.end();
		System.out.println("exe time: " + stopWatch.getElapsenTime());
	}

	
	
	
}
