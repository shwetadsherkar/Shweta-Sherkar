class SumOfDigits
 {
    public static void main(String[] args) 
    {
        int number = 9876;
        int sum = 0;                                  
        while (number > 0)
       {
            int digit = number % 10;
            sum =sum + digit;
            number= number/10;
        }    
        System.out.println(sum + "(9+8+7+6)");
    }
}


/*
C:\Users\Lenovo\Desktop\JAVA>java SumOfDigits
30(9+8+7+6)
*/