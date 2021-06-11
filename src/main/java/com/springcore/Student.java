package com.springcore;

public class Student {
private String studentId;
private String studentName;
private String studentAdress;
public Student() {
	super();
	// TODO Auto-generated constructor stub
}
public Student(String studentId, String studentName, String studentAdress) {
	super();
	this.studentId = studentId;
	this.studentName = studentName;
	this.studentAdress = studentAdress;
}
@Override
public String toString() {
	return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentAdress=" + studentAdress
			+ "]";
}
public String getStudentId() {
	return studentId;
}
public void setStudentId(String studentId) {
	this.studentId = studentId;
}
public String getStudentName() {
	return studentName;
}
public void setStudentName(String studentName) {
	this.studentName = studentName;
}
public String getStudentAdress() {
	return studentAdress;
}
public void setStudentAdress(String studentAdress) {
	this.studentAdress = studentAdress;
}

}
