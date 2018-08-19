package models.Rubbish.Plastic;

import Interfaces.IRecyclable;
import models.Rubbish.ConversionFactor;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "PET1_plastics")
public class PET1 extends Plastic implements IRecyclable {

    public PET1(String itemName, int quantity, double weight, String plastictype, ConversionFactor conversionFactor) {
        super(itemName, quantity, weight, plastictype, conversionFactor);
    }

    public PET1() {
    }

    @Override
    public String recycle() {
        return "This item is recyclable";
    }
}
