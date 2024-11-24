/*

#feedback

Eden, Great work!

Yam

*/

// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		int lim = Integer.parseInt(args[0]);
        int a = (int) (Math.random() * lim);
        int b = (int) (Math.random() * lim);
        int c = (int) (Math.random() * lim);
         System.out.println(a + "," + b + "," + c);
        
         
// biggest min and max         
         int min = Math.min(a, Math.min(b, c));
         int max = Math.max(a, Math.max(b, c));
         
// finding middle 
         int sum = a + b + c;
         int middle = sum - max - min;


         System.out.println( min + "," + middle + "," + max );


	}
}
