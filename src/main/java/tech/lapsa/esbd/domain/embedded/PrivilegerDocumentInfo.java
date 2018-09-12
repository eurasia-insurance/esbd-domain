package tech.lapsa.esbd.domain.embedded;

import java.time.LocalDate;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

import tech.lapsa.java.commons.function.MyObjects;
import tech.lapsa.patterns.domain.HashCodePrime;

@Embeddable
@AttributeOverrides({
	@AttributeOverride(name = "number", column = @Column(name = "PRIVILEGER_DOCUMENT_NUMBER")),
	@AttributeOverride(name = "dateOfIssue", column = @Column(name = "PRIVILEGER_DOCUMENT_DATE_OF_ISSUE"))
})
@HashCodePrime(307)
public class PrivilegerDocumentInfo extends ADocumentInfo {

    private static final long serialVersionUID = 1L;

    public static final PrivilegerDocumentInfoBuilder builder() {
	return new PrivilegerDocumentInfoBuilder();
    }

    public static final PrivilegerDocumentInfoBuilder builder(final PrivilegerDocumentInfo source) {
	MyObjects.requireNonNull(source, "source");
	return new PrivilegerDocumentInfoBuilder(source);
    }

    public static final class PrivilegerDocumentInfoBuilder
	    extends ADocumentInfoBuilder<PrivilegerDocumentInfo, PrivilegerDocumentInfoBuilder> {

	// private & protected

	protected String type;

	private String getType() {
	    return type;
	}

	private void setType(final String type) {
	    this.type = type;
	}

	@Override
	protected PrivilegerDocumentInfoBuilder _this() {
	    return this;
	}

	// constructor

	protected PrivilegerDocumentInfoBuilder() {
	}

	protected PrivilegerDocumentInfoBuilder(final PrivilegerDocumentInfo source) {
	    super(source);
	    type = source.type;
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

    protected PrivilegerDocumentInfo(final String number,
	    final LocalDate dateOfIssue,
	    final String type) {
	super(number, dateOfIssue);
	this.type = type;
    }

    protected PrivilegerDocumentInfo() {
	type = null;
    }

    // type

    @Basic
    @Column(name = "PRIVILEGER_DOCUMENT_TYPE")
    final String type;

    public String getType() {
	return type;
    }
}
