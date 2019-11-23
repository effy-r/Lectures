
public class statement {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int month = 2;
	        String monthString;
	        switch (month) {
	            case 1:  monthString = "Monday";
	                     break;
	            case 2:  monthString = "Tuesday";
	                     break;
	            case 3:  monthString = "Wednesday";
	                     break;
	            case 4:  monthString = "Thursday";
	                     break;
	            case 5:  monthString = "Friday";
	                     break;
	            case 6:  monthString = "Saturtday";
	                     break;
	            case 7:  monthString = "Sunday";
	                     break;
	            default: monthString = "Invalid month";
	                     break;
	        }
	        System.out.println(monthString);
	}

}
