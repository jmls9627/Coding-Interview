public static int sum(int n) {  //O(n)time O(n)space
    if (n <= 0) {
        return 0;
    }
    return n + sum(n-1);
}

public static void main(String[] args) {
    int s = sum(4);
    System.out.println(s);
}