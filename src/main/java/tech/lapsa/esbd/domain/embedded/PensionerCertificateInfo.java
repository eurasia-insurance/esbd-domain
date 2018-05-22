package tech.lapsa.esbd.domain.embedded;

import java.time.LocalDate;

import javax.persistence.Embeddable;

import tech.lapsa.patterns.domain.HashCodePrime;

@Embeddable
@HashCodePrime(283)
public class PensionerCertificateInfo extends ADocumentInfo {

    private static final long serialVersionUID = 1L;

    public static final PensionerCertificateInfoBuilder builder() {
	return new PensionerCertificateInfoBuilder();
    }

    public static final class PensionerCertificateInfoBuilder
	    extends ADocumentInfoBuilder<PensionerCertificateInfo, PensionerCertificateInfoBuilder> {

	// private

	@Override
	protected PensionerCertificateInfoBuilder _this() {
	    return this;
	}

	private PensionerCertificateInfoBuilder() {
	}

	// public

	@Override
	public PensionerCertificateInfo build() {
	    return new PensionerCertificateInfo(number,
		    dateOfIssue);
	}
    }

    // constructor

    private PensionerCertificateInfo(final String number,
	    final LocalDate dateOfIssue) {
	super(number, dateOfIssue);
    }

    protected PensionerCertificateInfo() {
    }
}
