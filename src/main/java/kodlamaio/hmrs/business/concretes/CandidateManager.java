package kodlamaio.hmrs.business.concretes;

import kodlamaio.hmrs.business.abstracts.BaseUserManager;
import kodlamaio.hmrs.entities.concretes.Candidates;

public class CandidateManager extends BaseUserManager {

	@Override
	public void save(Candidates candidates) {
		System.out.println("candidate save to dataBase" + candidates.getFirstName());
		
	}
	
}
