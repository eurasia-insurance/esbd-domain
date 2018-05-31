package tech.lapsa.esbd.domain.complex;

import com.lapsa.insurance.elements.InsuranceClassType;
import com.lapsa.insurance.elements.InsuredAgeAndExpirienceClass;
import com.lapsa.insurance.elements.InsuredAgeClass;
import com.lapsa.insurance.elements.InsuredExpirienceClass;
import com.lapsa.insurance.elements.MaritalStatus;

import tech.lapsa.esbd.domain.AEntity;
import tech.lapsa.esbd.domain.dict.InsuranceCompanyEntity;
import tech.lapsa.esbd.domain.embedded.DriverLicenseInfo;
import tech.lapsa.esbd.domain.embedded.GPWParticipantCertificateInfo;
import tech.lapsa.esbd.domain.embedded.HandicappedCertificateInfo;
import tech.lapsa.esbd.domain.embedded.PensionerCertificateInfo;
import tech.lapsa.esbd.domain.embedded.PrivilegerDocumentInfo;
import tech.lapsa.esbd.domain.embedded.RecordOperationInfo;
import tech.lapsa.java.commons.function.MyObjects;
import tech.lapsa.patterns.domain.HashCodeMultiplier;

@HashCodeMultiplier(11)
public class PolicyDriverEntity extends AEntity {

    private static final long serialVersionUID = 1L;

    public static final PolicyDriverEntityBuilder builder() {
	return new PolicyDriverEntityBuilder();
    }

    public static final PolicyDriverEntityBuilder builder(final PolicyDriverEntity source) {
	MyObjects.requireNonNull(source, "source");
	return new PolicyDriverEntityBuilder(source);
    }

    public static final class PolicyDriverEntityBuilder
	    extends AEntityBuilder<PolicyDriverEntity, PolicyDriverEntityBuilder> {

	// private & protected

	protected SubjectPersonEntity insuredPerson;

	private SubjectPersonEntity getInsuredPerson() {
	    return insuredPerson;
	}

	private void setInsuredPerson(SubjectPersonEntity insuredPerson) {
	    this.insuredPerson = insuredPerson;
	}

	protected MaritalStatus maritalStatus;

	private MaritalStatus getMaritalStatus() {
	    return maritalStatus;
	}

	private void setMaritalStatus(MaritalStatus maritalStatus) {
	    this.maritalStatus = maritalStatus;
	}

	protected InsuredAgeAndExpirienceClass insuredAgeExpirienceClass;

	private InsuredAgeAndExpirienceClass getInsuredAgeExpirienceClass() {
	    return insuredAgeExpirienceClass;
	}

	private void setInsuredAgeExpirienceClass(InsuredAgeAndExpirienceClass insuredAgeExpirienceClass) {
	    this.insuredAgeExpirienceClass = insuredAgeExpirienceClass;
	}

	protected Integer drivingExpirience;

	private Integer getDrivingExpirience() {
	    return drivingExpirience;
	}

	private void setDrivingExpirience(Integer drivingExpirience) {
	    this.drivingExpirience = drivingExpirience;
	}

	protected DriverLicenseInfo driverLicense;

	private DriverLicenseInfo getDriverLicense() {
	    return driverLicense;
	}

	private void setDriverLicense(DriverLicenseInfo driverLicense) {
	    this.driverLicense = driverLicense;
	}

	protected InsuranceClassType insuranceClassType;

	private InsuranceClassType getInsuranceClassType() {
	    return insuranceClassType;
	}

	private void setInsuranceClassType(InsuranceClassType insuranceClassType) {
	    this.insuranceClassType = insuranceClassType;
	}

	protected PrivilegerDocumentInfo privilegerInfo;

	private PrivilegerDocumentInfo getPrivilegerInfo() {
	    return privilegerInfo;
	}

	private void setPrivilegerInfo(PrivilegerDocumentInfo privilegerInfo) {
	    this.privilegerInfo = privilegerInfo;
	}

	protected GPWParticipantCertificateInfo gpwParticipantInfo;

	private GPWParticipantCertificateInfo getGpwParticipantInfo() {
	    return gpwParticipantInfo;
	}

	private void setGpwParticipantInfo(GPWParticipantCertificateInfo gpwParticipantInfo) {
	    this.gpwParticipantInfo = gpwParticipantInfo;
	}

	protected PensionerCertificateInfo pensionerInfo;

	private PensionerCertificateInfo getPensionerInfo() {
	    return pensionerInfo;
	}

	private void setPensionerInfo(PensionerCertificateInfo pensionerInfo) {
	    this.pensionerInfo = pensionerInfo;
	}

	protected HandicappedCertificateInfo handicappedInfo;

	private HandicappedCertificateInfo getHandicappedInfo() {
	    return handicappedInfo;
	}

	private void setHandicappedInfo(HandicappedCertificateInfo handicappedInfo) {
	    this.handicappedInfo = handicappedInfo;
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
	protected PolicyDriverEntityBuilder _this() {
	    return this;
	}

	// constructor

	protected PolicyDriverEntityBuilder() {
	}

	protected PolicyDriverEntityBuilder(final PolicyDriverEntity source) {
	    super(source);
	    this.insuredPerson = source.insuredPerson;
	    this.maritalStatus = source.maritalStatus;
	    this.insuredAgeExpirienceClass = source.insuredAgeExpirienceClass;
	    this.drivingExpirience = source.drivingExpirience;
	    this.driverLicense = source.driverLicense;
	    this.insuranceClassType = source.insuranceClassType;
	    this.privilegerInfo = source.privilegerInfo;
	    this.gpwParticipantInfo = source.gpwParticipantInfo;
	    this.pensionerInfo = source.pensionerInfo;
	    this.handicappedInfo = source.handicappedInfo;
	    this.created = source.created;
	    this.modified = source.modified;
	    this.insurer = source.insurer;
	}

	// public

	public PolicyDriverEntityBuilder withInsuredPerson(final SubjectPersonEntity insuredPerson)
		throws IllegalArgumentException {
	    setBuilderProperty("insuredPerson", this::getInsuredPerson, this::setInsuredPerson, insuredPerson);
	    return this;
	}

	public PolicyDriverEntityBuilder withMaritalStatus(final MaritalStatus maritalStatus)
		throws IllegalArgumentException {
	    setBuilderProperty("maritalStatus", this::getMaritalStatus, this::setMaritalStatus, maritalStatus);
	    return this;
	}

	public PolicyDriverEntityBuilder withInsuredAgeExpirienceClass(
		final InsuredAgeAndExpirienceClass insuredAgeExpirienceClass) throws IllegalArgumentException {
	    setBuilderProperty("insuredAgeExpirienceClass", this::getInsuredAgeExpirienceClass,
		    this::setInsuredAgeExpirienceClass, insuredAgeExpirienceClass);
	    return this;
	}

	public PolicyDriverEntityBuilder withDrivingExpirience(final Integer drivingExpirience)
		throws IllegalArgumentException {
	    setBuilderProperty("drivingExpirience", this::getDrivingExpirience, this::setDrivingExpirience,
		    drivingExpirience);
	    return this;
	}

	public PolicyDriverEntityBuilder withDriverLicense(final DriverLicenseInfo driverLicense)
		throws IllegalArgumentException {
	    setBuilderProperty("driverLicense", this::getDriverLicense, this::setDriverLicense, driverLicense);
	    return this;
	}

	public PolicyDriverEntityBuilder withInsuranceClassType(final InsuranceClassType insuranceClassType)
		throws IllegalArgumentException {
	    setBuilderProperty("insuranceClassType", this::getInsuranceClassType, this::setInsuranceClassType,
		    insuranceClassType);
	    return this;
	}

	public PolicyDriverEntityBuilder withPrivilegerInfo(final PrivilegerDocumentInfo privilegerInfo)
		throws IllegalArgumentException {
	    setBuilderProperty("privilegerInfo", this::getPrivilegerInfo, this::setPrivilegerInfo, privilegerInfo);
	    return this;
	}

	public PolicyDriverEntityBuilder withGpwParticipantInfo(final GPWParticipantCertificateInfo gpwParticipantInfo)
		throws IllegalArgumentException {
	    setBuilderProperty("gpwParticipantInfo", this::getGpwParticipantInfo, this::setGpwParticipantInfo,
		    gpwParticipantInfo);
	    return this;
	}

	public PolicyDriverEntityBuilder withPensionerInfo(final PensionerCertificateInfo pensionerInfo)
		throws IllegalArgumentException {
	    setBuilderProperty("pensionerInfo", this::getPensionerInfo, this::setPensionerInfo, pensionerInfo);
	    return this;
	}

	public PolicyDriverEntityBuilder withHandicappedInfo(final HandicappedCertificateInfo handicappedInfo)
		throws IllegalArgumentException {
	    setBuilderProperty("handicappedInfo", this::getHandicappedInfo, this::setHandicappedInfo, handicappedInfo);
	    return this;
	}

	public PolicyDriverEntityBuilder withCreated(final RecordOperationInfo created)
		throws IllegalArgumentException {
	    setBuilderProperty("created", this::getCreated, this::setCreated, created);
	    return this;
	}

	public PolicyDriverEntityBuilder withModified(final RecordOperationInfo modified)
		throws IllegalArgumentException {
	    setBuilderProperty("modified", this::getModified, this::setModified, modified);
	    return this;
	}

	public PolicyDriverEntityBuilder withInsurer(final InsuranceCompanyEntity insurer)
		throws IllegalArgumentException {
	    setBuilderProperty("insurer", this::getInsurer, this::setInsurer, insurer);
	    return this;
	}

	@Override
	public PolicyDriverEntity build() throws IllegalArgumentException {
	    return new PolicyDriverEntity(id,
		    insuredPerson,
		    maritalStatus,
		    insuredAgeExpirienceClass,
		    drivingExpirience,
		    driverLicense,
		    insuranceClassType,
		    privilegerInfo,
		    gpwParticipantInfo,
		    pensionerInfo,
		    handicappedInfo,
		    created,
		    modified,
		    insurer);
	}
    }

    // constructor

    protected PolicyDriverEntity(final Integer id,
	    final SubjectPersonEntity insuredPerson,
	    final MaritalStatus maritalStatus,
	    final InsuredAgeAndExpirienceClass insuredAgeExpirienceClass,
	    final Integer drivingExpirience,
	    final DriverLicenseInfo driverLicense,
	    final InsuranceClassType insuranceClassType,
	    final PrivilegerDocumentInfo privilegerInfo,
	    final GPWParticipantCertificateInfo gpwParticipantInfo,
	    final PensionerCertificateInfo pensionerInfo,
	    final HandicappedCertificateInfo handicappedInfo,
	    final RecordOperationInfo created,
	    final RecordOperationInfo modified,
	    final InsuranceCompanyEntity insurer) {
	super(id);
	this.insuredPerson = insuredPerson;
	this.maritalStatus = maritalStatus;
	this.insuredAgeExpirienceClass = insuredAgeExpirienceClass;
	this.drivingExpirience = drivingExpirience;
	this.driverLicense = driverLicense;
	this.insuranceClassType = insuranceClassType;
	this.privilegerInfo = privilegerInfo;
	this.gpwParticipantInfo = gpwParticipantInfo;
	this.pensionerInfo = pensionerInfo;
	this.handicappedInfo = handicappedInfo;
	this.created = created;
	this.modified = modified;
	this.insurer = insurer;
    }

    protected PolicyDriverEntity() {
	this.insuredPerson = null;
	this.maritalStatus = null;
	this.insuredAgeExpirienceClass = null;
	this.drivingExpirience = null;
	this.driverLicense = null;
	this.insuranceClassType = null;
	this.privilegerInfo = null;
	this.gpwParticipantInfo = null;
	this.pensionerInfo = null;
	this.handicappedInfo = null;
	this.created = null;
	this.modified = null;
	this.insurer = null;
    }

    // insuredPerson

    final SubjectPersonEntity insuredPerson;

    public SubjectPersonEntity getInsuredPerson() {
	return insuredPerson;
    }

    // maritalStatus

    final MaritalStatus maritalStatus;

    public MaritalStatus getMaritalStatus() {
	return maritalStatus;
    }

    // insuredAgeExpirienceClass

    final InsuredAgeAndExpirienceClass insuredAgeExpirienceClass;

    public InsuredAgeAndExpirienceClass getInsuredAgeExpirienceClass() {
	return insuredAgeExpirienceClass;
    }

    public InsuredAgeClass getAgeClass() {
	return MyObjects.isNull(insuredAgeExpirienceClass)
		? null
		: insuredAgeExpirienceClass.getAgeClass();
    }

    public InsuredExpirienceClass getExpirienceClass() {
	return MyObjects.isNull(insuredAgeExpirienceClass)
		? null
		: insuredAgeExpirienceClass.getExpirienceClass();
    }

    // drivingExpirience

    final Integer drivingExpirience;

    public Integer getDrivingExpirience() {
	return drivingExpirience;
    }

    final DriverLicenseInfo driverLicense;

    public DriverLicenseInfo getDriverLicense() {
	return driverLicense;
    }

    // insuranceClassType

    final InsuranceClassType insuranceClassType;

    public InsuranceClassType getInsuranceClassType() {
	return insuranceClassType;
    }

    // privilegerInfo

    final PrivilegerDocumentInfo privilegerInfo;

    public boolean isPrivileger() {
	return MyObjects.nonNull(privilegerInfo);
    }

    public PrivilegerDocumentInfo getPrivilegerInfo() {
	return privilegerInfo;
    }

    // gpwParticipantInfo

    final GPWParticipantCertificateInfo gpwParticipantInfo;

    public boolean isGpwParticipant() {
	return MyObjects.nonNull(gpwParticipantInfo);
    }

    public GPWParticipantCertificateInfo getGpwParticipantInfo() {
	return gpwParticipantInfo;
    }

    // pensionerInfo

    final PensionerCertificateInfo pensionerInfo;

    public boolean isPensioner() {
	return MyObjects.nonNull(pensionerInfo);
    }

    public PensionerCertificateInfo getPensionerInfo() {
	return pensionerInfo;
    }

    // handicappedInfo

    final HandicappedCertificateInfo handicappedInfo;

    public boolean isHandicapped() {
	return MyObjects.nonNull(handicappedInfo);
    }

    public HandicappedCertificateInfo getHandicappedInfo() {
	return handicappedInfo;
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
