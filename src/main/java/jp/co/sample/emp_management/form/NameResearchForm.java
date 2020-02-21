package jp.co.sample.emp_management.form;

import java.util.List;

import jp.co.sample.emp_management.domain.Employee;

public class NameResearchForm {

	/** 検索する名前 */
	private String nameResearch;

	public String getNameResearch() {
		return nameResearch;
	}

	public void setNameResearch(String nameResearch) {
		this.nameResearch = nameResearch;
	}

	@Override
	public String toString() {
		return "NameResearchForm [nameResearch=" + nameResearch + "]";
	}



}
