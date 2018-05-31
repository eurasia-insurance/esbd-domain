package tech.lapsa.esbd.domain;

import tech.lapsa.java.commons.function.MyObjects;

public abstract class AEntity extends ADomain implements Cloneable {

    private static final long serialVersionUID = 1L;

    public static abstract class AEntityBuilder<ET extends AEntity, BT extends AEntityBuilder<ET, BT>>
	    extends ADomainBuilder<ET, BT> {

	// private & protected

	protected Integer id;

	private Integer getId() {
	    return id;
	}

	private void setId(final Integer id) {
	    this.id = id;
	}

	// constructor

	protected AEntityBuilder() {
	}

	protected AEntityBuilder(final ET source) {
	    super(source);
	    this.id = source.id;
	}

	// public

	public BT withId(final Integer id) {
	    setBuilderPropertyNumber("id", this::getId, this::setId, id);
	    return _this();
	}
    }

    @Override
    public Object clone() {
	try {
	    return super.clone();
	} catch (final CloneNotSupportedException e) {
	    throw new RuntimeException(e);
	}
    }

    public <T> T clone(final Class<T> clazz) {
	final Object cloned = clone();
	return MyObjects.requireA(cloned, clazz);
    }

    // constructor

    protected AEntity(final Integer id) {
	this.id = id;
    }

    protected AEntity() {
	id = null;
    }

    // id

    final Integer id;

    public Integer getId() {
	return id;
    }
}
