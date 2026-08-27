import java.util.*;


public class twosum {

    public static void main(String[] args) {
          int[] result=twosumanswer(new int[]{2,6,7,15}, 9);
        System.out.println(Arrays.toString(result));
    }
    static int[] twosumanswer(int[] arr,int target){
        List<Integer> result=new ArrayList<>();
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            
            if(!map.containsKey(arr[i])){
                map.put(target-arr[i],i);
            }
            else{
                result.add(map.get(arr[i]));
                result.add(i);
            }
        }
        if (result.size() == 2) {
            return new int[]{result.get(0), result.get(1)};
        }
        return new int[]{};
    }
}

