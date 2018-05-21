package tech.lapsa.esbd.domain.dict;

import tech.lapsa.patterns.domain.HashCodePrime;

@HashCodePrime(5)
public class CompanyActivityKindEntity extends ADictEntity {

    private static final long serialVersionUID = 1L;

    public static final CompanyActivityKindEntityBuilder builder() {
	return new CompanyActivityKindEntityBuilder();
    }

    public static final class CompanyActivityKindEntityBuilder
	    extends DictionaryEntityBuilder<CompanyActivityKindEntity, CompanyActivityKindEntityBuilder> {

	private CompanyActivityKindEntityBuilder() {
	    super(CompanyActivityKindEntity::new);
	}

	@Override
	protected CompanyActivityKindEntityBuilder _this() {
	    return this;
	}
    }

    // constructor

    private CompanyActivityKindEntity(final Integer id,
	    final String code,
	    final String name) {
	super(id, code, name);
    }

}
