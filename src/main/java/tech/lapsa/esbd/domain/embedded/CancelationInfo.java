package tech.lapsa.esbd.domain.embedded;

import java.time.LocalDate;
import java.util.function.Consumer;

import com.lapsa.insurance.elements.CancelationReason;

import tech.lapsa.esbd.domain.AEntity;
import tech.lapsa.patterns.domain.HashCodePrime;

@HashCodePrime(241)
public class CancelationInfo extends AEntity {

    private static final long serialVersionUID = 1L;

    public static final CancelationInfoBuilder builder() {
	return new CancelationInfoBuilder();
    }

    public static final class CancelationInfoBuilder {

	// private

	private LocalDate dateOf;

	private LocalDate getDateOf() {
	    return dateOf;
	}

	private void setDateOf(LocalDate dateOf) {
	    this.dateOf = dateOf;
	}

	private CancelationReason reason;

	private CancelationReason getReason() {
	    return reason;
	}

	private void setReason(CancelationReason reason) {
	    this.reason = reason;
	}

	private CancelationInfoBuilder() {
	}

	// public

	public CancelationInfoBuilder withDateOf(final LocalDate dateOf) {
	    setIfNullOrThrow("dateOf", this::getDateOf, this::setDateOf, dateOf);
	    return this;
	}

	public CancelationInfoBuilder withReason(final CancelationReason reason) {
	    setIfNullOrThrow("reason", this::getReason, this::setReason, reason);
	    return this;
	}

	public CancelationInfo build() {
	    return new CancelationInfo(dateOf,
		    reason);
	}

	public void buildTo(final Consumer<CancelationInfo> consumer) {
	    consumer.accept(build());
	}
    }

    private CancelationInfo(final LocalDate dateOf,
	    final CancelationReason reason) {
	this.dateOf = dateOf;
	this.reason = reason;
    }

    // dateOf

    private final LocalDate dateOf;

    public LocalDate getDateOf() {
	return dateOf;
    }

    // reason

    private final CancelationReason reason;

    public CancelationReason getReason() {
	return reason;
    }
}
