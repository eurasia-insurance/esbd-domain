package tech.lapsa.esbd.domain.complex;

import com.lapsa.insurance.elements.SubjectType;
import com.lapsa.kz.economic.KZEconomicSector;

import tech.lapsa.esbd.domain.dict.CompanyActivityKindEntity;
import tech.lapsa.esbd.domain.embedded.ContactInfo;
import tech.lapsa.esbd.domain.embedded.OriginInfo;
import tech.lapsa.kz.taxpayer.TaxpayerNumber;
import tech.lapsa.patterns.domain.HashCodePrime;

@HashCodePrime(19)
public class SubjectCompanyEntity extends SubjectEntity {

    private static final long serialVersionUID = 1L;

    public static final SubjectCompanyEntityBuilder builder() {
	return new SubjectCompanyEntityBuilder();
    }

    public static final class SubjectCompanyEntityBuilder
	    extends SubjectEntityBuilder<SubjectCompanyEntity, SubjectCompanyEntityBuilder> {

	// private & protected

	private String companyName;

	private String getCompanyName() {
	    return companyName;
	}

	private void setCompanyName(String companyName) {
	    this.companyName = companyName;
	}

	private String headName;

	private String getHeadName() {
	    return headName;
	}

	private void setHeadName(String headName) {
	    this.headName = headName;
	}

	private String accountantName;

	private String getAccountantName() {
	    return accountantName;
	}

	private void setAccountantName(String accountantName) {
	    this.accountantName = accountantName;
	}

	private CompanyActivityKindEntity companyActivityKind;

	private CompanyActivityKindEntity getCompanyActivityKind() {
	    return companyActivityKind;
	}

	private void setCompanyActivityKind(CompanyActivityKindEntity companyActivityKind) {
	    this.companyActivityKind = companyActivityKind;
	}

	@Override
	protected SubjectCompanyEntityBuilder _this() {
	    return this;
	}

	// constructor

	private SubjectCompanyEntityBuilder() {
	}

	// public

	public SubjectCompanyEntityBuilder withCompanyName(final String companyName) {
	    setIfNullOrThrow("companyName", this::getCompanyName, this::setCompanyName, companyName);
	    return this;
	}

	public SubjectCompanyEntityBuilder withHeadName(final String headName) {
	    setStringIfNullOrThrow("headName", this::getHeadName, this::setHeadName, headName);
	    return this;
	}

	public SubjectCompanyEntityBuilder withAccountantName(final String accountantName) {
	    setStringIfNullOrThrow("accountantName", this::getAccountantName, this::setAccountantName, accountantName);
	    return this;
	}

	public SubjectCompanyEntityBuilder withCompanyActivityKind(
		final CompanyActivityKindEntity companyActivityKind) {
	    setIfNullOrThrow("companyActivityKind", this::getCompanyActivityKind, this::setCompanyActivityKind,
		    companyActivityKind);
	    return this;
	}

	@Override
	public SubjectCompanyEntity build() throws IllegalArgumentException {
	    return new SubjectCompanyEntity(id,
		    origin,
		    contact,
		    taxPayerNumber,
		    comments,
		    resident,
		    idNumber,
		    economicsSector,
		    companyName,
		    headName,
		    accountantName,
		    companyActivityKind);
	}
    }

    // constructor

    private SubjectCompanyEntity(Integer id,
	    final OriginInfo origin,
	    final ContactInfo contact,
	    final String taxPayerNumber,
	    final String comments,
	    final Boolean resident,
	    final TaxpayerNumber idNumber,
	    final KZEconomicSector economicsSector,
	    final String companyName,
	    final String headName,
	    final String accountantName,
	    final CompanyActivityKindEntity companyActivityKind) {
	super(id, origin, contact, taxPayerNumber, comments, resident, idNumber, economicsSector);
	this.companyName = companyName;
	this.headName = headName;
	this.accountantName = accountantName;
	this.companyActivityKind = companyActivityKind;
    }

    protected SubjectCompanyEntity() {
	this.companyName = null;
	this.headName = null;
	this.accountantName = null;
	this.companyActivityKind = null;
    }

    // subjectType

    @Override
    public SubjectType getSubjectType() {
	return SubjectType.COMPANY;
    }

    // companyName

    private final String companyName;

    public String getCompanyName() {
	return companyName;
    }

    // headName

    private final String headName;

    public String getHeadName() {
	return headName;
    }

    // accountantName

    private final String accountantName;

    public String getAccountantName() {
	return accountantName;
    }

    // companyActivityKind

    private final CompanyActivityKindEntity companyActivityKind;

    public CompanyActivityKindEntity getCompanyActivityKind() {
	return companyActivityKind;
    }
}
