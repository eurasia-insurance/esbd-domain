package test.entities;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;
import static test.entities.TestConstants.*;

import java.util.List;

import javax.inject.Inject;

import org.junit.Test;

import tech.lapsa.insurance.esbd.NotFound;
import tech.lapsa.insurance.esbd.entities.UserEntity;
import tech.lapsa.insurance.esbd.entities.UserEntityService.UserEntityServiceLocal;
import tech.lapsa.java.commons.exceptions.IllegalArgument;
import test.ArquillianBaseTestCase;

public class UserServiceTestCase extends ArquillianBaseTestCase {

    @Inject
    private UserEntityServiceLocal service;

    @Test
    public void testGetAll() {
	final List<UserEntity> all = service.getAll();
	assertThat(all,
		allOf(
			not(nullValue()),
			not(empty())));
    }

    @Test
    public void testGetById() throws IllegalArgument {
	final List<UserEntity> list = service.getAll();
	for (final UserEntity i : list)
	    try {
		final UserEntity res = service.getById(i.getId());
		assertThat(res, allOf(not(nullValue()), is(i)));
	    } catch (final NotFound e) {
		fail(e.getMessage());
	    }
    }

    @Test(expected = NotFound.class)
    public void testGetById_NotFound() throws NotFound, IllegalArgument {
	service.getById(INVALID_USER_ID);
    }
}
