import java.util.Scanner;
class P5_472{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Give three numbers");
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();


		if(a>b && a>c){
			System.out.println("Largest is "+a);
		}else{
			System.out.println(a+" is not largest");
		}
		if(b>a && b>c){
			System.out.println("Largest is "+b);
		}else {
			System.out.println(b+" is not largest");
		}
		if(c>a && c>b){
			System.out.println("Largest is "+c);
		}else {
			System.out.println(c+" is not largest");
		}
		if(a<b && a<c){
			System.out.println("Smallest is "+a);
		}else{
			System.out.println(a+" is not smallest");
		}
		if(b<a && b<c){
			System.out.println("Smallest is "+b);
		}else{
			System.out.println(b+" is not smallest");
		}
		if(c<a && c<b){
			System.out.println("Smallest is "+c);
		}else{
			System.out.println(c+" is not smallest");
		}
}
}