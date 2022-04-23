package com.edu;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="hqlemployee")


public class EmployeeHQL {
	@Id
	private int eid;
	private String ename;
	private float esalary;
	private String eaddress;
	private int deptno;
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public float getEsalary() {
		return esalary;
	}
	public void setEsalary(float esalary) {
		this.esalary = esalary;
	}
	public String getEaddress() {
		return eaddress;
	}
	public void setEaddress(String eaddress) {
		this.eaddress = eaddress;
	}
	public int getDeptno() {
		return deptno;
	}
	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
	public EmployeeHQL(int eid, String ename, float esalary, String eaddress, int deptno) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.esalary = esalary;
		this.eaddress = eaddress;
		this.deptno = deptno;
	}
	public EmployeeHQL() {
		super();
	}
	@Override
	public String toString() {
		return "EmployeeHQL [eid=" + eid + ", ename=" + ename + ", esalary=" + esalary + ", eaddress=" + eaddress
				+ ", deptno=" + deptno + "]";
	}
	
	
	
	

}
