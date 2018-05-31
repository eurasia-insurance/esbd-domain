package tech.lapsa.esbd.domain.embedded;

import java.time.LocalDate;

import com.lapsa.kz.country.KZArea;

import tech.lapsa.java.commons.function.MyObjects;
import tech.lapsa.kz.vehicle.VehicleRegNumber;
import tech.lapsa.patterns.domain.HashCodePrime;

@HashCodePrime(311)
public class VehicleCertificateInfo extends ADocumentInfo {

    private static final long serialVersionUID = 1L;

    public static final VehicleCertificateInfoBuilder builder() {
	return new VehicleCertificateInfoBuilder();
    }

    public static final VehicleCertificateInfoBuilder builder(final VehicleCertificateInfo source) {
	MyObjects.requireNonNull(source, "source");
	return new VehicleCertificateInfoBuilder(source);
    }

    public static final class VehicleCertificateInfoBuilder
	    extends ADocumentInfoBuilder<VehicleCertificateInfo, VehicleCertificateInfoBuilder> {

	// private & protected

	protected VehicleRegNumber registrationNumber;

	private VehicleRegNumber getRegistrationNumber() {
	    return registrationNumber;
	}

	private void setRegistrationNumber(final VehicleRegNumber registrationNumber) {
	    this.registrationNumber = registrationNumber;
	}

	protected KZArea registrationRegion;

	private KZArea getRegistrationRegion() {
	    return registrationRegion;
	}

	private void setRegistrationRegion(final KZArea registrationRegion) {
	    this.registrationRegion = registrationRegion;
	}

	protected Boolean registrationMajorCity;

	private Boolean getRegistrationMajorCity() {
	    return registrationMajorCity;
	}

	private void setRegistrationMajorCity(final Boolean registrationMajorCity) {
	    this.registrationMajorCity = registrationMajorCity;
	}

	@Override
	protected VehicleCertificateInfoBuilder _this() {
	    return this;
	}

	// constructor

	protected VehicleCertificateInfoBuilder() {
	}

	protected VehicleCertificateInfoBuilder(final VehicleCertificateInfo source) {
	    super(source);
	    registrationNumber = source.registrationNumber;
	    registrationRegion = source.registrationRegion;
	    registrationMajorCity = source.registrationMajorCity;
	}

	// public

	public VehicleCertificateInfoBuilder withRegistrationNumber(final VehicleRegNumber registrationNumber) {
	    setBuilderProperty("registrationNumber", this::getRegistrationNumber, this::setRegistrationNumber,
		    registrationNumber);
	    return this;
	}

	public VehicleCertificateInfoBuilder withRegistrationRegion(final KZArea registrationRegion) {
	    setBuilderProperty("registrationRegion", this::getRegistrationRegion, this::setRegistrationRegion,
		    registrationRegion);
	    return this;
	}

	public VehicleCertificateInfoBuilder withRegistrationMajorCity(final Boolean registrationMajorCity) {
	    setBuilderProperty("registrationMajorCity", this::getRegistrationMajorCity, this::setRegistrationMajorCity,
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
	registrationNumber = null;
	registrationRegion = null;
	registrationMajorCity = null;
    }

    // registrationNumber

    final VehicleRegNumber registrationNumber;

    public VehicleRegNumber getRegistrationNumber() {
	return registrationNumber;
    }

    // registrationRegion

    final KZArea registrationRegion;

    public KZArea getRegistrationRegion() {
	return registrationRegion;
    }

    // registrationMajorCity

    final Boolean registrationMajorCity;

    boolean isRegistrationMajorCity() {
	return registrationMajorCity;
    }
}
