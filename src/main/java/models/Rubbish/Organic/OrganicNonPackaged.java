package models.Rubbish.Organic;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "organic_wastes_nopackaging")

public class OrganicNonPackaged extends Organic {

    public OrganicNonPackaged(String itemName, int quantity, double weight) {
        super(itemName, quantity, weight);
    }

    public OrganicNonPackaged() {
    }

    @Override
    public String compost() {
        return null;
    }
}
