public class MyString {

    // Vérifie si str2 est une sous-chaîne de str1
    public static boolean contains(String str1, String str2) {
        for (int i = 0; i <= str1.length() - str2.length(); i++) {
            boolean found = true;
            for (int j = 0; j < str2.length(); j++) {
                if (str1.charAt(i + j) != str2.charAt(j)) {
                    found = false;
                    break;
                }
            }
            if (found) {
                return true;
            }
        }
        return false;
    }

    // Vérifie si str2 est un préfixe de str1
    public static boolean isPrefix(String str1, String str2) {
        if (str2.length() > str1.length()) {
            return false;
        }
        for (int i = 0; i < str2.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(contains("hello world", "world")); // true
        System.out.println(contains("hello world", "planet")); // false
        System.out.println(isPrefix("hello", "he")); // true
        System.out.println(isPrefix("hello", "hi")); // false
    }
}
