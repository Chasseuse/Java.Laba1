public class ConverterToKelvin implements Convertible, CreatorOfConverter{
    @Override
    public double convert(double c) {
        return c + 273.15;
    }

    @Override
    public Convertible create() {
        return new ConverterToKelvin();
    }
}
