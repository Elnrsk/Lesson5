import java.util.Scanner;
class P5_153{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        System.out.println("How much will 3 or N computers of these items cost?");
        System.out.println("Firstly give price of elements!");
		int m = in.nextInt();//monitor
		int sb= in.nextInt();//system block
		int k = in.nextInt();//keyboard
		int ms = in.nextInt();//mouse

		double comp = m+sb+k+ms;
		System.out.println("The price of 1 computer: "+comp);
		System.out.println("Price of 3 computers: "+(3*comp));

		System.out.println("Give number for N");//N is also amount of comp
		int N = in.nextInt();

	    System.out.println("Price of "+N+" computers: "+(N*comp));
	}
}