public static void main(String[] args) {
    int[] arrayA = {0, 1, 2, 3};
    int[] arrayB = {4, 5, 6};
    printUnorderedPairs(arrayA, arrayB);
}	

public static void printUnorderedPairs(int[] arrayA, int[] arrayB) {//O(ab)
    for (int i = 0; i < arrayA.length; i++) {
        for (int j = 0; j < arrayB.length; j++) {
            if (arrayA[i] < arrayB[j]) { //O(1)
                System.out.println(arrayA[i] + "," + arrayB[j]);
            }
        }
    }
}

