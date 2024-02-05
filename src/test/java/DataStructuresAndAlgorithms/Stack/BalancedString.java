package DataStructuresAndAlgorithms.Stack;

import java.util.Stack;

public class BalancedString {

    public static void main(String[] args) {
        System.out.println(isBalanced("[{()}]")); // true
        System.out.println(isBalanced("[({(})]")); // false
        System.out.println(isBalanced("{[}")); // false
        System.out.println(isBalanced("({}{}([{}]))")); // true
        System.out.println(isBalanced("({")); // false
    }

    public static boolean isBalanced(String inputString){
        Stack<Character> st = new Stack<>();

        for(char ch: inputString.toCharArray()){
            if(ch=='(' || ch=='{' || ch=='[' ){
                st.push(ch);
            }
            else{
                if(st.empty()){
                    return false;
                }

                char latestOpener = st.pop();
                if(latestOpener == '[' && ch!=']'){
                    return false;
                }
                else if(latestOpener == '(' && ch!=')'){
                    return false;
                }
                else if(latestOpener == '{' && ch!='}'){
                    return false;
                }
            }
        }
        return st.empty();
    }
}
