package idv.cpl.springboot.Vo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "journeys")
@Entity
public class journeysVo {
	
	@Column
	private String owner;
	@Column
	private String title;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer titleId;
	
	
	
	
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Integer getTitleId() {
		return titleId;
	}
	public void setTitleId(Integer titleId) {
		this.titleId = titleId;
	}
	@Override
	public String toString() {
		return "journeysVo [owner=" + owner + ", title=" + title + ", titleId=" + titleId + "]";
	}
}
