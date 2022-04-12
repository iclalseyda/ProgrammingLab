package day19_LoopPractices;

public class FrequencyOfCharacters {
    public static void main(String[] args) {

        String str = "aabccd";
        String result = "";
        for (int j = 0; j < str.length(); j++) {

            char ch = str.charAt(j);
            int count = 0;

            for (int i = 0; i < str.length(); i++) {

                char each = str.charAt(i); // each character of str
                if (ch == each) {
                    count++;
                }

            }


            System.out.println(count);


        }
    }
}