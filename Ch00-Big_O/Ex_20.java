public static void main(String[] args) {
    powersOf2(100);
}
public static int powersOf2(int n) {//O (log n)
    if (n == 1) {
        System.out.println(1);
        return 1;
    } else {
        int prev = powersOf2(n / 2);
        int curr = prev * 2;
        System.out.println(curr);
        return curr;
    }
}

	