package tech.lapsa.esbd.domain.complex;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.lapsa.insurance.elements.PaymentType;
import com.lapsa.insurance.elements.PersonType;

import tech.lapsa.esbd.domain.AEntity;
import tech.lapsa.esbd.domain.dict.BranchEntity;
import tech.lapsa.esbd.domain.dict.InsuranceCompanyEntity;
import tech.lapsa.esbd.domain.embedded.CancelationInfo;
import tech.lapsa.esbd.domain.embedded.RecordOperationInfo;
import tech.lapsa.java.commons.function.MyObjects;
import tech.lapsa.patterns.domain.HashCodePrime;

@HashCodePrime(17)
public class PolicyEntity extends AEntity {

    private static final long serialVersionUID = 1L;

    public static final PolicyEntityBuilder builder() {
	return new PolicyEntityBuilder();
    }

    public static final class PolicyEntityBuilder
	    extends AEntityBuilder<PolicyEntity, PolicyEntityBuilder> {

	// private & protected

	protected String number;

	private String getNumber() {
	    return number;
	}

	private void setNumber(String number) {
	    this.number = number;
	}

	protected String internalNumber;

	private String getInternalNumber() {
	    return internalNumber;
	}

	private void setInternalNumber(String internalNumber) {
	    this.internalNumber = internalNumber;
	}

	protected LocalDate validFrom;

	private LocalDate getValidFrom() {
	    return validFrom;
	}

	private void setValidFrom(LocalDate validFrom) {
	    this.validFrom = validFrom;
	}

	protected LocalDate validTill;

	private LocalDate getValidTill() {
	    return validTill;
	}

	private void setValidTill(LocalDate validTill) {
	    this.validTill = validTill;
	}

	protected Double actualPremium;

	private Double getActualPremium() {
	    return actualPremium;
	}

	private void setActualPremium(Double actualPremium) {
	    this.actualPremium = actualPremium;
	}

	protected Double calculatedPremium;

	private Double getCalculatedPremium() {
	    return calculatedPremium;
	}

	private void setCalculatedPremium(Double calculatedPremium) {
	    this.calculatedPremium = calculatedPremium;
	}

	protected InsuranceCompanyEntity insurer;

	private InsuranceCompanyEntity getInsurer() {
	    return insurer;
	}

	private void setInsurer(InsuranceCompanyEntity insurer) {
	    this.insurer = insurer;
	}

	protected SubjectEntity insurant;

	private SubjectEntity getInsurant() {
	    return insurant;
	}

	private void setInsurant(SubjectEntity insurant) {
	    this.insurant = insurant;
	}

	protected PersonType insurantPersonType;

	private PersonType getInsurantPersonType() {
	    return insurantPersonType;
	}

	private void setInsurantPersonType(PersonType insurantPersonType) {
	    this.insurantPersonType = insurantPersonType;
	}

	protected LocalDate dateOfIssue;

	private LocalDate getDateOfIssue() {
	    return dateOfIssue;
	}

	private void setDateOfIssue(LocalDate dateOfIssue) {
	    this.dateOfIssue = dateOfIssue;
	}

	protected CancelationInfo cancelation;

	private CancelationInfo getCancelation() {
	    return cancelation;
	}

	private void setCancelation(CancelationInfo cancelation) {
	    this.cancelation = cancelation;
	}

	protected BranchEntity branch;

	private BranchEntity getBranch() {
	    return branch;
	}

	private void setBranch(BranchEntity branch) {
	    this.branch = branch;
	}

	protected Integer reissuedPolicyId;

	private Integer getReissuedPolicyId() {
	    return reissuedPolicyId;
	}

	private void setReissuedPolicyId(Integer reissuedPolicyId) {
	    this.reissuedPolicyId = reissuedPolicyId;
	}

	protected String comments;

	private String getComments() {
	    return comments;
	}

	private void setComments(String comments) {
	    this.comments = comments;
	}

	protected List<PolicyDriverEntity> insuredDrivers;

	protected List<PolicyVehicleEntity> insuredVehicles;

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

	private LocalDate dateOfPayment;

	protected LocalDate getDateOfPayment() {
	    return dateOfPayment;
	}

	private void setDateOfPayment(LocalDate dateOfPayment) {
	    this.dateOfPayment = dateOfPayment;
	}

	protected PaymentType paymentType;

	private PaymentType getPaymentType() {
	    return paymentType;
	}

	private void setPaymentType(PaymentType paymentType) {
	    this.paymentType = paymentType;
	}

	protected InsuranceAgentEntity insuranceAgent;

	private InsuranceAgentEntity getInsuranceAgent() {
	    return insuranceAgent;
	}

	private void setInsuranceAgent(InsuranceAgentEntity insuranceAgent) {
	    this.insuranceAgent = insuranceAgent;
	}

	@Override
	protected PolicyEntityBuilder _this() {
	    return this;
	}

	// constructor

	protected PolicyEntityBuilder() {
	}

	// public

	public PolicyEntityBuilder withNumber(final String number) throws IllegalArgumentException {
	    setStringIfNullOrThrow("number", this::getNumber, this::setNumber, number);
	    return this;
	}

	public PolicyEntityBuilder withInternalNumber(final String internalNumber) throws IllegalArgumentException {
	    setStringIfNullOrThrow("internalNumber", this::getInternalNumber, this::setInternalNumber, internalNumber);
	    return this;
	}

	public PolicyEntityBuilder withValidFrom(final LocalDate validFrom) throws IllegalArgumentException {
	    setIfNullOrThrow("validFrom", this::getValidFrom, this::setValidFrom, validFrom);
	    return this;
	}

	public PolicyEntityBuilder withValidTill(final LocalDate validTill) throws IllegalArgumentException {
	    setIfNullOrThrow("validTill", this::getValidTill, this::setValidTill, validTill);
	    return this;
	}

	public PolicyEntityBuilder withActualPremium(final Double actualPremium) throws IllegalArgumentException {
	    setPositiveNumberIfNullOrThrow("actualPremium", this::getActualPremium, this::setActualPremium,
		    actualPremium);
	    return this;
	}

	public PolicyEntityBuilder withCalculatedPremium(final Double calculatedPremium)
		throws IllegalArgumentException {
	    setPositiveNumberIfNullOrThrow("calculatedPremium", this::getCalculatedPremium, this::setCalculatedPremium,
		    calculatedPremium);
	    return this;
	}

	public PolicyEntityBuilder withInsurer(final InsuranceCompanyEntity insurer) throws IllegalArgumentException {
	    setIfNullOrThrow("insurer", this::getInsurer, this::setInsurer, insurer);
	    return this;
	}

	public PolicyEntityBuilder withInsurant(final SubjectEntity insurant) throws IllegalArgumentException {
	    setIfNullOrThrow("insurant", this::getInsurant, this::setInsurant, insurant);
	    return this;
	}

	public PolicyEntityBuilder withInsurantPersonType(final PersonType insurantPersonType)
		throws IllegalArgumentException {
	    setIfNullOrThrow("insurantPersonType", this::getInsurantPersonType, this::setInsurantPersonType,
		    insurantPersonType);
	    return this;
	}

	public PolicyEntityBuilder withDateOfIssue(final LocalDate dateOfIssue) throws IllegalArgumentException {
	    setIfNullOrThrow("dateOfIssue", this::getDateOfIssue, this::setDateOfIssue, dateOfIssue);
	    return this;
	}

	public PolicyEntityBuilder withCancelation(final CancelationInfo cancelation)
		throws IllegalArgumentException {
	    setIfNullOrThrow("cancelation", this::getCancelation, this::setCancelation, cancelation);
	    return this;
	}

	public PolicyEntityBuilder withBranch(final BranchEntity branch) throws IllegalArgumentException {
	    setIfNullOrThrow("branch", this::getBranch, this::setBranch, branch);
	    return this;
	}

	public PolicyEntityBuilder withReissuedPolicyId(final Integer reissuedPolicyId)
		throws IllegalArgumentException {
	    setPositiveNumberIfNullOrThrow("reissuedPolicyId", this::getReissuedPolicyId, this::setReissuedPolicyId,
		    reissuedPolicyId);
	    return this;
	}

	public PolicyEntityBuilder withComments(final String comments) throws IllegalArgumentException {
	    setStringIfNullOrThrow("comments", this::getComments, this::setComments, comments);
	    return this;
	}

	public PolicyEntityBuilder addDriver(final PolicyDriverEntity insuredDriver)
		throws IllegalArgumentException {
	    MyObjects.requireNonNull(insuredDriver, "insuredDriver");
	    (insuredDrivers = MyObjects.getIfNull(insuredDrivers, ArrayList::new))
		    .add(insuredDriver);
	    return this;
	}

	public PolicyEntityBuilder addVehicle(final PolicyVehicleEntity insuredVehicle)
		throws IllegalArgumentException {
	    MyObjects.requireNonNull(insuredVehicle, "insuredVehicle");
	    (insuredVehicles = MyObjects.getIfNull(insuredVehicles, ArrayList::new))
		    .add(insuredVehicle);
	    return this;
	}

	public PolicyEntityBuilder withCreated(final RecordOperationInfo created) throws IllegalArgumentException {
	    setIfNullOrThrow("created", this::getCreated, this::setCreated, created);
	    return this;
	}

	public PolicyEntityBuilder withModified(final RecordOperationInfo modified) throws IllegalArgumentException {
	    setIfNullOrThrow("modified", this::getModified, this::setModified, modified);
	    return this;
	}

	public PolicyEntityBuilder withDateOfPayment(final LocalDate dateOfPayment) throws IllegalArgumentException {
	    setIfNullOrThrow("dateOfPayment", this::getDateOfPayment, this::setDateOfPayment, dateOfPayment);
	    return this;
	}

	public PolicyEntityBuilder withPaymentType(final PaymentType paymentType) {
	    setIfNullOrThrow("paymentType", this::getPaymentType, this::setPaymentType, paymentType);
	    return this;
	}

	public PolicyEntityBuilder withInsuranceAgent(final InsuranceAgentEntity insuranceAgent) {
	    setIfNullOrThrow("insuranceAgent", this::getInsuranceAgent, this::setInsuranceAgent, insuranceAgent);
	    return this;
	}

	public PolicyEntity build() throws IllegalArgumentException {
	    return new PolicyEntity(id,
		    number,
		    internalNumber,
		    validFrom,
		    validTill,
		    actualPremium,
		    calculatedPremium,
		    insurer,
		    insurant,
		    insurantPersonType,
		    dateOfIssue,
		    cancelation,
		    branch,
		    reissuedPolicyId,
		    comments,
		    insuredDrivers,
		    insuredVehicles,
		    created,
		    modified,
		    dateOfPayment,
		    paymentType,
		    insuranceAgent);
	}
    }

    // constructor

    protected PolicyEntity(Integer id,
	    final String number,
	    final String internalNumber,
	    final LocalDate validFrom,
	    final LocalDate validTill,
	    final Double actualPremium,
	    final Double calculatedPremium,
	    final InsuranceCompanyEntity insurer,
	    final SubjectEntity insurant,
	    final PersonType insurantPersonType,
	    final LocalDate dateOfIssue,
	    final CancelationInfo cancelation,
	    final BranchEntity branch,
	    final Integer reissuedPolicyId,
	    final String comments,
	    final List<PolicyDriverEntity> insuredDrivers,
	    final List<PolicyVehicleEntity> insuredVehicles,
	    final RecordOperationInfo created,
	    final RecordOperationInfo modified,
	    final LocalDate dateOfPayment,
	    final PaymentType paymentType,
	    final InsuranceAgentEntity insuranceAgent) {
	super(id);
	this.number = number;
	this.internalNumber = internalNumber;
	this.validFrom = validFrom;
	this.validTill = validTill;
	this.actualPremium = actualPremium;
	this.calculatedPremium = calculatedPremium;
	this.insurer = insurer;
	this.insurant = insurant;
	this.insurantPersonType = insurantPersonType;
	this.dateOfIssue = dateOfIssue;
	this.cancelation = cancelation;
	this.branch = branch;
	this.reissuedPolicyId = reissuedPolicyId;
	this.comments = comments;
	this.insuredDrivers = MyObjects.nullOrGet(insuredDrivers, Collections::unmodifiableList);
	this.insuredVehicles = MyObjects.nullOrGet(insuredVehicles, Collections::unmodifiableList);
	this.created = created;
	this.modified = modified;
	this.dateOfPayment = dateOfPayment;
	this.paymentType = paymentType;
	this.insuranceAgent = insuranceAgent;
    }

    protected PolicyEntity() {
	this.number = null;
	this.internalNumber = null;
	this.validFrom = null;
	this.validTill = null;
	this.actualPremium = null;
	this.calculatedPremium = null;
	this.insurer = null;
	this.insurant = null;
	this.insurantPersonType = null;
	this.dateOfIssue = null;
	this.cancelation = null;
	this.branch = null;
	this.reissuedPolicyId = null;
	this.comments = null;
	this.insuredDrivers = null;
	this.insuredVehicles = null;
	this.created = null;
	this.modified = null;
	this.dateOfPayment = null;
	this.paymentType = null;
	this.insuranceAgent = null;
    }

    // number

    private final String number;

    public String getNumber() {
	return number;
    }

    // internalNumber

    private final String internalNumber;

    public String getInternalNumber() {
	return internalNumber;
    }

    // validFrom

    private final LocalDate validFrom;

    public LocalDate getValidFrom() {
	return validFrom;
    }

    // validTill

    private final LocalDate validTill;

    public LocalDate getValidTill() {
	return validTill;
    }

    // actualPremium

    private final Double actualPremium;

    public Double getActualPremium() {
	return actualPremium;
    }

    // calculatedPremium

    private final Double calculatedPremium;

    public Double getCalculatedPremium() {
	return calculatedPremium;
    }

    // insurer

    private final InsuranceCompanyEntity insurer;

    public InsuranceCompanyEntity getInsurer() {
	return insurer;
    }

    // insurant

    private final SubjectEntity insurant;

    public SubjectEntity getInsurant() {
	return insurant;
    }

    // insurantType

    private final PersonType insurantPersonType;

    public PersonType getInsurantPersonType() {
	return insurantPersonType;
    }

    // dateOfIssue

    private final LocalDate dateOfIssue;

    public LocalDate getDateOfIssue() {
	return dateOfIssue;
    }

    // cancelation

    private final CancelationInfo cancelation;

    public CancelationInfo getCancelation() {
	return cancelation;
    }

    public boolean isCanceled() {
	return cancelation != null;
    }

    // branch

    private final BranchEntity branch;

    public BranchEntity getBranch() {
	return branch;
    }

    // reissuedPolicy

    private final Integer reissuedPolicyId;

    public boolean isReissued() {
	return MyObjects.nonNull(reissuedPolicyId);
    }

    public Integer getReissuedPolicyId() {
	return reissuedPolicyId;
    }

    // comments

    private final String comments;

    public String getComments() {
	return comments;
    }

    // insuredDrivers

    private final List<PolicyDriverEntity> insuredDrivers;

    public List<PolicyDriverEntity> getInsuredDrivers() {
	return insuredDrivers;
    }

    // insuredVehicles

    private final List<PolicyVehicleEntity> insuredVehicles;

    public List<PolicyVehicleEntity> getInsuredVehicles() {
	return insuredVehicles;
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

    // dateOfPayment

    private final LocalDate dateOfPayment;

    public LocalDate getDateOfPayment() {
	return dateOfPayment;
    }

    public boolean isPaid() {
	return MyObjects.nonNull(dateOfPayment);
    }

    // paymentType

    private final PaymentType paymentType;

    public PaymentType getPaymentType() {
	return paymentType;
    }

    // insuranceAgent

    private final InsuranceAgentEntity insuranceAgent;

    public InsuranceAgentEntity getInsuranceAgent() {
	return insuranceAgent;
    }
}
