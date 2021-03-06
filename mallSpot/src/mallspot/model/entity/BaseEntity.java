package mallspot.model.entity;

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
		this.id = id;
	}
	public  int getId(){
		return id;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public Date getModifiedDate() {
		return modifiedDate;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BaseEntity other = (BaseEntity) obj;
		if (id != other.id)
			return false;
		return true;
	}


	
	
	

}
