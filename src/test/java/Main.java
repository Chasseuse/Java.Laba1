import java.util.Locale;
public class Main {
    public static void main(String[] args) {
        // получаем своё местоположение
        Locale locale = Locale.getDefault();
        if (locale.getCountry().equals("US")) {
            // если это US, то создаём конвертер, который будет градусы переводить в фаренгейты
            ConverterToFahrenheit converter = new ConverterToFahrenheit();
            // если же это не US, то создаём конвертер, который будет переводить градусы в кельвины
            // так как это международная системная единица температуры
        }
        else {
                ConverterToKelvin converter = new ConverterToKelvin();
        }
    }
}
