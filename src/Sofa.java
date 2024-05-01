public class Sofa implements Furniture {
    private final double size;

    public Sofa(double size) {
        this.size = size;
    }

    public double getSize() {
        return size;
    }

    @Override
    public double accept(FurnitureCalculator calculator) {
        return calculator.calculateSofa(this);
    }
}