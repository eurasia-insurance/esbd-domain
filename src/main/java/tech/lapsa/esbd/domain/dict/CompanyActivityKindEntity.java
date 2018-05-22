package tech.lapsa.esbd.domain.dict;

import tech.lapsa.patterns.domain.HashCodePrime;

@HashCodePrime(521)
public class CompanyActivityKindEntity extends ADictEntity {

    private static final long serialVersionUID = 1L;

    public static final CompanyActivityKindEntityBuilder builder() {
	return new CompanyActivityKindEntityBuilder();
    }

    public static final class CompanyActivityKindEntityBuilder
	    extends ADictEntityBuilder<CompanyActivityKindEntity, CompanyActivityKindEntityBuilder> {

	@Override
	protected CompanyActivityKindEntityBuilder _this() {
	    return this;
	}

	private CompanyActivityKindEntityBuilder() {
	    super(CompanyActivityKindEntity::new);
	}
    }

    // constructor

    private CompanyActivityKindEntity(final Integer id,
	    final String code,
	    final String name) {
	super(id, code, name);
    }
}
