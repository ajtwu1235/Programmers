package Level1;
import java.util.*;
public class OverridingArr {
    public static String[] solution (String[] strings, int n) {
        Arrays.sort(strings, new Comparator<String>(){
             @Override
             public int compare(String a, String b){
                 if(a.charAt(n) == b.charAt(n)) return a.compareTo(b);
 
                 return (int)(a.charAt(n) - b.charAt(n));
             }
         });
 
         return strings;
        
     }

     public static void main(String[] args) {
         System.out.println(Arrays.toString(solution(new String[]{"sun","bed","car"},1)));
         System.out.println(Arrays.toString(solution(new String[]{"abce","abcd","cdx"},2)));
     }
}
