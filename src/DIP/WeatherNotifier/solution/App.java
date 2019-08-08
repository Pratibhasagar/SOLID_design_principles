package DIP.WeatherNotifier.solution;


public class App{
    public static void main(String[] args) {
        EmailClient emailClient = new EmailClient();
        MobileDevice mobileDevice = new MobileDevice();

        WeatherTracker weatherTracker = new WeatherTracker();
        weatherTracker.setCurrentConditions("rainy");

        weatherTracker.notify(emailClient);
        weatherTracker.notify(mobileDevice);

    }
}

