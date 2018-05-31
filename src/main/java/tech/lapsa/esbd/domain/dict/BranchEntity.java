package tech.lapsa.esbd.domain.dict;

import tech.lapsa.java.commons.function.MyObjects;
import tech.lapsa.patterns.domain.HashCodePrime;

@HashCodePrime(509)
public class BranchEntity extends ADictEntity {

    private static final long serialVersionUID = 1L;

    public static final BranchEntityBuilder builder() {
	return new BranchEntityBuilder();
    }

    public static final BranchEntityBuilder builder(final BranchEntity source) {
	MyObjects.requireNonNull(source, "source");
	return new BranchEntityBuilder(source);
    }

    public static final class BranchEntityBuilder
	    extends ADictEntityBuilder<BranchEntity, BranchEntityBuilder> {

	// private & protected

	@Override
	protected BranchEntityBuilder _this() {
	    return this;
	}

	// constructor

	protected BranchEntityBuilder() {
	}

	protected BranchEntityBuilder(BranchEntity source) {
	    super(source);
	}

	// public

	@Override
	public BranchEntity build() {
	    return new BranchEntity(id, code, name);
	}
    }

    // constructor

    protected BranchEntity(final Integer id,
	    final String code,
	    final String name) {
	super(id, code, name);
    }

    protected BranchEntity() {
    }
}
