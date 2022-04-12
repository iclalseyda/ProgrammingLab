package day16_ForLoopStringPractice;

public class RemoveDuplicated {

    public static void main(String[] args) {

        String str = "aabbaacc";

        String result = "";

        for (int i = 0; i <= str.length(); i++) { //i:represents the index numbers of str(start from zero)
            String ch = "" + str.charAt(i);// represents each Character of str

            if (!result.contains(ch)) {
                result += ch;
            }

            System.out.println(result);


        }
    }
}
