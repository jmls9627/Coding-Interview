public static void main(String [] args) {         
	int max=20;
		  for(int i =0;i<max;i++){
			  System.out.println(Fibonacci(i));  
		  }


public static int fibonacciLineal(int n) {
    if (n == 0) return 0;
    else if (n == 1) return 1;
    
    int[] memo = new int[n];
    memo[0] = 0;
    memo[1] = 1;
    for (int i = 2; i < n; i++) {
        memo[i] = memo[i - 1] + memo[i - 2];
    }
    return memo[n - 1] + memo[n - 2];
}

////////////////////////////////////////////////////////////////////////

	public static int fibonacciLineal1(int n) {
		if (n == 0) return 0;
		int a = 0;
		int b = 1;
		for (int i = 2; i < n; i++) {
			int c = a + b;
			a = b;
			b = c;
		}
		return a + b;
	}

	//////////////////////////////RECURSIVE////////////////////////////////////

	public static int Fibonacci(int n){
		if(n==0) return 0;
		if(n==1) return 1;
		
		return Fibonacci(n-1) + Fibonacci(n-2);
	}
	/////////////////////////////////////////////////////////////////////
	public static int fibonacci(int n) {
		return fibonacci(n, new int[n + 1]);
	}
	
	public static int fibonacci(int i, int[] memo) {
		if (i == 0) return 0;
		else if (i == 1) return 1;
		
		if (memo[i] == 0) {
			memo[i] = fibonacci(i - 1, memo) + fibonacci(i - 2, memo);
		}
		return memo[i];
	}