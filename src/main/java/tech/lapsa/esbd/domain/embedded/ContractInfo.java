package tech.lapsa.esbd.domain.embedded;

import java.time.LocalDate;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import tech.lapsa.esbd.domain.AEntity;
import tech.lapsa.patterns.domain.HashCodePrime;

@Embeddable
@HashCodePrime(239)
public class ContractInfo extends AEntity {

    private static final long serialVersionUID = 1L;

    public static final ContractInfoBuilder builder() {
	return new ContractInfoBuilder();
    }

    public static final class ContractInfoBuilder
	    extends AEntityBuilder<ContractInfo, ContractInfoBuilder> {

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

    @Basic
    @Column(name = "CONTRACT_NUMBER")
    private final String number;

    public final String getNumber() {
	return number;
    }

    // certificateValidFrom

    @Basic
    @Temporal(TemporalType.DATE)
    @Column(name = "CONTRACT_DATE_OF")
    private final LocalDate dateOf;

    public LocalDate getDateOf() {
	return dateOf;
    }
}
