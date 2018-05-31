package tech.lapsa.esbd.domain.complex;

import tech.lapsa.esbd.domain.AEntity;
import tech.lapsa.esbd.domain.dict.BranchEntity;
import tech.lapsa.esbd.domain.dict.InsuranceCompanyEntity;
import tech.lapsa.esbd.domain.embedded.ContractInfo;
import tech.lapsa.esbd.domain.embedded.RecordOperationInfo;
import tech.lapsa.java.commons.function.MyObjects;
import tech.lapsa.patterns.domain.HashCodePrime;

@HashCodePrime(43)
public class InsuranceAgentEntity extends AEntity {

    private static final long serialVersionUID = 1L;

    public static final InsuranceAgentEntityBuilder builder() {
	return new InsuranceAgentEntityBuilder();
    }

    public static final InsuranceAgentEntityBuilder builder(final InsuranceAgentEntity source) {
	MyObjects.requireNonNull(source, "source");
	return new InsuranceAgentEntityBuilder(source);
    }

    public static final class InsuranceAgentEntityBuilder
	    extends AEntityBuilder<InsuranceAgentEntity, InsuranceAgentEntityBuilder> {

	// private & protected

	protected ContractInfo contract;

	private ContractInfo getContract() {
	    return contract;
	}

	private void setContract(final ContractInfo contract) {
	    this.contract = contract;
	}

	protected BranchEntity branch;

	private BranchEntity getBranch() {
	    return branch;
	}

	private void setBranch(final BranchEntity branch) {
	    this.branch = branch;
	}

	protected UserEntity owner;

	private UserEntity getOwner() {
	    return owner;
	}

	private void setOwner(final UserEntity owner) {
	    this.owner = owner;
	}

	protected SubjectEntity subject;

	private SubjectEntity getSubject() {
	    return subject;
	}

	private void setSubject(final SubjectEntity subject) {
	    this.subject = subject;
	}

	protected RecordOperationInfo created;

	private RecordOperationInfo getCreated() {
	    return created;
	}

	private void setCreated(final RecordOperationInfo created) {
	    this.created = created;
	}

	protected RecordOperationInfo modified;

	private RecordOperationInfo getModified() {
	    return modified;
	}

	private void setModified(final RecordOperationInfo modified) {
	    this.modified = modified;
	}

	protected InsuranceCompanyEntity insurer;

	private InsuranceCompanyEntity getInsurer() {
	    return insurer;
	}

	private void setInsurer(final InsuranceCompanyEntity insurer) {
	    this.insurer = insurer;
	}

	protected String letterOfAttorneyNumber;

	private String getLetterOfAttorneyNumber() {
	    return letterOfAttorneyNumber;
	}

	private void setLetterOfAttorneyNumber(final String letterOfAttorneyNumber) {
	    this.letterOfAttorneyNumber = letterOfAttorneyNumber;
	}

	@Override
	protected InsuranceAgentEntityBuilder _this() {
	    return this;
	}

	// constructor

	protected InsuranceAgentEntityBuilder() {
	}

	protected InsuranceAgentEntityBuilder(final InsuranceAgentEntity source) {
	    super(source);
	    contract = source.contract;
	    branch = source.branch;
	    owner = source.owner;
	    subject = source.subject;
	    created = source.created;
	    modified = source.modified;
	    letterOfAttorneyNumber = source.letterOfAttorneyNumber;
	}

	// public

	public InsuranceAgentEntityBuilder withContract(final ContractInfo contract) {
	    setBuilderProperty("contract", this::getContract, this::setContract, contract);
	    return this;
	}

	public InsuranceAgentEntityBuilder withBranch(final BranchEntity branch) {
	    setBuilderProperty("branch", this::getBranch, this::setBranch, branch);
	    return this;
	}

	public InsuranceAgentEntityBuilder withOwner(final UserEntity owner) {
	    setBuilderProperty("owner", this::getOwner, this::setOwner, owner);
	    return this;
	}

	public InsuranceAgentEntityBuilder withSubject(final SubjectEntity subject) {
	    setBuilderProperty("subject", this::getSubject, this::setSubject, subject);
	    return this;
	}

	public InsuranceAgentEntityBuilder withCreated(final RecordOperationInfo created) {
	    setBuilderProperty("created", this::getCreated, this::setCreated, created);
	    return this;
	}

	public InsuranceAgentEntityBuilder withModified(final RecordOperationInfo modified) {
	    setBuilderProperty("modified", this::getModified, this::setModified, modified);
	    return this;
	}

	public InsuranceAgentEntityBuilder withInsurer(final InsuranceCompanyEntity insurer) {
	    setBuilderProperty("insurer", this::getInsurer, this::setInsurer, insurer);
	    return this;
	}

	public InsuranceAgentEntityBuilder withLetterOfAttorneyNumber(final String letterOfAttorneyNumber) {
	    setStringIfNullOrThrow("letterOfAttorneyNumber", this::getLetterOfAttorneyNumber,
		    this::setLetterOfAttorneyNumber,
		    letterOfAttorneyNumber);
	    return this;
	}

	@Override
	public InsuranceAgentEntity build() throws IllegalArgumentException {
	    return new InsuranceAgentEntity(id,
		    contract,
		    branch,
		    owner,
		    subject,
		    created,
		    modified,
		    letterOfAttorneyNumber);
	}
    }

    // constructor

    protected InsuranceAgentEntity(final Integer id,
	    final ContractInfo contract,
	    final BranchEntity branch,
	    final UserEntity owner,
	    final SubjectEntity subject,
	    final RecordOperationInfo created,
	    final RecordOperationInfo modified,
	    final String letterOfAttorneyNumber) {
	super(id);
	this.contract = contract;
	this.branch = branch;
	this.owner = owner;
	this.subject = subject;
	this.created = created;
	this.modified = modified;
	this.letterOfAttorneyNumber = letterOfAttorneyNumber;
    }

    protected InsuranceAgentEntity() {
	contract = null;
	branch = null;
	owner = null;
	subject = null;
	created = null;
	modified = null;
	letterOfAttorneyNumber = null;
    }

    // contract

    final ContractInfo contract;

    public ContractInfo getContract() {
	return contract;
    }

    // letterOfAttorneyNumber

    final String letterOfAttorneyNumber;

    public String getLetterOfAttorneyNumber() {
	return letterOfAttorneyNumber;
    }

    // branch

    final BranchEntity branch;

    public BranchEntity getBranch() {
	return branch;
    }

    // user

    final UserEntity owner;

    public UserEntity getOwner() {
	return owner;
    }

    // subject

    final SubjectEntity subject;

    public SubjectEntity getSubject() {
	return subject;
    }

    // created

    final RecordOperationInfo created;

    public RecordOperationInfo getCreated() {
	return created;
    }

    // modified

    final RecordOperationInfo modified;

    public RecordOperationInfo getModified() {
	return modified;
    }
}
