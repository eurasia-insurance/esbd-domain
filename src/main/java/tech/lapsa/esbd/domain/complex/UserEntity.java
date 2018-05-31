package tech.lapsa.esbd.domain.complex;

import java.time.Instant;

import tech.lapsa.esbd.domain.AEntity;
import tech.lapsa.esbd.domain.dict.BranchEntity;
import tech.lapsa.esbd.domain.dict.InsuranceCompanyEntity;
import tech.lapsa.java.commons.function.MyObjects;
import tech.lapsa.patterns.domain.HashCodePrime;

@HashCodePrime(29)
public class UserEntity extends AEntity {

    private static final long serialVersionUID = 1L;

    public static final UserEntityBuilder builder() {
	return new UserEntityBuilder();
    }

    public static final UserEntityBuilder builder(final UserEntity source) {
	MyObjects.requireNonNull(source, "source");
	return new UserEntityBuilder(source);
    }

    public static final class UserEntityBuilder
	    extends AEntityBuilder<UserEntity, UserEntityBuilder> {

	// private & protected

	protected String login;

	private String getLogin() {
	    return login;
	}

	private void setLogin(String login) {
	    this.login = login;
	}

	protected BranchEntity branch;

	private BranchEntity getBranch() {
	    return branch;
	}

	private void setBranch(BranchEntity branch) {
	    this.branch = branch;
	}

	protected SubjectEntity subject;

	private SubjectEntity getSubject() {
	    return subject;
	}

	private void setSubject(SubjectEntity subject) {
	    this.subject = subject;
	}

	protected InsuranceCompanyEntity organization;

	private InsuranceCompanyEntity getOrganization() {
	    return organization;
	}

	private void setOrganization(InsuranceCompanyEntity organization) {
	    this.organization = organization;
	}

	protected Boolean authentificated;

	private Boolean getAuthentificated() {
	    return authentificated;
	}

	private void setAuthentificated(Boolean authentificated) {
	    this.authentificated = authentificated;
	}

	protected String lastSesionId;

	private String getLastSesionId() {
	    return lastSesionId;
	}

	private void setLastSesionId(String lastSesionId) {
	    this.lastSesionId = lastSesionId;
	}

	protected Instant lastActivity;

	private Instant getLastActivity() {
	    return lastActivity;
	}

	private void setLastActivity(Instant lastActivity) {
	    this.lastActivity = lastActivity;
	}

	@Override
	protected UserEntityBuilder _this() {
	    return this;
	}

	// constructor

	protected UserEntityBuilder() {
	}

	protected UserEntityBuilder(UserEntity source) {
	    super(source);
	    this.login = source.login;
	    this.branch = source.branch;
	    this.subject = source.subject;
	    this.organization = source.organization;
	    this.authentificated = source.authentificated;
	    this.lastSesionId = source.lastSesionId;
	    this.lastActivity = source.lastActivity;
	}

	// public

	public UserEntityBuilder withLogin(final String login) throws IllegalArgumentException {
	    setStringIfNullOrThrow("login", this::getLogin, this::setLogin, login);
	    return this;
	}

	public UserEntityBuilder withBranch(final BranchEntity branch) throws IllegalArgumentException {
	    setBuilderProperty("branch", this::getBranch, this::setBranch, branch);
	    return this;
	}

	public UserEntityBuilder withSubject(final SubjectEntity subject) throws IllegalArgumentException {
	    setBuilderProperty("subject", this::getSubject, this::setSubject, subject);
	    return this;
	}

	public UserEntityBuilder withOrganization(final InsuranceCompanyEntity organization)
		throws IllegalArgumentException {
	    setBuilderProperty("organization", this::getOrganization, this::setOrganization, organization);
	    return this;
	}

	public UserEntityBuilder withAuthentificated(final Boolean authentificated) {
	    setBuilderProperty("authentificated", this::getAuthentificated, this::setAuthentificated, authentificated);
	    return this;
	}

	public UserEntityBuilder withLastSesionId(final String lastSesionId) {
	    setStringIfNullOrThrow("lastSesionId", this::getLastSesionId, this::setLastSesionId, lastSesionId);
	    return this;
	}

	public UserEntityBuilder withLastActivity(final Instant lastActivity) {
	    setBuilderProperty("lastActivity", this::getLastActivity, this::setLastActivity, lastActivity);
	    return this;
	}

	@Override
	public UserEntity build() throws IllegalArgumentException {
	    return new UserEntity(id,
		    login,
		    branch,
		    subject,
		    organization,
		    authentificated,
		    lastSesionId,
		    lastActivity);
	}
    }

    // constructor

    protected UserEntity(final Integer id,
	    final String login,
	    final BranchEntity branch,
	    final SubjectEntity subject,
	    final InsuranceCompanyEntity organization,
	    final Boolean authentificated,
	    final String lastSesionId,
	    final Instant lastActivity) {
	super(id);
	this.login = login;
	this.branch = branch;
	this.subject = subject;
	this.organization = organization;
	this.authentificated = authentificated;
	this.lastSesionId = lastSesionId;
	this.lastActivity = lastActivity;
    }

    protected UserEntity() {
	this.login = null;
	this.branch = null;
	this.subject = null;
	this.organization = null;
	this.authentificated = null;
	this.lastSesionId = null;
	this.lastActivity = null;
    }

    // login

    final String login;

    public String getLogin() {
	return login;
    }

    // branch

    final BranchEntity branch;

    public BranchEntity getBranch() {
	return branch;
    }

    // subject

    final SubjectEntity subject;

    public SubjectEntity getSubject() {
	return subject;
    }

    // organization

    final InsuranceCompanyEntity organization;

    public InsuranceCompanyEntity getOrganization() {
	return organization;
    }

    // authentificated

    final Boolean authentificated;

    public Boolean isAuthentificated() {
	return authentificated;
    }

    // lastSesionId

    final String lastSesionId;

    public String getLastSesionId() {
	return lastSesionId;
    }

    // lastActivity

    final Instant lastActivity;

    public Instant getLastActivity() {
	return lastActivity;
    }
}
