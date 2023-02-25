package in.surendra.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="ELIGIBILITY_dETAILS")
@Data
public class EligibilityDetails {
	
	@Id
	private Integer eliId;
	private String name;
	private Long mobile;
	private String email;
	private Character gender;
	private Long ssn;
	private String planName;
	private String planStatus;
	private LocalDate planStartDate;
	private LocalDate planEndDate;
	private LocalDate CreatedDate;
	private LocalDate UpdatedDate;
	private String createdBy;
	private String updatedBy;

}
