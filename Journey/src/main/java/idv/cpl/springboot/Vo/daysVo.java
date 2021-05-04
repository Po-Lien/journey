package idv.cpl.springboot.Vo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

//@Entity的Bean是告訴Spring這是數據模型層的宣告
//
//@Table name: Table的name對映到資料庫中的資料表名稱
//
//@Column name: 對應到Table的欄位中的欄位名稱
//
//@Id : 是此資料表的Primary Key
//
//@GeneratedValue : 告訴此Column的生成方式 ,如果設定成GenerationType.AUTO讓容器來自動產生
@Table(name = "days")
@Entity
public class daysVo {
	@javax.persistence.Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer Id;
	@Column
	private String date;
	@Column
	private String day;
	@Column
	private String week;
	@Column
	private Integer titleId;
//	@Column
//	private String title;
	
	
	
	
//	public String getTitle() {
//		return title;", title=" + title + 
//	}
//	public void setTitle(String title) {
//		this.title = title;
//	}
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getDay() {
		return day;
	}
	public void setDay(String day) {
		this.day = day;
	}
	public String getWeek() {
		return week;
	}
	public void setWeek(String week) {
		this.week = week;
	}
	public Integer getTitleId() {
		return titleId;
	}
	public void setTitleId(Integer titleId) {
		this.titleId = titleId;
	}
	@Override
	public String toString() {
		return "days [Id=" + Id + ", date=" + date + ", day=" + day + ", week=" + week + ", titleId=" + titleId + "]";
	}
}
