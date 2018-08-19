package models.Bins;

import models.Rubbish.PieceOfRubbish;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "bins")
@Inheritance(strategy = InheritanceType.JOINED)

public abstract class Bin {

        private int id;
        private String type;
        private double weightCapacity;
        private String collectionDay;
        private List<PieceOfRubbish> allRubbish;

    public Bin(String type, double weightCapacity, String collectionDay) {
            this.type = type;
            this.weightCapacity = weightCapacity;
            this.collectionDay = collectionDay;
            this.allRubbish = new ArrayList<PieceOfRubbish>();
    }

    public Bin() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public int getId() {
        return id;
    }


    @Column(name = "type")
    public String getType() {
            return type;
        }

    @Column(name = "weight_capacity")
    public double getWeightCapacity() {
            return weightCapacity;
        }

    @Column(name = "collection_day")
    public String getCollectionDay() {
            return collectionDay;
        }

    @Cascade(org.hibernate.annotations.CascadeType.SAVE_UPDATE)
    @ManyToMany
    @JoinTable(
            name = "bins_rubbish",
            joinColumns = {@JoinColumn(name = "bin_id", nullable = false, updatable = false)},
            inverseJoinColumns = {@JoinColumn(name = "piece_of_rubbish_id", nullable = false, updatable = false)}
    )
    public List<PieceOfRubbish> getAllRubbish() {
        return allRubbish;
    }

    public void setAllRubbish(List<PieceOfRubbish> allRubbish) {
        this.allRubbish = allRubbish;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setWeightCapacity(double weightCapacity) {
        this.weightCapacity = weightCapacity;
    }

    public void setCollectionDay(String collectionDay) {
        this.collectionDay = collectionDay;
    }

    public void addToBin(PieceOfRubbish pieceOfRubbish){
        allRubbish.add(pieceOfRubbish);
    }



//        public boolean addToBin(PieceOfRubbish pieceOfRubbish) {
//            if ((pieceOfRubbish.getWeight() + getWeightOfItemsInBin()) <= this.weightCapacity) {
//                allRubbish.add(pieceOfRubbish);
//                return true;
//            } else {
//                return false;
//            }
//        }

//        public double getWeightOfItemsInBin(){
//            double weightTotal = 0;
//            for(PieceOfRubbish pieceOfRubbish : allRubbish ){
//                weightTotal += pieceOfRubbish.getWeight();
//            }
//            return weightTotal;
//        }
//
//        public double getBinCapacityRemaining(){
//            return (1-(getWeightOfItemsInBin()/weightCapacity))*100;
//        }

    }



