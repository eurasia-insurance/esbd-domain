package test.cloning;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;

import java.time.Instant;

import org.junit.Test;

import tech.lapsa.esbd.domain.complex.InsuranceAgentEntity;
import tech.lapsa.esbd.domain.complex.SubjectPersonEntity;
import tech.lapsa.esbd.domain.complex.UserEntity;
import tech.lapsa.esbd.domain.dict.BranchEntity;
import tech.lapsa.esbd.domain.dict.InsuranceCompanyEntity;
import tech.lapsa.esbd.domain.embedded.ContractInfo;
import tech.lapsa.esbd.domain.embedded.RecordOperationInfo;

public class CloneEqualsTest {

    private final static InsuranceAgentEntity ORIGIN = InsuranceAgentEntity.builder()
	    .withBranch(BranchEntity.builder().build())
	    .withContract(ContractInfo.builder().build())
	    .withCreated(RecordOperationInfo.builder().build())
	    .withId(Integer.valueOf(1))
	    .withInsurer(InsuranceCompanyEntity.builder().build())
	    .withLetterOfAttorneyNumber("ADAS")
	    .withModified(RecordOperationInfo.builder().build())
	    .withOwner(UserEntity.builder().build())
	    .withSubject(SubjectPersonEntity.builder().build())
	    .build();

    @Test
    public void simpleTest() {
	final InsuranceAgentEntity b = ORIGIN;

	assertThat(b, allOf(sameInstance(ORIGIN), equalTo(ORIGIN)));
    }

    @Test
    public void clonedInstanceTest() {
	final Object b = ORIGIN.clone();

	assertThat(b, allOf(instanceOf(InsuranceAgentEntity.class), not(sameInstance(ORIGIN)), equalTo(ORIGIN)));
    }

    @Test
    public void clonedToTypeInstanceTest() {
	final InsuranceAgentEntity b = ORIGIN.clone(InsuranceAgentEntity.class);

	assertThat(b, allOf(not(sameInstance(ORIGIN)), equalTo(ORIGIN)));
    }

    @Test(expected = IllegalArgumentException.class)
    public void clonedToTypeInstanceTestFailure() {
	ORIGIN.clone(String.class);
    }

    @Test
    public void similarInstanceTest() {
	final InsuranceAgentEntity b = InsuranceAgentEntity.builder()
		.withBranch(BranchEntity.builder().build())
		.withContract(ContractInfo.builder().build())
		.withCreated(RecordOperationInfo.builder().build())
		.withId(Integer.valueOf(1))
		.withInsurer(InsuranceCompanyEntity.builder().build())
		.withLetterOfAttorneyNumber("ADAS")
		.withModified(RecordOperationInfo.builder().build())
		.withOwner(UserEntity.builder().build())
		.withSubject(SubjectPersonEntity.builder().build())
		.build();

	assertThat(b, allOf(not(sameInstance(ORIGIN)), equalTo(ORIGIN)));
    }

    @Test
    public void changedInstanceTest1() {
	final InsuranceAgentEntity b = InsuranceAgentEntity.builder()
		.withBranch(BranchEntity.builder().build())
		.withContract(ContractInfo.builder().build())
		.withCreated(RecordOperationInfo.builder().withInstant(Instant.now()).build()) // different
											       // timestamp
		.withId(Integer.valueOf(1))
		.withInsurer(InsuranceCompanyEntity.builder().build())
		.withLetterOfAttorneyNumber("ADAS")
		.withModified(RecordOperationInfo.builder().build())
		.withOwner(UserEntity.builder().build())
		.withSubject(SubjectPersonEntity.builder().build())
		.build();

	assertThat(b, allOf(not(sameInstance(ORIGIN)), not(equalTo(ORIGIN))));
    }

    @Test
    public void changedInstanceTest2() {
	final InsuranceAgentEntity b = InsuranceAgentEntity.builder()
		.withBranch(BranchEntity.builder().build())
		.withContract(ContractInfo.builder().build())
		.withCreated(RecordOperationInfo.builder().build())
		.withId(Integer.valueOf(2)) // different id
		.withInsurer(InsuranceCompanyEntity.builder().build())
		.withLetterOfAttorneyNumber("ADAS")
		.withModified(RecordOperationInfo.builder().build())
		.withOwner(UserEntity.builder().build())
		.withSubject(SubjectPersonEntity.builder().build())
		.build();

	assertThat(b, allOf(not(sameInstance(ORIGIN)), not(equalTo(ORIGIN))));
    }
}
