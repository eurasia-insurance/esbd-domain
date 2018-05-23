package tech.lapsa.esbd.domain.complex;

import java.time.Instant;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import tech.lapsa.esbd.domain.AEntity;
import tech.lapsa.esbd.domain.dict.BranchEntity;
import tech.lapsa.esbd.domain.dict.InsuranceCompanyEntity;
import tech.lapsa.patterns.domain.HashCodePrime;

@Entity
@Table(name = "USER")
@HashCodePrime(29)
public class UserEntity extends AEntity {

    private static final long serialVersionUID = 1L;

    public static final UserEntityBuilder builder() {
	return new UserEntityBuilder();
    }

    public static final class UserEntityBuilder
	    extends AEntityBuilder<UserEntity, UserEntityBuilder> {

	// private

	private String login;

	private String getLogin() {
	    return login;
	}

	private void setLogin(String login) {
	    this.login = login;
	}

	private BranchEntity branch;

	private BranchEntity getBranch() {
	    return branch;
	}

	private void setBranch(BranchEntity branch) {
	    this.branch = branch;
	}

	private SubjectEntity subject;

	private SubjectEntity getSubject() {
	    return subject;
	}

	private void setSubject(SubjectEntity subject) {
	    this.subject = subject;
	}

	private InsuranceCompanyEntity organization;

	private InsuranceCompanyEntity getOrganization() {
	    return organization;
	}

	private void setOrganization(InsuranceCompanyEntity organization) {
	    this.organization = organization;
	}

	private Boolean authentificated;

	private Boolean getAuthentificated() {
	    return authentificated;
	}

	private void setAuthentificated(Boolean authentificated) {
	    this.authentificated = authentificated;
	}

	private String lastSesionId;

	private String getLastSesionId() {
	    return lastSesionId;
	}

	private void setLastSesionId(String lastSesionId) {
	    this.lastSesionId = lastSesionId;
	}

	private Instant lastActivity;

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

	private UserEntityBuilder() {
	}

	// public

	public UserEntityBuilder withLogin(final String login) throws IllegalArgumentException {
	    setStringIfNullOrThrow("login", this::getLogin, this::setLogin, login);
	    return this;
	}

	public UserEntityBuilder withBranch(final BranchEntity branch) throws IllegalArgumentException {
	    setIfNullOrThrow("branch", this::getBranch, this::setBranch, branch);
	    return this;
	}

	public UserEntityBuilder withSubject(final SubjectEntity subject) throws IllegalArgumentException {
	    setIfNullOrThrow("subject", this::getSubject, this::setSubject, subject);
	    return this;
	}

	public UserEntityBuilder withOrganization(final InsuranceCompanyEntity organization)
		throws IllegalArgumentException {
	    setIfNullOrThrow("organization", this::getOrganization, this::setOrganization, organization);
	    return this;
	}

	public UserEntityBuilder withAuthentificated(final Boolean authentificated) {
	    setIfNullOrThrow("authentificated", this::getAuthentificated, this::setAuthentificated, authentificated);
	    return this;
	}

	public UserEntityBuilder withLastSesionId(final String lastSesionId) {
	    setStringIfNullOrThrow("lastSesionId", this::getLastSesionId, this::setLastSesionId, lastSesionId);
	    return this;
	}

	public UserEntityBuilder withLastActivity(final Instant lastActivity) {
	    setIfNullOrThrow("lastActivity", this::getLastActivity, this::setLastActivity, lastActivity);
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

    private UserEntity(final Integer id,
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

    @Basic
    @Column(name = "LOGIN")
    private final String login;

    public String getLogin() {
	return login;
    }

    // branch

    @ManyToOne
    @JoinColumn(name = "BRANCH_ID")
    private final BranchEntity branch;

    public BranchEntity getBranch() {
	return branch;
    }

    // subject

    @ManyToOne
    @JoinColumn(name = "SUBJECT_ID")
    private final SubjectEntity subject;

    public SubjectEntity getSubject() {
	return subject;
    }

    // organization

    @ManyToOne
    @JoinColumn(name = "ORGANIZATION_ID")
    private final InsuranceCompanyEntity organization;

    public InsuranceCompanyEntity getOrganization() {
	return organization;
    }

    // authentificated

    @Basic
    @Column(name = "AUTHENTIFICATED")
    private final Boolean authentificated;

    public Boolean isAuthentificated() {
	return authentificated;
    }

    // lastSesionId

    @Basic
    @Column(name = "LAST_SESSION_ID")
    private final String lastSesionId;

    public String getLastSesionId() {
	return lastSesionId;
    }

    // lastActivity

    @Basic
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "LAST_ACTIVITY")
    private final Instant lastActivity;

    public Instant getLastActivity() {
	return lastActivity;
    }
}
