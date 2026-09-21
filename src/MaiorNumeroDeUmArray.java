import java.util.Arrays;


public class MaiorNumeroDeUmArray {
    private int j = 0;
    private int i = 0;

    int maiorNumero(int[] nums) {
        j++;
        i++;
        /*
            o Problema e que agora, ele não esta validando
            o primeiro e o ultimo indice do array
            por que provavelmente não esta salvando o target
        */

        if (j <= nums.length -1) {

            if (nums[i] >= nums[i + 1]) {
                return nums[i];
            } else {
                return maiorNumero(new int[]{102, 5, 60, 1});
            }
        }
        return  0;
    }
}

