public class P5_4109{
	public static void main(String[] args) {
		int numsuit = 6;

		switch(numsuit){
			case 6:
			 	System.out.println("Six");
			 	break;
			case 7:
			 	System.out.println("Seven");
			 	break;
			case 8:
			 	System.out.println("Eight");
			 	break;
		   	case 9:
				System.out.println("Nine");
				break;
			case 10:
				System.out.println("Ten");
				break;
			case 11:
				System.out.println("Valet");
				break;
			case 12:
				System.out.println("Dama");
				break;
			case 13:
				System.out.println("King");
				break;
			case 14:
				System.out.println("Tuz");
				break;
		    default:
			 	System.out.println("Please enter number between 1 and 4 and including them");
			 	break;
			 }
		}
	}