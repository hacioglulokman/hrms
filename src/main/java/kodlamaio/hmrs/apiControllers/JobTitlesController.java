package kodlamaio.hmrs.apiControllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hmrs.business.abstracts.JobTitleService;
import kodlamaio.hmrs.entities.concretes.JobTitle;


@RestController
@RequestMapping("/api/jobtitles")
@CrossOrigin

public class JobTitlesController {
	
	@Autowired
	private JobTitleService jobTitleService;

	public JobTitlesController(JobTitleService jobTitleService) {
		super();
		this.jobTitleService = jobTitleService;
		
	}
	
	@GetMapping("/getall")
	public List<JobTitle>getAll(){
		
		return this.jobTitleService.getAll();

}
	
	
	
	
	

}
