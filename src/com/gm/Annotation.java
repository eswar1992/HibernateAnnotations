package com.gm;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employee")
public class Annotation 
{
	@Id
	@Column(name="eid")
	private int eid;
	@Column(name="ename")
	private String ename;
	@Column(name="eaddress")
	private String eaddress;

	public int getEid() 
	{
		return eid;
	}
	public void setEid(int eid) 
	{
		this.eid = eid;
	}
	public String getEname() 
	{
		return ename;
	}
	public void setEname(String ename) 
	{
		this.ename = ename;
	}
	public String getEaddress() 
	{
		return eaddress;
	}
	public void setEaddress(String eaddress) 
	{
		this.eaddress = eaddress;
	}
	

}
