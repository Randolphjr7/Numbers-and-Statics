public class StaticTests extends StaticSuper {

    static int rand;

    static {
        rand = (int) (Math.random() * 6);
        System.out.println("static block " + rand);
    }

    StaticTests() {
        System.out.println("static tests constructor");
    }

    public static void main(String[] args) {

        // Statics blocks for both classes run before either of the constructors run
        System.out.println("in main");
        StaticTests st = new StaticTests();
    }
}
