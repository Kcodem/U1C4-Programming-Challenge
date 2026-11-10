public class Solution {
    /**
     * DO NOT MODIFY THE METHOD NAME OR THE PARAMETERS
     * PLEASE REFER TO THE PROBLEMS.MD FILE FOR QUESTION DETAILS
     **/

    public Solution() {}

    public boolean endsLy(String x) {
        if (x.indexOf("ly") == -1) {
            return false;
        } else {
            return true;
        }
    }

    public String conCat(String s1, String s2) {
        String String1 = s1;
        String String2 = s2;
        int Length1 = String1.length();
        int Length2 = String2.length();
        String End1 = String1.substring(Length1);
        String Begin2 = String2.substring(0,1);
        String Idk = String2.substring(1,Length2);
        if (End1 == Begin2) {
            String Sentence = "" + String1 + Idk;
            return Sentence;
        } else {
            String Sentence = "" +  String1 + String2;
            return Sentence; 
        }
    }

    public String withoutX(String s1) {
        if (s1.indexOf("x") == -1) {
            return s1;
        } else {
            String Start = s1.substring(0,1);
            int End = s1.length();
            if (s1.indexOf("x") == 0) {
                String ya = s1.substring(1, End); 
                return ya;
            }
            if (s1.indexOf("x") == End) {
                int newEnd = s1.length() - 1;
                String sen = s1.substring(0,newEnd);
                return sen;
            } else {
                return s1;
            }

        }
    }

    public String fizzString(String s1) {
        String letter1 = s1.substring(0,1);
        int end = s1.length();
        String letterEnd = s1.substring(end);
        int num = 0;
        int num2 = 0;
        if (letter1 == "f") {
             num = 1;
        }
         if (letterEnd == "b") {
             num2 = 1;
        }
        if (num == 1 && num2 == 1) {
            return "FizzBuzz";
        } else {
            if (num == 1){
                return "Fizz";
            }
            if (num2 == 1) {
                return "Buzz";
            }
            return s1;
        }
        
    }

    public String fizzString2(int x) {
    int input = x;
       int Mod3 = 0;
       int Mod5 = 0;
        if ((input % 3) == 0) {
            Mod3 = 1;
        }
        if ((input % 5) == 0) {
            Mod5 = 1;
        }
        if (Mod3 == 1 && Mod5 == 1){
            return "FizzBuzz!";
        } else {
            if (Mod3 == 1) {
                return "Fizz!";
            }
            if (Mod5 == 1){
                return "Buzz!";
            }
            return input + "!";
        }
        
    }

}
