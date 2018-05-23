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

    protected ADocumentInfo() {
	this.number = null;
	this.dateOfIssue = null;
    }

    // number

    @Basic
    @Column(name = "DOCUMENT_NUMBER")
    private final String number;

    public String getCertificateNumber() {
	return number;
    }

    // dateOfIssue

    @Basic
    @Temporal(TemporalType.DATE)
    @Column(name = "DOCUMENT_DATE_OF_ISSUE")
    private final LocalDate dateOfIssue;

    public LocalDate getCertificateDateOfIssue() {
	return dateOfIssue;
    }

}
