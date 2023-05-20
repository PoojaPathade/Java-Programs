import java.util.*;

class Selection
{
    public static void main(String Arg[])
    {   
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the Number:");
        int iNo = sobj.nextInt();

        if(iNo%2 == 0 )
        {
            System.out.println("It is even number");

        }
        else 
        {
            System.out.println("It is odd number");
        }
    }
}
