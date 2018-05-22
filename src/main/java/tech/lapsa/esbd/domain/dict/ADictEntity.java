package tech.lapsa.esbd.domain.dict;

import java.util.function.Consumer;

import tech.lapsa.esbd.domain.AEntity;
import tech.lapsa.java.commons.function.MyFunctions.TriFunction;

public abstract class ADictEntity extends AEntity {

    private static final long serialVersionUID = 1L;

    public static abstract class DictionaryEntityBuilder<T extends ADictEntity> {

	protected final TriFunction<Integer, String, String, T> constructor;

	// private

	protected Integer id;

	private Integer getId() {
	    return id;
	}

	private void setId(Integer id) {
	    this.id = id;
	}

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

	protected DictionaryEntityBuilder(final TriFunction<Integer, String, String, T> constructor) {
	    assert constructor != null;
	    this.constructor = constructor;
	}

	// public

	public DictionaryEntityBuilder<T> withId(final Integer id) {
	    setNumberIfNullOrThrow("id", this::getId, this::setId, id);
	    return this;
	}

	public DictionaryEntityBuilder<T> withCode(final String code) {
	    setStringIfNullOrThrow("code", this::getCode, this::setCode, code);
	    return this;
	}

	public DictionaryEntityBuilder<T> withName(final String name) {
	    setStringIfNullOrThrow("name", this::getName, this::setName, name);
	    return this;
	}

	public T build() {
	    return constructor.apply(id, code, name);
	}

	public void buildTo(final Consumer<T> consumer) {
	    consumer.accept(build());
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
