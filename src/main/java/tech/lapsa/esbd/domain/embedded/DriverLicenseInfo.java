package tech.lapsa.esbd.domain.embedded;

import java.time.LocalDate;

import tech.lapsa.java.commons.function.MyObjects;
import tech.lapsa.patterns.domain.HashCodePrime;

@HashCodePrime(263)
public class DriverLicenseInfo extends ADocumentInfo {

    private static final long serialVersionUID = 1L;

    public static final DriverLicenseInfoBuilder builder() {
	return new DriverLicenseInfoBuilder();
    }

    public static final DriverLicenseInfoBuilder builder(final DriverLicenseInfo source) {
	MyObjects.requireNonNull(source, "source");
	return new DriverLicenseInfoBuilder(source);
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

	protected DriverLicenseInfoBuilder(final DriverLicenseInfo source) {
	    super(source);
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
