
public class TimeCard {
	
	private String timeIn;
	private String timeOut;
	private String code;
	private String descript;
	private int totTime;
	public int code_1TR731MMPR09;
	public int code_TC;
	
	public TimeCard(String ColA, String ColB, String ColC, String ColD) {
		
		this.timeIn = ColA;
		this.timeOut = ColB;
		this.code = ColC.toUpperCase();
		this.descript = ColD;

		System.out.println("________________");
		System.out.println("Charge Code: " + getCode());
		System.out.println("Description: " + getDescript());
		System.out.println("Time in session: " + getTotalTime() + " minutes.");
		 
	}
	

	
	public int getTotalTime() {
		
		int intInHr = Integer.parseInt(timeIn.substring(0, 2))*60;
		int intInMin = Integer.parseInt(timeIn.substring(2));
		int intInTime = intInHr + intInMin;
		int intOutHr = Integer.parseInt(timeOut.substring(0,2))*60;
		int intOutMin = Integer.parseInt(timeOut.substring(2));
		int intOutTime = intOutHr + intOutMin;
		
		totTime = intOutTime - intInTime;		
		return totTime;
	}
	
	
	public String getCode() {
		return code;
	}
	
	
	public String getDescript() {
		return descript;
	}
	
	
}
