public class ArrCharOps {

    // Prints the contents of a character array
    public static void println(char[] arr) {
        if (arr == null) {
            throw new IllegalArgumentException("Array cannot be null");
        }
        for (char c : arr) {
            System.out.print(c);
        }
        System.out.println();
    }

    // Returns the character at the specified index in the array
    public static char charAt(char[] arr, int index) {
        if (arr == null || index < 0 || index >= arr.length) {
            throw new IllegalArgumentException("Invalid array or index");
        }
        return arr[index];
    }

    // Returns the first index of the specified character in the array, or -1 if not found
    public static int indexOf(char[] arr, char target) {
        if (arr == null) {
            throw new IllegalArgumentException("Array cannot be null");
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1; // Not found
    }

    // Returns the last index of the specified character in the array, or -1 if not found
    public static int lastIndexOf(char[] arr, char target) {
        if (arr == null) {
            throw new IllegalArgumentException("Array cannot be null");
        }
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1; // Not found
    }

    // Concatenates two character arrays into a new array
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

    // Compares two strings lexicographically
    public static int compareTo(String str1, String str2) {
        if (str1 == null || str2 == null) {
            throw new IllegalArgumentException("Strings cannot be null");
        }
        int minLength = Math.min(str1.length(), str2.length());
        for (int i = 0; i < minLength; i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return str1.charAt(i) - str2.charAt(i);
            }
        }
        return str1.length() - str2.length();
    }

    public static void main(String[] args) {
        char[] arr1 = {'c', 'l', 'e', 'a', 'r', 'l', 'y'};
        char[] arr2 = {'s', 'i', 'm', 'p', 'l', 'e'};

        // Testing println
        System.out.print("Array 1: ");
        println(arr1);

        // Testing charAt
        System.out.println("Character at index 2 in arr1: " + charAt(arr1, 2)); // Output: e

        // Testing indexOf
        System.out.println("Index of 'e' in arr1: " + indexOf(arr1, 'e')); // Output: 2
        System.out.println("Index of 'z' in arr1: " + indexOf(arr1, 'z')); // Output: -1

        // Testing lastIndexOf
        System.out.println("Last index of 'l' in arr1: " + lastIndexOf(arr1, 'l')); // Output: 5

        // Testing concat
        char[] concatenated = concat(arr1, arr2);
        System.out.print("Concatenated array: ");
        println(concatenated);

        // Testing compareTo
        System.out.println("Comparing 'apple' and 'banana': " + compareTo("apple", "banana")); // Negative
        System.out.println("Comparing 'hello' and 'hello': " + compareTo("hello", "hello")); // Zero
        System.out.println("Comparing 'zebra' and 'apple': " + compareTo("zebra", "apple")); // Positive
    }
}
