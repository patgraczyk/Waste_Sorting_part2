package models.Rubbish.Plastic;

import Interfaces.IReusable;
import models.Rubbish.ConversionFactor;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "HDPE_plastics")
public class HDPE extends Plastic implements IReusable {

    public HDPE(String itemName, int quantity, double weight, String plastictype, ConversionFactor conversionFactor) {
        super(itemName, quantity, weight, plastictype, conversionFactor);
    }

    public HDPE() {
    }

    @Override
    public String reuse() {
        return null;
    }


}
