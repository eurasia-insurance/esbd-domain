package tech.lapsa.esbd.domain.complex;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import tech.lapsa.esbd.domain.AEntity;
import tech.lapsa.java.commons.function.MyObjects;
import tech.lapsa.patterns.domain.HashCodePrime;

@Entity
@Table(name = "VEHICLE_MODEL")
@HashCodePrime(41)
public class VehicleModelEntity extends AEntity {

    private static final long serialVersionUID = 1L;

    public static final VehicleModelEntityBuilder builder() {
	return new VehicleModelEntityBuilder();
    }

    public static final VehicleModelEntityBuilder builder(final VehicleModelEntity source) {
	MyObjects.requireNonNull(source, "source");
	return new VehicleModelEntityBuilder(source);
    }

    public static final class VehicleModelEntityBuilder
	    extends AEntityBuilder<VehicleModelEntity, VehicleModelEntityBuilder> {

	// private & protected

	protected String name;

	private String getName() {
	    return name;
	}

	private void setName(final String name) {
	    this.name = name;
	}

	protected VehicleManufacturerEntity manufacturer;

	private VehicleManufacturerEntity getManufacturer() {
	    return manufacturer;
	}

	private void setManufacturer(final VehicleManufacturerEntity manufacturer) {
	    this.manufacturer = manufacturer;
	}

	@Override
	protected VehicleModelEntityBuilder _this() {
	    return this;
	}

	// constructor

	protected VehicleModelEntityBuilder() {
	}

	protected VehicleModelEntityBuilder(final VehicleModelEntity source) {
	    super(source);
	    name = source.name;
	    manufacturer = source.manufacturer;
	}

	// public

	public VehicleModelEntityBuilder withName(final String name) {
	    setStringIfNullOrThrow("name", this::getName, this::setName, name);
	    return this;
	}

	public VehicleModelEntityBuilder withManufacturer(final VehicleManufacturerEntity manufacturer) {
	    setBuilderProperty("manufacturer", this::getManufacturer, this::setManufacturer, manufacturer);
	    return this;
	}

	@Override
	public VehicleModelEntity build() throws IllegalArgumentException {
	    return new VehicleModelEntity(id,
		    name,
		    manufacturer);
	}
    }

    // constructor

    protected VehicleModelEntity(final Integer id,
	    final String name,
	    final VehicleManufacturerEntity manufacturer) {
	super(id);
	this.name = name;
	this.manufacturer = manufacturer;
    }

    protected VehicleModelEntity() {
	name = null;
	manufacturer = null;
    }

    // name

    @Basic
    @Column(name = "NAME")
    final String name;

    public String getName() {
	return name;
    }

    // manufacturer

    @ManyToOne
    @JoinColumn(name = "VEHICLE_MANUFACTURER_ID")
    final VehicleManufacturerEntity manufacturer;

    public VehicleManufacturerEntity getManufacturer() {
	return manufacturer;
    }
}
