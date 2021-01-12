package model;
import java.io.Serializable;
import java.time.LocalDate;

public class Ocena implements Serializable {
     /**
	 * 
	 */
	private static final long serialVersionUID = -8697289311571657088L;
	/**
	 * 
	 */
	private Student student;
    private Subject subject;
    private int grade;
    private LocalDate date;
	public Ocena(Student student, Subject subject, int grade, LocalDate date) {
		super();
		this.student = student;
		this.subject = subject;
		this.grade = grade;
		this.date = date;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public Subject getSubject() {
		return subject;
	}
	public void setSubject(Subject subject) {
		this.subject = subject;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
    
	

}
