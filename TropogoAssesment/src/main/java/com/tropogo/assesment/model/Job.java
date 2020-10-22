package com.tropogo.assesment.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "tbl_job")
public class Job {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long jobId;
	
	@NotBlank(message = "companyName can't be blank")
	private String companyName;
	
	@NotBlank(message = "designation can't be blank")
	private String designation;
	
	@NotBlank(message = "discription can't be blank")
	private String discription;
	
	private double ctcInLpa;
	
	private String jobLocation;

	private long minExperience;
	
	private long maxExperience;
	
	@NotBlank(message = "keySkills can't be blank")
	private String keySkills;
	
	@NotBlank(message = "postedUser can't be blank")
	private String postedUser;
	
	@NotBlank(message = "mailId can't be blank")
	@Email(message = "invalid mail format")
	private String mailId;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @NotNull(message = "postedDate can't be blank")
	private Date postedDate;

	public Job(@NotBlank(message = "companyName can't be blank") String companyName,
			@NotBlank(message = "designation can't be blank") String designation,
			@NotBlank(message = "discription can't be blank") String discription, double ctcInLpa, String jobLocation,
			long minExperience, long maxExperience, @NotBlank(message = "keySkills can't be blank") String keySkills,
			@NotBlank(message = "postedUser can't be blank") String postedUser,
			@NotBlank(message = "mailId can't be blank") @Email(message = "invalid mail format") String mailId,
			@NotNull(message = "postedDate can't be blank") Date postedDate) {
		super();
		this.companyName = companyName;
		this.designation = designation;
		this.discription = discription;
		this.ctcInLpa = ctcInLpa;
		this.jobLocation = jobLocation;
		this.minExperience = minExperience;
		this.maxExperience = maxExperience;
		this.keySkills = keySkills;
		this.postedUser = postedUser;
		this.mailId = mailId;
		this.postedDate = postedDate;
	}
	
	public Job() {}

	public long getJobId() {
		return jobId;
	}

	public void setJobId(long jobId) {
		this.jobId = jobId;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getDiscription() {
		return discription;
	}

	public void setDiscription(String discription) {
		this.discription = discription;
	}

	public double getCtcInLpa() {
		return ctcInLpa;
	}

	public void setCtcInLpa(double ctcInLpa) {
		this.ctcInLpa = ctcInLpa;
	}

	public String getJobLocation() {
		return jobLocation;
	}

	public void setJobLocation(String jobLocation) {
		this.jobLocation = jobLocation;
	}

	public long getMinExperience() {
		return minExperience;
	}

	public void setMinExperience(long minExperience) {
		this.minExperience = minExperience;
	}

	public long getMaxExperience() {
		return maxExperience;
	}

	public void setMaxExperience(long maxExperience) {
		this.maxExperience = maxExperience;
	}

	public String getKeySkills() {
		return keySkills;
	}

	public void setKeySkills(String keySkills) {
		this.keySkills = keySkills;
	}

	public String getPostedUser() {
		return postedUser;
	}

	public void setPostedUser(String postedUser) {
		this.postedUser = postedUser;
	}

	public String getMailId() {
		return mailId;
	}

	public void setMailId(String mailId) {
		this.mailId = mailId;
	}

	public Date getPostedDate() {
		return postedDate;
	}

	public void setPostedDate(Date postedDate) {
		this.postedDate = postedDate;
	}	

}
