package tech.lapsa.esbd.domain.embedded;

import java.time.LocalDate;
import java.util.function.Consumer;

import tech.lapsa.esbd.domain.AEntity;
import tech.lapsa.patterns.domain.HashCodePrime;

@HashCodePrime(263)
public class DriverLicenseInfo extends AEntity {

    private static final long serialVersionUID = 1L;

    public static final DriverLicenseInfoBuilder builder() {
	return new DriverLicenseInfoBuilder();
    }

    public static final class DriverLicenseInfoBuilder {

	// private

	private String number;

	private String getNumber() {
	    return number;
	}

	private void setNumber(String number) {
	    this.number = number;
	}

	private LocalDate dateOfIssue;

	private LocalDate getDateOfIssue() {
	    return dateOfIssue;
	}

	private void setDateOfIssue(LocalDate dateOfIssue) {
	    this.dateOfIssue = dateOfIssue;
	}

	private DriverLicenseInfoBuilder() {
	}

	// public

	public DriverLicenseInfoBuilder withNumber(final String number) {
	    setStringIfNullOrThrow("number", this::getNumber, this::setNumber, number);
	    return this;
	}

	public DriverLicenseInfoBuilder withDateOfIssue(final LocalDate dateOfIssue) {
	    setIfNullOrThrow("dateOfIssue", this::getDateOfIssue, this::setDateOfIssue, dateOfIssue);
	    return this;
	}

	public DriverLicenseInfo build() {
	    return new DriverLicenseInfo(number,
		    dateOfIssue);
	}

	public void buildTo(final Consumer<DriverLicenseInfo> consumer) {
	    consumer.accept(build());
	}
    }

    private DriverLicenseInfo(final String number,
	    final LocalDate dateOfIssue) {
	this.number = number;
	this.dateOfIssue = dateOfIssue;
    }

    // number

    private final String number;

    public String getNumber() {
	return number;
    }

    // dateOfIssue

    private final LocalDate dateOfIssue;

    public LocalDate getDateOfIssue() {
	return dateOfIssue;
    }
}
