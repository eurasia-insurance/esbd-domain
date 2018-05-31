package tech.lapsa.esbd.domain.embedded;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import com.lapsa.international.country.Country;
import com.lapsa.kz.country.KZCity;

import tech.lapsa.esbd.domain.ADomain;
import tech.lapsa.java.commons.function.MyObjects;
import tech.lapsa.patterns.domain.HashCodePrime;

@Embeddable
@HashCodePrime(281)
public class OriginInfo extends ADomain {

    private static final long serialVersionUID = 1L;

    public static final OriginInfoBuilder builder() {
	return new OriginInfoBuilder();
    }

    public static final OriginInfoBuilder builder(final OriginInfo source) {
	MyObjects.requireNonNull(source, "source");
	return new OriginInfoBuilder(source);
    }

    public static final class OriginInfoBuilder
	    extends ADomainBuilder<OriginInfo, OriginInfoBuilder> {

	// private & protected

	protected Country country;

	private Country getCountry() {
	    return country;
	}

	private void setCountry(final Country country) {
	    this.country = country;
	}

	protected KZCity city;

	private KZCity getCity() {
	    return city;
	}

	private void setCity(final KZCity city) {
	    this.city = city;
	}

	@Override
	protected OriginInfoBuilder _this() {
	    return this;
	}

	// constructor

	protected OriginInfoBuilder() {
	}

	protected OriginInfoBuilder(final OriginInfo source) {
	    super(source);
	    country = source.country;
	    city = source.city;
	}

	// public

	public OriginInfoBuilder withCountry(final Country country) {
	    setBuilderProperty("country", this::getCountry, this::setCountry, country);
	    return this;
	}

	public OriginInfoBuilder withCity(final KZCity city) {
	    setBuilderProperty("city", this::getCity, this::setCity, city);
	    return this;
	}

	@Override
	public OriginInfo build() {
	    return new OriginInfo(country, city);
	}
    }

    // constructor

    protected OriginInfo(final Country country,
	    final KZCity city) {
	this.country = country;
	this.city = city;
    }

    protected OriginInfo() {
	country = null;
	city = null;
    }

    // country

    @Basic
    @Enumerated(EnumType.STRING)
    @Column(name = "ORIGIN_COUNTRY")
    final Country country;

    public Country getCountry() {
	return country;
    }

    // city

    @Basic
    @Enumerated(EnumType.STRING)
    @Column(name = "ORIGIN_CITY")
    final KZCity city;

    public KZCity getCity() {
	return city;
    }
}
