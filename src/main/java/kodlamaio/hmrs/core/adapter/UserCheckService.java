package kodlamaio.hmrs.core.adapter;

import kodlamaio.hmrs.entities.concretes.Candidates;

public interface UserCheckService {
	
	boolean checkIfRealPerson(Candidates candidates);

}
