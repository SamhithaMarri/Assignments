package com.sam.hibernate.entity;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.Entity;
@Entity
//@Table(name="employee")
public class Employee
{
	@Id
	@Column(name="empid")
	private int empid;
	@Column(name="empname")
	private String empname;
	private double salary;
	@Column(name="deptno")
	private int deptno;
	public Employee() {}
	public Employee(int empid, String empname, double salary, int deptno) {
	
		this.empid = empid;
		this.empname = empname;
		this.salary = salary;
		this.deptno = deptno;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public int getDeptno() {
		return deptno;
	}
	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
}
