package tech.lapsa.esbd.domain.embedded;

import java.time.LocalDate;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import tech.lapsa.esbd.domain.ADomain;

@MappedSuperclass
public abstract class ADocumentInfo extends ADomain {

    private static final long serialVersionUID = 1L;

    public static abstract class ADocumentInfoBuilder<ET extends ADocumentInfo, BT extends ADocumentInfoBuilder<ET, BT>>
	    extends ADomainBuilder<ET, BT> {

	// private & protected

	protected String number;

	private String getNumber() {
	    return number;
	}

	private void setNumber(final String number) {
	    this.number = number;
	}

	protected LocalDate dateOfIssue;

	private LocalDate getDateOfIssue() {
	    return dateOfIssue;
	}

	private void setDateOfIssue(final LocalDate dateOfIssue) {
	    this.dateOfIssue = dateOfIssue;
	}

	// constructor

	protected ADocumentInfoBuilder() {
	}

	protected ADocumentInfoBuilder(final ET source) {
	    super(source);
	    this.number = source.number;
	    this.dateOfIssue = source.dateOfIssue;
	}

	// public

	public BT withNumber(final String number) {
	    setStringIfNullOrThrow("number", this::getNumber, this::setNumber, number);
	    return _this();
	}

	public BT withDateOfIssue(final LocalDate dateOfIssue) {
	    setBuilderProperty("dateOfIssue", this::getDateOfIssue, this::setDateOfIssue, dateOfIssue);
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
	number = null;
	dateOfIssue = null;
    }

    // number

    @Basic
    @Column(name = "DOCUMENT_NUMBER")
    final String number;

    public String getNumber() {
	return number;
    }

    // dateOfIssue

    @Basic
    @Temporal(TemporalType.DATE)
    @Column(name = "DOCUMENT_DATE_OF_ISSUE")
    final LocalDate dateOfIssue;

    public LocalDate getDateOfIssue() {
	return dateOfIssue;
    }

}
