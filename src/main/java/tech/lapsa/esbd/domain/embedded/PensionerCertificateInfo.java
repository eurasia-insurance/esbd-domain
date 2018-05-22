package tech.lapsa.esbd.domain.embedded;

import java.time.LocalDate;
import java.util.function.Consumer;

import tech.lapsa.esbd.domain.AEntity;
import tech.lapsa.patterns.domain.HashCodePrime;

@HashCodePrime(283)
public class PensionerInfo extends AEntity {

    private static final long serialVersionUID = 1L;

    public static final PensionerInfoBuilder builder() {
	return new PensionerInfoBuilder();
    }

    public static final class PensionerInfoBuilder {

	// private

	private String certificateNumber;

	private String getCertificateNumber() {
	    return certificateNumber;
	}

	private void setCertificateNumber(String certificateNumber) {
	    this.certificateNumber = certificateNumber;
	}

	private LocalDate certiticateDateOfIssue;

	private LocalDate getCertiticateDateOfIssue() {
	    return certiticateDateOfIssue;
	}

	private void setCertiticateDateOfIssue(LocalDate certiticateDateOfIssue) {
	    this.certiticateDateOfIssue = certiticateDateOfIssue;
	}

	private PensionerInfoBuilder() {
	}

	// public

	public PensionerInfoBuilder withCertificateNumber(final String certificateNumber) {
	    setStringIfNullOrThrow("certificateNumber", this::getCertificateNumber, this::setCertificateNumber,
		    certificateNumber);
	    return this;
	}

	public PensionerInfoBuilder withCertiticateDateOfIssue(final LocalDate certiticateDateOfIssue) {
	    setIfNullOrThrow("certiticateDateOfIssue", this::getCertiticateDateOfIssue, this::setCertiticateDateOfIssue,
		    certiticateDateOfIssue);
	    return this;
	}

	public PensionerInfo build() {
	    return new PensionerInfo(certificateNumber,
		    certiticateDateOfIssue);
	}

	public void buildTo(final Consumer<PensionerInfo> consumer) {
	    consumer.accept(build());
	}
    }

    private PensionerInfo(final String certificateNumber,
	    final LocalDate certiticateDateOfIssue) {
	this.certificateNumber = certificateNumber;
	this.certiticateDateOfIssue = certiticateDateOfIssue;
    }

    // certificateNumber

    private final String certificateNumber;

    public String getCertificateNumber() {
	return certificateNumber;
    }

    // certiticateDateOfIssue

    private final LocalDate certiticateDateOfIssue;

    public LocalDate getCertiticateDateOfIssue() {
	return certiticateDateOfIssue;
    }
}
