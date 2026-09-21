import java.util.Arrays;


public class MaiorNumeroDeUmArray {
    private int j = 0;
    private  int target = 0;

    int maiorNumero (int[] nums, int i){
            j++;
            if (j < 4){
                return  target;
            }else {
                target = nums[i];
                i++;
                if (nums[i] > nums[i+1]){
                    target = nums[i];
                }else {
                    i++;
                    return  maiorNumero(new int[]{4, 3, 5, 1}, 0);
                }
                return  target;
            }
        }
    }

