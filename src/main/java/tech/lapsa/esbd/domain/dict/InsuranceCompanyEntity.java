package tech.lapsa.esbd.domain.dict;

import tech.lapsa.java.commons.function.MyObjects;
import tech.lapsa.patterns.domain.HashCodePrime;

@HashCodePrime(523)
public class InsuranceCompanyEntity extends ADictEntity {

    private static final long serialVersionUID = 1L;

    public static final InsuranceCompanyEntityBuilder builder() {
	return new InsuranceCompanyEntityBuilder();
    }

    public static final InsuranceCompanyEntityBuilder builder(final InsuranceCompanyEntity source) {
	MyObjects.requireNonNull(source, "source");
	return new InsuranceCompanyEntityBuilder(source);
    }

    public static final class InsuranceCompanyEntityBuilder
	    extends ADictEntityBuilder<InsuranceCompanyEntity, InsuranceCompanyEntityBuilder> {

	// private & protected

	@Override
	protected InsuranceCompanyEntityBuilder _this() {
	    return this;
	}

	// constructor

	protected InsuranceCompanyEntityBuilder() {
	}

	protected InsuranceCompanyEntityBuilder(final InsuranceCompanyEntity from) {
	    super(from);
	}

	// public

	@Override
	public InsuranceCompanyEntity build() {
	    return new InsuranceCompanyEntity(id, code, name);
	}
    }

    // constructor

    protected InsuranceCompanyEntity(final Integer id,
	    final String code,
	    final String name) {
	super(id, code, name);
    }

    protected InsuranceCompanyEntity() {
    }
}
