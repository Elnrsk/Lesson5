import java.util.Scanner;
class P5_473{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Give four numbers");
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		int d = in.nextInt();


		double ab=Math.max(a,b);
		double bc=Math.max(ab,c);
		double cd=Math.max(bc,d);
		System.out.println("Largest is:"+cd);

		double ab1=Math.min(a,b);
		double bc1=Math.min(ab1,c);
		double cd1=Math.min(bc1,d);
		System.out.println("Smallest is:"+cd1);



	}
}