package tech.lapsa.esbd.domain.complex;

import java.time.LocalDate;
import java.util.function.Consumer;

import com.lapsa.insurance.elements.SteeringWheelLocation;
import com.lapsa.insurance.elements.VehicleClass;

import tech.lapsa.esbd.domain.AEntity;
import tech.lapsa.esbd.domain.embedded.VehicleEngineInfo;
import tech.lapsa.java.commons.function.MyObjects;
import tech.lapsa.java.commons.function.MyStrings;
import tech.lapsa.patterns.domain.HashCodePrime;

@HashCodePrime(31)
public class VehicleEntity extends AEntity {

    private static final long serialVersionUID = 1L;

    public static final VehicleEntityBuilder builder() {
	return new VehicleEntityBuilder();
    }

    public static final class VehicleEntityBuilder {

	private Integer id;
	private VehicleClass vehicleClass;
	private String vinCode;
	private VehicleModelEntity vehicleModel;
	private SteeringWheelLocation steeringWheelLocation;
	private String color;
	private LocalDate realeaseDate;
	private VehicleEngineInfo engine;

	private VehicleEntityBuilder() {
	}

	public VehicleEntityBuilder withId(final Integer id) {
	    this.id = MyObjects.requireNonNull(id, "id");
	    return this;
	}

	public VehicleEntityBuilder withVehicleClass(final VehicleClass vehicleClass) {
	    this.vehicleClass = MyObjects.requireNonNull(vehicleClass, "vehicleClass");
	    return this;
	}

	public VehicleEntityBuilder withVinCode(final String vinCode) {
	    this.vinCode = MyStrings.requireNonEmpty(vinCode, "vinCode");
	    return this;
	}

	public VehicleEntityBuilder withVehicleModel(final VehicleModelEntity vehicleModel) {
	    this.vehicleModel = MyObjects.requireNonNull(vehicleModel, "vehicleModel");
	    return this;
	}

	public VehicleEntityBuilder withSteeringWheelLocation(final SteeringWheelLocation steeringWheelLocation) {
	    this.steeringWheelLocation = MyObjects.requireNonNull(steeringWheelLocation, "steeringWheelLocation");
	    return this;
	}

	public VehicleEntityBuilder withColor(final String color) {
	    this.color = MyStrings.requireNonEmpty(color, "color");
	    return this;
	}

	public VehicleEntityBuilder withRealeaseDate(final LocalDate realeaseDate) {
	    this.realeaseDate = MyObjects.requireNonNull(realeaseDate, "realeaseDate");
	    return this;
	}

	public VehicleEntityBuilder withEngine(final VehicleEngineInfo engine) {
	    this.engine = MyObjects.requireNonNull(engine, "engine");
	    return this;
	}

	public VehicleEntity build() throws IllegalArgumentException {
	    return new VehicleEntity(id,
		    vehicleClass,
		    vinCode,
		    vehicleModel,
		    steeringWheelLocation,
		    engine,
		    color,
		    realeaseDate);
	}

	public void buildTo(final Consumer<VehicleEntity> consumer) throws IllegalArgumentException {
	    consumer.accept(build());
	}
    }

    // constructor

    private VehicleEntity(final Integer id,
	    final VehicleClass vehicleClass,
	    final String vinCode,
	    final VehicleModelEntity vehicleModel,
	    final SteeringWheelLocation steeringWheelLocation,
	    final VehicleEngineInfo engine,
	    final String color,
	    final LocalDate realeaseDate) {
	this.id = id;
	this.vehicleClass = vehicleClass;
	this.vinCode = vinCode;
	this.vehicleModel = vehicleModel;
	this.steeringWheelLocation = steeringWheelLocation;
	this.engine = engine;
	this.color = color;
	this.realeaseDate = realeaseDate;
    }

    // id

    private final Integer id;

    public Integer getId() {
	return id;
    }

    // vehicleClass

    private final VehicleClass vehicleClass;

    public VehicleClass getVehicleClass() {
	return vehicleClass;
    }

    // vinCode

    private final String vinCode;

    public String getVinCode() {
	return vinCode;
    }

    // vehicleModel

    private final VehicleModelEntity vehicleModel;

    public VehicleModelEntity getVehicleModel() {
	return vehicleModel;
    }

    // steeringWheelLocation

    private final SteeringWheelLocation steeringWheelLocation;

    public SteeringWheelLocation getSteeringWheelLocation() {
	return steeringWheelLocation;
    }

    // color

    private final String color;

    public String getColor() {
	return color;
    }

    // realeaseDate

    private final LocalDate realeaseDate;

    public LocalDate getRealeaseDate() {
	return realeaseDate;
    }

    // engine

    private final VehicleEngineInfo engine;

    public VehicleEngineInfo getEngine() {
	return engine;
    }
}
