package arrays;

import java.util.Hashtable;

/**
 * Created by sumon.chatterjee on 31/08/17.
 */
public class FindPairOfNumbersWhoseSumIsGiven {

    public static void main(String[] args) {
        int arr[] ={2,45,7,3,-5,1,8,9};
        FindPairOfNumbersWhoseSumIsGiven sum= new FindPairOfNumbersWhoseSumIsGiven();
        sum.findPairOfNumbersInArray(arr,9);

    }

    private void findPairOfNumbersInArray(int[] input,int sum){
        Hashtable<Integer,Integer> map= new Hashtable<>();

        if(input.length>0){

            for(int i=0;i<input.length;i++){

                if(map.containsKey(input[i]))
                    System.out.println(input[i] +", "+ map.get(input[i]));
                else
                    map.put(sum-input[i], input[i]);
            }

        }
    }


    // Prints the pair with sum cloest to x
    static void printClosest(int arr[], int n, int x)
    {
        int res_l=0, res_r=0;  // To store indexes of result pair

        // Initialize left and right indexes and difference between
        // pair sum and x
        int l = 0, r = n-1, diff = Integer.MAX_VALUE;

        // While there are elements between l and r
        while (r > l)
        {
            // Check if this pair is closer than the closest pair so far
            if (Math.abs(arr[l] + arr[r] - x) < diff)
            {
                res_l = l;
                res_r = r;
                diff = Math.abs(arr[l] + arr[r] - x);
            }

            // If this pair has more sum, move to smaller values.
            if (arr[l] + arr[r] > x)
                r--;
            else // Move to larger values
                l++;
        }

        System.out.println(" The closest pair is "+arr[res_l]+" and "+ arr[res_r]);
    }
}
