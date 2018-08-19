package models.Bins;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "compost_bins")

public class Compost extends Bin {

    public Compost(String type, double weightCapacity, String collectionDay) {
        super(type, weightCapacity, collectionDay);
    }

    public Compost() {
    }
}
