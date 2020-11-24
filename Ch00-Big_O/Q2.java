
public static void main(String[] args) {
    System.out.println(power(3, 4));
}

public static int power(int a, int b) { //O(b)
    if (b < 0) {
        return 0; // error
    } else if (b == 0) {
        return 1; 
    } else {
        return a * power(a, b - 1);
    }
}
