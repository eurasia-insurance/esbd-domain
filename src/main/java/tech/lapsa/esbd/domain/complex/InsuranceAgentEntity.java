package tech.lapsa.esbd.domain.complex;

import java.util.function.Consumer;

import tech.lapsa.esbd.domain.AEntity;
import tech.lapsa.esbd.domain.dict.BranchEntity;
import tech.lapsa.esbd.domain.dict.InsuranceCompanyEntity;
import tech.lapsa.esbd.domain.embedded.ContractInfo;
import tech.lapsa.esbd.domain.embedded.RecordOperationInfo;
import tech.lapsa.patterns.domain.HashCodePrime;

@HashCodePrime(97)
public class InsuranceAgentEntity extends AEntity {

    private static final long serialVersionUID = 1L;

    public static final InsuranceAgentEntityBuilder builder() {
	return new InsuranceAgentEntityBuilder();
    }

    public static final class InsuranceAgentEntityBuilder {

	private Integer id;
	private ContractInfo contract;
	private BranchEntity branch;
	private UserEntity user;
	private SubjectEntity subject;
	private RecordOperationInfo created;
	private RecordOperationInfo modified;
	private InsuranceCompanyEntity insurer;
	private String letterOfAttorneyNumber;

	private InsuranceAgentEntityBuilder() {
	}

	public InsuranceAgentEntityBuilder withId(final Integer id) {
	    setIfNullOrThrow("id", this::getId, this::setId, id);
	    return this;
	}

	public InsuranceAgentEntityBuilder withContract(final ContractInfo contract) {
	    setIfNullOrThrow("contract", this::getContract, this::setContract, contract);
	    return this;
	}

	public InsuranceAgentEntityBuilder withBranch(final BranchEntity branch) {
	    setIfNullOrThrow("branch", this::getBranch, this::setBranch, branch);
	    return this;
	}

	public InsuranceAgentEntityBuilder withUser(final UserEntity user) {
	    setIfNullOrThrow("user", this::getUser, this::setUser, user);
	    return this;
	}

	public InsuranceAgentEntityBuilder withSubject(final SubjectEntity subject) {
	    setIfNullOrThrow("subject", this::getSubject, this::setSubject, subject);
	    return this;
	}

	public InsuranceAgentEntityBuilder withCreated(final RecordOperationInfo created) {
	    setIfNullOrThrow("created", this::getCreated, this::setCreated, created);
	    return this;
	}

	public InsuranceAgentEntityBuilder withModified(final RecordOperationInfo modified) {
	    setIfNullOrThrow("modified", this::getModified, this::setModified, modified);
	    return this;
	}

	public InsuranceAgentEntityBuilder withInsurer(final InsuranceCompanyEntity insurer) {
	    setIfNullOrThrow("insurer", this::getInsurer, this::setInsurer, insurer);
	    return this;
	}

	public InsuranceAgentEntityBuilder withLetterOfAttorneyNumber(final String letterOfAttorneyNumber) {
	    setIfNullOrThrow("letterOfAttorneyNumber", this::getLetterOfAttorneyNumber, this::setLetterOfAttorneyNumber,
		    letterOfAttorneyNumber);
	    return this;
	}

	private Integer getId() {
	    return id;
	}

	private void setId(Integer id) {
	    this.id = id;
	}

	private ContractInfo getContract() {
	    return contract;
	}

	private void setContract(ContractInfo contract) {
	    this.contract = contract;
	}

	private BranchEntity getBranch() {
	    return branch;
	}

	private void setBranch(BranchEntity branch) {
	    this.branch = branch;
	}

	private UserEntity getUser() {
	    return user;
	}

	private void setUser(UserEntity user) {
	    this.user = user;
	}

	private SubjectEntity getSubject() {
	    return subject;
	}

	private void setSubject(SubjectEntity subject) {
	    this.subject = subject;
	}

	private RecordOperationInfo getCreated() {
	    return created;
	}

	private void setCreated(RecordOperationInfo created) {
	    this.created = created;
	}

	private RecordOperationInfo getModified() {
	    return modified;
	}

	private void setModified(RecordOperationInfo modified) {
	    this.modified = modified;
	}

	private InsuranceCompanyEntity getInsurer() {
	    return insurer;
	}

	private void setInsurer(InsuranceCompanyEntity insurer) {
	    this.insurer = insurer;
	}

	private String getLetterOfAttorneyNumber() {
	    return letterOfAttorneyNumber;
	}

	private void setLetterOfAttorneyNumber(String letterOfAttorneyNumber) {
	    this.letterOfAttorneyNumber = letterOfAttorneyNumber;
	}

	public InsuranceAgentEntity build() throws IllegalArgumentException {
	    return new InsuranceAgentEntity(id,
		    contract,
		    branch,
		    user,
		    subject,
		    created,
		    modified,
		    letterOfAttorneyNumber);
	}

	public void buildTo(final Consumer<InsuranceAgentEntity> consumer) throws IllegalArgumentException {
	    consumer.accept(build());
	}
    }

    // constructor

    private InsuranceAgentEntity(final Integer id,
	    final ContractInfo contract,
	    final BranchEntity branch,
	    final UserEntity user,
	    final SubjectEntity subject,
	    final RecordOperationInfo created,
	    final RecordOperationInfo modified,
	    final String letterOfAttorneyNumber) {
	this.id = id;
	this.contract = contract;
	this.branch = branch;
	this.user = user;
	this.subject = subject;
	this.created = created;
	this.modified = modified;
	this.letterOfAttorneyNumber = letterOfAttorneyNumber;
    }

    // id

    private final Integer id;

    public Integer getId() {
	return id;
    }

    // contract

    private final ContractInfo contract;

    public ContractInfo getContract() {
	return contract;
    }

    // letterOfAttorneyNumber

    private final String letterOfAttorneyNumber;

    public String getLetterOfAttorneyNumber() {
	return letterOfAttorneyNumber;
    }

    // branch

    private final BranchEntity branch;

    public BranchEntity getBranch() {
	return branch;
    }

    // user

    private final UserEntity user;

    public UserEntity getUser() {
	return user;
    }

    private final SubjectEntity subject;

    public SubjectEntity getSubject() {
	return subject;
    }

    // created

    private final RecordOperationInfo created;

    public RecordOperationInfo getCreated() {
	return created;
    }

    // modified

    private final RecordOperationInfo modified;

    public RecordOperationInfo getModified() {
	return modified;
    }
}
