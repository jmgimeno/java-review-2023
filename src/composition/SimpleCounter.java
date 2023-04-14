package composition;

// implements -> no HERETEM res (en java clàssic)
// les obliogacions que hem cumplir per poder compilar
public class SimpleCounter implements Counter {
    private int counter;


    public SimpleCounter(int counter) {
        this.counter = counter;
    }

    public void increment() {
        counter += 1;
    }
}
