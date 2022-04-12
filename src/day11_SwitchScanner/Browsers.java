package day_11Switch_Scanner;

public class Browsers {

    public static void main(String[] args) {


        String browserName = "chrome";
        String result = "";
        boolean validBrowser = browserName == "chrome" || browserName == "firefox" ||
                browserName == "opera" || browserName == "safari" || browserName == "edge";

        if (validBrowser) {

            if (browserName == "chrome") {
                result = "Chrome Browser is Selected";

                }else if (browserName=="Firefox "){
                result = "Firefox Browser is Selected";

                }else if (browserName == " opera"){
                result = "Opera  Browser is Selected";

                 }else if(browserName== "safari") {
                result = "Safari Browser is selected";

            } else {
                result = "Edge";
            }
        } else {
                result = "Invalid Browser Name";
            }

        System.out.println(result);
            }


        }
