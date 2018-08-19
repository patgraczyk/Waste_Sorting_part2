package models.Bins;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "mixed_bins")

public class MixedRecycling extends Bin {

    public MixedRecycling(String type, double weightCapacity, String collectionDay) {
        super(type, weightCapacity, collectionDay);
    }

    public MixedRecycling() {
    }
}
