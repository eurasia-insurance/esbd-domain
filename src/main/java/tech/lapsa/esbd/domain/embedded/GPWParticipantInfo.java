package tech.lapsa.esbd.domain.embedded;

import java.time.LocalDate;
import java.util.function.Consumer;

import tech.lapsa.esbd.domain.AEntity;
import tech.lapsa.patterns.domain.HashCodePrime;

@HashCodePrime(269)
public class GPWParticipantInfo extends AEntity {

    private static final long serialVersionUID = 1L;

    public static final GPWParticipantInfoBuilder builder() {
	return new GPWParticipantInfoBuilder();
    }

    public static final class GPWParticipantInfoBuilder {

	// private

	private String certificateNumber;

	private String getCertificateNumber() {
	    return certificateNumber;
	}

	private void setCertificateNumber(String certificateNumber) {
	    this.certificateNumber = certificateNumber;
	}

	private LocalDate certificateDateOfIssue;

	private LocalDate getCertificateDateOfIssue() {
	    return certificateDateOfIssue;
	}

	private void setCertificateDateOfIssue(LocalDate certificateDateOfIssue) {
	    this.certificateDateOfIssue = certificateDateOfIssue;
	}

	private GPWParticipantInfoBuilder() {
	}

	// public

	public GPWParticipantInfoBuilder withCertificateNumber(final String certificateNumber) {
	    setStringIfNullOrThrow("certificateNumber", this::getCertificateNumber, this::setCertificateNumber,
		    certificateNumber);
	    return this;
	}

	public GPWParticipantInfoBuilder withCertificateDateOfIssue(final LocalDate certificateDateOfIssue) {
	    setIfNullOrThrow("certificateDateOfIssue", this::getCertificateDateOfIssue, this::setCertificateDateOfIssue,
		    certificateDateOfIssue);
	    return this;
	}

	public GPWParticipantInfo build() {
	    return new GPWParticipantInfo(certificateNumber,
		    certificateDateOfIssue);
	}

	public void buildTo(final Consumer<GPWParticipantInfo> consumer) {
	    consumer.accept(build());
	}
    }

    private GPWParticipantInfo(final String certificateNumber,
	    final LocalDate certificateDateOfIssue) {
	this.certificateNumber = certificateNumber;
	this.certificateDateOfIssue = certificateDateOfIssue;
    }

    // certificateNumber

    private final String certificateNumber;

    public String getCertificateNumber() {
	return certificateNumber;
    }

    // certificateDateOfIssue

    private final LocalDate certificateDateOfIssue;

    public LocalDate getCertificateDateOfIssue() {
	return certificateDateOfIssue;
    }
}
