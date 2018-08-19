package models.Rubbish.Organic;

import Interfaces.IRecyclable;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "organic_wastes_packaging")

public class OrganicPackaged extends Organic implements IRecyclable {

    public OrganicPackaged(String itemName, int quantity, double weight) {
        super(itemName, quantity, weight);
    }

    public OrganicPackaged() {
    }

    @Override
    public String compost() {
        return null;
    }

    @Override
    public String recycle() {
        return null;
    }
}
