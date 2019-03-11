import java.util.Map;
import java.util.HashMap;

public class PairCounter 
{

    public static void main(String[] args)
    {
        int number = Integer.parseInt(args[0]);
        int[] arr = new int[number];
        for(int i=1,j=0;i<number+1;i++,j++)
        {
            arr[j] = Integer.parseInt(args[i]);
        }
        int k = Integer.parseInt(args[number+1]);
        int paircount = countPairs(arr,k);
        System.out.println(paircount);
    }

    public static int countPairs(int[] arr, int k) 
    {
        if (arr == null || arr.length == 0 || k < 0)
        {
            return 0;
        }   
        
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for (int i : arr) 
        {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) 
        {
            if (k == 0) 
            {
                if (entry.getValue() >= 2) 
                {
                    count++;
                } 
            } 
            else 
            {
                if (map.containsKey(entry.getKey() + k)) 
                {
                    count++;
                }
            }
        }
        
        return count;
    }
}