class Calculator
{
    int a;

    public int add(int num1,int num2)
    {
        System.out.println("in add");
        int r= num1+num2;
        return r;
    }
}

public class oops_concept {
    public static void main(String arg[])
    {
        int num1=4;
        int num2=5;
        //int result = num1+num2;//This can be replaced
        //System.out.println(result);


        //Creating the object
        Calculator calc = new Calculator();
        int result = calc.add(num1,num2);
        //This is the return value of the function add in class Calculator and object of it which is calc
        System.out.println(result);
        //This is the value that the object has 
        System.out.println(calc);

    }
}
