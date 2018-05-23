package tech.lapsa.esbd.domain.embedded;

import java.time.LocalDate;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import com.lapsa.insurance.elements.IdentityCardType;

import tech.lapsa.patterns.domain.HashCodePrime;

@Embeddable
@AttributeOverrides({
	@AttributeOverride(name = "number", column = @Column(name = "IDENTITY_CARD_NUMBER")),
	@AttributeOverride(name = "dateOfIssue", column = @Column(name = "IDENTITY_CARD_DATE_OF_ISSUE"))
})
@HashCodePrime(277)
public class IdentityCardInfo extends ADocumentInfo {

    private static final long serialVersionUID = 1L;

    public static final IdentityCardInfoBuilder builder() {
	return new IdentityCardInfoBuilder();
    }

    public static final class IdentityCardInfoBuilder
	    extends ADocumentInfoBuilder<IdentityCardInfo, IdentityCardInfoBuilder> {

	// private & protected

	protected String issuingAuthority;

	private String getIssuingAuthority() {
	    return issuingAuthority;
	}

	private void setIssuingAuthority(String issuingAuthority) {
	    this.issuingAuthority = issuingAuthority;
	}

	protected IdentityCardType identityCardType;

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

	// constructor

	protected IdentityCardInfoBuilder() {
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

    // constructor

    protected IdentityCardInfo(final String number,
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

    @Basic
    private String issuingAuthority;

    public String getIssuingAuthority() {
	return issuingAuthority;
    }

    // identityCardType

    @Basic
    @Enumerated(EnumType.STRING)
    @Column(name = "IDENTITY_CARD_TYPE")
    private IdentityCardType identityCardType;

    public IdentityCardType getIdentityCardType() {
	return identityCardType;
    }
}
