package tech.lapsa.esbd.domain.dict;

import javax.persistence.Entity;

import tech.lapsa.patterns.domain.HashCodePrime;

@Entity
@HashCodePrime(523)
public class InsuranceCompanyEntity extends ADictEntity {

    private static final long serialVersionUID = 1L;

    public static final InsuranceCompanyEntityBuilder builder() {
	return new InsuranceCompanyEntityBuilder();
    }

    public static final class InsuranceCompanyEntityBuilder
	    extends ADictEntityBuilder<InsuranceCompanyEntity, InsuranceCompanyEntityBuilder> {

	@Override
	protected InsuranceCompanyEntityBuilder _this() {
	    return this;
	}

	private InsuranceCompanyEntityBuilder() {
	    super(InsuranceCompanyEntity::new);
	}
    }

    // constructor

    private InsuranceCompanyEntity(final Integer id,
	    final String code,
	    final String name) {
	super(id, code, name);
    }

    protected InsuranceCompanyEntity() {
    }
}
