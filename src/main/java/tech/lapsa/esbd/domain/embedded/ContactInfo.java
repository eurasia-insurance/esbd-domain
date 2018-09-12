package tech.lapsa.esbd.domain.embedded;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

import com.lapsa.international.phone.PhoneNumber;

import tech.lapsa.esbd.domain.ADomain;
import tech.lapsa.java.commons.function.MyObjects;
import tech.lapsa.patterns.domain.HashCodePrime;

@Embeddable
@HashCodePrime(251)
public class ContactInfo extends ADomain {

    private static final long serialVersionUID = 1L;

    public static final ContactInfoBuilder builder() {
	return new ContactInfoBuilder();
    }

    public static final ContactInfoBuilder builder(final ContactInfo source) {
	MyObjects.requireNonNull(source, "source");
	return new ContactInfoBuilder(source);
    }

    public static final class ContactInfoBuilder
	    extends ADomainBuilder<ContactInfo, ContactInfoBuilder> {

	// private & protected

	protected PhoneNumber phone;

	private PhoneNumber getPhone() {
	    return phone;
	}

	private void setPhone(final PhoneNumber phone) {
	    this.phone = phone;
	}

	protected String email;

	private String getEmail() {
	    return email;
	}

	private void setEmail(final String email) {
	    this.email = email;
	}

	protected String homeAdress;

	private String getHomeAdress() {
	    return homeAdress;
	}

	private void setHomeAdress(final String homeAdress) {
	    this.homeAdress = homeAdress;
	}

	protected String siteUrl;

	private String getSiteUrl() {
	    return siteUrl;
	}

	private void setSiteUrl(final String siteUrl) {
	    this.siteUrl = siteUrl;
	}

	@Override
	protected ContactInfoBuilder _this() {
	    return this;
	}

	// constructor

	protected ContactInfoBuilder() {
	}

	protected ContactInfoBuilder(final ContactInfo source) {
	    super(source);
	    phone = source.phone;
	    email = source.email;
	    homeAdress = source.homeAdress;
	    siteUrl = source.siteUrl;
	}

	// public

	public ContactInfoBuilder withPhone(final PhoneNumber phone) {
	    setBuilderProperty("phone", this::getPhone, this::setPhone, phone);
	    return this;
	}

	public ContactInfoBuilder withEmail(final String email) {
	    setStringIfNullOrThrow("email", this::getEmail, this::setEmail, email);
	    return this;
	}

	public ContactInfoBuilder withHomeAdress(final String homeAdress) {
	    setStringIfNullOrThrow("homeAdress", this::getHomeAdress, this::setHomeAdress, homeAdress);
	    return this;
	}

	public ContactInfoBuilder withSiteUrl(final String siteUrl) {
	    setStringIfNullOrThrow("siteUrl", this::getSiteUrl, this::setSiteUrl, siteUrl);
	    return this;
	}

	@Override
	public ContactInfo build() {
	    return new ContactInfo(phone,
		    email,
		    homeAdress,
		    siteUrl);
	}
    }

    // constructor

    protected ContactInfo(final PhoneNumber phone,
	    final String email,
	    final String homeAdress,
	    final String siteUrl) {
	this.phone = phone;
	this.email = email;
	this.homeAdress = homeAdress;
	this.siteUrl = siteUrl;
    }

    protected ContactInfo() {
	phone = null;
	email = null;
	homeAdress = null;
	siteUrl = null;
    }

    // phone

    @Basic
    @Column(name = "CONTACT_PHONE")
    final PhoneNumber phone;

    public PhoneNumber getPhone() {
	return phone;
    }

    // email

    @Basic
    @Column(name = "CONTACT_EMAIL")
    final String email;

    public String getEmail() {
	return email;
    }

    // homeAdress

    @Basic
    @Column(name = "CONTACT_HOME_ADDRESS")
    final String homeAdress;

    public String getHomeAdress() {
	return homeAdress;
    }

    // siteUrl

    @Basic
    @Column(name = "CONTACT_SITE_URL")
    final String siteUrl;

    public String getSiteUrl() {
	return siteUrl;
    }
}
