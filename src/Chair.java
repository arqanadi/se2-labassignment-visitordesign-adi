public class Chair implements Furniture {
    private final double size;

    public Chair(double size) {
        this.size = size;
    }

    public double getSize() {
        return size;
    }

    @Override
    public double accept(FurnitureCalculator calculator) {
        return calculator.calculateChair(this);
    }
}