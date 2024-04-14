package cap8.lambdas;

import java.util.ArrayList;

public class TraditionalSearch {
    public static void main(String[] args) {
        //Cria lista de animais
         var animals =  new ArrayList<Animal>();

         //Popula lista
         animals.add(new Animal("peixe", false, true));
         animals.add(new Animal("canguru", true, false));
         animals.add(new Animal("coelho", true, false));
         animals.add(new Animal("tartaruga", false, true));

         //Utiliza método para printar apenas animais que pulam passando a lista e a classe que irá fazer a verificação
        print(animals, new CheckIfHooper());
    }

    private static void print(ArrayList<Animal> animals, CheckTrait checker) {
        for(Animal animal: animals){
            //Verificação geral
            if(checker.test(animal)){
                System.out.print(animal.species() + "\n");
            }
        }
        System.out.println();
    }

    //E se quisermos printar os animais que nadam? O que teria que ser feito sem usar lambdas?
}
