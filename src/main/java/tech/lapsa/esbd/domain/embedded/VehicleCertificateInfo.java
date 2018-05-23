package tech.lapsa.esbd.domain.embedded;

import java.time.LocalDate;

import com.lapsa.kz.country.KZArea;

import tech.lapsa.kz.vehicle.VehicleRegNumber;
import tech.lapsa.patterns.domain.HashCodePrime;

@HashCodePrime(311)
public class VehicleCertificateInfo extends ADocumentInfo {

    private static final long serialVersionUID = 1L;

    public static final VehicleCertificateInfoBuilder builder() {
	return new VehicleCertificateInfoBuilder();
    }

    public static final class VehicleCertificateInfoBuilder
	    extends ADocumentInfoBuilder<VehicleCertificateInfo, VehicleCertificateInfoBuilder> {

	// private & protected

	protected VehicleRegNumber registrationNumber;

	private VehicleRegNumber getRegistrationNumber() {
	    return registrationNumber;
	}

	private void setRegistrationNumber(VehicleRegNumber registrationNumber) {
	    this.registrationNumber = registrationNumber;
	}

	protected KZArea registrationRegion;

	private KZArea getRegistrationRegion() {
	    return registrationRegion;
	}

	private void setRegistrationRegion(KZArea registrationRegion) {
	    this.registrationRegion = registrationRegion;
	}

	protected Boolean registrationMajorCity;

	private Boolean getRegistrationMajorCity() {
	    return registrationMajorCity;
	}

	private void setRegistrationMajorCity(Boolean registrationMajorCity) {
	    this.registrationMajorCity = registrationMajorCity;
	}

	@Override
	protected VehicleCertificateInfoBuilder _this() {
	    return this;
	}

	// constructor

	protected VehicleCertificateInfoBuilder() {
	}

	// public

	public VehicleCertificateInfoBuilder withRegistrationNumber(final VehicleRegNumber registrationNumber) {
	    setIfNullOrThrow("registrationNumber", this::getRegistrationNumber, this::setRegistrationNumber,
		    registrationNumber);
	    return this;
	}

	public VehicleCertificateInfoBuilder withRegistrationRegion(final KZArea registrationRegion) {
	    setIfNullOrThrow("registrationRegion", this::getRegistrationRegion, this::setRegistrationRegion,
		    registrationRegion);
	    return this;
	}

	public VehicleCertificateInfoBuilder withRegistrationMajorCity(final Boolean registrationMajorCity) {
	    setIfNullOrThrow("registrationMajorCity", this::getRegistrationMajorCity, this::setRegistrationMajorCity,
		    registrationMajorCity);
	    return this;
	}

	@Override
	public VehicleCertificateInfo build() {
	    return new VehicleCertificateInfo(number,
		    dateOfIssue,
		    registrationNumber,
		    registrationRegion,
		    registrationMajorCity);
	}
    }

    // constructor

    protected VehicleCertificateInfo(final String number,
	    final LocalDate dateOfIssue,
	    final VehicleRegNumber registrationNumber,
	    final KZArea registrationRegion,
	    final Boolean registrationMajorCity) {
	super(number, dateOfIssue);
	this.registrationNumber = registrationNumber;
	this.registrationRegion = registrationRegion;
	this.registrationMajorCity = registrationMajorCity;
    }

    protected VehicleCertificateInfo() {
	this.registrationNumber = null;
	this.registrationRegion = null;
	this.registrationMajorCity = null;
    }

    // registrationNumber

    private final VehicleRegNumber registrationNumber;

    public VehicleRegNumber getRegistrationNumber() {
	return registrationNumber;
    }

    // registrationRegion

    private final KZArea registrationRegion;

    public KZArea getRegistrationRegion() {
	return registrationRegion;
    }

    // registrationMajorCity

    private final Boolean registrationMajorCity;

    boolean isRegistrationMajorCity() {
	return registrationMajorCity;
    }
}
