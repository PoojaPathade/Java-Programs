import java.util.*;

class Input
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter First Number: ");
        int iNo1 = sobj.nextInt();

        System.out.println("Enter Second Number: ");
        int iNo2 = sobj.nextInt();

        int Ans = 0;
        Ans = iNo1 + iNo2;
        System.out.println("Addition is: "+Ans);

        sobj.close();
    }

}
