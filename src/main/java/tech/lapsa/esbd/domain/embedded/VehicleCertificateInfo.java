package tech.lapsa.esbd.domain.embedded;

import java.time.LocalDate;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import com.lapsa.kz.country.KZArea;

import tech.lapsa.kz.vehicle.VehicleRegNumber;
import tech.lapsa.patterns.domain.HashCodePrime;

@Embeddable
@AttributeOverrides({
	@AttributeOverride(name = "number", column = @Column(name = "VEGICLE_CERTIFICATE_NUMBER")),
	@AttributeOverride(name = "dateOfIssue", column = @Column(name = "VEGICLE_CERTIFICATE_DATE_OF_ISSUE"))
})
@HashCodePrime(311)
public class VehicleCertificateInfo extends ADocumentInfo {

    private static final long serialVersionUID = 1L;

    public static final VehicleCertificateInfoBuilder builder() {
	return new VehicleCertificateInfoBuilder();
    }

    public static final class VehicleCertificateInfoBuilder
	    extends ADocumentInfoBuilder<VehicleCertificateInfo, VehicleCertificateInfoBuilder> {

	// private

	private VehicleRegNumber registrationNumber;

	private VehicleRegNumber getRegistrationNumber() {
	    return registrationNumber;
	}

	private void setRegistrationNumber(VehicleRegNumber registrationNumber) {
	    this.registrationNumber = registrationNumber;
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

	@Override
	protected VehicleCertificateInfoBuilder _this() {
	    return this;
	}

	private VehicleCertificateInfoBuilder() {
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

    private VehicleCertificateInfo(final String number,
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

    @Basic
    @Column(name = "VEGICLE_CERTIFICATE_REGNUM")
    private final VehicleRegNumber registrationNumber;

    public VehicleRegNumber getRegistrationNumber() {
	return registrationNumber;
    }

    // registrationRegion

    @Basic
    @Enumerated(EnumType.STRING)
    @Column(name = "VEGICLE_CERTIFICATE_REGION")
    private final KZArea registrationRegion;

    public KZArea getRegistrationRegion() {
	return registrationRegion;
    }

    // registrationMajorCity

    @Basic
    @Column(name = "VEGICLE_CERTIFICATE_MAJOR_CITY")
    private final Boolean registrationMajorCity;

    boolean isRegistrationMajorCity() {
	return registrationMajorCity;
    }
}
