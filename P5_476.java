import java.util.Scanner;
class P5_476{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        System.out.println("Give 2 number!");
        int a = in.nextInt();
        int b = in.nextInt();
         
    


        if(a>b){
        	System.out.println("First number larger than second so will half of first  "+(a/2));
        }else{
        	System.out.println("Undefined!");
        }

	}
}