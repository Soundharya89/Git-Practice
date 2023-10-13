import java.util.Arrays;
import java.util.Scanner;

public class Strrev {
    public static String revstring(String str)
    {
      // String s;
        int n=str.length()-1;
        int i=0;
         char a[]=new char[n];
         a=str.toCharArray();
        while(i<n)
        {
            if(a[i]!=a[n]){
                char temp=a[i];
                a[i]=a[n];
                a[n]=temp;
            }
            i++;
            n--;
        }
        
        return new String(a);
        // for(char j: a){
        //     System.out.print(j);
        // } 
    }
    public static void main(String[] args)
    {
        String s,res;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the string");
        s=sc.nextLine();
       // res=;
       System.out.println(revstring(s));
       sc.close(); 
    }
}
