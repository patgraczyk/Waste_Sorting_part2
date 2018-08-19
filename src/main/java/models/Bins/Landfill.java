package models.Bins;

import Interfaces.IChargable;
import models.Rubbish.PieceOfRubbish;

import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table(name = "landfill_bins")
public class Landfill extends Bin implements IChargable {

    public Landfill(String type, double weightCapacity, String collectionDay) {
        super(type, weightCapacity, collectionDay);
    }

    public Landfill() {
    }

    @Override
    public double unitPrice() {
        return 4.50;
    }

    @Override
    public double priceForPieceOfTrash(PieceOfRubbish pieceOfRubbish) {
        return  unitPrice() * pieceOfRubbish.getWeight();
    }
}
