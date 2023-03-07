public class loops {
    public static void main(String arg[])
    {
        System.out.println("Loops are of 3 types:\nwhile\ndo while\nfor loop");
        System.out.println("Loops can be nested too");

        //While loop
        int i=0;
        while(i<4)
        {
            System.out.println("while");
            i++;
        }

        int j=0;
        do{
            System.out.println("This is do while");
            j++;
        }while(j<=4);
        //Do while is an exit controlled loop
        //Do while loop executes the block of stmts inside it atleast irrespective of the condition to be satisfied.


        for(int k=0;k<4;k++)
        {
            System.out.println("This is for loop");
        }

    }
}
