import java.util.Scanner;
	class P5_154{
		public static void main(String[] args) {
			Scanner in =new Scanner(System.in);

			System.out.println("Given the age");
            System.out.println("Find average age and how different is the age of aech child?");
            System.out.println("Firstly give the number of age");
            int t = in.nextInt();
            int m = in.nextInt();
            double a = ((t+m)/2);
            double dt= Math.abs(a-t);
            double mt= Math.abs(a-m);

            System.out.println("Average age: "+a);
            System.out.println("The different of each: "+"Tanya: "+dt+" Mitya: "+mt);
		}
	}
