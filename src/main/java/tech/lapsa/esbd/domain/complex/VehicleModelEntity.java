package tech.lapsa.esbd.domain.complex;

import tech.lapsa.esbd.domain.AEntity;
import tech.lapsa.patterns.domain.HashCodePrime;

@HashCodePrime(41)
public class VehicleModelEntity extends AEntity {

    private static final long serialVersionUID = 1L;

    public static final VehicleModelEntityBuilder builder() {
	return new VehicleModelEntityBuilder();
    }

    public static final class VehicleModelEntityBuilder
	    extends AEntityBuilder<VehicleModelEntity, VehicleModelEntityBuilder> {

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

	private VehicleManufacturerEntity manufacturer;

	private VehicleManufacturerEntity getManufacturer() {
	    return manufacturer;
	}

	private void setManufacturer(VehicleManufacturerEntity manufacturer) {
	    this.manufacturer = manufacturer;
	}

	private VehicleModelEntityBuilder() {
	}

	// public

	public VehicleModelEntityBuilder withId(final Integer id) {
	    setNumberIfNullOrThrow("id", this::getId, this::setId, id);
	    return this;
	}

	public VehicleModelEntityBuilder withName(final String name) {
	    setStringIfNullOrThrow("name", this::getName, this::setName, name);
	    return this;
	}

	public VehicleModelEntityBuilder withManufacturer(final VehicleManufacturerEntity manufacturer) {
	    setIfNullOrThrow("manufacturer", this::getManufacturer, this::setManufacturer, manufacturer);
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

    private VehicleModelEntity(final Integer id,
	    final String name,
	    final VehicleManufacturerEntity manufacturer) {
	this.id = id;
	this.name = name;
	this.manufacturer = manufacturer;
    }

    // id

    private final Integer id;

    public Integer getId() {
	return id;
    }

    // name

    private final String name;

    public String getName() {
	return name;
    }

    // manufacturer

    private final VehicleManufacturerEntity manufacturer;

    public VehicleManufacturerEntity getManufacturer() {
	return manufacturer;
    }
}
