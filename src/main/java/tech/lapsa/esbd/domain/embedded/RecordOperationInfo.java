package tech.lapsa.esbd.domain.embedded;

import java.time.Instant;
import java.util.function.Consumer;

import tech.lapsa.esbd.domain.AEntity;
import tech.lapsa.esbd.domain.complex.UserEntity;
import tech.lapsa.patterns.domain.HashCodePrime;

@HashCodePrime(257)
public class RecordOperationInfo extends AEntity {

    private static final long serialVersionUID = 1L;

    public static final RecordOperationInfoBuilder builder() {
	return new RecordOperationInfoBuilder();
    }

    public static final class RecordOperationInfoBuilder {

	// private

	private Instant instant;

	private Instant getInstant() {
	    return instant;
	}

	private void setInstant(Instant instant) {
	    this.instant = instant;
	}

	private UserEntity author;

	private UserEntity getAuthor() {
	    return author;
	}

	private void setAuthor(UserEntity author) {
	    this.author = author;
	}

	private RecordOperationInfoBuilder() {
	}

	// public

	public RecordOperationInfoBuilder withInstant(final Instant instant) {
	    setIfNullOrThrow("instant", this::getInstant, this::setInstant, instant);
	    return this;
	}

	public RecordOperationInfoBuilder withAuthor(final UserEntity author) {
	    setIfNullOrThrow("author", this::getAuthor, this::setAuthor, author);
	    return this;
	}

	public RecordOperationInfo build() {
	    return new RecordOperationInfo(instant,
		    author);
	}

	public void buildTo(final Consumer<RecordOperationInfo> consumer) {
	    consumer.accept(build());
	}
    }

    private RecordOperationInfo(final Instant instant,
	    final UserEntity author) {
	this.instant = instant;
	this.author = author;
    }

    // res

    private final Instant instant;

    public Instant getInstant() {
	return instant;
    }

    // author

    private final UserEntity author;

    public UserEntity getAuthor() {
	return author;
    }
}
