public class ConverterToFahrenheit implements Convertible, CreatorOfConverter{
    @Override
    public double convert(double c) {
        return ((9 / 5) * c + 32);
    }

    @Override
    public Convertible create() {
        return new ConverterToFahrenheit();
    }
}
