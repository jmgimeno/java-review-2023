package nested;

public class Outer {

    // una per totes les instàncies
    public static int num = 0;
    // cada instància la seva
    public int counter = 0;

    // cada instància d'Inner es correspon amb una instància d'Outer
    public class Inner {
        private int value = counter;

        public void method(int value, int counter) {
            var b = this.value;
            // qualified this
            var c = Outer.this.counter;
        }
    }

    // les instàncies d'InnerStatic no estàn relacionades amb les de Outer
    public static class InnerStatic {
        // private int value = counter;
        // private int value = Outer.this.counter;
        private int value = num;
    }

    public static void main(String[] args) {
        var outer = new Outer();
        var inner = outer.new Inner();
        var innerS = new InnerStatic();
    }
}
