package tech.lapsa.esbd.domain.complex;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import tech.lapsa.esbd.domain.AEntity;
import tech.lapsa.java.commons.function.MyObjects;
import tech.lapsa.patterns.domain.HashCodePrime;

@Entity
@Table(name = "VEHICLE_MANUFACTURER")
@HashCodePrime(37)
public class VehicleManufacturerEntity extends AEntity {

    private static final long serialVersionUID = 1L;

    public static final VehicleManufacturerEntityBuilder builder() {
	return new VehicleManufacturerEntityBuilder();
    }

    public static final VehicleManufacturerEntityBuilder builder(final VehicleManufacturerEntity source) {
	MyObjects.requireNonNull(source, "source");
	return new VehicleManufacturerEntityBuilder(source);
    }

    public static final class VehicleManufacturerEntityBuilder
	    extends AEntityBuilder<VehicleManufacturerEntity, VehicleManufacturerEntityBuilder> {

	// private & protected

	protected String name;

	private String getName() {
	    return name;
	}

	private void setName(final String name) {
	    this.name = name;
	}

	protected Boolean foreign;

	private Boolean getForeign() {
	    return foreign;
	}

	private void setForeign(final Boolean foreign) {
	    this.foreign = foreign;
	}

	@Override
	protected VehicleManufacturerEntityBuilder _this() {
	    return this;
	}

	// constructor

	protected VehicleManufacturerEntityBuilder() {
	}

	protected VehicleManufacturerEntityBuilder(final VehicleManufacturerEntity source) {
	    super(source);
	    name = source.name;
	    foreign = source.foreign;
	}

	// public

	public VehicleManufacturerEntityBuilder withName(final String name) {
	    setStringIfNullOrThrow("name", this::getName, this::setName, name);
	    return this;
	}

	public VehicleManufacturerEntityBuilder withForeign(final Boolean foreign) {
	    setBuilderProperty("foreign", this::getForeign, this::setForeign, foreign);
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

    protected VehicleManufacturerEntity(final Integer id,
	    final String name,
	    final Boolean foreign) {
	super(id);
	this.name = name;
	this.foreign = foreign;
    }

    protected VehicleManufacturerEntity() {
	name = null;
	foreign = null;
    }

    // name

    @Basic
    @Column(name = "NAME")
    final String name;

    public String getName() {
	return name;
    }

    // foreign

    @Basic
    @Column(name = "FOREIGN")
    final Boolean foreign;

    public Boolean isForeign() {
	return foreign;
    }
}
