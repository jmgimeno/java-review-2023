package arrays;

import inheritance.Counter;
import inheritance.NamedCounter;

public class ArrayProgram {



    static void method(Counter[] counters) {
        counters[0] = new Counter(42);
    }

    public static void main(String[] args) {
        Counter[] counters = new Counter[10];
        method(counters);

        // Arrays en Java són COVARIANTS
        // A subtipus de B => A[] subtipus de B[]
        NamedCounter[] nameds = new NamedCounter[20];
        method(nameds);

        // Arrays en Java guarden informació sobre el tipus d'elements que tenen
        // el tipus d'elements que té un array s'ha de conéixer en tmeps d'execució
    }
}
