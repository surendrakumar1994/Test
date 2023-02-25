package in.surendra.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import in.surendra.EligibilityDetailsRepo;
import in.surendra.entity.EligibilityDetails;



@Component
public class AppRunner implements ApplicationRunner {
	
	
	@Autowired
	private EligibilityDetailsRepo repo;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		
	EligibilityDetails entity1=new EligibilityDetails();
	
	entity1.setEliId(1);
	entity1.setName("John");
	entity1.setMobile((long) 12345551);
	entity1.setGender('M');
	entity1.setSsn((long)666856592);
	entity1.setPlanName("SNAP");
	entity1.setPlanStatus("approved");
	
	repo.save(entity1);
	
EligibilityDetails entity2=new EligibilityDetails();
	
	entity2.setEliId(2);
	entity2.setName("Ravi");
    entity2.setMobile((long)12356855);
	entity2.setGender('M');
	entity2.setSsn((long)666566592);
	entity2.setPlanName("CCAP");
	entity2.setPlanStatus("Denied");
	
	repo.save(entity2);
	
EligibilityDetails entity3=new EligibilityDetails();
	
	entity3.setEliId(3);
	entity3.setName("Shivansh");
	entity3.setMobile((long)123563155);
	entity3.setGender('M');
	entity3.setSsn((long)666568992);
	entity3.setPlanName("Medicaid");
	entity3.setPlanStatus("closed");
	
	repo.save(entity3);
		
	}

}
