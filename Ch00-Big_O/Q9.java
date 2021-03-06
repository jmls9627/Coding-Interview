public static void main(String[] args) {
    int[] array = {1, 2, 3, 4, 5, 6};
    int[] copy = copyArray(array);
    for (int x : copy) {
        System.out.println(x);
    }
}

public static int[] copyArray(int[] array) { //O(n^2)
    int[] copy = new int[0];
    for (int value : array) {
        copy = appendToNew(copy, value);
    }
    return copy;
}

public static int[] appendToNew(int[] array, int value) { //O(n)
    // copy all elements over to new array
    int[] bigger = new int[array.length + 1];
    for (int i = 0; i < array.length; i++) {
        bigger[i] = array[i];
    }

    // add new element
    bigger[bigger.length - 1] = value;
    return bigger;
}

