import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class geradorQuadradoRandom {

    private static final Random gerador = new Random();

    public static ArrayList<Integer> gerar_Quadrado() {
        return new ArrayList<>(Arrays.asList(0,1,2,3,4,5,6,7,8));
    }

    public static int NumAleatorio(ArrayList<Integer> quadrado) {
        return quadrado.remove(gerador.nextInt(quadrado.size())) + 1;
    }
}