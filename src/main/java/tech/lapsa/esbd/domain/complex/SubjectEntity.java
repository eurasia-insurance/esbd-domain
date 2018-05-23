package tech.lapsa.esbd.domain.complex;

import java.util.function.Consumer;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

import com.lapsa.insurance.elements.SubjectType;
import com.lapsa.kz.economic.KZEconomicSector;

import tech.lapsa.esbd.domain.AEntity;
import tech.lapsa.esbd.domain.embedded.ContactInfo;
import tech.lapsa.esbd.domain.embedded.OriginInfo;
import tech.lapsa.kz.taxpayer.TaxpayerNumber;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "SUBJECT")
public abstract class SubjectEntity extends AEntity {

    private static final long serialVersionUID = 1L;

    public abstract static class SubjectEntityBuilder<T extends SubjectEntity, B extends SubjectEntityBuilder<T, B>>
	    extends AEntityBuilder<T, B> {

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
	super(id);
	this.origin = origin;
	this.contact = contact;
	this.taxPayerNumber = taxPayerNumber;
	this.comments = comments;
	this.resident = resident;
	this.idNumber = idNumber;
	this.economicsSector = economicsSector;
    }

    protected SubjectEntity() {
	this.origin = null;
	this.contact = null;
	this.taxPayerNumber = null;
	this.comments = null;
	this.resident = null;
	this.idNumber = null;
	this.economicsSector = null;
    }

    // subjectType

    public abstract SubjectType getSubjectType();

    // origin

    @Embedded
    private final OriginInfo origin;

    public OriginInfo getOrigin() {
	return origin;
    }

    // contact

    @Embedded
    private final ContactInfo contact;

    public ContactInfo getContact() {
	return contact;
    }

    // taxPayerNumber

    @Basic
    @Column(name = "TAX_PAYER_NUMBER")
    private final String taxPayerNumber;

    public String getTaxPayerNumber() {
	return taxPayerNumber;
    }

    // comments

    @Basic
    @Column(name = "COMMENTS")
    private final String comments;

    public String getComments() {
	return comments;
    }

    // resident

    @Basic
    @Column(name = "RESIDENT")
    private final Boolean resident;

    public Boolean isResident() {
	return resident;
    }

    // idNumber

    @Basic
    @Column(name = "ID_NUMBER")
    private final TaxpayerNumber idNumber;

    public TaxpayerNumber getIdNumber() {
	return idNumber;
    }

    // economicsSector

    @Basic
    @Enumerated(EnumType.STRING)
    @Column(name = "ECONOMICS_SECTOR")
    private final KZEconomicSector economicsSector;

    public KZEconomicSector getEconomicsSector() {
	return economicsSector;
    }
}
