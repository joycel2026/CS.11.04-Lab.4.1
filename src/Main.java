public class Main {

    // 1. parenthesesCheck
    public static boolean parenthesesCheck(String str) {
        boolean result = false;
        int front = 0;
        int back = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') {
                front++;
            }
            if (str.charAt(i) == ')') {
                back++;
            }
        }
        if (front == back) {
            result = true;
        }
        return result;
    }

    // 2. reverseInteger
    public static String reverseInteger(int integer) {
        String str = Integer.toString(integer);
        String result = "";
        for (int i = str.length() - 1; i > -1; i--) {
            result = result + str.charAt(i);
        }
        return result;
    }

    // 3. encryptThis
    public static String encryptThis(String message) {
        String[] words = message.split(" ");
        StringBuilder encryptedMessage = new StringBuilder();
        for (String word : words) {
            char[] characters = word.toCharArray();
            char second = characters[1];
            characters[1] = characters[characters.length - 1];
            characters[characters.length - 1] = second;
            int first =  (int) characters[0];
            encryptedMessage.append(first).append(characters,1,characters.length-1).append(" ");
        }
        return encryptedMessage.toString().trim();
    }

    // 4. decipherThis
    public static String decipherThis(String message) {
        String[] words = message.split(" ");
        StringBuilder decipheredMessage = new StringBuilder();
        for (String word : words) {
            int charCode = Integer.parseInt(word.replaceAll("[^0-9]", ""));
            char firstLetter = (char) charCode;
            String Letters = word.replaceAll("[0-9]","");
            char[] letters = Letters.toCharArray();
            char secondLetter = letters[0];
            char lastLetter = letters[letters.length - 1];
            letters[0] = lastLetter;
            letters[letters.length - 1] = secondLetter;
            decipheredMessage.append(firstLetter).append(letters).append(" ");
        }
        return decipheredMessage.toString().trim();
    }
}