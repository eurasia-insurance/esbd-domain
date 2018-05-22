package tech.lapsa.esbd.domain.dict;

import tech.lapsa.esbd.domain.AEntity;
import tech.lapsa.java.commons.function.MyFunctions.TriFunction;

public abstract class ADictEntity extends AEntity {

    private static final long serialVersionUID = 1L;

    public static abstract class ADictEntityBuilder<T extends ADictEntity, B extends ADictEntityBuilder<?, ?>>
	    extends AEntityBuilder<T, B> {

	private final TriFunction<Integer, String, String, T> constructor;

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

	protected abstract B _this();

	protected ADictEntityBuilder(final TriFunction<Integer, String, String, T> constructor) {
	    assert constructor != null;
	    this.constructor = constructor;
	}

	// public

	public B withId(final Integer id) {
	    setNumberIfNullOrThrow("id", this::getId, this::setId, id);
	    return _this();
	}

	public B withCode(final String code) {
	    setStringIfNullOrThrow("code", this::getCode, this::setCode, code);
	    return _this();
	}

	public B withName(final String name) {
	    setStringIfNullOrThrow("name", this::getName, this::setName, name);
	    return _this();
	}

	@Override
	public T build() {
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
