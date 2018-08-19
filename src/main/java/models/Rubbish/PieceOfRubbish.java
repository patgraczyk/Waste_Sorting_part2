package models.Rubbish;

import models.Bins.Bin;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "rubbish")
@Inheritance(strategy = InheritanceType.JOINED)

public abstract class PieceOfRubbish {

    private int id;
    private String itemName;
    private int quantity;
    private double weight;
    private List<Bin> bins;

    public PieceOfRubbish(String itemName, int quantity, double weight) {
        this.itemName = itemName;
        this.quantity = quantity;
        this.weight = weight;
        this.bins = new ArrayList<Bin>();
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

    @Cascade(org.hibernate.annotations.CascadeType.SAVE_UPDATE)
    @ManyToMany
    @JoinTable(
            name = "bins_rubbish",
            joinColumns = {@JoinColumn(name = "piece_of_rubbish_id", nullable = false, updatable = false)},
            inverseJoinColumns = {@JoinColumn(name = "bin_id", nullable = false, updatable = false)}
    )
    public List<Bin> getBins() {
        return bins;
    }

    public void setBins(List<Bin> bins) {
        this.bins = bins;
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
