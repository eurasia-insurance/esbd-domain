package tech.lapsa.esbd.domain.complex;

import java.util.function.Consumer;

import com.lapsa.insurance.elements.InsuranceClassType;
import com.lapsa.insurance.elements.InsuredAgeAndExpirienceClass;
import com.lapsa.insurance.elements.InsuredAgeClass;
import com.lapsa.insurance.elements.InsuredExpirienceClass;
import com.lapsa.insurance.elements.MaritalStatus;

import tech.lapsa.esbd.domain.AEntity;
import tech.lapsa.esbd.domain.dict.InsuranceCompanyEntity;
import tech.lapsa.esbd.domain.embedded.DriverLicenseInfo;
import tech.lapsa.esbd.domain.embedded.GPWParticipantInfo;
import tech.lapsa.esbd.domain.embedded.HandicappedInfo;
import tech.lapsa.esbd.domain.embedded.PensionerInfo;
import tech.lapsa.esbd.domain.embedded.PrivilegerInfo;
import tech.lapsa.esbd.domain.embedded.RecordOperationInfo;
import tech.lapsa.java.commons.function.MyObjects;
import tech.lapsa.patterns.domain.HashCodeMultiplier;

@HashCodeMultiplier(11)
public class PolicyDriverEntity extends AEntity {

    private static final long serialVersionUID = 1L;

    public static final PolicyDriverEntityBuilder builder() {
	return new PolicyDriverEntityBuilder();
    }

    public static final class PolicyDriverEntityBuilder {

	// private

	private Integer id;

	private Integer getId() {
	    return id;
	}

	private void setId(Integer id) {
	    this.id = id;
	}

	private SubjectPersonEntity insuredPerson;

	private SubjectPersonEntity getInsuredPerson() {
	    return insuredPerson;
	}

	private void setInsuredPerson(SubjectPersonEntity insuredPerson) {
	    this.insuredPerson = insuredPerson;
	}

	private MaritalStatus maritalStatus;

	private MaritalStatus getMaritalStatus() {
	    return maritalStatus;
	}

	private void setMaritalStatus(MaritalStatus maritalStatus) {
	    this.maritalStatus = maritalStatus;
	}

	private InsuredAgeAndExpirienceClass insuredAgeExpirienceClass;

	private InsuredAgeAndExpirienceClass getInsuredAgeExpirienceClass() {
	    return insuredAgeExpirienceClass;
	}

	private void setInsuredAgeExpirienceClass(InsuredAgeAndExpirienceClass insuredAgeExpirienceClass) {
	    this.insuredAgeExpirienceClass = insuredAgeExpirienceClass;
	}

	private Integer drivingExpirience;

	private Integer getDrivingExpirience() {
	    return drivingExpirience;
	}

	private void setDrivingExpirience(Integer drivingExpirience) {
	    this.drivingExpirience = drivingExpirience;
	}

	private DriverLicenseInfo driverLicense;

	private DriverLicenseInfo getDriverLicense() {
	    return driverLicense;
	}

	private void setDriverLicense(DriverLicenseInfo driverLicense) {
	    this.driverLicense = driverLicense;
	}

	private InsuranceClassType insuraceClassType;

	private InsuranceClassType getInsuraceClassType() {
	    return insuraceClassType;
	}

	private void setInsuraceClassType(InsuranceClassType insuraceClassType) {
	    this.insuraceClassType = insuraceClassType;
	}

	private PrivilegerInfo privilegerInfo;

	private PrivilegerInfo getPrivilegerInfo() {
	    return privilegerInfo;
	}

	private void setPrivilegerInfo(PrivilegerInfo privilegerInfo) {
	    this.privilegerInfo = privilegerInfo;
	}

	private GPWParticipantInfo gpwParticipantInfo;

	private GPWParticipantInfo getGpwParticipantInfo() {
	    return gpwParticipantInfo;
	}

	private void setGpwParticipantInfo(GPWParticipantInfo gpwParticipantInfo) {
	    this.gpwParticipantInfo = gpwParticipantInfo;
	}

	private PensionerInfo pensionerInfo;

	private PensionerInfo getPensionerInfo() {
	    return pensionerInfo;
	}

	private void setPensionerInfo(PensionerInfo pensionerInfo) {
	    this.pensionerInfo = pensionerInfo;
	}

	private HandicappedInfo handicappedInfo;

	private HandicappedInfo getHandicappedInfo() {
	    return handicappedInfo;
	}

	private void setHandicappedInfo(HandicappedInfo handicappedInfo) {
	    this.handicappedInfo = handicappedInfo;
	}

	private RecordOperationInfo created;

	private RecordOperationInfo getCreated() {
	    return created;
	}

	private void setCreated(RecordOperationInfo created) {
	    this.created = created;
	}

	private RecordOperationInfo modified;

	private RecordOperationInfo getModified() {
	    return modified;
	}

	private void setModified(RecordOperationInfo modified) {
	    this.modified = modified;
	}

	private InsuranceCompanyEntity insurer;

	private InsuranceCompanyEntity getInsurer() {
	    return insurer;
	}

	private void setInsurer(InsuranceCompanyEntity insurer) {
	    this.insurer = insurer;
	}

	private PolicyDriverEntityBuilder() {
	}

	// public

	public PolicyDriverEntityBuilder withId(final Integer id) throws IllegalArgumentException {
	    setNumberIfNullOrThrow("id", this::getId, this::setId, id);
	    return this;
	}

	public PolicyDriverEntityBuilder withInsuredPerson(final SubjectPersonEntity insuredPerson)
		throws IllegalArgumentException {
	    setIfNullOrThrow("insuredPerson", this::getInsuredPerson, this::setInsuredPerson, insuredPerson);
	    return this;
	}

	public PolicyDriverEntityBuilder withMaritalStatus(final MaritalStatus maritalStatus)
		throws IllegalArgumentException {
	    setIfNullOrThrow("maritalStatus", this::getMaritalStatus, this::setMaritalStatus, maritalStatus);
	    return this;
	}

	public PolicyDriverEntityBuilder withInsuredAgeExpirienceClass(
		final InsuredAgeAndExpirienceClass insuredAgeExpirienceClass) throws IllegalArgumentException {
	    setIfNullOrThrow("insuredAgeExpirienceClass", this::getInsuredAgeExpirienceClass,
		    this::setInsuredAgeExpirienceClass, insuredAgeExpirienceClass);
	    return this;
	}

	public PolicyDriverEntityBuilder withDrivingExpirience(final Integer drivingExpirience)
		throws IllegalArgumentException {
	    setIfNullOrThrow("drivingExpirience", this::getDrivingExpirience, this::setDrivingExpirience,
		    drivingExpirience);
	    return this;
	}

	public PolicyDriverEntityBuilder withDriverLicense(final DriverLicenseInfo driverLicense)
		throws IllegalArgumentException {
	    setIfNullOrThrow("driverLicense", this::getDriverLicense, this::setDriverLicense, driverLicense);
	    return this;
	}

	public PolicyDriverEntityBuilder withInsuraceClassType(final InsuranceClassType insuraceClassType)
		throws IllegalArgumentException {
	    setIfNullOrThrow("insuraceClassType", this::getInsuraceClassType, this::setInsuraceClassType,
		    insuraceClassType);
	    return this;
	}

	public PolicyDriverEntityBuilder withPrivilegerInfo(final PrivilegerInfo privilegerInfo)
		throws IllegalArgumentException {
	    setIfNullOrThrow("privilegerInfo", this::getPrivilegerInfo, this::setPrivilegerInfo, privilegerInfo);
	    return this;
	}

	public PolicyDriverEntityBuilder withGpwParticipantInfo(final GPWParticipantInfo gpwParticipantInfo)
		throws IllegalArgumentException {
	    setIfNullOrThrow("gpwParticipantInfo", this::getGpwParticipantInfo, this::setGpwParticipantInfo,
		    gpwParticipantInfo);
	    return this;
	}

	public PolicyDriverEntityBuilder withPensionerInfo(final PensionerInfo pensionerInfo)
		throws IllegalArgumentException {
	    setIfNullOrThrow("pensionerInfo", this::getPensionerInfo, this::setPensionerInfo, pensionerInfo);
	    return this;
	}

	public PolicyDriverEntityBuilder withHandicappedInfo(final HandicappedInfo handicappedInfo)
		throws IllegalArgumentException {
	    setIfNullOrThrow("handicappedInfo", this::getHandicappedInfo, this::setHandicappedInfo, handicappedInfo);
	    return this;
	}

	public PolicyDriverEntityBuilder withCreated(final RecordOperationInfo created)
		throws IllegalArgumentException {
	    setIfNullOrThrow("created", this::getCreated, this::setCreated, created);
	    return this;
	}

	public PolicyDriverEntityBuilder withModified(final RecordOperationInfo modified)
		throws IllegalArgumentException {
	    setIfNullOrThrow("modified", this::getModified, this::setModified, modified);
	    return this;
	}

	public PolicyDriverEntityBuilder withInsurer(final InsuranceCompanyEntity insurer)
		throws IllegalArgumentException {
	    setIfNullOrThrow("insurer", this::getInsurer, this::setInsurer, insurer);
	    return this;
	}

	public PolicyDriverEntity build() throws IllegalArgumentException {
	    return new PolicyDriverEntity(id,
		    insuredPerson,
		    maritalStatus,
		    insuredAgeExpirienceClass,
		    drivingExpirience,
		    driverLicense,
		    insuraceClassType,
		    privilegerInfo,
		    gpwParticipantInfo,
		    pensionerInfo,
		    handicappedInfo,
		    created,
		    modified,
		    insurer);
	}

	public void buildTo(final Consumer<PolicyDriverEntity> consumer) throws IllegalArgumentException {
	    consumer.accept(build());
	}
    }

    // constructor

    private PolicyDriverEntity(final Integer id,
	    final SubjectPersonEntity insuredPerson,
	    final MaritalStatus maritalStatus,
	    final InsuredAgeAndExpirienceClass insuredAgeExpirienceClass,
	    final Integer drivingExpirience,
	    final DriverLicenseInfo driverLicense,
	    final InsuranceClassType insuraceClassType,
	    final PrivilegerInfo privilegerInfo,
	    final GPWParticipantInfo gpwParticipantInfo,
	    final PensionerInfo pensionerInfo,
	    final HandicappedInfo handicappedInfo,
	    final RecordOperationInfo created,
	    final RecordOperationInfo modified,
	    final InsuranceCompanyEntity insurer) {
	this.id = id;
	this.insuredPerson = insuredPerson;
	this.maritalStatus = maritalStatus;
	this.insuredAgeExpirienceClass = insuredAgeExpirienceClass;
	this.drivingExpirience = drivingExpirience;
	this.driverLicense = driverLicense;
	this.insuraceClassType = insuraceClassType;
	this.privilegerInfo = privilegerInfo;
	this.gpwParticipantInfo = gpwParticipantInfo;
	this.pensionerInfo = pensionerInfo;
	this.handicappedInfo = handicappedInfo;
	this.created = created;
	this.modified = modified;
	this.insurer = insurer;
    }

    // id

    private final Integer id;

    public Integer getId() {
	return id;
    }

    // insuredPerson

    private final SubjectPersonEntity insuredPerson;

    public SubjectPersonEntity getInsuredPerson() {
	return insuredPerson;
    }

    // maritalStatus

    private final MaritalStatus maritalStatus;

    public MaritalStatus getMaritalStatus() {
	return maritalStatus;
    }

    // insuredAgeExpirienceClass

    private final InsuredAgeAndExpirienceClass insuredAgeExpirienceClass;

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

    private final Integer drivingExpirience;

    public Integer getDrivingExpirience() {
	return drivingExpirience;
    }

    private final DriverLicenseInfo driverLicense;

    public DriverLicenseInfo getDriverLicense() {
	return driverLicense;
    }

    // insuraceClassType

    private final InsuranceClassType insuraceClassType;

    public InsuranceClassType getInsuraceClassType() {
	return insuraceClassType;
    }

    // privilegerInfo

    private final PrivilegerInfo privilegerInfo;

    public boolean isPrivileger() {
	return MyObjects.nonNull(privilegerInfo);
    }

    public PrivilegerInfo getPrivilegerInfo() {
	return privilegerInfo;
    }

    // gpwParticipantInfo

    private final GPWParticipantInfo gpwParticipantInfo;

    public boolean isGpwParticipant() {
	return MyObjects.nonNull(gpwParticipantInfo);
    }

    public GPWParticipantInfo getGpwParticipantInfo() {
	return gpwParticipantInfo;
    }

    // pensionerInfo

    private final PensionerInfo pensionerInfo;

    public boolean isPensioner() {
	return MyObjects.nonNull(pensionerInfo);
    }

    public PensionerInfo getPensionerInfo() {
	return pensionerInfo;
    }

    // handicappedInfo

    private final HandicappedInfo handicappedInfo;

    public boolean isHandicapped() {
	return MyObjects.nonNull(handicappedInfo);
    }

    public HandicappedInfo getHandicappedInfo() {
	return handicappedInfo;
    }

    // created

    private final RecordOperationInfo created;

    public RecordOperationInfo getCreated() {
	return created;
    }

    // modified

    private final RecordOperationInfo modified;

    public boolean isModified() {
	return MyObjects.nonNull(modified);
    }

    public RecordOperationInfo getModified() {
	return modified;
    }

    // insurer

    private final InsuranceCompanyEntity insurer;

    public InsuranceCompanyEntity getInsurer() {
	return insurer;
    }
}
