package tech.lapsa.esbd.domain.dict;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

import tech.lapsa.esbd.domain.AEntity;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@Table(name = "DICTIONARY")
public abstract class ADictEntity extends AEntity {

    private static final long serialVersionUID = 1L;

    public static abstract class ADictEntityBuilder<ET extends ADictEntity, BT extends ADictEntityBuilder<ET, BT>>
	    extends AEntityBuilder<ET, BT> {

	// private & protected

	protected String code;

	private String getCode() {
	    return code;
	}

	private void setCode(String code) {
	    this.code = code;
	}

	protected String name;

	private String getName() {
	    return name;
	}

	private void setName(String name) {
	    this.name = name;
	}

	// constructor

	protected ADictEntityBuilder() {
	}

	// public

	public BT withCode(final String code) {
	    setStringIfNullOrThrow("code", this::getCode, this::setCode, code);
	    return _this();
	}

	public BT withName(final String name) {
	    setStringIfNullOrThrow("name", this::getName, this::setName, name);
	    return _this();
	}
    }

    // constructor

    protected ADictEntity(final Integer id, final String code, final String name) {
	super(id);
	this.code = code;
	this.name = name;
    }

    protected ADictEntity() {
	this.code = null;
	this.name = null;
    }

    // code

    @Basic
    @Column(name = "CODE")
    private final String code;

    public String getCode() {
	return code;
    }

    // name

    @Basic
    @Column(name = "NAME")
    private final String name;

    public String getName() {
	return name;
    }
}
