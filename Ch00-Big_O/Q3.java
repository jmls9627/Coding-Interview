public static void main(String[] args) {
    System.out.println(mod(3, 6));
}

public static int mod(int a, int b) { //O(1)
    if (b <= 0) {
        return -1;
    }
    int div = a / b;
    return a - div * b;
}

