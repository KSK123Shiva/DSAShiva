public class LeetCode {


        public static int scoreOfString(String s) {
            int ans=0;
            for(int i=0;i<s.length()-1;i++){
                int first = s.charAt(i);
                int second = s.charAt(i+1);
                int temp = Math.abs(second-first);
                ans=ans+temp;
            }
            System.out.println(ans);
            return ans;
        }

    public static int scoreOfStringway(String s) {
        int ans=0;
        for(int i=0;i<s.length()-1;i++){
            ans=ans+ Math.abs(s.charAt(i+1)-s.charAt(i));
        }
        System.out.println(ans);
        return ans;

    }

    public static void main(String[] args) {
            scoreOfString("hello");
            scoreOfStringway("hello");

    }
}
