package tech.lapsa.esbd.domain.embedded;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import com.lapsa.international.country.Country;
import com.lapsa.kz.country.KZCity;

import tech.lapsa.esbd.domain.ADomain;
import tech.lapsa.patterns.domain.HashCodePrime;

@Embeddable
@HashCodePrime(281)
public class OriginInfo extends ADomain {

    private static final long serialVersionUID = 1L;

    public static final OriginInfoBuilder builder() {
	return new OriginInfoBuilder();
    }

    public static final class OriginInfoBuilder
	    extends ADomainBuilder<OriginInfo, OriginInfoBuilder> {

	// private

	private Country country;

	private Country getCountry() {
	    return country;
	}

	private void setCountry(Country country) {
	    this.country = country;
	}

	private KZCity city;

	private KZCity getCity() {
	    return city;
	}

	private void setCity(KZCity city) {
	    this.city = city;
	}

	@Override
	protected OriginInfoBuilder _this() {
	    return this;
	}

	private OriginInfoBuilder() {
	}

	// public

	public OriginInfoBuilder withCountry(final Country country) {
	    setIfNullOrThrow("country", this::getCountry, this::setCountry, country);
	    return this;
	}

	public OriginInfoBuilder withCity(final KZCity city) {
	    setIfNullOrThrow("city", this::getCity, this::setCity, city);
	    return this;
	}

	@Override
	public OriginInfo build() {
	    return new OriginInfo(country, city);
	}
    }

    // constructor

    private OriginInfo(final Country country,
	    final KZCity city) {
	this.country = country;
	this.city = city;
    }

    protected OriginInfo() {
	this.country = null;
	this.city = null;
    }

    // country

    @Basic
    @Enumerated(EnumType.STRING)
    @Column(name = "ORIGIN_COUNTRY")
    private final Country country;

    public Country getCountry() {
	return country;
    }

    // city

    @Basic
    @Enumerated(EnumType.STRING)
    @Column(name = "ORIGIN_CITY")
    private final KZCity city;

    public KZCity getCity() {
	return city;
    }
}
