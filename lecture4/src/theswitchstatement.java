
public class theswitchstatement {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int day = 1;
		String dayString ;
		
		switch (new day){
		
		case 7: dayString = "Sunday";
		
		case 6: dayString = "Saturtday";
		
		case 5: dayString = "Friday";
		case 4: dayString = "Thursday";
		case 3: dayString = "Wednesday";
		case 2: dayString = "Tuesday";
		case 1: dayString = "Monday";
		break;
		
		/*case 1: dayString = "Monday";
		break;
		case 2: dayString = "Tuesday";
		break;
		case 3: dayString = "Wednesday";
		break;
		case 4: dayString = "Thursday";
		break;
		case 5: dayString = "Friday";
		break;
		case 6: dayString = "Saturtday";
		break;
		case 7: dayString = "Sunday";
		break;*/
		
        
		}
		
		System.out.println(dayString);
	}

}
