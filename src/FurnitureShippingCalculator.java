public class FurnitureShippingCalculator {
    // Arqan Adanza Adi | 20-13459-703
    public static void main(String[] args) {
        // Size 1 = small-sized product
        // Size 2 = medium-sized product
        // Size 3 = large-sized product
        // Size 4 = extra-large or bulky-sized product
        Chair chair = new Chair(1.0);
        Table table = new Table(2.0);
        Sofa sofa = new Sofa(3.0);
        Cabinet cabinet = new Cabinet(4.0);

        FurnitureCalculator flatRateCalculator = new FlatRateShippingCalculator(275.0, 2);
        FurnitureCalculator distanceBasedCalculator = new DistanceBasedShippingCalculator(137.5, 12.0, 2); // Distance is in km

        double chairShippingCostFlatRate = chair.accept(flatRateCalculator);
        double tableShippingCostFlatRate = table.accept(flatRateCalculator);
        double sofaShippingCostFlatRate = sofa.accept(flatRateCalculator);
        double cabinetShippingCostFlatRate = cabinet.accept(flatRateCalculator);

        double chairShippingCostDistanceBased = chair.accept(distanceBasedCalculator);
        double tableShippingCostDistanceBased = table.accept(distanceBasedCalculator);
        double sofaShippingCostDistanceBased = sofa.accept(distanceBasedCalculator);
        double cabinetShippingCostDistanceBased = cabinet.accept(distanceBasedCalculator);


        System.out.println("Check Products' Flat-Rate Shipping Costs:");
        System.out.println("Chair: ₱" + chairShippingCostFlatRate);
        System.out.println("Table: ₱" + tableShippingCostFlatRate);
        System.out.println("Sofa: ₱" + sofaShippingCostFlatRate);
        System.out.println("Cabinet: ₱" + cabinetShippingCostFlatRate);

        System.out.println("\nCheck Products' Distance-Based Shipping Costs:");
        System.out.println("Chair: ₱" + chairShippingCostDistanceBased);
        System.out.println("Table: ₱" + tableShippingCostDistanceBased);
        System.out.println("Sofa: ₱" + sofaShippingCostDistanceBased);
        System.out.println("Cabinet: ₱" + cabinetShippingCostDistanceBased);
    }
}