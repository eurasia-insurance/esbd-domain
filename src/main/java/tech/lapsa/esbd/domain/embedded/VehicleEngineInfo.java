package tech.lapsa.esbd.domain.embedded;

import tech.lapsa.esbd.domain.ADomain;
import tech.lapsa.java.commons.function.MyObjects;
import tech.lapsa.patterns.domain.HashCodePrime;

@HashCodePrime(233)
public class VehicleEngineInfo extends ADomain {

    private static final long serialVersionUID = 1L;

    public static final VehicleEngineInfoBuilder builder() {
	return new VehicleEngineInfoBuilder();
    }

    public static final VehicleEngineInfoBuilder builder(final VehicleEngineInfo source) {
	MyObjects.requireNonNull(source, "source");
	return new VehicleEngineInfoBuilder(source);
    }

    public static final class VehicleEngineInfoBuilder
	    extends ADomainBuilder<VehicleEngineInfo, VehicleEngineInfoBuilder> {

	// private & protected

	protected Integer volume;

	private Integer getVolume() {
	    return volume;
	}

	private void setVolume(Integer volume) {
	    this.volume = volume;
	}

	protected String number;

	private String getNumber() {
	    return number;
	}

	private void setNumber(String number) {
	    this.number = number;
	}

	protected Integer power;

	private Integer getPower() {
	    return power;
	}

	private void setPower(Integer power) {
	    this.power = power;
	}

	@Override
	protected VehicleEngineInfoBuilder _this() {
	    return this;
	}

	// constructor

	protected VehicleEngineInfoBuilder() {
	}

	protected VehicleEngineInfoBuilder(VehicleEngineInfo source) {
	    super(source);
	    this.volume = source.volume;
	    this.number = source.number;
	    this.power = source.power;
	}

	// public

	public VehicleEngineInfoBuilder withVolume(final Integer volume) {
	    setPositiveNumberIfNullOrThrow("volume", this::getVolume, this::setVolume, volume);
	    return this;
	}

	public VehicleEngineInfoBuilder withNumber(final String number) {
	    setStringIfNullOrThrow("number", this::getNumber, this::setNumber, number);
	    return this;
	}

	public VehicleEngineInfoBuilder withPower(final Integer power) {
	    setPositiveNumberIfNullOrThrow("power", this::getPower, this::setPower, power);
	    return this;
	}

	public VehicleEngineInfoBuilder withEngine(final String number, final Integer volume,
		final Integer power) {
	    return withNumber(number)
		    .withPower(power)
		    .withVolume(volume);
	}

	@Override
	public VehicleEngineInfo build() {
	    return new VehicleEngineInfo(volume,
		    number,
		    power);
	}
    }

    // constructor

    protected VehicleEngineInfo(final Integer volume,
	    final String number,
	    final Integer power) {
	this.volume = volume;
	this.number = number;
	this.power = power;
    }

    protected VehicleEngineInfo() {
	this.volume = null;
	this.number = null;
	this.power = null;
    }

    // engineVolume

    final Integer volume;

    public Integer getVolume() {
	return volume;
    }

    // engineNumber

    final String number;

    public String getNumber() {
	return number;
    }

    // enginePower

    final Integer power;

    public Integer getPower() {
	return power;
    }
}
