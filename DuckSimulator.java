public class DuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.display();
        mallard.performFly();
        mallard.performQuack();

        System.out.println();

        Duck rubber = new RubberDuck();
        rubber.display();
        rubber.performFly();
        rubber.performQuack();

        System.out.println();

        Duck decoy = new DecoyDuck();
        decoy.display();
        decoy.performFly();
        decoy.performQuack();

        System.out.println("\nCambio de comportamiento en tiempo de ejecución:");
        rubber.setFlyBehavior(new FlyWithWings());
        rubber.performFly();
    }
}
