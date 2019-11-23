public class array_2x2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {0,4,8,12}; 
		int b[] = {1,5,9,13};
		int c[] = {2,6,10,14};
		int d[] = {3,7,11,15};
		int e[][] = {
				{0,4,8,12},
				{1,5,9,13},
				{2,6,10,14},
				{3,7,11,15}
		};
		
		/*System.out.print(""+ e[1][0]+",");
		System.out.println();*/
		
		for (int i=0;i<4;i++){
			for(int j=0;j<4;j++){
				System.out.print(""+ e[j][i]+",");
			}
			System.out.println();
		}
	}
}
