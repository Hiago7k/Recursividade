public class Array {

    int  maiorNumeroDeUmArray(){
        int[] nums = {1, 54, 6, 9, 3};
        int next = 1;
        int maiorNumero = 0; // case base
        int numeroAtual = nums[next];

        if (numeroAtual >= maiorNumero){
            next = next + 1;

        }else {
            maiorNumeroDeUmArray();
        }
        return next;
    }
}
