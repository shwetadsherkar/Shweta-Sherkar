class pyramid
 {
    public static void main(String[] args)
    {
        for (int i = 1; i <6; i++)
        {
            for (int j =1; j > i; j--)
            {
                System.out.print(" ");
            }
           
            for (int k = 1; k <= (2 * i - 1); k++)
            {
                System.out.print("*");
            }
            
            System.out.println();
        }
    }
}


/*output:
C:\Users\Lenovo\Desktop\JAVA>java pyramid
*
***
*****
*******
*********

*/