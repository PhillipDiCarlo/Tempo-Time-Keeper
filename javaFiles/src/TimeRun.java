import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;


public class TimeRun extends TimeCard{

	public TimeRun(String ColA, String ColB, String ColC, String ColD) {
		super(ColA, ColB, ColC, ColD);
		
	}
	
	private static TimeCard columns;
	static ArrayList<TimeCard> timeInput = new ArrayList<TimeCard>();
	static ArrayList<String> timeTemp = new ArrayList<String>();
	

	public static void main(String[] args) throws IOException {

		System.out.println("Please enter the year(YYYY).");		
		Scanner sc = new Scanner(System.in);
		String year1 = sc.nextLine();
		System.out.println("Please enter the month(MM).");
		String month1 = sc.nextLine();
		System.out.println("Please enter the day(DD).");
		String day1 = sc.nextLine();
		
		
		
		// The name of the file to open.
        String fileName = year1 + "-" + month1 + "-" + day1 + ".txt";

        // This will reference one line at a time
        String line = null;

        
        // FileReader reads text files in the default encoding.
        FileReader fileReader = new FileReader(fileName);

            // Always wrap FileReader in BufferedReader.
        BufferedReader bufferedReader = new BufferedReader(fileReader);

            //Read every available line and write to an array
            while((line = bufferedReader.readLine()) != null) {
            	String str1[] = line.split(" ");
            	columns =  new TimeCard(str1[0], str1[1], str1[2], str1[3]);

            	timeInput.add(columns);
            	
            	//Populate a new arrayList for later use
            	for (int x = 0; x < timeInput.size(); x++) {
           		   
                	  if(!timeTemp.contains(str1[2])) {
                		  timeTemp.add(str1[2]);
                	  }
                 	       	   
                    }
            }
            
            // Always close files.
            bufferedReader.close();         
        

            String search = "";
            Boolean isFalse = false;
            
            while(isFalse != true) {
            	System.out.println("----------------------------");
            	System.out.println("THE AVALABLE CHARGE TIMES BELOW: ");
            	
            	for(int x=0; x<timeTemp.size(); x++) System.out.println(timeTemp.get(x));
            	System.out.println("----------------------------");
            	
            	System.out.println("Please enter a charge time to find total hours, else type NO");
            	search = sc.nextLine().toUpperCase();
            	
            	if(search.equals("NO")) {
            		isFalse = true;
            		System.exit(0);
            	}
            
            	searchFor(search);
            	
            }
            
	}

	
		
    public static void searchFor(String search) {
		
    	int addition = 0;
      for (int x = 0; x < timeInput.size(); x++) {
     		   
    	  String searchAgainst = timeInput.get(x).getCode().toUpperCase();
    	  
    	  if(searchAgainst.contains(search)) addition += timeInput.get(x).getTotalTime(); 
     		   
        }
      
      System.out.println("The charge code " + search + " is at " + addition + " minutes for today.");
      waiting();
      
      
    } 
    
    public static void waiting()  {
    	
    	System.out.println("Press ENTER to continue.");
    	Scanner tempy = new Scanner(System.in);
    	String idk = tempy.nextLine();
    }
    
		

}


