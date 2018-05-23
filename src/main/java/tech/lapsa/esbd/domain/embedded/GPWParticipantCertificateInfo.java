package tech.lapsa.esbd.domain.embedded;

import java.time.LocalDate;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embeddable;

import tech.lapsa.patterns.domain.HashCodePrime;

@Embeddable
@AttributeOverrides({
	@AttributeOverride(name = "number", column = @Column(name = "GPW_CERTIFICATE_NUMBER")),
	@AttributeOverride(name = "dateOfIssue", column = @Column(name = "GPW_CERTIFICATE_DATE_OF_ISSUE"))
})
@HashCodePrime(269)
public class GPWParticipantCertificateInfo extends ADocumentInfo {

    private static final long serialVersionUID = 1L;

    public static final GPWParticipantCertificateInfoBuilder builder() {
	return new GPWParticipantCertificateInfoBuilder();
    }

    public static final class GPWParticipantCertificateInfoBuilder
	    extends ADocumentInfoBuilder<GPWParticipantCertificateInfo, GPWParticipantCertificateInfoBuilder> {

	// private

	@Override
	protected GPWParticipantCertificateInfoBuilder _this() {
	    return this;
	}

	private GPWParticipantCertificateInfoBuilder() {
	}

	// public

	@Override
	public GPWParticipantCertificateInfo build() {
	    return new GPWParticipantCertificateInfo(number,
		    dateOfIssue);
	}
    }

    // constructor

    private GPWParticipantCertificateInfo(final String number,
	    final LocalDate dateOfIssue) {
	super(number, dateOfIssue);
    }

    protected GPWParticipantCertificateInfo() {
    }
}
