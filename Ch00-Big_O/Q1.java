public static void main(String[] args) {
    System.out.println(product(5, 6));
}

public static int product(int a, int b) {  //O(b)
    int sum = 0; 
    for (int i = 0; i < b; i++) {
        sum += a;
    }
    return sum;
}

