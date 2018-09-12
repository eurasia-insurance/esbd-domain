package tech.lapsa.esbd.domain.embedded;

import java.time.LocalDate;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embeddable;

import tech.lapsa.java.commons.function.MyObjects;
import tech.lapsa.patterns.domain.HashCodePrime;

@Embeddable
@AttributeOverrides({
	@AttributeOverride(name = "number", column = @Column(name = "PENSIONER_CERTIFICATE_NUMBER")),
	@AttributeOverride(name = "dateOfIssue", column = @Column(name = "PENSIONER_CERTIFICATE_DATE_OF_ISSUE"))
})
@HashCodePrime(283)
public class PensionerCertificateInfo extends ADocumentInfo {

    private static final long serialVersionUID = 1L;

    public static final PensionerCertificateInfoBuilder builder() {
	return new PensionerCertificateInfoBuilder();
    }

    public static final PensionerCertificateInfoBuilder builder(final PensionerCertificateInfo source) {
	MyObjects.requireNonNull(source, "source");
	return new PensionerCertificateInfoBuilder(source);
    }

    public static final class PensionerCertificateInfoBuilder
	    extends ADocumentInfoBuilder<PensionerCertificateInfo, PensionerCertificateInfoBuilder> {

	// private & protected

	@Override
	protected PensionerCertificateInfoBuilder _this() {
	    return this;
	}

	// constructor

	protected PensionerCertificateInfoBuilder() {
	}

	protected PensionerCertificateInfoBuilder(final PensionerCertificateInfo source) {
	    super(source);
	}

	// public

	@Override
	public PensionerCertificateInfo build() {
	    return new PensionerCertificateInfo(number,
		    dateOfIssue);
	}
    }

    // constructor

    protected PensionerCertificateInfo(final String number,
	    final LocalDate dateOfIssue) {
	super(number, dateOfIssue);
    }

    protected PensionerCertificateInfo() {
    }
}
