package models.Rubbish;

import javax.persistence.*;

@Entity
@Table(name = "rubbish")
@Inheritance(strategy = InheritanceType.JOINED)

public abstract class PieceOfRubbish {

    private int id;
    private String itemName;
    private int quantity;
    private double weight;

    public PieceOfRubbish(String itemName, int quantity, double weight) {
        this.itemName = itemName;
        this.quantity = quantity;
        this.weight = weight;
    }

    public PieceOfRubbish() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public int getId() {
        return id;
    }

    @Column(name = "rubbish_name")
    public String getItemName() {
        return itemName;
    }

    @Column(name = "quantity")
    public int getQuantity() {
        return quantity;
    }

    @Column(name = "weight")
    public double getWeight() {
        return weight;
    }



    public void setId(int id) {
        this.id = id;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
