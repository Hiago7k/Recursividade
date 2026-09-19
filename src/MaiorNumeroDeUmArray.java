import java.util.Arrays;

public class MaiorNumeroDeUmArray {
        int maiorNumero (int[] nums, int i){
            i = 0;
            int j = 0;
            int higher = 0;
            if(j <= nums.length -1){
                j++;
                if (nums[i] <= nums[i+1]){
                    higher = nums[i]; // caso base
                }else {
                    i++;
                    return  maiorNumero(new int[]{2, 3, 5, 1}, 0);
                }
            }
            return  nums[i];
        }
    }

