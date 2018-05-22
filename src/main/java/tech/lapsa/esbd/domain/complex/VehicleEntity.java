package tech.lapsa.esbd.domain.complex;

import java.time.LocalDate;

import com.lapsa.insurance.elements.SteeringWheelLocation;
import com.lapsa.insurance.elements.VehicleClass;

import tech.lapsa.esbd.domain.AEntity;
import tech.lapsa.esbd.domain.embedded.VehicleEngineInfo;
import tech.lapsa.patterns.domain.HashCodePrime;

@HashCodePrime(31)
public class VehicleEntity extends AEntity {

    private static final long serialVersionUID = 1L;

    public static final VehicleEntityBuilder builder() {
	return new VehicleEntityBuilder();
    }

    public static final class VehicleEntityBuilder
	    extends AEntityBuilder<VehicleEntity, VehicleEntityBuilder> {

	// private

	private Integer id;

	private Integer getId() {
	    return id;
	}

	private void setId(Integer id) {
	    this.id = id;
	}

	private VehicleClass vehicleClass;

	private VehicleClass getVehicleClass() {
	    return vehicleClass;
	}

	private void setVehicleClass(VehicleClass vehicleClass) {
	    this.vehicleClass = vehicleClass;
	}

	private String vinCode;

	private String getVinCode() {
	    return vinCode;
	}

	private void setVinCode(String vinCode) {
	    this.vinCode = vinCode;
	}

	private VehicleModelEntity vehicleModel;

	private VehicleModelEntity getVehicleModel() {
	    return vehicleModel;
	}

	private void setVehicleModel(VehicleModelEntity vehicleModel) {
	    this.vehicleModel = vehicleModel;
	}

	private SteeringWheelLocation steeringWheelLocation;

	private SteeringWheelLocation getSteeringWheelLocation() {
	    return steeringWheelLocation;
	}

	private void setSteeringWheelLocation(SteeringWheelLocation steeringWheelLocation) {
	    this.steeringWheelLocation = steeringWheelLocation;
	}

	private String color;

	private String getColor() {
	    return color;
	}

	private void setColor(String color) {
	    this.color = color;
	}

	private LocalDate realeaseDate;

	private LocalDate getRealeaseDate() {
	    return realeaseDate;
	}

	private void setRealeaseDate(LocalDate realeaseDate) {
	    this.realeaseDate = realeaseDate;
	}

	private VehicleEngineInfo engine;

	private VehicleEngineInfo getEngine() {
	    return engine;
	}

	private void setEngine(VehicleEngineInfo engine) {
	    this.engine = engine;
	}

	private VehicleEntityBuilder() {
	}

	// public

	public VehicleEntityBuilder withId(final Integer id) {
	    setNumberIfNullOrThrow("id", this::getId, this::setId, id);
	    return this;
	}

	public VehicleEntityBuilder withVehicleClass(final VehicleClass vehicleClass) {
	    setIfNullOrThrow("vehicleClass", this::getVehicleClass, this::setVehicleClass, vehicleClass);
	    return this;
	}

	public VehicleEntityBuilder withVinCode(final String vinCode) {
	    setStringIfNullOrThrow("vinCode", this::getVinCode, this::setVinCode, vinCode);
	    return this;
	}

	public VehicleEntityBuilder withVehicleModel(final VehicleModelEntity vehicleModel) {
	    setIfNullOrThrow("vehicleModel", this::getVehicleModel, this::setVehicleModel, vehicleModel);
	    return this;
	}

	public VehicleEntityBuilder withSteeringWheelLocation(final SteeringWheelLocation steeringWheelLocation) {
	    setIfNullOrThrow("steeringWheelLocation", this::getSteeringWheelLocation, this::setSteeringWheelLocation,
		    steeringWheelLocation);
	    return this;
	}

	public VehicleEntityBuilder withColor(final String color) {
	    setStringIfNullOrThrow("color", this::getColor, this::setColor, color);
	    return this;
	}

	public VehicleEntityBuilder withRealeaseDate(final LocalDate realeaseDate) {
	    setIfNullOrThrow("realeaseDate", this::getRealeaseDate, this::setRealeaseDate, realeaseDate);
	    return this;
	}

	public VehicleEntityBuilder withEngine(final VehicleEngineInfo engine) {
	    setIfNullOrThrow("engine", this::getEngine, this::setEngine, engine);
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
