package ma.geo.local.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
    @DiscriminatorValue("majeur")
public class Majeur extends StudentEntity{
    private String cin;

    public String getCin() {
        return cin;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }
}
