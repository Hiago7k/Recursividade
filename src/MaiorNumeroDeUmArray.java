import java.util.Arrays;

public class MaiorNumeroDeUmArray {
        int maiorNumero (int[] nums, int i){

            if(nums[i] < nums[i +1]){
               nums[i] = nums[i +1];

            }else {

                if (i <= nums.length -1){
                return  nums[i];
                }

                return  maiorNumero(new int[]{2, 3, 5, 6}, 0);
            }

        }
    }

