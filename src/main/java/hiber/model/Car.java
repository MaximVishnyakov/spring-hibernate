package hiber.model;

import org.springframework.stereotype.Controller;

import javax.persistence.*;

@Entity
@Table(name = "cars")
public class Car {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column
    private int series;

    @Column
    private String model;

    @OneToOne(mappedBy = "car", cascade = CascadeType.ALL)
    private User user;


    public Car() {

    }

    public Car(int series, String model) {
        this.series = series;
        this.model = model;
    }



    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Car{" +
                "series=" + series +
                ", model='" + model + '\'' +
                '}';
    }
}
