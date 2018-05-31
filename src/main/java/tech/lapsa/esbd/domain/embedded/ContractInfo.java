package tech.lapsa.esbd.domain.embedded;

import java.time.LocalDate;

import tech.lapsa.esbd.domain.ADomain;
import tech.lapsa.java.commons.function.MyObjects;
import tech.lapsa.patterns.domain.HashCodePrime;

@HashCodePrime(239)
public class ContractInfo extends ADomain {

    private static final long serialVersionUID = 1L;

    public static final ContractInfoBuilder builder() {
	return new ContractInfoBuilder();
    }

    public static final ContractInfoBuilder builder(final ContractInfo source) {
	MyObjects.requireNonNull(source, "source");
	return new ContractInfoBuilder(source);
    }

    public static final class ContractInfoBuilder
	    extends ADomainBuilder<ContractInfo, ContractInfoBuilder> {

	// private & protected

	protected String number;

	private String getNumber() {
	    return number;
	}

	private void setNumber(String number) {
	    this.number = number;
	}

	protected LocalDate dateOf;

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

	// constructor

	protected ContractInfoBuilder() {
	}

	protected ContractInfoBuilder(ContractInfo source) {
	    super(source);
	    this.number = source.number;
	    this.dateOf = source.dateOf;
	}

	// public

	public ContractInfoBuilder withNumber(final String number) {
	    setStringIfNullOrThrow("number", this::getNumber, this::setNumber, number);
	    return this;
	}

	public ContractInfoBuilder withDateOf(LocalDate dateOf) {
	    setBuilderProperty("dateOf", this::getDateOf, this::setDateOf, dateOf);
	    return this;
	}

	@Override
	public ContractInfo build() {
	    return new ContractInfo(number,
		    dateOf);
	}
    }

    // constructor

    protected ContractInfo(final String number,
	    final LocalDate dateOf) {
	this.number = number;
	this.dateOf = dateOf;
    }

    protected ContractInfo() {
	this.number = null;
	this.dateOf = null;
    }

    // certificateNumber

    final String number;

    public final String getNumber() {
	return number;
    }

    // certificateValidFrom

    final LocalDate dateOf;

    public LocalDate getDateOf() {
	return dateOf;
    }
}
