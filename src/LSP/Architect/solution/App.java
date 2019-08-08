package LSP.Architect.solution;

public class App {
    public static void main(String[] args) {

        PenthouseSuite penthouseSuite = new PenthouseSuite();

        BedroomAdder bedroomAdder = new BedroomAdder();
        bedroomAdder.addBedroom(penthouseSuite);

    }
}
