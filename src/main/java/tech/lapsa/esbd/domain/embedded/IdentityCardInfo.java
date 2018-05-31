package tech.lapsa.esbd.domain.embedded;

import java.time.LocalDate;

import com.lapsa.insurance.elements.IdentityCardType;

import tech.lapsa.java.commons.function.MyObjects;
import tech.lapsa.patterns.domain.HashCodePrime;

@HashCodePrime(277)
public class IdentityCardInfo extends ADocumentInfo {

    private static final long serialVersionUID = 1L;

    public static final IdentityCardInfoBuilder builder() {
	return new IdentityCardInfoBuilder();
    }

    public static final IdentityCardInfoBuilder builder(final IdentityCardInfo source) {
	MyObjects.requireNonNull(source, "source");
	return new IdentityCardInfoBuilder(source);
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

	protected IdentityCardInfoBuilder(IdentityCardInfo source) {
	    super(source);
	    this.issuingAuthority = source.issuingAuthority;
	    this.identityCardType = source.identityCardType;
	}

	// public

	public IdentityCardInfoBuilder withIssuingAuthority(final String issuingAuthority) {
	    setStringIfNullOrThrow("issuingAuthority", this::getIssuingAuthority, this::setIssuingAuthority,
		    issuingAuthority);
	    return this;
	}

	public IdentityCardInfoBuilder withIdentityCardType(final IdentityCardType identityCardType) {
	    setBuilderProperty("identityCardType", this::getIdentityCardType, this::setIdentityCardType,
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
