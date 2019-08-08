package LSP.Architect.solution;

class BedroomAdder {

    void addBedroom(PenthouseSuite penthouse) {
        penthouse.numberOfBedrooms += 1;

        System.out.println("Number of bedrooms: " + penthouse.numberOfBedrooms);
    }
}
