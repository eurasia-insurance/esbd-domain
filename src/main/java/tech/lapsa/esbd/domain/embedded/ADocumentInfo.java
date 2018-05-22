package tech.lapsa.esbd.domain.embedded;

import java.time.LocalDate;

import tech.lapsa.esbd.domain.AEntity;

public abstract class ADocumentInfo extends AEntity {

    private static final long serialVersionUID = 1L;

    public static abstract class ADocumentInfoBuilder<ET extends ADocumentInfo, BT extends ADocumentInfoBuilder<ET, BT>>
	    extends AEntityBuilder<ET, BT> {

	// private

	protected String number;

	private String getNumber() {
	    return number;
	}

	private void setNumber(String number) {
	    this.number = number;
	}

	protected LocalDate dateOfIssue;

	private LocalDate getDateOfIssue() {
	    return dateOfIssue;
	}

	private void setDateOfIssue(LocalDate dateOfIssue) {
	    this.dateOfIssue = dateOfIssue;
	}

	protected ADocumentInfoBuilder() {
	}

	protected abstract BT _this();

	// public

	public BT withNumber(final String number) {
	    setStringIfNullOrThrow("number", this::getNumber, this::setNumber, number);
	    return _this();
	}

	public BT withDateOfIssue(final LocalDate dateOfIssue) {
	    setIfNullOrThrow("dateOfIssue", this::getDateOfIssue, this::setDateOfIssue, dateOfIssue);
	    return _this();
	}
    }

    protected ADocumentInfo(final String number,
	    final LocalDate dateOfIssue) {
	this.number = number;
	this.dateOfIssue = dateOfIssue;
    }

    // number

    private final String number;

    public String getCertificateNumber() {
	return number;
    }

    // dateOfIssue

    private final LocalDate dateOfIssue;

    public LocalDate getCertificateDateOfIssue() {
	return dateOfIssue;
    }

}
