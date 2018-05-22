package tech.lapsa.esbd.domain.dict;

import tech.lapsa.patterns.domain.HashCodePrime;

@HashCodePrime(523)
public class InsuranceCompanyEntity extends ADictEntity {

    private static final long serialVersionUID = 1L;

    public static final InsuranceCompanyEntityBuilder builder() {
	return new InsuranceCompanyEntityBuilder();
    }

    public static final class InsuranceCompanyEntityBuilder
	    extends DictionaryEntityBuilder<InsuranceCompanyEntity> {

	private InsuranceCompanyEntityBuilder() {
	    super(InsuranceCompanyEntity::new);
	}
    }

    // constructor

    private InsuranceCompanyEntity(final Integer id, final String code, final String name) {
	super(id, code, name);
    }

}
