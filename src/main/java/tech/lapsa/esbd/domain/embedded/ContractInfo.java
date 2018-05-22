package tech.lapsa.esbd.domain.embedded;

import java.time.LocalDate;
import java.util.function.Consumer;

import tech.lapsa.esbd.domain.AEntity;
import tech.lapsa.patterns.domain.HashCodePrime;

@HashCodePrime(239)
public class ContractInfo extends AEntity {

    private static final long serialVersionUID = 1L;

    public static final ContractInfoBuilder builder() {
	return new ContractInfoBuilder();
    }

    public static final class ContractInfoBuilder {

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

	public ContractInfo build() {
	    return new ContractInfo(number,
		    dateOf);
	}

	public void buildTo(final Consumer<ContractInfo> consumer) {
	    consumer.accept(build());
	}
    }

    // constructor

    private ContractInfo(final String number,
	    final LocalDate dateOf) {
	this.number = number;
	this.dateOf = dateOf;
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
