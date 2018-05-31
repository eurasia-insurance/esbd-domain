package tech.lapsa.esbd.domain.embedded;

import java.time.LocalDate;

import tech.lapsa.java.commons.function.MyObjects;
import tech.lapsa.patterns.domain.HashCodePrime;

@HashCodePrime(269)
public class GPWParticipantCertificateInfo extends ADocumentInfo {

    private static final long serialVersionUID = 1L;

    public static final GPWParticipantCertificateInfoBuilder builder() {
	return new GPWParticipantCertificateInfoBuilder();
    }

    public static final GPWParticipantCertificateInfoBuilder builder(final GPWParticipantCertificateInfo source) {
	MyObjects.requireNonNull(source, "source");
	return new GPWParticipantCertificateInfoBuilder(source);
    }

    public static final class GPWParticipantCertificateInfoBuilder
	    extends ADocumentInfoBuilder<GPWParticipantCertificateInfo, GPWParticipantCertificateInfoBuilder> {

	// private & protected

	@Override
	protected GPWParticipantCertificateInfoBuilder _this() {
	    return this;
	}

	// constructor

	protected GPWParticipantCertificateInfoBuilder() {
	}

	protected GPWParticipantCertificateInfoBuilder(GPWParticipantCertificateInfo source) {
	    super(source);
	}

	// public

	@Override
	public GPWParticipantCertificateInfo build() {
	    return new GPWParticipantCertificateInfo(number,
		    dateOfIssue);
	}
    }

    // constructor

    protected GPWParticipantCertificateInfo(final String number,
	    final LocalDate dateOfIssue) {
	super(number, dateOfIssue);
    }

    protected GPWParticipantCertificateInfo() {
    }
}
