import java.util.Scanner;
class P5_152{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Find Purchase price");
		System.out.println("Given the price of goods for 1 kg");
        int sweets = 2500;
        int biscuits = 800;
        int apples = 150;
        System.out.println("One kg of sweets costs 2500 tg");
        System.out.println("One kg of biscuits costs 800 tg");
        System.out.println("One kg of apples costs 150 tg");
        System.out.println("Give the number of kg");
		int x= in.nextInt();
		int y= in.nextInt();
		int z= in.nextInt();

		System.out.println("Sweets: "+(x*sweets)+"tg");
		System.out.println("Biscuits: "+(y*biscuits)+"tg");
		System.out.println("Apples: "+(z*apples)+"tg");

		System.out.println("The Purchase price: "+((x*sweets)+(y*biscuits)+(z*apples))+" tg");

        


	}
}

