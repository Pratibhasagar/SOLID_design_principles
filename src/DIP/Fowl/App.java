package DIP.Fowl;

class App
{
    public static void main(String args[])
    {
        Sparrow sparrow = new Sparrow();
        ToyDuck toyDuck = new PlasticToyDuck();

        // Wrap a bird in a birdAdapter so that it
        // behaves like toy duck
        ToyDuck birdAdapter = new BirdAdapter(sparrow);

        System.out.println("DIP.Fowl.Sparrow...");
        sparrow.fly();
        sparrow.makeSound();

        System.out.println("DIP.Fowl.ToyDuck...");
        toyDuck.squeak();

        // toy duck behaving like a bird
        System.out.println("DIP.Fowl.BirdAdapter...");
        birdAdapter.squeak();
    }
}
