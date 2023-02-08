package StringsInJava;

public class StringsDemo {
    public static void main(String args[]){
        /*
          Strings are sequence of characters and immutable. Once created we cannot change their value.
         */
        /*
          Ways to create the string:
          1. String Literal
          2. Using new keyword
         */
        String ex="Example";
        String ex1 = new String("Example");
        System.out.println(ex);
        System.out.println(ex1);

        // String Methods

        // 1. length() : Returns the number of characters in the string
        System.out.println("Length "+" "+ex.length()); // returns 7

        // 2. charAt(int i): Returns the character at index i
        System.out.println("Character At index "+" "+ex.charAt(2)); // returns 'a'

        // 3. subString(int i): Returns the substring from ith index character to end
        System.out.println("Substring from index i "+" "+ex.substring(2)); // returns "ample"

        // 4. subString(int i, int j): Returns the substring from ith index character to j-1 th index character
        System.out.println("Substring from index i to index j-1 "+" "+ex.substring(1,4)); // returns "xam"

        // 5. concat(String str): concatenate the specified string to the end of given string
        System.out.println("Concatenate two strings "+" "+ex.concat(ex1)); // returns "ExampleExample"

        // 6. indexOf("String str): Returns the index within the string of the first occurrence of the specified string.
        System.out.println("First occurence of index of substring "+" "+ex.indexOf("amp")); // returns 2

        // 7. indexOf(String str, int i): Returns the index within the string of the first occurrence of the specified string, starting at the specified index.
        System.out.println("First occurence of index of substring from index i "+" "+ex.indexOf("amp",1)); // returns 2

        // 8. lastIndexOf(String str): Returns the index within the string of the last occurrence of the specified string.
        System.out.println("Last occurence of index of substring"+" "+ex.lastIndexOf("amp")); // returns 2

        // 9. equals(Object obj) : Compares this string to the specified object. it will return either true of false
        System.out.println("Compares two strings are equal"+" "+ex.equals("Example")); // returns true

        // 10. compareTo(String str): Compare two strings lexicographically.
        /*
          This returns difference s1-s2. If :
             out < 0  // s1 comes before s2
             out = 0  // s1 and s2 are equal.
              out > 0   // s1 comes after s2.
         */
        int out = "Example".compareTo("MyExample");
        System.out.println("Compare strings lexicographically"+" "+out);

        // 11. toLowerCase(): Converts all the characters in the string to lower case.
        System.out.println("String to Lower case "+" "+ex.toLowerCase()); // returns example

        // 12. toUpperCase(): Converts all the characters in the string to upper case.
        System.out.println("String to upper case "+" "+ex.toUpperCase()); // returns EXAMPLE

        // 13. trim(): Returns the copy of string by removing the whitespaces from both the ends. The spaces in the middle of the string wont affect
        String str1 = " Grow Big ";
        System.out.println("Trim the string"+" "+str1.trim()); // return "Grow Big"

        // 14. replace(char oldchar, char newchar): Returns new string by replacing all occurrences of oldChar with newChar.
        System.out.println("Replace a character in the string "+" "+ex.replace('e','d')); // return dxampld


    }
}
