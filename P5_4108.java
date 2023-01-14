public class P5_4108{
	public static void main(String[] args) {
		int numsuit = 2;

		switch(numsuit){
			case 1:
			 	System.out.println("Peaks");
			 	break;
			case 2:
			 	System.out.println("Clubs");
			 	break;
			case 3:
			 	System.out.println("Diamonds");
			 	break;
		   	case 4:
				System.out.println("Hearts");
				break;
		    default:
			 	System.out.println("Please enter number between 1 and 4 and including them");
			 	break;
			 
		}
	}

}