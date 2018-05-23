package tech.lapsa.esbd.domain.embedded;

import com.lapsa.international.country.Country;
import com.lapsa.kz.country.KZCity;

import tech.lapsa.esbd.domain.ADomain;
import tech.lapsa.patterns.domain.HashCodePrime;

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

    private final Country country;

    public Country getCountry() {
	return country;
    }

    // city

    private final KZCity city;

    public KZCity getCity() {
	return city;
    }
}
