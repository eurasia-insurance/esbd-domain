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

	// private

	@Override
	protected DriverLicenseInfoBuilder _this() {
	    return this;
	}

	private DriverLicenseInfoBuilder() {
	}

	// public

	@Override
	public DriverLicenseInfo build() {
	    return new DriverLicenseInfo(number,
		    dateOfIssue);
	}
    }

    private DriverLicenseInfo(final String number,
	    final LocalDate dateOfIssue) {
	super(number, dateOfIssue);
    }
}
