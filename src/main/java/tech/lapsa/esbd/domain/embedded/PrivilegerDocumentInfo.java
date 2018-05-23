package tech.lapsa.esbd.domain.embedded;

import java.time.LocalDate;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

import tech.lapsa.patterns.domain.HashCodePrime;

@Embeddable
@HashCodePrime(307)
public class PrivilegerDocumentInfo extends ADocumentInfo {

    private static final long serialVersionUID = 1L;

    public static final PrivilegerDocumentInfoBuilder builder() {
	return new PrivilegerDocumentInfoBuilder();
    }

    public static final class PrivilegerDocumentInfoBuilder
	    extends ADocumentInfoBuilder<PrivilegerDocumentInfo, PrivilegerDocumentInfoBuilder> {

	// private

	private String type;

	private String getType() {
	    return type;
	}

	private void setType(String type) {
	    this.type = type;
	}

	@Override
	protected PrivilegerDocumentInfoBuilder _this() {
	    return this;
	}

	private PrivilegerDocumentInfoBuilder() {
	}

	// public

	public PrivilegerDocumentInfoBuilder withType(final String type) {
	    setStringIfNullOrThrow("type", this::getType, this::setType, type);
	    return this;
	}

	@Override
	public PrivilegerDocumentInfo build() {
	    return new PrivilegerDocumentInfo(number,
		    dateOfIssue,
		    type);
	}
    }

    // constructor

    private PrivilegerDocumentInfo(final String number,
	    final LocalDate dateOfIssue,
	    final String type) {
	super(number, dateOfIssue);
	this.type = type;
    }

    protected PrivilegerDocumentInfo() {
	this.type = null;
    }

    // type

    @Basic
    @Column(name = "PRIVILEGER_TYPE")
    private final String type;

    public String getType() {
	return type;
    }
}
