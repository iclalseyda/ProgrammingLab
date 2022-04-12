package day13_String;

public class EmailDomain {
    public static void main(String[] args) {

String email="Cydeo.School@gmail.com";

int beginningIndex= email.indexOf("@")+1;
int endingIndex= email.lastIndexOf(".");

String domain= email.substring(beginningIndex,endingIndex);

        System.out.println("domain = " + domain);
        System.out.println("--------------------------------");





    }

}
