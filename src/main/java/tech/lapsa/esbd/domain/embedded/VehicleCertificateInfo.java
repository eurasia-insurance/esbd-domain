package tech.lapsa.esbd.domain.embedded;

import java.time.LocalDate;

import com.lapsa.kz.country.KZArea;

import tech.lapsa.esbd.domain.AEntity;
import tech.lapsa.kz.vehicle.VehicleRegNumber;
import tech.lapsa.patterns.domain.HashCodePrime;

@HashCodePrime(311)
public class VehicleCertificateInfo extends AEntity {

    private static final long serialVersionUID = 1L;

    public static final VehicleCertificateInfoBuilder builder() {
	return new VehicleCertificateInfoBuilder();
    }

    public static final class VehicleCertificateInfoBuilder
	    extends AEntityBuilder<VehicleCertificateInfo, VehicleCertificateInfoBuilder> {

	// private

	private VehicleRegNumber registrationNumber;

	private VehicleRegNumber getRegistrationNumber() {
	    return registrationNumber;
	}

	private void setRegistrationNumber(VehicleRegNumber registrationNumber) {
	    this.registrationNumber = registrationNumber;
	}

	private String certificateNumber;

	private String getCertificateNumber() {
	    return certificateNumber;
	}

	private void setCertificateNumber(String certificateNumber) {
	    this.certificateNumber = certificateNumber;
	}

	private LocalDate dateOfIssue;

	private LocalDate getDateOfIssue() {
	    return dateOfIssue;
	}

	private void setDateOfIssue(LocalDate dateOfIssue) {
	    this.dateOfIssue = dateOfIssue;
	}

	private KZArea registrationRegion;

	private KZArea getRegistrationRegion() {
	    return registrationRegion;
	}

	private void setRegistrationRegion(KZArea registrationRegion) {
	    this.registrationRegion = registrationRegion;
	}

	private Boolean registrationMajorCity;

	private Boolean getRegistrationMajorCity() {
	    return registrationMajorCity;
	}

	private void setRegistrationMajorCity(Boolean registrationMajorCity) {
	    this.registrationMajorCity = registrationMajorCity;
	}

	private VehicleCertificateInfoBuilder() {
	}

	// public

	public VehicleCertificateInfoBuilder withRegistrationNumber(final VehicleRegNumber registrationNumber) {
	    setIfNullOrThrow("registrationNumber", this::getRegistrationNumber, this::setRegistrationNumber,
		    registrationNumber);
	    return this;
	}

	public VehicleCertificateInfoBuilder withCertificateNumber(final String certificateNumber) {
	    setStringIfNullOrThrow("certificateNumber", this::getCertificateNumber, this::setCertificateNumber,
		    certificateNumber);
	    return this;
	}

	public VehicleCertificateInfoBuilder withDateOfIssue(final LocalDate dateOfIssue) {
	    setIfNullOrThrow("dateOfIssue", this::getDateOfIssue, this::setDateOfIssue, dateOfIssue);
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
	    return new VehicleCertificateInfo(registrationNumber,
		    certificateNumber,
		    dateOfIssue,
		    registrationRegion,
		    registrationMajorCity);
	}
    }

    private VehicleCertificateInfo(final VehicleRegNumber registrationNumber,
	    final String certificateNumber,
	    final LocalDate dateOfIssue,
	    final KZArea registrationRegion,
	    final Boolean registrationMajorCity) {
	this.registrationNumber = registrationNumber;
	this.certificateNumber = certificateNumber;
	this.dateOfIssue = dateOfIssue;
	this.registrationRegion = registrationRegion;
	this.registrationMajorCity = registrationMajorCity;
    }

    // registrationNumber

    private final VehicleRegNumber registrationNumber;

    public VehicleRegNumber getRegistrationNumber() {
	return registrationNumber;
    }

    // certificateNumber

    private final String certificateNumber;

    public String getCertificateNumber() {
	return certificateNumber;
    }

    // dateOfIssue

    private final LocalDate dateOfIssue;

    public LocalDate getDateOfIssue() {
	return dateOfIssue;
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
