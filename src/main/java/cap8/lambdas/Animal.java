package cap8.lambdas;

/**
 * O objetivo do exemplo será printar todos os animais de uma lista que possuem o "canHop" como true,
 * primeiro sem lamda e depois usando lambdas
 */
public record Animal(
        String species,
        boolean canHop,
        boolean canSwim
) { }
