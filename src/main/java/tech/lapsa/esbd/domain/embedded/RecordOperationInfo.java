package tech.lapsa.esbd.domain.embedded;

import java.time.Instant;

import tech.lapsa.esbd.domain.ADomain;
import tech.lapsa.esbd.domain.complex.UserEntity;
import tech.lapsa.java.commons.function.MyObjects;
import tech.lapsa.patterns.domain.HashCodePrime;

@HashCodePrime(257)
public class RecordOperationInfo extends ADomain {

    private static final long serialVersionUID = 1L;

    public static final RecordOperationInfoBuilder builder() {
	return new RecordOperationInfoBuilder();
    }

    public static final RecordOperationInfoBuilder builder(final RecordOperationInfo source) {
	MyObjects.requireNonNull(source, "source");
	return new RecordOperationInfoBuilder(source);
    }

    public static final class RecordOperationInfoBuilder
	    extends ADomainBuilder<RecordOperationInfo, RecordOperationInfoBuilder> {

	// private & protected

	protected Instant instant;

	private Instant getInstant() {
	    return instant;
	}

	private void setInstant(final Instant instant) {
	    this.instant = instant;
	}

	protected UserEntity author;

	private UserEntity getAuthor() {
	    return author;
	}

	private void setAuthor(final UserEntity author) {
	    this.author = author;
	}

	@Override
	protected RecordOperationInfoBuilder _this() {
	    return this;
	}

	// constructor

	protected RecordOperationInfoBuilder() {
	}

	protected RecordOperationInfoBuilder(final RecordOperationInfo source) {
	    super(source);
	    instant = source.instant;
	    author = source.author;
	}

	// public

	public RecordOperationInfoBuilder withInstant(final Instant instant) {
	    setBuilderProperty("instant", this::getInstant, this::setInstant, instant);
	    return this;
	}

	public RecordOperationInfoBuilder withAuthor(final UserEntity author) {
	    setBuilderProperty("author", this::getAuthor, this::setAuthor, author);
	    return this;
	}

	@Override
	public RecordOperationInfo build() {
	    return new RecordOperationInfo(instant,
		    author);
	}
    }

    // constructor

    protected RecordOperationInfo(final Instant instant,
	    final UserEntity author) {
	this.instant = instant;
	this.author = author;
    }

    protected RecordOperationInfo() {
	instant = null;
	author = null;
    }

    // res

    final Instant instant;

    public Instant getInstant() {
	return instant;
    }

    // author

    final UserEntity author;

    public UserEntity getAuthor() {
	return author;
    }
}
