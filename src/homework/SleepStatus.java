package homework;

public class SleepStatus {
	
	public static void main(String[] args) {
		
		boolean amIssleeing = spleepin(false, false);
		System.out.println(amIssleeing);
		
		boolean amIssleeing1 = spleepin(false, true);
		System.out.println(amIssleeing1);
			
		boolean amIssleeing2 = spleepin(true, false);
		System.out.println(amIssleeing2);
		
		boolean amIssleeing3 = spleepin(true, true);
		System.out.println(amIssleeing3);
			
		}
	
public static boolean spleepin(boolean isWeekday, boolean isVacation) {
	
	boolean result = false;
	
	if(isWeekday == true && isVacation == true) {
		result = true;
	} else if(isWeekday == true && isVacation == false) {
		result = false;
	} else if(isWeekday == false && isVacation == true) {
		result = true;
	} else if(isWeekday == false && isVacation == false)
		result = true;
	
	return result;
}

}
