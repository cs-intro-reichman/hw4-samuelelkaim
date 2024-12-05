   
  public class ArrCharOps {

    // Prints the content of the array
    public static void println(char[] arr) {
        for (char c : arr) {
            System.out.print(c);
        }
        System.out.println(); // Move to the next line
    }

    // Returns the character at the given index in the array
    public static char charAt(char[] arr, int index) {
        // Assumes index is valid
        return arr[index];
    }

    // Returns the index of the first occurrence of the given character in the array, or -1 if not found
    public static int indexOf(char[] arr, char c) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == c) {
                return i;
            }
        }
        return -1; // Character not found
    }

    // Returns the index of the last occurrence of the given character in the array, or -1 if not found
    public static int lastIndexOf(char[] arr, char c) {
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == c) {
                return i;
            }
        }
        return -1; // Character not found
    }

    // Concatenates two arrays of characters into a new array
    public static char[] concat(char[] arr1, char[] arr2) {
        char[] result = new char[arr1.length + arr2.length];

        // Copy arr1 to result
        for (int i = 0; i < arr1.length; i++) {
            result[i] = arr1[i];
        }

        // Copy arr2 to result
        for (int i = 0; i < arr2.length; i++) {
            result[arr1.length + i] = arr2[i];
        }

        return result;
    }

    // Compares two strings lexicographically
    public static int compareTo(String str1, String str2) {
        int minLength = Math.min(str1.length(), str2.length());

        // Compare character by character
        for (int i = 0; i < minLength; i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return str1.charAt(i) - str2.charAt(i);
            }
        }

        // If all characters are equal, compare lengths
        return str1.length() - str2.length();
    }

    // Main method for testing
    public static void main(String[] args) {
        char[] arr1 = {'c', 'l', 'e', 'a', 'r'};
        char[] arr2 = {'l', 'y'};

        // Test println
        System.out.print("Array 1: ");
        println(arr1);
        System.out.print("Array 2: ");
        println(arr2);

        // Test charAt
        System.out.println("charAt(arr1, 2): " + charAt(arr1, 2)); // Expected: e

        // Test indexOf
        System.out.println("indexOf(arr1, 'e'): " + indexOf(arr1, 'e')); // Expected: 2
        System.out.println("indexOf(arr1, 'z'): " + indexOf(arr1, 'z')); // Expected: -1

        // Test lastIndexOf
        System.out.println("lastIndexOf(arr1, 'l'): " + lastIndexOf(arr1, 'l')); // Expected: 1
        System.out.println("lastIndexOf(arr1, 'z'): " + lastIndexOf(arr1, 'z')); // Expected: -1

        // Test concat
        char[] concatenated = concat(arr1, arr2);
        System.out.print("Concatenated array: ");
        println(concatenated); // Expected: clearly

        // Test compareTo
        System.out.println("compareTo(\"apple\", \"banana\"): " + compareTo("apple", "banana")); // Expected: negative
        System.out.println("compareTo(\"banana\", \"banana\"): " + compareTo("banana", "banana")); // Expected: 0
        System.out.println("compareTo(\"cherry\", \"banana\"): " + compareTo("cherry", "banana")); // Expected: positive
    }
}
