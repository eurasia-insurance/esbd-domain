package tech.lapsa.esbd.domain.embedded;

import java.time.LocalDate;

import tech.lapsa.esbd.domain.ADomain;
import tech.lapsa.patterns.domain.HashCodePrime;

@HashCodePrime(239)
public class ContractInfo extends ADomain {

    private static final long serialVersionUID = 1L;

    public static final ContractInfoBuilder builder() {
	return new ContractInfoBuilder();
    }

    public static final class ContractInfoBuilder
	    extends ADomainBuilder<ContractInfo, ContractInfoBuilder> {

	// private

	private String number;

	private String getNumber() {
	    return number;
	}

	private void setNumber(String number) {
	    this.number = number;
	}

	private LocalDate dateOf;

	private LocalDate getDateOf() {
	    return dateOf;
	}

	private void setDateOf(LocalDate dateOf) {
	    this.dateOf = dateOf;
	}

	@Override
	protected ContractInfoBuilder _this() {
	    return this;
	}

	private ContractInfoBuilder() {
	}

	// public

	public ContractInfoBuilder withNumber(final String number) {
	    setStringIfNullOrThrow("number", this::getNumber, this::setNumber, number);
	    return this;
	}

	public ContractInfoBuilder withDateOf(LocalDate dateOf) {
	    setIfNullOrThrow("dateOf", this::getDateOf, this::setDateOf, dateOf);
	    return this;
	}

	@Override
	public ContractInfo build() {
	    return new ContractInfo(number,
		    dateOf);
	}
    }

    // constructor

    private ContractInfo(final String number,
	    final LocalDate dateOf) {
	this.number = number;
	this.dateOf = dateOf;
    }

    protected ContractInfo() {
	this.number = null;
	this.dateOf = null;
    }

    // certificateNumber

    private final String number;

    public final String getNumber() {
	return number;
    }

    // certificateValidFrom

    private final LocalDate dateOf;

    public LocalDate getDateOf() {
	return dateOf;
    }
}
