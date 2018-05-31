package test.cloning;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;

import org.junit.Test;

import tech.lapsa.esbd.domain.complex.InsuranceAgentEntity;
import tech.lapsa.esbd.domain.complex.SubjectPersonEntity;
import tech.lapsa.esbd.domain.complex.UserEntity;
import tech.lapsa.esbd.domain.dict.BranchEntity;
import tech.lapsa.esbd.domain.dict.InsuranceCompanyEntity;
import tech.lapsa.esbd.domain.embedded.ContractInfo;
import tech.lapsa.esbd.domain.embedded.RecordOperationInfo;

public class BuilderTest {

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
    public void similarInstanceTest() {
	final InsuranceAgentEntity b = InsuranceAgentEntity.builder(ORIGIN).build();

	assertThat(b, allOf(not(sameInstance(ORIGIN)), equalTo(ORIGIN)));
    }

    @Test
    public void changedInstanceTest1() {
	final InsuranceAgentEntity b = InsuranceAgentEntity.builder(ORIGIN)
		.withLetterOfAttorneyNumber("ADAS1")
		.build();

	assertThat(b, allOf(not(sameInstance(ORIGIN)), not(equalTo(ORIGIN))));
    }
}
