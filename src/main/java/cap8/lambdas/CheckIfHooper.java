package cap8.lambdas;

/**
 * Classe que implementa a interface que criamos
 */
public class CheckIfHooper implements CheckTrait{
    @Override
    public boolean test(Animal a) {
        return a.canHop();
    }
}
