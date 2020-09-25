
public static void main(String[] args) { //O(2^n)=>O(n)
    f(1);
}
public static int f(int n) {
    if (n <= 0) {
        return 1;
    }
    return f(n - 1) + f(n - 1);
}
