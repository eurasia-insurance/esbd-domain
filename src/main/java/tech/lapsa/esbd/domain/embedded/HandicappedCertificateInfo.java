package tech.lapsa.esbd.domain.embedded;

import java.time.LocalDate;

import tech.lapsa.java.commons.function.MyObjects;
import tech.lapsa.patterns.domain.HashCodePrime;

@HashCodePrime(271)
public class HandicappedCertificateInfo extends ADocumentInfo {

    private static final long serialVersionUID = 1L;

    public static final HandicappedCertificateInfoBuilder builder() {
	return new HandicappedCertificateInfoBuilder();
    }

    public static final HandicappedCertificateInfoBuilder builder(final HandicappedCertificateInfo source) {
	MyObjects.requireNonNull(source, "source");
	return new HandicappedCertificateInfoBuilder(source);
    }

    public static final class HandicappedCertificateInfoBuilder
	    extends ADocumentInfoBuilder<HandicappedCertificateInfo, HandicappedCertificateInfoBuilder> {

	// private & protected

	protected LocalDate validFrom;

	private LocalDate getValidFrom() {
	    return validFrom;
	}

	private void setValidFrom(final LocalDate validFrom) {
	    this.validFrom = validFrom;
	}

	protected LocalDate validTill;

	private LocalDate getValidTill() {
	    return validTill;
	}

	private void setValidTill(final LocalDate validTill) {
	    this.validTill = validTill;
	}

	@Override
	protected HandicappedCertificateInfoBuilder _this() {
	    return this;
	}

	// constructor

	protected HandicappedCertificateInfoBuilder() {
	}

	protected HandicappedCertificateInfoBuilder(final HandicappedCertificateInfo source) {
	    super(source);
	    validFrom = source.validFrom;
	    validTill = source.validTill;
	}

	// public

	public HandicappedCertificateInfoBuilder withValidFrom(final LocalDate validFrom) {
	    setBuilderProperty("validFrom", this::getValidFrom, this::setValidFrom,
		    validFrom);
	    return this;
	}

	public HandicappedCertificateInfoBuilder withValidTill(final LocalDate validTill) {
	    setBuilderProperty("validTill", this::getValidTill, this::setValidTill,
		    validTill);
	    return this;
	}

	@Override
	public HandicappedCertificateInfo build() {
	    return new HandicappedCertificateInfo(number,
		    validFrom,
		    validTill);
	}
    }

    // constructor

    protected HandicappedCertificateInfo(final String number,
	    final LocalDate validFrom,
	    final LocalDate validTill) {
	super(number, null);
	this.validFrom = validFrom;
	this.validTill = validTill;
    }

    protected HandicappedCertificateInfo() {
	validFrom = null;
	validTill = null;
    }

    // validFrom

    final LocalDate validFrom;

    public LocalDate getValidFrom() {
	return validFrom;
    }

    // validTill

    final LocalDate validTill;

    public LocalDate getValidTill() {
	return validTill;
    }
}
