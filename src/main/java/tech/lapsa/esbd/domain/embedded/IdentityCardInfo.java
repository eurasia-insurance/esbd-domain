package tech.lapsa.esbd.domain.embedded;

import java.time.LocalDate;
import java.util.function.Consumer;

import com.lapsa.insurance.elements.IdentityCardType;

import tech.lapsa.esbd.domain.AEntity;
import tech.lapsa.patterns.domain.HashCodePrime;

@HashCodePrime(277)
public class IdentityCardInfo extends AEntity {

    private static final long serialVersionUID = 1L;

    public static final IdentityCardInfoBuilder builder() {
	return new IdentityCardInfoBuilder();
    }

    public static final class IdentityCardInfoBuilder {

	// private

	private LocalDate dateOfIssue;

	private LocalDate getDateOfIssue() {
	    return dateOfIssue;
	}

	private void setDateOfIssue(LocalDate dateOfIssue) {
	    this.dateOfIssue = dateOfIssue;
	}

	private String issuingAuthority;

	private String getIssuingAuthority() {
	    return issuingAuthority;
	}

	private void setIssuingAuthority(String issuingAuthority) {
	    this.issuingAuthority = issuingAuthority;
	}

	private String number;

	private String getNumber() {
	    return number;
	}

	private void setNumber(String number) {
	    this.number = number;
	}

	private IdentityCardType identityCardType;

	private IdentityCardType getIdentityCardType() {
	    return identityCardType;
	}

	private void setIdentityCardType(IdentityCardType identityCardType) {
	    this.identityCardType = identityCardType;
	}

	private IdentityCardInfoBuilder() {
	}

	// public

	public IdentityCardInfoBuilder withDateOfIssue(final LocalDate dateOfIssue) {
	    setIfNullOrThrow("dateOfIssue", this::getDateOfIssue, this::setDateOfIssue, dateOfIssue);
	    return this;
	}

	public IdentityCardInfoBuilder withIssuingAuthority(final String issuingAuthority) {
	    setStringIfNullOrThrow("issuingAuthority", this::getIssuingAuthority, this::setIssuingAuthority,
		    issuingAuthority);
	    return this;
	}

	public IdentityCardInfoBuilder withNumber(final String number) {
	    setStringIfNullOrThrow("number", this::getNumber, this::setNumber, number);
	    return this;
	}

	public IdentityCardInfoBuilder withIdentityCardType(final IdentityCardType identityCardType) {
	    setIfNullOrThrow("identityCardType", this::getIdentityCardType, this::setIdentityCardType,
		    identityCardType);
	    return this;
	}

	public IdentityCardInfo build() {
	    return new IdentityCardInfo(dateOfIssue,
		    issuingAuthority,
		    number,
		    identityCardType);
	}

	public void buildTo(final Consumer<IdentityCardInfo> consumer) {
	    consumer.accept(build());
	}
    }

    private IdentityCardInfo(final LocalDate dateOfIssue,
	    final String issuingAuthority,
	    final String number,
	    final IdentityCardType identityCardType) {
	this.dateOfIssue = dateOfIssue;
	this.issuingAuthority = issuingAuthority;
	this.number = number;
	this.identityCardType = identityCardType;
    }

    // dateOfIssue

    private LocalDate dateOfIssue;

    public LocalDate getDateOfIssue() {
	return dateOfIssue;
    }

    // issuingAuthority

    private String issuingAuthority;

    public String getIssuingAuthority() {
	return issuingAuthority;
    }

    // number

    private String number;

    public String getNumber() {
	return number;
    }

    // identityCardType

    private IdentityCardType identityCardType;

    public IdentityCardType getIdentityCardType() {
	return identityCardType;
    }
}
