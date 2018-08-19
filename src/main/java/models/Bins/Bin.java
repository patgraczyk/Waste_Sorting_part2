package models.Bins;

import javax.persistence.*;


@Entity
@Table(name = "bins")
@Inheritance(strategy = InheritanceType.JOINED)

public abstract class Bin {

        private int id;
        private String type;
        private double weightCapacity;
        private String collectionDay;


    public Bin(String type, double weightCapacity, String collectionDay) {
            this.type = type;
            this.weightCapacity = weightCapacity;
            this.collectionDay = collectionDay;

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


//        public boolean addItemsToBin(PieceOfRubbish pieceOfRubbish) {
//            if ((pieceOfRubbish.getWeight() + getWeightOfItemsInBin()) <= this.weightCapacity) {
//                allRubbish.add(pieceOfRubbish);
//                return true;
//            } else {
//                return false;
//            }
//        }
//
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



