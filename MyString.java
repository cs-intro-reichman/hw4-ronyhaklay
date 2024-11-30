public class MyString {
    public static void main(String[] args) {
        System.out.println("Testing lowercase:");
        System.out.println("UnHappy : " + lowerCase("UnHappy"));
        System.out.println("This costs 15 Sheksls : " + lowerCase("This costs 15 Sheksls"));
        System.out.println("TLV : " + lowerCase("TLV"));
        System.out.println("lowercase : " + lowerCase("lowercase"));

        System.out.println("Testing contains:");
        System.out.println(contains("unhappy", "happy")); // true
        System.out.println(contains("happy", "unhappy")); // false
        System.out.println(contains("historical", "story")); // false
        System.out.println(contains("psychology", "psycho")); // true
        System.out.println(contains("personality", "son")); // true
        System.out.println(contains("personality", "dad")); // false
        System.out.println(contains("resignation", "sign")); // true
    }

    /** Returns the lowercase version of the given string. */
    public static String lowerCase(String str) {
        if (str == null) 
            return null; 

        String result = ""; 
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i); 
            if (ch >= 'A' && ch <= 'Z') {
                ch = (char)(ch + 32);
            }
            result += ch;
        }
        return result;
    }

    /** If str1 contains str2, returns true; otherwise returns false. */
    public static boolean contains(String str1, String str2) {
        String newStr1 = lowerCase(str1);  // Convert both strings to lowercase
        String newStr2 = lowerCase(str2);

        if (newStr2.isEmpty())  // If the second string is empty, it is considered contained
            return true;

        if (newStr2.length() > newStr1.length()) {  // If str2 is longer than str1, it can't be contained
            return false;
        }

        // Check if newStr2 is a substring of newStr1
        for (int i = 0; i <= newStr1.length() - newStr2.length(); i++) {
            if (newStr1.substring(i, i + newStr2.length()).equals(newStr2)) {
                return true;  // Found a match
            }
        }
        return false;  // If no match found, return false
    }
}
