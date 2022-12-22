package Homework6.Temperature;

class Temperature implements Convertible {

    @Override
    public double convert(double a, int b) {
        if (b == 1) {
            return (a * 1.8 + 32);
        } else {
            return (a + 273);
        }
    }
}
