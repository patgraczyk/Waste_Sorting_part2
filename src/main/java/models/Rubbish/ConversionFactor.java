package models.Rubbish;

public enum ConversionFactor {

    HDPE ("HDPE", 2.45),
    PET1 ("PET1", 3.45),
    VEGWARE ("VEGWARE", 4.55);

    private String plasticType;
    private double conversionFactor;

    ConversionFactor(String plasticType, double conversionFactor) {
        this.plasticType = plasticType;
        this.conversionFactor = conversionFactor;
    }

    public String getPlasticType() {
        return plasticType;
    }

    public double getConversionFactor() {
        return conversionFactor;
    }
}
