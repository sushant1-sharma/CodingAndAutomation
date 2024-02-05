package DataStructuresAndAlgorithms.Strings;

public class Palindrome {

    public static void main(String args[]){
        String myString = "Sushant";
        String myString1 = "regabcbager";
        if(isPalindrome(myString) || isPalindrome(myString1)){
            System.out.println(myString1+" is Palindrome");
        }
        else{
            System.out.println(myString+" is not a Palindrome");
        }
    }


    static boolean isPalindrome(String inputString){

        int start = 0;
        int end = inputString.length()-1;

        while(start<end){
            if(inputString.charAt(start)!=inputString.charAt(end)){
                return false;
            }

            start++;
            end--;
        }
        return true;
    }
}
