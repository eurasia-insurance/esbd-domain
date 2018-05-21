package tech.lapsa.esbd.domain.dict;

import java.util.function.Consumer;

import tech.lapsa.esbd.domain.AEntity;
import tech.lapsa.java.commons.function.MyFunctions.TriFunction;
import tech.lapsa.java.commons.function.MyNumbers;
import tech.lapsa.java.commons.function.MyStrings;

public abstract class ADictEntity extends AEntity {

    private static final long serialVersionUID = 1L;

    public static abstract class DictionaryEntityBuilder<T extends ADictEntity> {

	protected final TriFunction<Integer, String, String, T> constructor;

	protected DictionaryEntityBuilder(final TriFunction<Integer, String, String, T> constructor) {
	    assert constructor != null;
	    this.constructor = constructor;
	}

	protected Integer id;
	protected String code;
	protected String name;

	public DictionaryEntityBuilder<T> withId(final Integer id) {
	    this.id = MyNumbers.requirePositive(id, "id");
	    return this;
	}

	public DictionaryEntityBuilder<T> withCode(final String code) {
	    this.code = MyStrings.requireNonEmpty(code, "code");
	    return this;
	}

	public DictionaryEntityBuilder<T> withName(final String name) {
	    this.name = MyStrings.requireNonEmpty(name, "name");
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
