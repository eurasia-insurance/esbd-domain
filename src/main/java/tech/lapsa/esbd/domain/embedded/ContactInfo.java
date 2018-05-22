package tech.lapsa.esbd.domain.embedded;

import com.lapsa.international.phone.PhoneNumber;

import tech.lapsa.esbd.domain.AEntity;
import tech.lapsa.patterns.domain.HashCodePrime;

@HashCodePrime(251)
public class ContactInfo extends AEntity {

    private static final long serialVersionUID = 1L;

    public static final ContactInfoBuilder builder() {
	return new ContactInfoBuilder();
    }

    public static final class ContactInfoBuilder
	    extends AEntityBuilder<ContactInfo, ContactInfoBuilder> {

	// private

	private PhoneNumber phone;

	private PhoneNumber getPhone() {
	    return phone;
	}

	private void setPhone(PhoneNumber phone) {
	    this.phone = phone;
	}

	private String email;

	private String getEmail() {
	    return email;
	}

	private void setEmail(String email) {
	    this.email = email;
	}

	private String homeAdress;

	private String getHomeAdress() {
	    return homeAdress;
	}

	private void setHomeAdress(String homeAdress) {
	    this.homeAdress = homeAdress;
	}

	private String siteUrl;

	private String getSiteUrl() {
	    return siteUrl;
	}

	private void setSiteUrl(String siteUrl) {
	    this.siteUrl = siteUrl;
	}

	private ContactInfoBuilder() {
	}

	// public

	public ContactInfoBuilder withPhone(final PhoneNumber phone) {
	    setIfNullOrThrow("phone", this::getPhone, this::setPhone, phone);
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

    private ContactInfo(final PhoneNumber phone,
	    final String email,
	    final String homeAdress,
	    final String siteUrl) {
	this.phone = phone;
	this.email = email;
	this.homeAdress = homeAdress;
	this.siteUrl = siteUrl;
    }

    // phone

    private final PhoneNumber phone;

    public PhoneNumber getPhone() {
	return phone;
    }

    // email

    private final String email;

    public String getEmail() {
	return email;
    }

    // homeAdress

    private final String homeAdress;

    public String getHomeAdress() {
	return homeAdress;
    }

    // siteUrl

    private final String siteUrl;

    public String getSiteUrl() {
	return siteUrl;
    }
}
