package org.hillel.it.mallspot.model.entity;

import java.util.Date;

public abstract class BaseEntity {
	protected int id;
	private Date createdDate;
	private Date modifiedDate;
	private User createdBy;
	private User modifiedBy;
	public void setCreatedDate(Date createdDate){
		this.createdDate = createdDate;
	}
	
	
	public void setModifiedDate(Date modifiedDate){
		this.modifiedDate = modifiedDate;
	}
	
	public void setCreatedBy(User createdBy){
		this.createdBy = createdBy;
	}
	
	public User getCreatedBy(){
		return createdBy;
	}
	public void setModifiedBy(User modifiedBy){
		this.modifiedBy = modifiedBy;
	}
	
	public User getModifiedBy(){
		return modifiedBy;
	}
	public void setId(int id) {
		this.id = (this.id == 0 ? id : this.id);
	}
	public int getId() {
		return id;
	}
	

}
