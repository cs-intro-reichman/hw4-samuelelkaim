public class ArrayCharOps {

    // Returns the character at the specified index in the array
    public static char charAt(char[] arr, int index) {
        if (arr == null || index < 0 || index >= arr.length) {
            throw new IllegalArgumentException("Invalid array or index");
        }
        return arr[index];
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

    // Prints the array content
    public static void println(char[] arr) {
        if (arr == null) {
            throw new IllegalArgumentException("Array cannot be null");
        }
        for (char c : arr) {
            System.out.print(c);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        char[] arr1 = {'a', 'b', 'c', 'd', 'e'};
        char[] arr2 = {'f', 'g', 'h'};

        // Test methods
        println(arr1); // Output: abcde
        println(concat(arr1, arr2)); // Output: abcdefgh
        System.out.println(charAt(arr1, 2)); // Output: c
    }
}
