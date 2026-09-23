public class DividirParaConquistar {
    static void main() {
        // RecursividadeFatorial chama = new RecursividadeFatorial();

       // MaiorNumeroDeUmArray maior = new MaiorNumeroDeUmArray();
      //  System.out.println(maior.maiorNumero(new int[]{5, 7, 2, 8, 3, 1}));

        int[] nums = {5, 7, 2, 8, 3, 1};
        int sentinela = nums[0];
        int higher = 0;

        for (int i = 0; i <= nums.length -1; i++){
            for (int j = i + 1; j <= nums.length -1; j++){

                if (nums[i] >= nums[j]){
                    higher = nums[i];
                }else {
                    higher = nums[j];
                }

                if (higher >= sentinela){
                    sentinela = higher;
                }else {
                    sentinela = sentinela;
                }
            }
        }
        System.out.println(sentinela);
    }

}
