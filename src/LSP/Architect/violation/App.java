package LSP.Architect.violation;

public class App {
    public static void main(String[] args) {

        Apartment penthouseSuite = new PenthouseSuite();
        Apartment studio = new Studio();
        UnitUpgrader upgrader = new UnitUpgrader();

        upgrader.upgrade(penthouseSuite);
        upgrader.upgrade(studio);
    }
}
