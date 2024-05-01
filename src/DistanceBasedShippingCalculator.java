public class DistanceBasedShippingCalculator implements FurnitureCalculator {
    private final double baseRate;
    private final double distance;
    private final int limit;

    public DistanceBasedShippingCalculator(double baseRate, double distance, int limit) {
        this.baseRate = baseRate;
        this.distance = distance;
        this.limit = limit;
    }

    // Use distance-based shipping calculator if size is over the limit
    @Override
    public double calculateChair(Chair chair) {
        return chair.getSize() > limit ? baseRate * distance : 0;
    }

    @Override
    public double calculateTable(Table table) {
        return table.getSize() > limit ? baseRate * distance : 0;
    }

    @Override
    public double calculateSofa(Sofa sofa) {
        return sofa.getSize() > limit ? baseRate * distance : 0;
    }

    @Override
    public double calculateCabinet(Cabinet cabinet) {
        return cabinet.getSize() > limit ? baseRate * distance * 2 : 0;
    }
}