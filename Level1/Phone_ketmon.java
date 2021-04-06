package Level1;
import java.util.*;
public class Phone_ketmon {
   
    public static int solution(int[] nums) {
        int answer = 0;
        int max_choice =nums.length/2;
        Set<Integer> set =new HashSet<>();
        for(int data:nums){
            set.add(data);
        }
        if(set.size()>=max_choice){
            answer=max_choice;
        }
        else{
            answer=set.size();
        }
        return answer;
    }
    public static void main(String[] args) {
        System.out.println(solution(new int[]{3,1,2,3}));
        System.out.println(solution(new int[]{3,3,3,2,2,4}));
        System.out.println(solution(new int[]{3,3,3,2,2,2}));
    }
}

