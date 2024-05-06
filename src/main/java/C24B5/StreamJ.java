package C24B5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamJ {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7,8);

        //IMPERATIVO
        for(int i =0; i<numeros.size(); i++){
            if (numeros.get(i)%2==0){
                System.out.println(numeros.get(i));
            }
        }

        //FUNCIONAL
        numeros.stream().filter(n -> n%2 == 0).forEach(System.out::println);
        int suma = numeros.stream().mapToInt(Integer::intValue).sum();
        System.out.println(suma);
    }
}
