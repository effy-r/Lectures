
public class Lecture_examples{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String [] cars = {"Volvo", "BMW", "Ford", "Mazda"};
		System.out.println("Cars:");
		System.out.println(cars[0]);

		System.out.println(cars.length);

		cars[0] = "Opel";

		System.out.println(cars[0]);
		System.out.println(cars);
		System.out.println(cars.length);
		System.out.println(cars[1]);

		// another example from the teacher
		System.out.println("values1");
		int size = 6;
		int[] values = new int[4];
		System.out.println(values);
		System.out.println(values[2]);
				
		//another example
		System.out.println("values2");
		int[] values2={1,2,3,4};
		System.out.println(values2[1]);
		
		//Array loop
		
		System.out.println("Array loop:");
		
		for (int i=0; i < values.length; i++){
			System.out.println(values2[i]);
			
		}
		
		//Enhanced loop
		System.out.println("Enhanced loop:");
		
		for(int elem : values2){
			System.out.println(elem);
			
		}
		}

	}


