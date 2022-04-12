package day19_LoopPractices;

public class UniqueCharacters {

    public static void main(String[] args) {
        String str = "aaabccc";
        String result = "";

        for (int j = 0; j < str.length(); j++) {

            char ch = 'a';
            int count = 0; // represent the frequency of the ch

            for (int i = 0; i < str.length(); i++) { //  compares the character that outer loop picked, with each char
                char each = str.charAt(i); // each char. of str
                if (ch == each) { //
                    count++;
                }
            }
            System.out.println(count == 1); { // if the frequency of the character is 1, then the char is unique
                result += ch;
            }
        }
        System.out.println(result);
    }
}