package tech.lapsa.esbd.domain.complex;

import tech.lapsa.esbd.domain.AEntity;
import tech.lapsa.patterns.domain.HashCodePrime;

@HashCodePrime(37)
public class VehicleManufacturerEntity extends AEntity {

    private static final long serialVersionUID = 1L;

    public static final VehicleManufacturerEntityBuilder builder() {
	return new VehicleManufacturerEntityBuilder();
    }

    public static final class VehicleManufacturerEntityBuilder
	    extends AEntityBuilder<VehicleManufacturerEntity, VehicleManufacturerEntityBuilder> {

	// private & protected

	protected String name;

	private String getName() {
	    return name;
	}

	private void setName(String name) {
	    this.name = name;
	}

	protected Boolean foreign;

	private Boolean getForeign() {
	    return foreign;
	}

	private void setForeign(Boolean foreign) {
	    this.foreign = foreign;
	}

	@Override
	protected VehicleManufacturerEntityBuilder _this() {
	    return this;
	}

	// constructor

	protected VehicleManufacturerEntityBuilder() {
	}

	// public

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

    protected VehicleManufacturerEntity(final Integer id,
	    final String name,
	    final Boolean foreign) {
	super(id);
	this.name = name;
	this.foreign = foreign;
    }

    protected VehicleManufacturerEntity() {
	this.name = null;
	this.foreign = null;
    }

    // name

    private final String name;

    public String getName() {
	return name;
    }

    // foreign

    private final Boolean foreign;

    public Boolean isForeign() {
	return foreign;
    }
}
