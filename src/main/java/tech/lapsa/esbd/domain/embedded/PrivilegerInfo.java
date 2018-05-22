package tech.lapsa.esbd.domain.embedded;

import java.time.LocalDate;
import java.util.function.Consumer;

import tech.lapsa.esbd.domain.AEntity;
import tech.lapsa.patterns.domain.HashCodePrime;

@HashCodePrime(307)
public class PrivilegerInfo extends AEntity {

    private static final long serialVersionUID = 1L;

    public static final PrivilegerInfoBuilder builder() {
	return new PrivilegerInfoBuilder();
    }

    public static final class PrivilegerInfoBuilder {

	// private

	private String type;

	private String getType() {
	    return type;
	}

	private void setType(String type) {
	    this.type = type;
	}

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

	private PrivilegerInfoBuilder() {
	}

	// public

	public PrivilegerInfoBuilder withType(final String type) {
	    setStringIfNullOrThrow("type", this::getType, this::setType, type);
	    return this;
	}

	public PrivilegerInfoBuilder withCertificateNumber(final String certificateNumber) {
	    setStringIfNullOrThrow("certificateNumber", this::getCertificateNumber, this::setCertificateNumber,
		    certificateNumber);
	    return this;
	}

	public PrivilegerInfoBuilder withCertificateDateOfIssue(final LocalDate certificateDateOfIssue) {
	    setIfNullOrThrow("certificateDateOfIssue", this::getCertificateDateOfIssue, this::setCertificateDateOfIssue,
		    certificateDateOfIssue);
	    return this;
	}

	public PrivilegerInfo build() {
	    return new PrivilegerInfo(type,
		    certificateNumber,
		    certificateDateOfIssue);
	}

	public void buildTo(final Consumer<PrivilegerInfo> consumer) {
	    consumer.accept(build());
	}
    }

    private PrivilegerInfo(final String type,
	    final String certificateNumber,
	    final LocalDate certificateDateOfIssue) {
	this.type = type;
	this.certificateNumber = certificateNumber;
	this.certificateDateOfIssue = certificateDateOfIssue;
    }

    // type

    private final String type;

    public String getType() {
	return type;
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
