package tech.lapsa.esbd.domain.complex;

import java.time.LocalDate;

import com.lapsa.insurance.elements.SteeringWheelLocation;
import com.lapsa.insurance.elements.VehicleClass;

import tech.lapsa.esbd.domain.AEntity;
import tech.lapsa.esbd.domain.embedded.VehicleEngineInfo;
import tech.lapsa.java.commons.function.MyObjects;
import tech.lapsa.patterns.domain.HashCodePrime;

@HashCodePrime(31)
public class VehicleEntity extends AEntity {

    private static final long serialVersionUID = 1L;

    public static final VehicleEntityBuilder builder() {
	return new VehicleEntityBuilder();
    }

    public static final VehicleEntityBuilder builder(final VehicleEntity source) {
	MyObjects.requireNonNull(source, "source");
	return new VehicleEntityBuilder(source);
    }

    public static final class VehicleEntityBuilder
	    extends AEntityBuilder<VehicleEntity, VehicleEntityBuilder> {

	// private & protected

	protected VehicleClass vehicleClass;

	private VehicleClass getVehicleClass() {
	    return vehicleClass;
	}

	private void setVehicleClass(final VehicleClass vehicleClass) {
	    this.vehicleClass = vehicleClass;
	}

	protected String vinCode;

	private String getVinCode() {
	    return vinCode;
	}

	private void setVinCode(final String vinCode) {
	    this.vinCode = vinCode;
	}

	protected VehicleModelEntity vehicleModel;

	private VehicleModelEntity getVehicleModel() {
	    return vehicleModel;
	}

	private void setVehicleModel(final VehicleModelEntity vehicleModel) {
	    this.vehicleModel = vehicleModel;
	}

	protected SteeringWheelLocation steeringWheelLocation;

	private SteeringWheelLocation getSteeringWheelLocation() {
	    return steeringWheelLocation;
	}

	private void setSteeringWheelLocation(final SteeringWheelLocation steeringWheelLocation) {
	    this.steeringWheelLocation = steeringWheelLocation;
	}

	protected String color;

	private String getColor() {
	    return color;
	}

	private void setColor(final String color) {
	    this.color = color;
	}

	protected LocalDate realeaseDate;

	private LocalDate getRealeaseDate() {
	    return realeaseDate;
	}

	private void setRealeaseDate(final LocalDate realeaseDate) {
	    this.realeaseDate = realeaseDate;
	}

	protected VehicleEngineInfo engine;

	private VehicleEngineInfo getEngine() {
	    return engine;
	}

	private void setEngine(final VehicleEngineInfo engine) {
	    this.engine = engine;
	}

	@Override
	protected VehicleEntityBuilder _this() {
	    return this;
	}

	// constructor

	protected VehicleEntityBuilder() {
	}

	protected VehicleEntityBuilder(final VehicleEntity source) {
	    super(source);
	    vehicleClass = source.vehicleClass;
	    vinCode = source.vinCode;
	    vehicleModel = source.vehicleModel;
	    steeringWheelLocation = source.steeringWheelLocation;
	    engine = source.engine;
	    color = source.color;
	    realeaseDate = source.realeaseDate;
	}

	// public

	public VehicleEntityBuilder withVehicleClass(final VehicleClass vehicleClass) {
	    setBuilderProperty("vehicleClass", this::getVehicleClass, this::setVehicleClass, vehicleClass);
	    return this;
	}

	public VehicleEntityBuilder withVinCode(final String vinCode) {
	    setStringIfNullOrThrow("vinCode", this::getVinCode, this::setVinCode, vinCode);
	    return this;
	}

	public VehicleEntityBuilder withVehicleModel(final VehicleModelEntity vehicleModel) {
	    setBuilderProperty("vehicleModel", this::getVehicleModel, this::setVehicleModel, vehicleModel);
	    return this;
	}

	public VehicleEntityBuilder withSteeringWheelLocation(final SteeringWheelLocation steeringWheelLocation) {
	    setBuilderProperty("steeringWheelLocation", this::getSteeringWheelLocation, this::setSteeringWheelLocation,
		    steeringWheelLocation);
	    return this;
	}

	public VehicleEntityBuilder withColor(final String color) {
	    setStringIfNullOrThrow("color", this::getColor, this::setColor, color);
	    return this;
	}

	public VehicleEntityBuilder withRealeaseDate(final LocalDate realeaseDate) {
	    setBuilderProperty("realeaseDate", this::getRealeaseDate, this::setRealeaseDate, realeaseDate);
	    return this;
	}

	public VehicleEntityBuilder withEngine(final VehicleEngineInfo engine) {
	    setBuilderProperty("engine", this::getEngine, this::setEngine, engine);
	    return this;
	}

	@Override
	public VehicleEntity build() {
	    return new VehicleEntity(id,
		    vehicleClass,
		    vinCode,
		    vehicleModel,
		    steeringWheelLocation,
		    engine,
		    color,
		    realeaseDate);
	}
    }

    // constructor

    protected VehicleEntity(final Integer id,
	    final VehicleClass vehicleClass,
	    final String vinCode,
	    final VehicleModelEntity vehicleModel,
	    final SteeringWheelLocation steeringWheelLocation,
	    final VehicleEngineInfo engine,
	    final String color,
	    final LocalDate realeaseDate) {
	super(id);
	this.vehicleClass = vehicleClass;
	this.vinCode = vinCode;
	this.vehicleModel = vehicleModel;
	this.steeringWheelLocation = steeringWheelLocation;
	this.engine = engine;
	this.color = color;
	this.realeaseDate = realeaseDate;
    }

    protected VehicleEntity() {
	vehicleClass = null;
	vinCode = null;
	vehicleModel = null;
	steeringWheelLocation = null;
	engine = null;
	color = null;
	realeaseDate = null;
    }

    // vehicleClass

    final VehicleClass vehicleClass;

    public VehicleClass getVehicleClass() {
	return vehicleClass;
    }

    // vinCode

    final String vinCode;

    public String getVinCode() {
	return vinCode;
    }

    // vehicleModel

    final VehicleModelEntity vehicleModel;

    public VehicleModelEntity getVehicleModel() {
	return vehicleModel;
    }

    // steeringWheelLocation

    final SteeringWheelLocation steeringWheelLocation;

    public SteeringWheelLocation getSteeringWheelLocation() {
	return steeringWheelLocation;
    }

    // color

    final String color;

    public String getColor() {
	return color;
    }

    // realeaseDate

    final LocalDate realeaseDate;

    public LocalDate getRealeaseDate() {
	return realeaseDate;
    }

    // engine

    final VehicleEngineInfo engine;

    public VehicleEngineInfo getEngine() {
	return engine;
    }
}
