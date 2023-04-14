package inheritance;

import java.util.List;

// extends -> heretem TOTES les implementacions "visibles"
// de la classe que estenem
public class NamedCounter extends Counter {

    private String name;

    // constructor que crea javac si no el posem
    public NamedCounter(String name, int initial) {
        super(initial);
        this.name = name;
    }

    public static void main(String[] args) {
        var nc = new NamedCounter("aprovats", 25);
        // herència permet aprofitar-me des de la subclasse
        // del màtode increment
        nc.increment();

        var l = List.of(new Counter(42), new NamedCounter("patata", 12));
        for (var c : l) {
            c.increment();
        }
    }
}
