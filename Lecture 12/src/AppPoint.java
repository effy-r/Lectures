class Point {
	int x;
	int y;

	public String toString() {
		return "x:" + this.x + " y:" + this.y;
	}

	public Point() {

	}

	// creating a new constructor
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
public static int calculateMiddlePoint (int firstCoordinate, int secondCoordinate){
	return (firstCoordinate+secondCoordinate)/2;
}

public static Point createMiddlePoint(Point point1, Point point2){
	int middleX = (point1.x+point2.x)/2;
	int middleY = (point1.y + point2.y)/2;
	Point middlePoint = new Point (middleX, middleY);
	
	return middlePoint;
}
	/*
	 * public int getCoordinates(int myArray[][]){ return myArray[x][y]; }
	 * public static void toString(int [][] myArray){ for (int i=0;
	 * i<myArray.length; i++){ System.out.print(myArray[i]);
	 * }System.out.println(" ");
	 * 
	 * } final static int MAX_X = 10; final static int MAX_Y = 10;
	 */
}

public class AppPoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Point startPoint = new Point();
		startPoint.x = 0;
		startPoint.y = 0;
		System.out.println(startPoint.toString());

		Point endPoint = new Point(10,10);
		System.out.println(endPoint.toString());
		int middlePointX=(startPoint.x + endPoint.x)/2;
		int middlePointY=(startPoint.y + endPoint.y)/2;
		Point middlePoint = new Point (middlePointX,middlePointY);
		System.out.println(middlePoint.toString());
		/*
		 * int[][] data = new int [Point.MAX_X][Point.MAX_Y];
		 * Point.toString(data);
		 */

		
	}

}
