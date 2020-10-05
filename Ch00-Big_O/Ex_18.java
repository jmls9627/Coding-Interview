public static void main(String[] args) {
    allFib(6);
}	

public static void allFib(int n) { //O(2^N)
    for (int i = 0; i < n; i++) {
        System.out.println(i + ": " + fib(i));
    }
}

public static int fib(int n) { 
    if (n <= 0) return 0;
    else if (n == 1) return 1;    
    return fib(n - 1) + fib(n - 2);
}

