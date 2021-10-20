public class Prime {
	    public static void main(String[] args) {
	        int num = 7;
	        boolean count = false;
	        for (int i = 2; i <= num / 2; i++) {
	            if (num % i == 0) {
	                count = true;
	                break;
	            }
	        }
	        if (!count)
	            System.out.println(num + " is a prime number.");
	        else
	            System.out.println(num + " is not a prime number.");
	    }
	}

