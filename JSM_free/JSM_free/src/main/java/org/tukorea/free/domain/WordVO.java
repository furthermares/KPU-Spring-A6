package org.tukorea.free.domain;

public class WordVO {

	private String w_id;
	private String l_id;
	private String w_title;
	private String w_desc;
	private String w_extra;
	
	public String getW_id() {
		return w_id;
	}
	public void setW_id(String w_id) {
		this.w_id = w_id;
	}
	public String getL_id() {
		return l_id;
	}
	public void setL_id(String l_id) {
		this.l_id = l_id;
	}
	public String getW_title() {
		return w_title;
	}
	public void setW_title(String w_title) {
		this.w_title = w_title;
	}
	public String getW_desc() {
		return w_desc;
	}
	public void setW_desc(String w_desc) {
		this.w_desc = w_desc;
	}
	public String getW_extra() {
		return w_extra;
	}
	public void setW_extra(String w_extra) {
		this.w_extra = w_extra;
	}
	
	@Override
	public String toString() {
		return "WordVO [w_id=" + w_id + ", l_id=" + l_id + ", w_title=" + w_title + ", w_desc=" + w_desc + ", w_extra="
				+ w_extra + "]";
	}

}