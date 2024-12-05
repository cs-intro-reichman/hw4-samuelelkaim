
  public class ArrayCharOps {

    public static char charAt(char[] arr, int index) {
        if (arr == null || index < 0 || index >= arr.length) {
            throw new IllegalArgumentException("Invalid array or index");
        }
        return arr[index];
    }

    public static void main(String[] args) {
        char[] arr = {'a', 'b', 'c', 'd', 'e'};
        System.out.println(charAt(arr, 2)); // Output: c
    }
}
