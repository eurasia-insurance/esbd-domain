package tech.lapsa.esbd.domain.complex;

import com.lapsa.insurance.elements.SubjectType;
import com.lapsa.kz.economic.KZEconomicSector;

import tech.lapsa.esbd.domain.embedded.ContactInfo;
import tech.lapsa.esbd.domain.embedded.IdentityCardInfo;
import tech.lapsa.esbd.domain.embedded.OriginInfo;
import tech.lapsa.esbd.domain.embedded.PersonalInfo;
import tech.lapsa.java.commons.function.MyObjects;
import tech.lapsa.kz.taxpayer.TaxpayerNumber;
import tech.lapsa.patterns.domain.HashCodePrime;

@HashCodePrime(23)
public class SubjectPersonEntity extends SubjectEntity {

    private static final long serialVersionUID = 1L;

    public static final SubjectPersonEntityBuilder builder() {
	return new SubjectPersonEntityBuilder();
    }

    public static final SubjectPersonEntityBuilder builder(final SubjectPersonEntity source) {
	MyObjects.requireNonNull(source, "source");
	return new SubjectPersonEntityBuilder(source);
    }

    public static final class SubjectPersonEntityBuilder
	    extends SubjectEntityBuilder<SubjectPersonEntity, SubjectPersonEntityBuilder> {

	// private & protected

	protected PersonalInfo personal;

	private PersonalInfo getPersonal() {
	    return personal;
	}

	private void setPersonal(PersonalInfo personal) {
	    this.personal = personal;
	}

	protected IdentityCardInfo identityCard;

	private IdentityCardInfo getIdentityCard() {
	    return identityCard;
	}

	private void setIdentityCard(IdentityCardInfo identityCard) {
	    this.identityCard = identityCard;
	}

	@Override
	protected SubjectPersonEntityBuilder _this() {
	    return this;
	}

	// constructor

	protected SubjectPersonEntityBuilder() {
	}

	protected SubjectPersonEntityBuilder(SubjectPersonEntity source) {
	    super(source);
	    this.personal = source.personal;
	    this.identityCard = source.identityCard;
	}

	// public

	public SubjectPersonEntityBuilder withPersonal(final PersonalInfo personal) {
	    setBuilderProperty("personal", this::getPersonal, this::setPersonal, personal);
	    return this;
	}

	public SubjectPersonEntityBuilder withIdentityCard(final IdentityCardInfo identityCard) {
	    setBuilderProperty("identityCard", this::getIdentityCard, this::setIdentityCard, identityCard);
	    return this;
	}

	@Override
	public SubjectPersonEntity build() throws IllegalArgumentException {
	    return new SubjectPersonEntity(id,
		    origin,
		    contact,
		    taxPayerNumber,
		    comments,
		    resident,
		    idNumber,
		    economicsSector,
		    personal,
		    identityCard);
	}
    }

    // constructor

    protected SubjectPersonEntity(final Integer id,
	    final OriginInfo origin,
	    final ContactInfo contact,
	    final String taxPayerNumber,
	    final String comments,
	    final Boolean resident,
	    final TaxpayerNumber idNumber,
	    final KZEconomicSector economicsSector,
	    final PersonalInfo personal,
	    final IdentityCardInfo identityCard) {
	super(id, origin, contact, taxPayerNumber, comments, resident, idNumber, economicsSector);
	this.personal = personal;
	this.identityCard = identityCard;
    }

    protected SubjectPersonEntity() {
	this.personal = null;
	this.identityCard = null;
    }

    // subjectType

    @Override
    public SubjectType getSubjectType() {
	return SubjectType.PERSON;
    }

    // personal

    final PersonalInfo personal;

    public PersonalInfo getPersonal() {
	return personal;
    }

    // identityCard

    final IdentityCardInfo identityCard;

    public IdentityCardInfo getIdentityCard() {
	return identityCard;
    }
}
