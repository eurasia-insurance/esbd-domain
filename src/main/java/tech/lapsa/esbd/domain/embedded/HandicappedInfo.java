package tech.lapsa.esbd.domain.embedded;

import java.time.LocalDate;
import java.util.function.Consumer;

import tech.lapsa.esbd.domain.AEntity;
import tech.lapsa.patterns.domain.HashCodePrime;

@HashCodePrime(271)
public class HandicappedInfo extends AEntity {

    private static final long serialVersionUID = 1L;

    public static final HandicappedInfoBuilder builder() {
	return new HandicappedInfoBuilder();
    }

    public static final class HandicappedInfoBuilder {

	// private

	private String certificateNumber;

	private String getCertificateNumber() {
	    return certificateNumber;
	}

	private void setCertificateNumber(String certificateNumber) {
	    this.certificateNumber = certificateNumber;
	}

	private LocalDate certificateValidFrom;

	private LocalDate getCertificateValidFrom() {
	    return certificateValidFrom;
	}

	private void setCertificateValidFrom(LocalDate certificateValidFrom) {
	    this.certificateValidFrom = certificateValidFrom;
	}

	private LocalDate certificateValidTill;

	private LocalDate getCertificateValidTill() {
	    return certificateValidTill;
	}

	private void setCertificateValidTill(LocalDate certificateValidTill) {
	    this.certificateValidTill = certificateValidTill;
	}

	private HandicappedInfoBuilder() {
	}

	// public

	public HandicappedInfoBuilder withCertificateNumber(final String certificateNumber) {
	    setStringIfNullOrThrow("certificateNumber", this::getCertificateNumber, this::setCertificateNumber,
		    certificateNumber);
	    return this;
	}

	public HandicappedInfoBuilder withCertificateValidFrom(final LocalDate certificateValidFrom) {
	    setIfNullOrThrow("certificateValidFrom", this::getCertificateValidFrom, this::setCertificateValidFrom,
		    certificateValidFrom);
	    return this;
	}

	public HandicappedInfoBuilder withCertificateValidTill(final LocalDate certificateValidTill) {
	    setIfNullOrThrow("certificateValidTill", this::getCertificateValidTill, this::setCertificateValidTill,
		    certificateValidTill);
	    return this;
	}

	public HandicappedInfo build() {
	    return new HandicappedInfo(certificateNumber,
		    certificateValidFrom,
		    certificateValidTill);
	}

	public void buildTo(final Consumer<HandicappedInfo> consumer) {
	    consumer.accept(build());
	}
    }

    // constructor

    private HandicappedInfo(final String certificateNumber,
	    final LocalDate certificateValidFrom,
	    final LocalDate certificateValidTill) {
	this.certificateNumber = certificateNumber;
	this.certificateValidFrom = certificateValidFrom;
	this.certificateValidTill = certificateValidTill;
    }

    // certificateNumber

    private final String certificateNumber;

    public final String getCertificateNumber() {
	return certificateNumber;
    }

    // certificateValidFrom

    private final LocalDate certificateValidFrom;

    public LocalDate getCertificateValidFrom() {
	return certificateValidFrom;
    }

    // certificateValidTill

    private final LocalDate certificateValidTill;

    public LocalDate getCertificateValidTill() {
	return certificateValidTill;
    }
}
