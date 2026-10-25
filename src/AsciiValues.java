public class AsciiValues {

    public static void main(String[] args) {
//        ASCII values
//        absolute difference
//        adjacent characters.
//        Character Datatype
//        Typecasting

        char ch= 'a';
        System.out.println(ch);
        int n=-1;
        if(n<0){
            n=n*-1;
        }
        System.out.println(n);
        System.out.println(Math.abs(-1));

        System.out.println("====Type casting====");

        System.out.println((int)'a');
        int vara='a';
        System.out.println(vara);

        int varb='b';
        int varc='c';
        System.out.println(varc-varb);

        System.out.println('c'-'b');

        System.out.println('c' + 'b');

        System.out.println("c" + 'b');
    }
}
