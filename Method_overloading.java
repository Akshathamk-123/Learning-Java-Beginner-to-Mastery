class Calculator1
{
    public int add(int n1, int n2)
    {
        return n1+n2;
    }
    public int add(int n1, int n2,int n3)
    {
        return n1+n2+n3;
    }
}
//When you want to have method overoading 
//It is allowed but it should have a different signatures.
//That is different number of parameters or the different datatypes.

public class Method_overloading {
    public static void main(String args[])
    {
        Calculator1 obj =new Calculator1();
        int r1= obj.add(3, 4);
        System.out.println(r1);
        int r2 = obj.add(3, 4,5);
        System.out.println(r2);
    }
}
