public class Factor {
	    public static void main(String args[]) {
	        int Num = 99;
	        System.out.print("Factor" + Num + ":");
	        for (int i = 1; i <= Num; ++i) {
	            if (Num % i == 0) {
	                System.out.print(i + " ");
	            }
	        }
	    }
	}

