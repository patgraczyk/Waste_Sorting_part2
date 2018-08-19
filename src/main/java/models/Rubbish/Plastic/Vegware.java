package models.Rubbish.Plastic;

import Interfaces.ICompostable;
import models.Rubbish.ConversionFactor;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "vegware_plastics")

public class Vegware extends Plastic implements ICompostable {

    public Vegware(String itemName, int quantity, double weight, String plastictype, ConversionFactor conversionFactor) {
        super(itemName, quantity, weight, plastictype, conversionFactor);
    }

    public Vegware() {
    }

    @Override
    public String compost() {
        return null;
    }
}
