package tech.lapsa.esbd.domain.embedded;

import java.util.function.Consumer;

import tech.lapsa.esbd.domain.AEntity;
import tech.lapsa.java.commons.function.MyNumbers;
import tech.lapsa.java.commons.function.MyStrings;
import tech.lapsa.patterns.domain.HashCodePrime;

@HashCodePrime(233)
public class VehicleEngineInfo extends AEntity {

    private static final long serialVersionUID = 1L;

    public static final VehicleEngineInfoBuilder builder() {
	return new VehicleEngineInfoBuilder();
    }

    public static final class VehicleEngineInfoBuilder {

	private Integer volume;
	private String number;
	private Integer power;

	private VehicleEngineInfoBuilder() {
	}

	public VehicleEngineInfoBuilder withVolume(final Integer volume) {
	    this.volume = MyNumbers.requireNonZero(volume, "volume");
	    return this;
	}

	public VehicleEngineInfoBuilder withNumber(final String number) {
	    this.number = MyStrings.requireNonEmpty(number, "number");
	    return this;
	}

	public VehicleEngineInfoBuilder withPower(final Integer power) {
	    this.power = MyNumbers.requireNonZero(power, "power");
	    return this;
	}

	public VehicleEngineInfoBuilder withEngine(final String number, final Integer volume,
		final Integer power) {
	    return withNumber(number)
		    .withPower(power)
		    .withVolume(volume);
	}

	public VehicleEngineInfo build() {
	    return new VehicleEngineInfo(volume,
		    number,
		    power);
	}

	public void buildTo(final Consumer<VehicleEngineInfo> consumer) {
	    consumer.accept(build());
	}
    }

    // constructor

    private VehicleEngineInfo(final Integer volume,
	    final String number,
	    final Integer power) {
	this.volume = volume;
	this.number = number;
	this.power = power;
    }

    // engineVolume

    private final Integer volume;

    public Integer getVolume() {
	return volume;
    }

    // engineNumber

    private final String number;

    public String getNumber() {
	return number;
    }

    // enginePower

    private final Integer power;

    public Integer getPower() {
	return power;
    }
}
