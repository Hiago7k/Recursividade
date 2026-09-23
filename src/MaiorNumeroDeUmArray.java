import java.util.Arrays;


public class MaiorNumeroDeUmArray {
    private int j = 0;
    private int i = 0;
    private int higher = 0;

    int maiorNumero(int[] nums) {
        j++;
        i++;

        if (j >= nums.length -1) {
            higher = higher;
            return  higher; // caso base parada
        }else {

            if(nums[i] >= nums[i +1]){
                higher = nums[i];
            }else {
                higher = nums[i+1];
            }
            return maiorNumero(new int[]{3, 76, 20, 3});
        }
    }
}

