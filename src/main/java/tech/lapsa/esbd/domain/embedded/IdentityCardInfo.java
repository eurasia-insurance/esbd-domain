package tech.lapsa.esbd.domain.embedded;

import java.time.LocalDate;

import com.lapsa.insurance.elements.IdentityCardType;

import tech.lapsa.patterns.domain.HashCodePrime;

@HashCodePrime(277)
public class IdentityCardInfo extends ADocumentInfo {

    private static final long serialVersionUID = 1L;

    public static final IdentityCardInfoBuilder builder() {
	return new IdentityCardInfoBuilder();
    }

    public static final class IdentityCardInfoBuilder
	    extends ADocumentInfoBuilder<IdentityCardInfo, IdentityCardInfoBuilder> {

	// private

	private String issuingAuthority;

	private String getIssuingAuthority() {
	    return issuingAuthority;
	}

	private void setIssuingAuthority(String issuingAuthority) {
	    this.issuingAuthority = issuingAuthority;
	}

	private IdentityCardType identityCardType;

	private IdentityCardType getIdentityCardType() {
	    return identityCardType;
	}

	private void setIdentityCardType(IdentityCardType identityCardType) {
	    this.identityCardType = identityCardType;
	}

	@Override
	protected IdentityCardInfoBuilder _this() {
	    return this;
	}

	private IdentityCardInfoBuilder() {
	}

	// public

	public IdentityCardInfoBuilder withIssuingAuthority(final String issuingAuthority) {
	    setStringIfNullOrThrow("issuingAuthority", this::getIssuingAuthority, this::setIssuingAuthority,
		    issuingAuthority);
	    return this;
	}

	public IdentityCardInfoBuilder withIdentityCardType(final IdentityCardType identityCardType) {
	    setIfNullOrThrow("identityCardType", this::getIdentityCardType, this::setIdentityCardType,
		    identityCardType);
	    return this;
	}

	@Override
	public IdentityCardInfo build() {
	    return new IdentityCardInfo(number,
		    dateOfIssue,
		    issuingAuthority,
		    identityCardType);
	}
    }

    private IdentityCardInfo(final String number,
	    final LocalDate dateOfIssue,
	    final String issuingAuthority,
	    final IdentityCardType identityCardType) {
	super(number, dateOfIssue);
	this.issuingAuthority = issuingAuthority;
	this.identityCardType = identityCardType;
    }

    protected IdentityCardInfo() {
	this.issuingAuthority = null;
	this.identityCardType = null;
    }

    // issuingAuthority

    private String issuingAuthority;

    public String getIssuingAuthority() {
	return issuingAuthority;
    }

    // identityCardType

    private IdentityCardType identityCardType;

    public IdentityCardType getIdentityCardType() {
	return identityCardType;
    }
}
