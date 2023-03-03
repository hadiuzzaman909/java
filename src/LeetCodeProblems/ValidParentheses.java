package LeetCodeProblems;

public class ValidParentheses {

    private boolean isValid(String p) {

        if(p=="()"|| p=="{}" ||p=="[]"){
            return true;
        }



        return false;
    }

    public static void main(String[] args) {
        String p="()";
        ValidParentheses valid_parentheses=new ValidParentheses();
        boolean b=valid_parentheses.isValid(p);
        System.out.println(b);

    }
}
