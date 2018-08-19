package models.Rubbish.Plastic;

import models.Rubbish.ConversionFactor;
import models.Rubbish.PieceOfRubbish;

import javax.persistence.*;

@Entity
@Table(name = "plastics")
@Inheritance(strategy = InheritanceType.JOINED)

public abstract class Plastic extends PieceOfRubbish {

    private String plastictype;
    private ConversionFactor conversionFactor;

    public Plastic(String itemName, int quantity, double weight, String plastictype, ConversionFactor conversionFactor) {
        super(itemName, quantity, weight);
        this.plastictype = plastictype;
        this.conversionFactor = conversionFactor;
    }

    public Plastic() {
    }

    @Column(name = "plastic_type")
    public String getPlastictype() {
        return plastictype;
    }

    public void setPlastictype(String plastictype) {
        this.plastictype = plastictype;
    }
    @Enumerated(value = EnumType.STRING)
    public ConversionFactor getConversionFactor() {
        return conversionFactor;
    }

    public void setConversionFactor(ConversionFactor conversionFactor) {
        this.conversionFactor = conversionFactor;
    }
}
