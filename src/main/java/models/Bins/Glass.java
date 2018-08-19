package models.Bins;

import Interfaces.IChargable;
import models.Rubbish.PieceOfRubbish;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "glass_bins")
public class Glass extends Bin implements IChargable {

    public Glass(String type, double weightCapacity, String collectionDay) {
        super(type, weightCapacity, collectionDay);
    }

    public Glass() {
    }

    //    i chargable method - why won't let me use @Override?
    @Override
    public double unitPrice() {
        return 2.50;
    }

    @Override
    public double priceForPieceOfTrash(PieceOfRubbish pieceOfRubbish) {
        return unitPrice() * pieceOfRubbish.getWeight();
    }


//    public double getPriceOfItemsInBin(){
//        double weightTotal = 0;
//        for(PieceOfRubbish pieceOfRubbish : getRubbish() ){
//            weightTotal += pieceOfRubbish.getWeight();
//        }
//        return weightTotal * unitPrice();
//    }


}
