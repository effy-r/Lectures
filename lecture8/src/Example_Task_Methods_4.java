class ArraySum {
	private int[] array;
	private int sum = 0;

	void setArray(int[] array1) {
		array = array1;
	}

	int getArraySum() {

		for (int i = 0; i < array.length; i++) {

			sum += array[i];

		}
		System.out.println("sum is " + sum);
		return sum;

	}
}

public class Example_Task_Methods_4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArraySum newArray = new ArraySum();
		int[] audi = { 1, 2, 3, 4 };
		newArray.setArray(audi);
		newArray.getArraySum();

		/*
		 * int sum = 0; for (int i=0; i<audi.length; i++){
		 * 
		 * sum += audi[i];
		 * 
		 * }System.out.println("sum is " + sum);
		 */
	}
}
