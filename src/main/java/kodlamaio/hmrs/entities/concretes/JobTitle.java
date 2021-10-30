package kodlamaio.hmrs.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="job_titles")

public class JobTitle {
	
	@Id
	@GeneratedValue
	@Column(name="job_titles")
	
	private String jobTitle;
	
	
}
