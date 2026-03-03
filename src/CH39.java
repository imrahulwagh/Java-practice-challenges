// Create a program that print patterns
public class CH39
{
    // Right Half Pyramid
    public static void pat1()
    {
        int i=0;
        while(i<=5)
        {
            int j=0;
            while(j<i)
            {
                System.out.print("* ");
                j++;
            }
            System.out.println();
            i++;
        }
    }

    // Reverse Right Half Pyramid
    public static void pat2() {
        int i = 5;
        while (i > 0) {
            int j = 0;
            while (j < i) {
                System.out.print("* ");
                j++;
            }
            System.out.println();
            i--;
        }
    }

// Incomplete
    // Left Half Pyramid
    public static void pat3()
    {
        int i=5;
        while(i>0)
        {
            int j=0;
            while(j<i)
            {
                System.out.print("  ");
                int k = 0;
//                while(k<i-1)
//                {
//
//                }
                j++;
            }

            System.out.println();
            i--;
        }
    }
    public static void main(String[] args) {
        System.out.print("First Pattern : ");
        pat1();
        System.out.println("\nSecond Pattern : ");
        pat2();
    }
}
