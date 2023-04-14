package composition;

import java.util.List;

public class NamedCounter implements Counter {

    private String name;
    private SimpleCounter counter;

    // constructor que crea javac si no el posem
    public NamedCounter(String name, int initial) {
        this.counter = new SimpleCounter(initial);
        this.name = name;
    }

    public void increment() {
        this.counter.increment();
    }

    public static void main(String[] args) {
        var nc = new NamedCounter("aprovats", 25);
        // herència permet aprofitar-me des de la subclasse
        // del màtode increment
        nc.increment();

        var l = List.of(new SimpleCounter(42), new NamedCounter("patata", 12));
        for (var c : l) {
            c.increment();
        }
    }
}
