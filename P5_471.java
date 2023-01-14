import java.util.Scanner;
class P5_471{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Give two numbers");
		int a = in.nextInt();
		int b = in.nextInt();

		if(a>b){
			System.out.println("Largest is "+a);
		}else{
			System.out.println("Largest is "+b);
		}
		if(a<b){
			System.out.println("Smallest is "+a);
		}else{
			System.out.println("Smallest is "+b);
		}


	}
}