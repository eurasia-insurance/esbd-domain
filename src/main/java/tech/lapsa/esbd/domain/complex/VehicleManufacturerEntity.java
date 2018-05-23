package tech.lapsa.esbd.domain.complex;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import tech.lapsa.esbd.domain.AEntity;
import tech.lapsa.patterns.domain.HashCodePrime;

@Entity
@Table(name = "VEHICLE_MANUFACTURER")
@HashCodePrime(37)
public class VehicleManufacturerEntity extends AEntity {

    private static final long serialVersionUID = 1L;

    public static final VehicleManufacturerEntityBuilder builder() {
	return new VehicleManufacturerEntityBuilder();
    }

    public static final class VehicleManufacturerEntityBuilder
	    extends AEntityBuilder<VehicleManufacturerEntity, VehicleManufacturerEntityBuilder> {

	// private

	private Integer id;

	private Integer getId() {
	    return id;
	}

	private void setId(Integer id) {
	    this.id = id;
	}

	private String name;

	private String getName() {
	    return name;
	}

	private void setName(String name) {
	    this.name = name;
	}

	private Boolean foreign;

	private Boolean getForeign() {
	    return foreign;
	}

	private void setForeign(Boolean foreign) {
	    this.foreign = foreign;
	}

	private VehicleManufacturerEntityBuilder() {
	}

	// public

	public VehicleManufacturerEntityBuilder withId(final Integer id) {
	    setNumberIfNullOrThrow("id", this::getId, this::setId, id);
	    return this;
	}

	public VehicleManufacturerEntityBuilder withName(final String name) {
	    setStringIfNullOrThrow("name", this::getName, this::setName, name);
	    return this;
	}

	public VehicleManufacturerEntityBuilder withForeign(final Boolean foreign) {
	    setIfNullOrThrow("foreign", this::getForeign, this::setForeign, foreign);
	    return this;
	}

	@Override
	public VehicleManufacturerEntity build() throws IllegalArgumentException {
	    return new VehicleManufacturerEntity(id,
		    name,
		    foreign);
	}
    }

    // constructor

    private VehicleManufacturerEntity(final Integer id,
	    final String name,
	    final Boolean foreign) {
	this.id = id;
	this.name = name;
	this.foreign = foreign;
    }

    protected VehicleManufacturerEntity() {
	this.id = null;
	this.name = null;
	this.foreign = null;
    }

    // id

    @Id
    @Column(name = "ID")
    private final Integer id;

    public Integer getId() {
	return id;
    }

    // name

    @Basic
    @Column(name = "NAME")
    private final String name;

    public String getName() {
	return name;
    }

    // foreign

    @Basic
    @Column(name = "FOREIGN")
    private final Boolean foreign;

    public Boolean isForeign() {
	return foreign;
    }
}
