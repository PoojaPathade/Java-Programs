import java.util.*;

class Selection2
{
    public static void main(String Arg[])
    {
        
        Scanner sobj = new Scanner(System.in);
        int day = 7 ;

        System.out.println("Enter the weekday number : ");  
        day = sobj.nextInt();
    

        switch (day)
        {
            case 1:
                System.out.println("Monday");
                break;
        
            case 2:
                System.out.println("Tuesday");
                break;

            case 3:
                System.out.println("Wednesday");
                break;
            
            case 4:
                System.out.println("Thursday");
                break;

            case 5:
                System.out.println("Firday");
                break;

            case 6:
                System.out.println("Saturday");
                break;

            case 7:
                System.out.println("Saturday");
                break;

            default:
                System.out.println("invalid entry please enter only 1 to 7 numbers");
                break;
        }
    }
}

