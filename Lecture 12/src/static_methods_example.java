import java.util.Arrays;

public class static_methods_example {

	private static int studentsInClassA = 30;
	private static int studentsInClassB = 35;
	private static int studentsInClassC = 30;
	public static int sum;
	public static int sum1;

	public static int sumOfStudents() {
		return sum = studentsInClassA + studentsInClassB + studentsInClassC;

	}

	public static int sum(int arg1, int arg2, int arg3) {
		return arg1 + arg2 + arg3;

	}

	public static void sumArrayValues(int[] myArray) {
		int sum1 = 0;

		for (int e : myArray){
			sum1 += e;
	
		}System.out.println(sum1);
	}
	

	public static void printOut(int[] myArray) {
		System.out.println(myArray.toString());
	}
	public static void printOutValues (int [] myArray){
		for (int i=0; i<myArray.length; i++){
			System.out.print(myArray[i]);
		}System.out.println(" ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*System.out.println(sumOfStudents());
		int sum = sum(1, 2, 3);
		System.out.println(sum);*/

		int[] data = new int[4];
		sumArrayValues(data);
		printOut(data);

		int[] data2 = new int[20];
		
		sumArrayValues(data2);
		printOut(data2);
//		System.out.println(data.toString());
		printOutValues(data);
		
		printOutValues(data2);

	}

}
