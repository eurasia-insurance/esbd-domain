package tech.lapsa.esbd.domain.dict;

import tech.lapsa.esbd.domain.AEntity;
import tech.lapsa.java.commons.function.MyFunctions.TriFunction;

public abstract class ADictEntity extends AEntity {

    private static final long serialVersionUID = 1L;

    public static abstract class ADictEntityBuilder<ET extends ADictEntity, BT extends ADictEntityBuilder<ET, BT>>
	    extends AEntityBuilder<ET, BT> {

	private final TriFunction<Integer, String, String, ET> constructor;

	// private

	private Integer id;

	private Integer getId() {
	    return id;
	}

	private void setId(Integer id) {
	    this.id = id;
	}

	private String code;

	private String getCode() {
	    return code;
	}

	private void setCode(String code) {
	    this.code = code;
	}

	private String name;

	private String getName() {
	    return name;
	}

	private void setName(String name) {
	    this.name = name;
	}

	protected abstract BT _this();

	protected ADictEntityBuilder(final TriFunction<Integer, String, String, ET> constructor) {
	    assert constructor != null;
	    this.constructor = constructor;
	}

	// public

	public BT withId(final Integer id) {
	    setNumberIfNullOrThrow("id", this::getId, this::setId, id);
	    return _this();
	}

	public BT withCode(final String code) {
	    setStringIfNullOrThrow("code", this::getCode, this::setCode, code);
	    return _this();
	}

	public BT withName(final String name) {
	    setStringIfNullOrThrow("name", this::getName, this::setName, name);
	    return _this();
	}

	@Override
	public ET build() {
	    return constructor.apply(id, code, name);
	}
    }

    // constructor

    protected ADictEntity(final Integer id, final String code, final String name) {
	this.id = id;
	this.code = code;
	this.name = name;
    }

    // id

    private final Integer id;

    public Integer getId() {
	return id;
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
