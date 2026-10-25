public class FunctionsEx {

    public static void naming(String s, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(s);
        }
    }

    public static void fun(int a, int b, int c) {
        System.out.println(a + " , " + b + "," + c);
    }

    public static void fun(int n) {
        System.out.println(n);
    }

    public static void fun(String s) {
        System.out.println(s);
    }

    public static void fun(String s, int n) {
        System.out.println(s);

        System.out.println(n);
    }

//    public static int fun(){
//        System.out.println("Heelo");
//        return 8;
//    }
//
//    public static int fun(int a){
//        return a+5;
//    }
//
//    public static int fun(int a,int b){
//        return a+b;
//    }
//
//    public static String fun(){
//        return "Hello";
//    }
//
//    public static String fun(String s){
//        System.out.println(s+" Boom");
//    }

    public static void main(String[] args) {
        naming("Shiva", 2);
        fun(10, 20, 30);
        fun(10);
        fun("Java");
        fun("Python", 10);

    }
}
