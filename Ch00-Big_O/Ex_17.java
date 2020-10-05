public static void main(String[] args) {
    for (int i = 0; i < 6; i++) {
        System.out.println(i + ": " + fib(i));
    }
}	
public static int fib(int n) { //O(2^n)
    if (n <= 0) return 0;
    else if (n == 1) return 1;    
    return fib(n - 1) + fib(n - 2);
}


