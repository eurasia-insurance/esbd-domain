package tech.lapsa.esbd.domain.embedded;

import java.time.LocalDate;

import com.lapsa.insurance.elements.CancelationReason;

import tech.lapsa.esbd.domain.ADomain;
import tech.lapsa.patterns.domain.HashCodePrime;

@HashCodePrime(241)
public class CancelationInfo extends ADomain {

    private static final long serialVersionUID = 1L;

    public static final CancelationInfoBuilder builder() {
	return new CancelationInfoBuilder();
    }

    public static final class CancelationInfoBuilder
	    extends ADomainBuilder<CancelationInfo, CancelationInfoBuilder> {

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

	@Override
	protected CancelationInfoBuilder _this() {
	    return this;
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

	@Override
	public CancelationInfo build() {
	    return new CancelationInfo(dateOf,
		    reason);
	}
    }

    private CancelationInfo(final LocalDate dateOf,
	    final CancelationReason reason) {
	this.dateOf = dateOf;
	this.reason = reason;
    }

    protected CancelationInfo() {
	this.dateOf = null;
	this.reason = null;
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
