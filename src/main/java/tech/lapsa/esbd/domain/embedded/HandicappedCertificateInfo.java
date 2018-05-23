package tech.lapsa.esbd.domain.embedded;

import java.time.LocalDate;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import tech.lapsa.patterns.domain.HashCodePrime;

@Embeddable
@AttributeOverrides({
	@AttributeOverride(name = "number", column = @Column(name = "HANDICAPED_CERTIFICATE_NUMBER")),
	@AttributeOverride(name = "dateOfIssue", column = @Column(name = "HANDICAPED_CERTIFICATE_DATE_OF_ISSUE"))
})
@HashCodePrime(271)
public class HandicappedCertificateInfo extends ADocumentInfo {

    private static final long serialVersionUID = 1L;

    public static final HandicappedCertificateInfoBuilder builder() {
	return new HandicappedCertificateInfoBuilder();
    }

    public static final class HandicappedCertificateInfoBuilder
	    extends ADocumentInfoBuilder<HandicappedCertificateInfo, HandicappedCertificateInfoBuilder> {

	// private & protected

	protected LocalDate validFrom;

	private LocalDate getValidFrom() {
	    return validFrom;
	}

	private void setValidFrom(LocalDate validFrom) {
	    this.validFrom = validFrom;
	}

	protected LocalDate validTill;

	private LocalDate getValidTill() {
	    return validTill;
	}

	private void setValidTill(LocalDate validTill) {
	    this.validTill = validTill;
	}

	@Override
	protected HandicappedCertificateInfoBuilder _this() {
	    return this;
	}

	// constructor

	protected HandicappedCertificateInfoBuilder() {
	}

	// public

	public HandicappedCertificateInfoBuilder withValidFrom(final LocalDate validFrom) {
	    setIfNullOrThrow("validFrom", this::getValidFrom, this::setValidFrom,
		    validFrom);
	    return this;
	}

	public HandicappedCertificateInfoBuilder withValidTill(final LocalDate validTill) {
	    setIfNullOrThrow("validTill", this::getValidTill, this::setValidTill,
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
	this.validFrom = null;
	this.validTill = null;
    }

    // validFrom

    @Basic
    @Temporal(TemporalType.DATE)
    @Column(name = "HANDICAPED_CERTIFICATE_VALID_FROM")
    private final LocalDate validFrom;

    public LocalDate getValidFrom() {
	return validFrom;
    }

    // validTill

    @Basic
    @Temporal(TemporalType.DATE)
    @Column(name = "HANDICAPED_CERTIFICATE_VALID_TILL")
    private final LocalDate validTill;

    public LocalDate getValidTill() {
	return validTill;
    }
}
