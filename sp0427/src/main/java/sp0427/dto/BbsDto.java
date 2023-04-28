package sp0427.dto;

import java.sql.Date;

public class BbsDto {

	private int no;
	private String title, writer_id, content;
	private Date date;
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getWriter_id() {
		return writer_id;
	}
	public void setWriter_id(String writer_id) {
		this.writer_id = writer_id;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "BbsDto [no=" + no + ", title=" + title + ", writer_id=" + writer_id + ", content=" + content + ", date="
				+ date + "]";
	}
	
	
}
