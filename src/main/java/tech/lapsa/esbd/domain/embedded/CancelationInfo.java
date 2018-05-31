package tech.lapsa.esbd.domain.embedded;

import java.time.LocalDate;

import com.lapsa.insurance.elements.CancelationReason;

import tech.lapsa.esbd.domain.ADomain;
import tech.lapsa.java.commons.function.MyObjects;
import tech.lapsa.patterns.domain.HashCodePrime;

@HashCodePrime(241)
public class CancelationInfo extends ADomain {

    private static final long serialVersionUID = 1L;

    public static final CancelationInfoBuilder builder() {
	return new CancelationInfoBuilder();
    }

    public static final CancelationInfoBuilder builder(final CancelationInfo source) {
	MyObjects.requireNonNull(source, "source");
	return new CancelationInfoBuilder(source);
    }

    public static final class CancelationInfoBuilder
	    extends ADomainBuilder<CancelationInfo, CancelationInfoBuilder> {

	// private & protected

	protected LocalDate dateOf;

	private LocalDate getDateOf() {
	    return dateOf;
	}

	private void setDateOf(final LocalDate dateOf) {
	    this.dateOf = dateOf;
	}

	protected CancelationReason reason;

	private CancelationReason getReason() {
	    return reason;
	}

	private void setReason(final CancelationReason reason) {
	    this.reason = reason;
	}

	@Override
	protected CancelationInfoBuilder _this() {
	    return this;
	}

	// constructor

	protected CancelationInfoBuilder() {
	}

	public CancelationInfoBuilder(final CancelationInfo source) {
	    super(source);
	    dateOf = source.dateOf;
	    reason = source.reason;
	}

	// public

	public CancelationInfoBuilder withDateOf(final LocalDate dateOf) {
	    setBuilderProperty("dateOf", this::getDateOf, this::setDateOf, dateOf);
	    return this;
	}

	public CancelationInfoBuilder withReason(final CancelationReason reason) {
	    setBuilderProperty("reason", this::getReason, this::setReason, reason);
	    return this;
	}

	@Override
	public CancelationInfo build() {
	    return new CancelationInfo(dateOf,
		    reason);
	}
    }

    // constructor

    protected CancelationInfo(final LocalDate dateOf,
	    final CancelationReason reason) {
	this.dateOf = dateOf;
	this.reason = reason;
    }

    protected CancelationInfo() {
	dateOf = null;
	reason = null;
    }

    // dateOf

    final LocalDate dateOf;

    public LocalDate getDateOf() {
	return dateOf;
    }

    // reason

    final CancelationReason reason;

    public CancelationReason getReason() {
	return reason;
    }
}
