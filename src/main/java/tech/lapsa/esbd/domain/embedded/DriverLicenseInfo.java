package tech.lapsa.esbd.domain.embedded;

import java.time.LocalDate;

import tech.lapsa.patterns.domain.HashCodePrime;

@HashCodePrime(263)
public class DriverLicenseInfo extends ADocumentInfo {

    private static final long serialVersionUID = 1L;

    public static final DriverLicenseInfoBuilder builder() {
	return new DriverLicenseInfoBuilder();
    }

    public static final class DriverLicenseInfoBuilder
	    extends ADocumentInfoBuilder<DriverLicenseInfo, DriverLicenseInfoBuilder> {

	// private & protected

	@Override
	protected DriverLicenseInfoBuilder _this() {
	    return this;
	}

	// constructor

	protected DriverLicenseInfoBuilder() {
	}

	// public

	@Override
	public DriverLicenseInfo build() {
	    return new DriverLicenseInfo(number,
		    dateOfIssue);
	}
    }

    // constructor

    protected DriverLicenseInfo(final String number,
	    final LocalDate dateOfIssue) {
	super(number, dateOfIssue);
    }

    protected DriverLicenseInfo() {
    }
}
