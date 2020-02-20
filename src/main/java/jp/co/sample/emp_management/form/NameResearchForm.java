package jp.co.sample.emp_management.form;


public class NameResearchForm {

	/** 検索する名前 */
	private String nameResearch;

	public String getNameResearch() {
		return nameResearch;
	}

	@Override
	public String toString() {
		return "nameResearchForm [nameResearch=" + nameResearch + "]";
	}

	public void setNameResearch(String nameResearch) {
		this.nameResearch = nameResearch;
	}

}
