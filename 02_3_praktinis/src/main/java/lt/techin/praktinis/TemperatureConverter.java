package lt.techin.praktinis;

public class TemperatureConverter {
    public void toFahrenheit(int temperatureCelsius) {
        int tempCelsius = temperatureCelsius;

        double tempFahrenheit = ((tempCelsius * 9) / 5.0) + 32;

        System.out.println(tempFahrenheit);
    }

    public static void main(String[] args) {
        TemperatureConverter tc = new TemperatureConverter();
        tc.toFahrenheit(100);
    }
}
