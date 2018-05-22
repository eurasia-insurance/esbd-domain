package tech.lapsa.esbd.domain.dict;

import javax.persistence.Entity;

import tech.lapsa.patterns.domain.HashCodePrime;

@Entity
@HashCodePrime(509)
public class BranchEntity extends ADictEntity {

    private static final long serialVersionUID = 1L;

    public static final BranchEntityBuilder builder() {
	return new BranchEntityBuilder();
    }

    public static final class BranchEntityBuilder
	    extends ADictEntityBuilder<BranchEntity, BranchEntityBuilder> {

	@Override
	protected BranchEntityBuilder _this() {
	    return this;
	}

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

    protected BranchEntity() {
    }
}
