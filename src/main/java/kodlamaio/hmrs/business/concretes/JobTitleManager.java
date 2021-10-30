package kodlamaio.hmrs.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import kodlamaio.hmrs.business.abstracts.JobTitleService;
import kodlamaio.hmrs.dataAccess.abstracts.JobTitleDao;
import kodlamaio.hmrs.entities.concretes.JobTitle;

@Service

public class JobTitleManager implements JobTitleService{
	
	
	private JobTitleDao jobtitleDao;
	
    @Autowired
	public JobTitleManager(JobTitleDao jobtitleDao) {
		super();
		this.jobtitleDao = jobtitleDao;
	}


	@Override
	public List<JobTitle> getAll() {
	
		return jobtitleDao.findAll();

}
}