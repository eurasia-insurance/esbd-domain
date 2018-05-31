package tech.lapsa.esbd.domain.dict;

import tech.lapsa.java.commons.function.MyObjects;
import tech.lapsa.patterns.domain.HashCodePrime;

@HashCodePrime(521)
public class CompanyActivityKindEntity extends ADictEntity {

    private static final long serialVersionUID = 1L;

    public static final CompanyActivityKindEntityBuilder builder() {
	return new CompanyActivityKindEntityBuilder();
    }

    public static final CompanyActivityKindEntityBuilder builder(final CompanyActivityKindEntity source) {
	MyObjects.requireNonNull(source, "source");
	return new CompanyActivityKindEntityBuilder(source);
    }

    public static final class CompanyActivityKindEntityBuilder
	    extends ADictEntityBuilder<CompanyActivityKindEntity, CompanyActivityKindEntityBuilder> {

	// private & protected

	@Override
	protected CompanyActivityKindEntityBuilder _this() {
	    return this;
	}

	// constructor

	protected CompanyActivityKindEntityBuilder() {
	}

	protected CompanyActivityKindEntityBuilder(CompanyActivityKindEntity source) {
	    super(source);
	}

	// public

	@Override
	public CompanyActivityKindEntity build() {
	    return new CompanyActivityKindEntity(id, code, name);
	}
    }

    // constructor

    protected CompanyActivityKindEntity(final Integer id,
	    final String code,
	    final String name) {
	super(id, code, name);
    }

    protected CompanyActivityKindEntity() {
    }
}
