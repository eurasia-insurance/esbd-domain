package test.persistenceUnit;

import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import tech.lapsa.esbd.jpa.EsbdConstants;

@Startup
@Singleton
public class TestBean {

    @PersistenceContext(unitName = EsbdConstants.PERSISTENCE_UNIT_NAME)
    protected EntityManager em;

    public EntityManager getEm() {
	return em;
    }
}
