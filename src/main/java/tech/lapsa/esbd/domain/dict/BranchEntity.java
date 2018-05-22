package tech.lapsa.esbd.domain.dict;

import tech.lapsa.patterns.domain.HashCodePrime;

@HashCodePrime(509)
public class BranchEntity extends ADictEntity {

    private static final long serialVersionUID = 1L;

    public static final BranchEntityBuilder builder() {
	return new BranchEntityBuilder();
    }

    public static final class BranchEntityBuilder extends DictionaryEntityBuilder<BranchEntity> {

	private BranchEntityBuilder() {
	    super(BranchEntity::new);
	}
    }

    // constructor

    private BranchEntity(final Integer id,
	    final String code,
	    final String name) {
	super(id, code, name);
    }
}
