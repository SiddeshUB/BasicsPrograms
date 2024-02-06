public class SortString {
    public static void main(String[] args) {
        String inputString = "example";

        // Convert the string to a char array for sorting
        char[] charArray = inputString.toCharArray();

        // Perform bubble sort
        int n = charArray.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (charArray[j] > charArray[j + 1]) {
                    // Swap the characters if they are in the wrong order
                    char temp = charArray[j];
                    charArray[j] = charArray[j + 1];
                    charArray[j + 1] = temp;
                }
            }
        }

        // Convert the sorted char array back to a string
        String sortedString = new String(charArray);

        // Display the sorted string
        System.out.println("Original String: " + inputString);
        System.out.println("Sorted String: " + sortedString);
    }
}

