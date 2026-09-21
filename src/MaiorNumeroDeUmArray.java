import java.util.Arrays;


public class MaiorNumeroDeUmArray {
    private int j = 0;
    private int target = 0;
    private int i = 0;

    int maiorNumero(int[] nums) {
        j++;
        i++;

        if (j <= nums.length -1) {
            if (nums[i] >= nums[i + 1]) {
                target = nums[i];
            } else {
                return maiorNumero(new int[]{1000, 122, 50, 10});
            }
        }

        return target;
    }
}

