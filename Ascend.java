// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		int lim = Integer.parseInt(args[0]);
        int a = (int) (Math.random() * lim);
        int b = (int) (Math.random() * lim);
        int c = (int) (Math.random() * lim);
         System.out.println(a + "," + b + "," + c);
        

// now we are figuring out the middle number
         int one = Math.min(a,b);
         int two = Math.min(one,c);
         int middle = Math.max(one,two);
         
// biggest min and max         
         int min = Math.min(one,two);
         int max = Math.max(Math.max(a, b), c);


         System.out.println(min + "," + middle + "," + max );


	}
}
