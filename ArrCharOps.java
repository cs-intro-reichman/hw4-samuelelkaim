public class ArrayCharOps {

    // Prints the content of the array
    public static void println(char[] arr) {
        if (arr == null) {
            throw new IllegalArgumentException("Array cannot be null");
        }
        for (char c : arr) {
            System.out.print(c);
        }
        System.out.println();
    }

    // Returns the character at the given index in the array
    public static char charAt(char[] arr, int index) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array cannot be null or empty");
        }
        if (index < 0 || index >= arr.length) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        return arr[index];
    }

    // Returns the index of the first occurrence of the given character in the array
    public static int indexOf(char[] arr, char c) {
        if (arr == null) {
            throw new IllegalArgumentException("Array cannot be null");
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == c) {
                return i;
            }
        }
        return -1;
    }

    // Concatenates two arrays
    public static char[] concat(char[] arr1, char[] arr2) {
        if (arr1 == null || arr2 == null) {
            throw new IllegalArgumentException("Arrays cannot be null");
        }
        char[] result = new char[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            result[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            result[arr1.length + i] = arr2[i];
        }
        return result;
    }

    public static void main(String[] args) {
        try {
            char[] arr1 = {'h', 'e', 'l', 'l', 'o'};
            char[] arr2 = {'w', 'o', 'r', 'l', 'd'};

            // Test methods
            println(arr1); // Output: hello
            System.out.println(charAt(arr1, 2)); // Output: l
            System.out.println(indexOf(arr1, 'l')); // Output: 2
            println(concat(arr1, arr2)); // Output: helloworld
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
