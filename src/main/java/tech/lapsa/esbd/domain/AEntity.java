package tech.lapsa.esbd.domain;

import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class AEntity extends ADomain {

    private static final long serialVersionUID = 1L;

    public static abstract class AEntityBuilder<ET extends ADomain, BT extends AEntityBuilder<ET, BT>>
	    extends ADomainBuilder<ET, BT> {

	// private & protected

	protected Integer id;

	private Integer getId() {
	    return id;
	}

	private void setId(Integer id) {
	    this.id = id;
	}

	protected abstract BT _this();

	// constructor

	protected AEntityBuilder() {
	}

	// public

	public BT withId(final Integer id) {
	    setNumberIfNullOrThrow("id", this::getId, this::setId, id);
	    return _this();
	}
    }

    // constructor

    protected AEntity(Integer id) {
	this.id = id;
    }

    protected AEntity() {
	this.id = null;
    }

    // id

    @Id
    private final Integer id;

    public Integer getId() {
	return id;
    }
}
