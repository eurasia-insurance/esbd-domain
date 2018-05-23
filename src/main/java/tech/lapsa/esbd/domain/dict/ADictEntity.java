package tech.lapsa.esbd.domain.dict;

import tech.lapsa.esbd.domain.AEntity;

public abstract class ADictEntity extends AEntity {

    private static final long serialVersionUID = 1L;

    public static abstract class ADictEntityBuilder<ET extends ADictEntity, BT extends ADictEntityBuilder<ET, BT>>
	    extends AEntityBuilder<ET, BT> {

	// private & protected

	protected String code;

	private String getCode() {
	    return code;
	}

	private void setCode(String code) {
	    this.code = code;
	}

	protected String name;

	private String getName() {
	    return name;
	}

	private void setName(String name) {
	    this.name = name;
	}

	// constructor

	protected ADictEntityBuilder() {
	}

	// public

	public BT withCode(final String code) {
	    setStringIfNullOrThrow("code", this::getCode, this::setCode, code);
	    return _this();
	}

	public BT withName(final String name) {
	    setStringIfNullOrThrow("name", this::getName, this::setName, name);
	    return _this();
	}
    }

    // constructor

    protected ADictEntity(final Integer id, final String code, final String name) {
	super(id);
	this.code = code;
	this.name = name;
    }

    protected ADictEntity() {
	this.code = null;
	this.name = null;
    }

    // code

    private final String code;

    public String getCode() {
	return code;
    }

    // name

    private final String name;

    public String getName() {
	return name;
    }
}
