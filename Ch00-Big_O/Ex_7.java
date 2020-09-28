public static void main(String[] args) {
    int[] array = {0, 1, 2, 3};
    printPairs(array);
}	

public static void printPairs(int[] array) { //O(N^2)
    for (int i = 0; i < array.length; i++) {
        for (int j = 0; j < array.length; j++) {
            System.out.println(array[i] + "," + array[j]);
        }
    }
}

