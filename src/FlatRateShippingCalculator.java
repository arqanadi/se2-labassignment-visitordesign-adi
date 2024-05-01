public class FlatRateShippingCalculator implements FurnitureCalculator {
    private final double flatRate;
    private final int flatRateLimit;

    public FlatRateShippingCalculator(double flatRate, int flatRateLimit) {
        this.flatRate = flatRate;
        this.flatRateLimit = flatRateLimit;
    }

    // Use flat-rate shipping calculator if size is within limit
    @Override
    public double calculateChair(Chair chair) {
        return chair.getSize() <= flatRateLimit ? flatRate : 0;
    }

    @Override
    public double calculateTable(Table table) {
        return table.getSize() <= flatRateLimit ? flatRate : 0;
    }

    @Override
    public double calculateSofa(Sofa sofa) {
        return sofa.getSize() <= flatRateLimit ? flatRate : 0;
    }

    @Override
    public double calculateCabinet(Cabinet cabinet) {
        return cabinet.getSize() <= flatRateLimit ? flatRate  : 0;
    }
}