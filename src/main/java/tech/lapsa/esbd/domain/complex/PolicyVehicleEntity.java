package tech.lapsa.esbd.domain.complex;

import com.lapsa.insurance.elements.VehicleAgeClass;
import com.lapsa.insurance.elements.VehicleClass;

import tech.lapsa.esbd.domain.AEntity;
import tech.lapsa.esbd.domain.dict.InsuranceCompanyEntity;
import tech.lapsa.esbd.domain.embedded.RecordOperationInfo;
import tech.lapsa.esbd.domain.embedded.VehicleCertificateInfo;
import tech.lapsa.java.commons.function.MyObjects;
import tech.lapsa.patterns.domain.HashCodePrime;

@HashCodePrime(13)
public class PolicyVehicleEntity extends AEntity {

    private static final long serialVersionUID = 1L;

    public static PolicyVehicleEntityBuilder builder() {
	return new PolicyVehicleEntityBuilder();
    }

    public static final PolicyVehicleEntityBuilder builder(final PolicyVehicleEntity source) {
	MyObjects.requireNonNull(source, "source");
	return new PolicyVehicleEntityBuilder(source);
    }

    public static final class PolicyVehicleEntityBuilder
	    extends AEntityBuilder<PolicyVehicleEntity, PolicyVehicleEntityBuilder> {

	// private & protected

	protected VehicleEntity vehicle;

	private VehicleEntity getVehicle() {
	    return vehicle;
	}

	private void setVehicle(VehicleEntity vehicle) {
	    this.vehicle = vehicle;
	}

	protected VehicleClass vehicleClass;

	private VehicleClass getVehicleClass() {
	    return vehicleClass;
	}

	private void setVehicleClass(VehicleClass vehicleClass) {
	    this.vehicleClass = vehicleClass;
	}

	protected VehicleAgeClass vehicleAgeClass;

	private VehicleAgeClass getVehicleAgeClass() {
	    return vehicleAgeClass;
	}

	private void setVehicleAgeClass(VehicleAgeClass vehicleAgeClass) {
	    this.vehicleAgeClass = vehicleAgeClass;
	}

	protected VehicleCertificateInfo certificate;

	private VehicleCertificateInfo getCertificate() {
	    return certificate;
	}

	private void setCertificate(VehicleCertificateInfo certificate) {
	    this.certificate = certificate;
	}

	protected String vehiclePurpose;

	private String getVehiclePurpose() {
	    return vehiclePurpose;
	}

	private void setVehiclePurpose(String vehiclePurpose) {
	    this.vehiclePurpose = vehiclePurpose;
	}

	protected Integer currentOdometerValue;

	private Integer getCurrentOdometerValue() {
	    return currentOdometerValue;
	}

	private void setCurrentOdometerValue(Integer currentOdometerValue) {
	    this.currentOdometerValue = currentOdometerValue;
	}

	protected RecordOperationInfo created;

	private RecordOperationInfo getCreated() {
	    return created;
	}

	private void setCreated(RecordOperationInfo created) {
	    this.created = created;
	}

	protected RecordOperationInfo modified;

	private RecordOperationInfo getModified() {
	    return modified;
	}

	private void setModified(RecordOperationInfo modified) {
	    this.modified = modified;
	}

	protected InsuranceCompanyEntity insurer;

	private InsuranceCompanyEntity getInsurer() {
	    return insurer;
	}

	private void setInsurer(InsuranceCompanyEntity insurer) {
	    this.insurer = insurer;
	}

	@Override
	protected PolicyVehicleEntityBuilder _this() {
	    return this;
	}

	// constructor

	protected PolicyVehicleEntityBuilder() {
	}

	protected PolicyVehicleEntityBuilder(PolicyVehicleEntity source) {
	    super(source);
	    this.vehicle = source.vehicle;
	    this.vehicleClass = source.vehicleClass;
	    this.vehicleAgeClass = source.vehicleAgeClass;
	    this.certificate = source.certificate;
	    this.vehiclePurpose = source.vehiclePurpose;
	    this.currentOdometerValue = source.currentOdometerValue;
	    this.created = source.created;
	    this.modified = source.modified;
	    this.insurer = source.insurer;
	}

	// public

	public PolicyVehicleEntityBuilder withVehicle(final VehicleEntity vehicle) throws IllegalArgumentException {
	    setBuilderProperty("vehicle", this::getVehicle, this::setVehicle, vehicle);
	    return this;
	}

	public PolicyVehicleEntityBuilder withVehicleClass(final VehicleClass vehicleClass)
		throws IllegalArgumentException {
	    setBuilderProperty("vehicleClass", this::getVehicleClass, this::setVehicleClass, vehicleClass);
	    return this;
	}

	public PolicyVehicleEntityBuilder withVehicleAgeClass(final VehicleAgeClass vehicleAgeClass)
		throws IllegalArgumentException {
	    setBuilderProperty("vehicleAgeClass", this::getVehicleAgeClass, this::setVehicleAgeClass, vehicleAgeClass);
	    return this;
	}

	public PolicyVehicleEntityBuilder withCertificate(final VehicleCertificateInfo certificate)
		throws IllegalArgumentException {
	    setBuilderProperty("certificate", this::getCertificate, this::setCertificate, certificate);
	    return this;
	}

	public PolicyVehicleEntityBuilder withVehiclePurpose(final String vehiclePurpose)
		throws IllegalArgumentException {
	    setBuilderProperty("vehiclePurpose", this::getVehiclePurpose, this::setVehiclePurpose, vehiclePurpose);
	    return this;
	}

	public PolicyVehicleEntityBuilder withCurrentOdometerValue(final Integer currentOdometerValue)
		throws IllegalArgumentException {
	    setBuilderPropertyNumber("currentOdometerValue", this::getCurrentOdometerValue, this::setCurrentOdometerValue,
		    currentOdometerValue);
	    return this;
	}

	public PolicyVehicleEntityBuilder withCreated(final RecordOperationInfo created)
		throws IllegalArgumentException {
	    setBuilderProperty("created", this::getCreated, this::setCreated, created);
	    return this;
	}

	public PolicyVehicleEntityBuilder withModified(final RecordOperationInfo modified)
		throws IllegalArgumentException {
	    setBuilderProperty("modified", this::getModified, this::setModified, modified);
	    return this;
	}

	public PolicyVehicleEntityBuilder withInsurer(final InsuranceCompanyEntity insurer)
		throws IllegalArgumentException {
	    setBuilderProperty("insurer", this::getInsurer, this::setInsurer, insurer);
	    return this;
	}

	@Override
	public PolicyVehicleEntity build() throws IllegalArgumentException {
	    return new PolicyVehicleEntity(id,
		    vehicle,
		    vehicleClass,
		    vehicleAgeClass,
		    certificate,
		    vehiclePurpose,
		    currentOdometerValue,
		    created,
		    modified,
		    insurer);
	}
    }

    // constructor

    protected PolicyVehicleEntity(final Integer id,
	    final VehicleEntity vehicle,
	    final VehicleClass vehicleClass,
	    final VehicleAgeClass vehicleAgeClass,
	    final VehicleCertificateInfo certificate,
	    final String vehiclePurpose,
	    final Integer currentOdometerValue,
	    final RecordOperationInfo created,
	    final RecordOperationInfo modified,
	    final InsuranceCompanyEntity insurer) {
	super(id);
	this.vehicle = vehicle;
	this.vehicleClass = vehicleClass;
	this.vehicleAgeClass = vehicleAgeClass;
	this.certificate = certificate;
	this.vehiclePurpose = vehiclePurpose;
	this.currentOdometerValue = currentOdometerValue;
	this.created = created;
	this.modified = modified;
	this.insurer = insurer;
    }

    protected PolicyVehicleEntity() {
	this.vehicle = null;
	this.vehicleClass = null;
	this.vehicleAgeClass = null;
	this.certificate = null;
	this.vehiclePurpose = null;
	this.currentOdometerValue = null;
	this.created = null;
	this.modified = null;
	this.insurer = null;
    }

    // vehicle

    final VehicleEntity vehicle;

    public VehicleEntity getVehicle() {
	return vehicle;
    }

    // vehicleClass

    final VehicleClass vehicleClass;

    public VehicleClass getVehicleClass() {
	return vehicleClass;
    }

    // vehicleAgeClass

    final VehicleAgeClass vehicleAgeClass;

    public VehicleAgeClass getVehicleAgeClass() {
	return vehicleAgeClass;
    }

    // certificate

    final VehicleCertificateInfo certificate;

    public VehicleCertificateInfo getCertificate() {
	return certificate;
    }

    // vehiclePurpose

    final String vehiclePurpose;

    public String getVehiclePurpose() {
	return vehiclePurpose;
    }

    // currentOdometerValue

    final Integer currentOdometerValue;

    public Integer getCurrentOdometerValue() {
	return currentOdometerValue;
    }

    // created

    final RecordOperationInfo created;

    public RecordOperationInfo getCreated() {
	return created;
    }

    // modified

    final RecordOperationInfo modified;

    public boolean isModified() {
	return MyObjects.nonNull(modified);
    }

    public RecordOperationInfo getModified() {
	return modified;
    }

    // insurer

    final InsuranceCompanyEntity insurer;

    public InsuranceCompanyEntity getInsurer() {
	return insurer;
    }
}
