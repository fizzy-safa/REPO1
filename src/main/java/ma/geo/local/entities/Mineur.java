package ma.geo.local.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("mineur")
public class Mineur extends StudentEntity{

    private Boolean isAuthorized ;

    public Boolean getAuthorized() {
        return isAuthorized;
    }

    public void setAuthorized(Boolean authorized) {
        isAuthorized = authorized;
    }
}
