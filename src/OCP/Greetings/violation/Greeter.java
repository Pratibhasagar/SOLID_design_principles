package OCP.Greetings.violation;

public class Greeter {

    private String formality;

    public String greet() {

        String greeting = "Hello";

        if (this.formality.equalsIgnoreCase("formal")) {
            greeting = "Good evening, sir.";

        } else if (this.formality.equalsIgnoreCase("casual")) {
            greeting = "Sup bro?";

        } else if (this.formality.equalsIgnoreCase("intimate")) {
            greeting = "Hello Darling!";
        }

        return greeting;
    }

    public void setFormality(String formality) {
        this.formality = formality;
    }
}
