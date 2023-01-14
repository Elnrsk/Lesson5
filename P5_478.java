import java.util.Scanner;
class P5_478{

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
          
        System.out.println("Write three number");

		int x = in.nextInt();
		int y = in.nextInt();
		int z = in.nextInt();

		if(x%2==0 ){
		 System.out.println(x+" is even");
		}else{
			System.out.println(x+" is odd");
		}
		if(y%2==0){
			System.out.println(y+" is even");
		}else{
			System.out.println(y+" is odd");
		}
		if(z%2==0){
			System.out.println(z+" is even");
		}else{
			System.out.println(z+" is odd");
		}
	}}