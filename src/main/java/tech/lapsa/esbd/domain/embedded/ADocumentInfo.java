package tech.lapsa.esbd.domain.embedded;

import java.time.LocalDate;

import tech.lapsa.esbd.domain.ADomain;

public abstract class ADocumentInfo extends ADomain {

    private static final long serialVersionUID = 1L;

    public static abstract class ADocumentInfoBuilder<ET extends ADocumentInfo, BT extends ADocumentInfoBuilder<ET, BT>>
	    extends ADomainBuilder<ET, BT> {

	// private & protected

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

	// constructor

	protected ADocumentInfoBuilder() {
	}

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

    // constructor

    protected ADocumentInfo(final String number,
	    final LocalDate dateOfIssue) {
	this.number = number;
	this.dateOfIssue = dateOfIssue;
    }

    protected ADocumentInfo() {
	this.number = null;
	this.dateOfIssue = null;
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
