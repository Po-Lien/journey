package idv.cpl.springboot.Vo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

@Entity
@Table(name="tourism")
public class tourismVo {
	@javax.persistence.Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer Id;
	@Column
	private String startTime;
	@Column
	private String endTime;
	@Column
	private String place;
	@Column
	private String address;
	@Column
	private String stayTime;
	@Column
	private Integer daysId;
	
	
	
	
	
	@Override
	public String toString() {
		return "tourismVo [Id=" + Id + ", startTime=" + startTime + ", endTime=" + endTime + ", place=" + place
				+ ", address=" + address + ", stayTime=" + stayTime + ", daysId=" + daysId + "]";
	}
	
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public String getEndTime() {
		return endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getStayTime() {
		return stayTime;
	}
	public void setStayTime(String stayTime) {
		this.stayTime = stayTime;
	}
	public Integer getDaysId() {
		return daysId;
	}
	public void setDaysId(Integer daysId) {
		this.daysId = daysId;
	}
}
