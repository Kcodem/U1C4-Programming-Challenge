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
        int Length1 = s1.length();
        int Length2 = s2.length();
        String End1 = s1.substring(Length1);
        String Begin2 = s2.substring(0,1);
        if (End1 == Begin2) {
            String Sentence = "" + s1 + s2.substring(1,Length2);
            return Sentence;
        } else {
            String Sentence = "" +  s1 + s2;
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
        if (letter1 == "f") {
            int num = 1;
        }
         if (letterEnd == "b") {
            int num2 = 1;
        }
        if (num == 1 && num2 == 1) {
            return "FizzBuzz";
        } else {
            if (num == 1){
                return "Fizz";
            }
            if (num2 = 1) {
                return "Buzz";
            }
            return s1;
        }
        
    }

    public String fizzString2(int x) {
       int Mod3 = 0;
       int Mod5 = 0;
        if (x % 3 = 0) {
            Mod3 = 1;
        }
        if (x % 5 = 0) {
            Mod5 = 1;
        }
        if (Mod3 = 1 && Mod5 = 1){
            return "FizzBuzz!";
        } else {
            if (Mod3 = 1) {
                return "Fizz!";
            }
            if (Mod5 = 1){
                return "Buzz!";
            }
            string re1 = x + "!";
            return re1;
        }
        
    }

}
