public static void main(String[] args) {
    System.out.println(sumDigits(1252));
}
public static int sumDigits(int n) {//O(log n)
    int sum = 0;
    while (n > 0) {
        sum += n % 10;
        n /= 10;
    }
    return sum;
}

