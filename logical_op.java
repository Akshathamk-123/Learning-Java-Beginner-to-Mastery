public class logical_op {
    public static void main(String arg[]){
        System.out.println("AND(&) OR(|) NOT(!)");
        System.out.println("This is Short-circuiting:\tAND(&&) OR(||) NOT(!)");
        int x=7;
        int y=5;
        int a=5;
        int b=9;

        boolean res = x>y && a>b;
        System.out.println(res);

        boolean res1 = x>y || a>b;
        System.out.println(res1);

        boolean res2 = x>y;
        System.out.println(!res2);
    }
}
