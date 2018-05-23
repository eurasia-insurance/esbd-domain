package tech.lapsa.esbd.domain.embedded;

import java.time.Instant;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import tech.lapsa.esbd.domain.ADomain;
import tech.lapsa.esbd.domain.complex.UserEntity;
import tech.lapsa.patterns.domain.HashCodePrime;

@Embeddable
@HashCodePrime(257)
public class RecordOperationInfo extends ADomain {

    private static final long serialVersionUID = 1L;

    public static final RecordOperationInfoBuilder builder() {
	return new RecordOperationInfoBuilder();
    }

    public static final class RecordOperationInfoBuilder
	    extends ADomainBuilder<RecordOperationInfo, RecordOperationInfoBuilder> {

	// private & protected

	protected Instant instant;

	private Instant getInstant() {
	    return instant;
	}

	private void setInstant(Instant instant) {
	    this.instant = instant;
	}

	protected UserEntity author;

	private UserEntity getAuthor() {
	    return author;
	}

	private void setAuthor(UserEntity author) {
	    this.author = author;
	}

	@Override
	protected RecordOperationInfoBuilder _this() {
	    return this;
	}

	// constructor

	protected RecordOperationInfoBuilder() {
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
	this.instant = null;
	this.author = null;
    }

    // instant

    @Basic
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "OPERATION_INSTANT")
    private final Instant instant;

    public Instant getInstant() {
	return instant;
    }

    // author

    @ManyToOne
    @JoinColumn(name = "OPERATION_AUTHOR_ID")
    private final UserEntity author;

    public UserEntity getAuthor() {
	return author;
    }
}
