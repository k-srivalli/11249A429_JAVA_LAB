public class StringFunctionsDemo {
    public static void main(String[] args) {
        String str1 = "Java Programming";
        String str2 = "java programming";
        String str3 = " Welcome to Java ";

        System.out.println("Original String: " + str1);

        // length()
        System.out.println("Length: " + str1.length());

        // charAt()
        System.out.println("Character at index 5: " + str1.charAt(5));

        // substring()
        System.out.println("Substring (5): " + str1.substring(5));
        System.out.println("Substring (5,11): " + str1.substring(5, 11));

        // toUpperCase() and toLowerCase()
        System.out.println("Uppercase: " + str1.toUpperCase());
        System.out.println("Lowercase: " + str1.toLowerCase());

        // equals() and equalsIgnoreCase()
        System.out.println("Equals: " + str1.equals(str2));
        System.out.println("Equals Ignore Case: " + str1.equalsIgnoreCase(str2));

        // compareTo()
        System.out.println("Compare To: " + str1.compareTo(str2));

        // contains()
        System.out.println("Contains 'Java': " + str1.contains("Java"));

        // startsWith() and endsWith()
        System.out.println("Starts With 'Java': " + str1.startsWith("Java"));
        System.out.println("Ends With 'ming': " + str1.endsWith("ming"));

        // indexOf() and lastIndexOf()
        System.out.println("Index of 'a': " + str1.indexOf('a'));
        System.out.println("Last Index of 'a': " + str1.lastIndexOf('a'));

        // replace()
        System.out.println("Replace Java with Python: " + str1.replace("Java", "Python"));

        // trim()
        System.out.println("Trimmed String: '" + str3.trim() + "'");

        // concat()
        System.out.println("Concat: " + str1.concat(" Language"));

        // isEmpty()
        String empty = "";
        System.out.println("Is Empty: " + empty.isEmpty());

        // split()
        String[] words = str1.split(" ");
        System.out.println("Split:");
        for (String word : words) {
            System.out.println(word);
        }

        // Repeat (Java 8 alternative)
        System.out.print("Repeat: ");
        for (int i = 0; i < 3; i++) {
            System.out.print("Hi ");
        }
        System.out.println();
    }
}