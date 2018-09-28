package com.matchzone.upstreamservice.model;


public class Certification {

	private String certificationName;
	private String certificationAuthority;
	private String licenseNumber;
	private Integer durationFrom;
	private Integer durationTo;
	private String certificationURL;

	public String getCertificationName() {
		return certificationName;
	}

	public void setCertificationName(String certificationName) {
		this.certificationName = certificationName;
	}

	public String getCertificationAuthority() {
		return certificationAuthority;
	}

	public void setCertificationAuthority(String certificationAuthority) {
		this.certificationAuthority = certificationAuthority;
	}

	public String getLicenseNumber() {
		return licenseNumber;
	}

	public void setLicenseNumber(String licenseNumber) {
		this.licenseNumber = licenseNumber;
	}

	public Integer getDurationFrom() {
		return durationFrom;
	}

	public void setDurationFrom(Integer durationFrom) {
		this.durationFrom = durationFrom;
	}

	public Integer getDurationTo() {
		return durationTo;
	}

	public void setDurationTo(Integer durationTo) {
		this.durationTo = durationTo;
	}

	public String getCertificationURL() {
		return certificationURL;
	}

	public void setCertificationURL(String certificationURL) {
		this.certificationURL = certificationURL;
	}

	public Certification(String certificationName, String certificationAuthority, String licenseNumber,
			Integer durationFrom, Integer durationTo, String certificationURL) {
		super();
		this.certificationName = certificationName;
		this.certificationAuthority = certificationAuthority;
		this.licenseNumber = licenseNumber;
		this.durationFrom = durationFrom;
		this.durationTo = durationTo;
		this.certificationURL = certificationURL;
	}

	public Certification() {
		super();
	}

}
