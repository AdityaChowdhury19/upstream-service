package com.matchzone.upstreamservice.model;

public class Skills {

	private String iTSkills;
	private String version;
	private String level;
	private String lastUsed;

	public String getiTSkills() {
		return iTSkills;
	}

	public void setiTSkills(String iTSkills) {
		this.iTSkills = iTSkills;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public String getLastUsed() {
		return lastUsed;
	}

	public void setLastUsed(String lastUsed) {
		this.lastUsed = lastUsed;
	}

	public Skills(String iTSkills, String version, String level, String lastUsed) {
		super();
		this.iTSkills = iTSkills;
		this.version = version;
		this.level = level;
		this.lastUsed = lastUsed;
	}

	public Skills() {
		super();
	}

}
