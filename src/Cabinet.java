public class Cabinet implements Furniture {
    private final double size;
    public Cabinet(double size) {
        this.size = size;
    }

    public double getSize() {
        return size;
    }

    @Override
    public double accept(FurnitureCalculator calculator) {
        return calculator.calculateCabinet(this);
    }
}