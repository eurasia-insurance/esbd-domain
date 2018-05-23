package tech.lapsa.esbd.domain.embedded;

import java.time.LocalDate;

import com.lapsa.insurance.elements.Sex;

import tech.lapsa.esbd.domain.ADomain;
import tech.lapsa.patterns.domain.HashCodePrime;

@HashCodePrime(293)
public class PersonalInfo extends ADomain {

    private static final long serialVersionUID = 1L;

    public static final PersonalInfoBuilder builder() {
	return new PersonalInfoBuilder();
    }

    public static final class PersonalInfoBuilder
	    extends ADomainBuilder<PersonalInfo, PersonalInfoBuilder> {

	// private

	private String name;

	private String getName() {
	    return name;
	}

	private void setName(String name) {
	    this.name = name;
	}

	private String surename;

	private String getSurename() {
	    return surename;
	}

	private void setSurename(String surename) {
	    this.surename = surename;
	}

	private String patronymic;

	private String getPatronymic() {
	    return patronymic;
	}

	private void setPatronymic(String patronymic) {
	    this.patronymic = patronymic;
	}

	private LocalDate dayOfBirth;

	private LocalDate getDayOfBirth() {
	    return dayOfBirth;
	}

	private void setDayOfBirth(LocalDate dayOfBirth) {
	    this.dayOfBirth = dayOfBirth;
	}

	private Sex gender;

	private Sex getGender() {
	    return gender;
	}

	private void setGender(Sex gender) {
	    this.gender = gender;
	}

	@Override
	protected PersonalInfoBuilder _this() {
	    return this;
	}

	private PersonalInfoBuilder() {
	}

	// public

	public PersonalInfoBuilder withName(final String name) {
	    setStringIfNullOrThrow("name", this::getName, this::setName, name);
	    return this;
	}

	public PersonalInfoBuilder withSurename(final String surename) {
	    setStringIfNullOrThrow("surename", this::getSurename, this::setSurename, surename);
	    return this;
	}

	public PersonalInfoBuilder withPatronymic(final String patronymic) {
	    setStringIfNullOrThrow("patronymic", this::getPatronymic, this::setPatronymic, patronymic);
	    return this;
	}

	public PersonalInfoBuilder withDayOfBirth(final LocalDate dayOfBirth) {
	    setIfNullOrThrow("dayOfBirth", this::getDayOfBirth, this::setDayOfBirth, dayOfBirth);
	    return this;
	}

	public PersonalInfoBuilder withGender(final Sex gender) {
	    setIfNullOrThrow("gender", this::getGender, this::setGender, gender);
	    return this;
	}

	@Override
	public PersonalInfo build() {
	    return new PersonalInfo(name,
		    surename,
		    patronymic,
		    dayOfBirth,
		    gender);
	}
    }

    private PersonalInfo(final String name,
	    final String surename,
	    final String patronymic,
	    final LocalDate dayOfBirth,
	    final Sex gender) {
	this.name = name;
	this.surename = surename;
	this.patronymic = patronymic;
	this.dayOfBirth = dayOfBirth;
	this.gender = gender;
    }

    // name

    private final String name;

    public String getName() {
	return name;
    }

    // surename

    private final String surename;

    public String getSurename() {
	return surename;
    }

    // patronymic

    private final String patronymic;

    public String getPatronymic() {
	return patronymic;
    }

    // dayOfBirth

    private final LocalDate dayOfBirth;

    public LocalDate getDayOfBirth() {
	return dayOfBirth;
    }

    // gender

    private final Sex gender;

    public Sex getGender() {
	return gender;
    }
}
