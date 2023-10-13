import java.util.*;
public class Palindrome
{
      public static boolean Palindrome(String str){
        int n=str.length()-1;
        int i=0;
        while(i<n)
        {
            if(str.charAt(i)!=str.charAt(n))
            {
              return false;
            }
            else if(str.charAt(i)==str.charAt(n)){
               i++;
               n--;
            }
        }return true;
       
    }
    public static void main(String[] args)
    {
        String s;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the string");
        //StringBuffer s=new StringBuffer();
        s=sc.nextLine();
        String str=s.toLowerCase();
        System.out.println(Palindrome(str));

    }
}