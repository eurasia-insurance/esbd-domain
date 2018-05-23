package tech.lapsa.esbd.domain;

import java.io.Serializable;
import java.util.function.Consumer;
import java.util.function.Supplier;

import javax.persistence.MappedSuperclass;

import tech.lapsa.java.commons.function.MyNumbers;
import tech.lapsa.java.commons.function.MyObjects;
import tech.lapsa.java.commons.function.MyStrings;
import tech.lapsa.patterns.domain.MyHcEqToStr;

@MappedSuperclass
public abstract class ADomain implements Serializable {

    private static final long serialVersionUID = 1L;

    public static abstract class ADomainBuilder<ET extends ADomain, BT extends ADomainBuilder<ET, BT>> {

	// private & protected

	protected abstract BT _this();

	// constructor

	protected ADomainBuilder() {
	}

	// public

	public abstract ET build();

	public void buildTo(final Consumer<ET> consumer) {
	    consumer.accept(build());
	}

	// static

	protected static <T> T setIfNullOrThrow(final String propertyName,
		final Supplier<T> geter,
		final Consumer<T> seter,
		final T newValue) throws IllegalStateException, IllegalArgumentException {
	    final T oldValue = geter.get();
	    MyObjects.requireNullMsg(IllegalStateException::new, oldValue, "'%1$s' property is already set",
		    propertyName);
	    MyObjects.requireNonNullMsg(IllegalArgumentException::new, newValue, "Null value for '%1$s' property",
		    propertyName);
	    seter.accept(newValue);
	    return newValue;
	}

	protected static <T extends Number> T setNumberIfNullOrThrow(final String propertyName,
		final Supplier<T> geter,
		final Consumer<T> seter,
		final T newValue) {
	    return setIfNullOrThrow(propertyName,
		    geter,
		    seter,
		    MyNumbers.requireNonZeroMsg(IllegalArgumentException::new, newValue,
			    "Zero number value '%1$s' property", propertyName));
	}

	protected static <T extends Number> T setPositiveNumberIfNullOrThrow(final String propertyName,
		final Supplier<T> geter,
		final Consumer<T> seter,
		final T newValue) {
	    return setIfNullOrThrow(propertyName,
		    geter,
		    seter,
		    MyNumbers.requirePositiveMsg(IllegalArgumentException::new, newValue,
			    "Non-positive number value '%1$s' property", propertyName));
	}

	protected static String setStringIfNullOrThrow(final String propertyName,
		final Supplier<String> geter,
		final Consumer<String> seter,
		final String newValue) {
	    return setIfNullOrThrow(propertyName,
		    geter,
		    seter,
		    MyStrings.requireNonEmptyMsg(IllegalArgumentException::new, newValue,
			    "Empty string value '%1$s' property", propertyName));
	}
    }

    // constructor

    protected ADomain() {
    }

    // id

    @Override
    public String toString() {
	return MyHcEqToStr.toString(this);
    }

    @Override
    public final int hashCode() {
	return MyHcEqToStr.hashCode(this);
    }

    @Override
    public final boolean equals(final Object other) {
	return MyHcEqToStr.equals(this, other);
    }
}
