public class recursion2{
	public static void printNub(int n){
	    if(n==6){
	        return;
	    }
	    System.out.println(n);
	    printNub(n+1);
	}
	public static void main(String[]args){
	    int n=1;
	    printNub(n);
	}
	    
	}

