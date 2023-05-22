import java.util.*;
public class strongnum {
 
    public static void main(String args[] )
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number to check for strong number:");
        int num = sc.nextInt();
        if(isstrong(num))  
            System.out.println("Number is a strong number");
        else
        {
            System.out.println("Number is not a strong number");
        } 
    }
    
     static int factorial(int num)
    {
     
        if(num == 0)
        {
            return 1;
        }
        return num * factorial(num-1);
       }
       
       static boolean isstrong(int num)
       {
        int n,a,strong=0;
        n=num;
        while(num!=0)
        { 
          a = num%10;
          strong = strong + factorial(a);
          num = num/10;
        }
          if(n==strong)
        {
            return true;
        }
        else 
        {
            return false;
        }   
    }
}
