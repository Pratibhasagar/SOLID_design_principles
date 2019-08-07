package LSP.Shapes;

public class App {

    public static void main(String[] args) {

        final int WIDTH = 5;

        Rectangle square = new Square();
        square.setHeight(6);
        System.out.println(square.getArea());

    }
}
