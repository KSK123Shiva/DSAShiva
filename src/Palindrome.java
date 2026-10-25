public class Palindrome {

    public static void main(String[] args) {

//        S=”abcd”
//        S.charAt(0) => a
//        S.charAt(1) = > b
//        S.charAt(2) => c
//        S.charAt(3) => d

        String s = "bangaram";
        String ans="";
        for(int i=s.length()-1;i>=0;i--){
            ans = ans + s.charAt(i);
        }
        System.out.println(ans);

        System.out.println("====Way1=====");

        String s1 = "bangaram";
        String ans1="";
        for(int i=s1.length()-1;i>=0;i--){
            ans1 = ans1 + s1.charAt(i);
        }
        if(ans1.equals(s1)){
            System.out.println("yes,it is a palindrome");
        }else{
            System.out.println("No, it is not a palindrome");
        }

        System.out.println("====Way2=====");

        boolean isPalindrome = true;
        String s2="abccba";
        int n=s2.length();
        System.out.println(n);
        int mid=n/2;
        for(int i=0;i<mid;i++){
            if(s2.charAt(i)!=s2.charAt(n-i-1)){
                isPalindrome = false;

                break;

            }
        }
        if(isPalindrome){
            System.out.println("yes,it is a palindrome");
        }else{
            System.out.println("No, it is not a palindrome");
        }

    }
}
