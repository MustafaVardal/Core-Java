
public class RecapDemo2 {

	public static void main(String[] args) {
		double[] myList = new double[4];
		myList[0] = 1.1;
		myList[1] = 2.2;
		myList[2] = 3.3;
		myList[3] = 4.4;
		// We need to add values in our array.
		// or we can do directly this.
		
		for (double number : myList) {
			System.out.println(number);
		}
		System.out.println("--------------");
		double[] myList2 = { 1.1, 2.3, 5.1, 5.2 };
		double total= 0;
		for(double num : myList2) {
			total =+ num;
			System.out.println(num);
		}
		
		System.out.println("--------------");
		
		double max = myList2[0];
		
		for(double num : myList2) {
			if (max < num) {
				max = num;
			}
			total += num;
			System.out.println(num);
			
		}
		
		System.out.println("Total : " + total);
		System.out.println("Maximum number : "+ max);
		
		
	}

}
