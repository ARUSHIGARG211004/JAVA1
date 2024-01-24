public class recursion1
{
	public static void printNub(int n){
	    if(n==0){
	        return;
	    }
	    System.out.println(n);
	    printNub(n-1);
	}
	public static void main(String[]args){
	    int n=5;
	    printNub(n);
	}
	    
	}

