package tech.lapsa.esbd.domain.complex;

import java.util.function.Consumer;

import com.lapsa.insurance.elements.SubjectType;
import com.lapsa.kz.economic.KZEconomicSector;

import tech.lapsa.esbd.domain.AEntity;
import tech.lapsa.esbd.domain.embedded.ContactInfo;
import tech.lapsa.esbd.domain.embedded.OriginInfo;
import tech.lapsa.kz.taxpayer.TaxpayerNumber;

public abstract class SubjectEntity extends AEntity {

    private static final long serialVersionUID = 1L;

    public abstract static class SubjectEntityBuilder<T extends SubjectEntity, B extends SubjectEntityBuilder<T, B>>
	    extends AEntityBuilder<T, B> {

	protected Integer id;

	private Integer getId() {
	    return id;
	}

	private void setId(Integer id) {
	    this.id = id;
	}

	protected OriginInfo origin;

	private OriginInfo getOrigin() {
	    return origin;
	}

	private void setOrigin(OriginInfo origin) {
	    this.origin = origin;
	}

	protected ContactInfo contact;

	private ContactInfo getContact() {
	    return contact;
	}

	private void setContact(ContactInfo contact) {
	    this.contact = contact;
	}

	protected String taxPayerNumber;

	private String getTaxPayerNumber() {
	    return taxPayerNumber;
	}

	private void setTaxPayerNumber(String taxPayerNumber) {
	    this.taxPayerNumber = taxPayerNumber;
	}

	protected String comments;

	private String getComments() {
	    return comments;
	}

	private void setComments(String comments) {
	    this.comments = comments;
	}

	protected Boolean resident;

	private Boolean getResident() {
	    return resident;
	}

	private void setResident(Boolean resident) {
	    this.resident = resident;
	}

	protected TaxpayerNumber idNumber;

	private TaxpayerNumber getIdNumber() {
	    return idNumber;
	}

	private void setIdNumber(TaxpayerNumber idNumber) {
	    this.idNumber = idNumber;
	}

	protected KZEconomicSector economicsSector;

	private KZEconomicSector getEconomicsSector() {
	    return economicsSector;
	}

	private void setEconomicsSector(KZEconomicSector economicsSector) {
	    this.economicsSector = economicsSector;
	}

	protected SubjectEntityBuilder() {
	}

	protected abstract B _this();

	// public

	public B withId(final Integer id) {
	    setNumberIfNullOrThrow("id", this::getId, this::setId, id);
	    return _this();
	}

	public B withOrigin(final OriginInfo origin) {
	    setIfNullOrThrow("origin", this::getOrigin, this::setOrigin, origin);
	    return _this();
	}

	public B withContact(final ContactInfo contact) {
	    setIfNullOrThrow("contact", this::getContact, this::setContact, contact);
	    return _this();
	}

	public B withTaxPayerNumber(final String taxPayerNumber) {
	    setIfNullOrThrow("taxPayerNumber", this::getTaxPayerNumber, this::setTaxPayerNumber, taxPayerNumber);
	    return _this();
	}

	public B withComments(final String comments) {
	    setStringIfNullOrThrow("comments", this::getComments, this::setComments, comments);
	    return _this();
	}

	public B withResident(final Boolean resident) {
	    setIfNullOrThrow("resident", this::getResident, this::setResident, resident);
	    return _this();
	}

	public B withIdNumber(final TaxpayerNumber idNumber) {
	    setIfNullOrThrow("idNumber", this::getIdNumber, this::setIdNumber, idNumber);
	    return _this();
	}

	public B withEconomicsSector(final KZEconomicSector economicsSector) {
	    setIfNullOrThrow("economicsSector", this::getEconomicsSector, this::setEconomicsSector, economicsSector);
	    return _this();
	}

	public void buildTo(final Consumer<T> consumer) {
	    consumer.accept(build());
	}

	public abstract T build() throws IllegalArgumentException;
    }

    // constructor

    protected SubjectEntity(final Integer id,
	    final OriginInfo origin,
	    final ContactInfo contact,
	    final String taxPayerNumber,
	    final String comments,
	    final Boolean resident,
	    final TaxpayerNumber idNumber,
	    final KZEconomicSector economicsSector) {
	this.id = id;
	this.origin = origin;
	this.contact = contact;
	this.taxPayerNumber = taxPayerNumber;
	this.comments = comments;
	this.resident = resident;
	this.idNumber = idNumber;
	this.economicsSector = economicsSector;
    }

    // subjectType

    public abstract SubjectType getSubjectType();

    // id

    private final Integer id;

    public Integer getId() {
	return id;
    }

    // origin

    private final OriginInfo origin;

    public OriginInfo getOrigin() {
	return origin;
    }

    // contact

    private final ContactInfo contact;

    public ContactInfo getContact() {
	return contact;
    }

    // taxPayerNumber

    private final String taxPayerNumber;

    public String getTaxPayerNumber() {
	return taxPayerNumber;
    }

    // comments

    private final String comments;

    public String getComments() {
	return comments;
    }

    // resident

    private final Boolean resident;

    public Boolean isResident() {
	return resident;
    }

    // idNumber

    private final TaxpayerNumber idNumber;

    public TaxpayerNumber getIdNumber() {
	return idNumber;
    }

    // economicsSector

    private final KZEconomicSector economicsSector;

    public KZEconomicSector getEconomicsSector() {
	return economicsSector;
    }
}
