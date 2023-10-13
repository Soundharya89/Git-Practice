import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class remdupli {
    public static List<Character> remduplicate(char[] s)
    {
      ArrayList<Character> list=new ArrayList<Character>();
      for (char a:s)
      {
        if(list.contains(a))
        {
            continue;
        }
        else{
            list.add(a);
        }
      }
      return list;
    }
    public static void main(String[] args)
    {
        char a[]={'a','b','a','c','d'};
        System.out.println(remduplicate(a));
    }
}
