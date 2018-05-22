package tech.lapsa.esbd.jpa;


import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ESBD_VER_2_3")
@Access(AccessType.PROPERTY)
public class EsbdVersion {

    @Id
    public int getDummy() {
	return 0;
    }

    public void setDummy(final int dummy) {
    }
}
