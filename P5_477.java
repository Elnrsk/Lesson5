import java.util.Scanner;
class P5_477{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		 System.out.println("Give 2 number!");
        int a = in.nextInt();
        int b = in.nextInt();
        double m = Math.sqrt(b);

        System.out.println("If square of second number smallest than first, that need *5 ");
        if(m<a){
        	System.out.println("So "+(b*5));
        }else{
        	System.out.println("Square is smallest!");
        }

	}
}