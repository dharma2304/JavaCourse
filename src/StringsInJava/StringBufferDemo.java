package StringsInJava;

public class StringBufferDemo {
    public static void main(String args[]){
        /*
          StringBuffer: StringBuffer is a peer class of string which is used to create the mutable strings.Its same as string except it is
          mutable.

          Important Constructors in StringBuffer class
          1. StringBuffer(): creates an empty string buffer with the initial capacity of 16.
          2. StringBuffer(String str): creates a string buffer with the specified string.
          3. StringBuffer(int capacity): creates an empty string buffer with the specified capacity as length.
         */

        // Creating the empty buffer
        StringBuffer strbuf = new StringBuffer();

        // Methods of StringBuffer

        // 1. append(String str): It concatenates the given argument with the stringbuffer.
         strbuf.append("Hello Java !");
        System.out.println("Append string: "+" "+strbuf);

        // 2. insert(int index, String str): It inserts the given string at a particular index in the string buffer
        strbuf.insert(5, "Kill it");
        System.out.println("Insert the string in the buffer: "+ " "+ strbuf);

        // 3. replace(int begin, int end, String str): Replaces the given string from the specified begin index and endIndex -1.
        strbuf.replace(5, 10, "Nothing");
        System.out.println("Replaces the string with given string from index i to index j-1: "+" "+ strbuf);

        // 4. delete(int begin, int end): It deletes the string from index i to index j-1
        strbuf.delete(5, 12);
        System.out.println("delete the string from index i to index j-1: "+" "+ strbuf);

        // 5. reverse(): It reverse the stringbuffer
        System.out.println("Reverses the String buffer: "+" "+ strbuf.reverse());

        // 6. capacity(): The capacity() method of StringBuffer class returns the current capacity of the buffer.
        // The default capacity is 16 and if the numbers of characters are more than the capacity of the buffer then the buffer increases its capacity to (capacity*2)+2.
        System.out.println("Capacity of the buffer: "+" "+strbuf.capacity());

        // 7. length(): It returns the length of string buffer
        System.out.println("Length of the buffer: "+" "+strbuf.length());

        // 8. charAt(int index): Returns the character at the particular index  in the buffer
        System.out.println("Character at the particular index in the buffer"+" "+strbuf.charAt(4));

        // 9. deleteCharAt(int index):Deletes the character at the particular index.
        System.out.println("Deletes the character at the particular index: "+" "+ strbuf.deleteCharAt(3));






    }

}
