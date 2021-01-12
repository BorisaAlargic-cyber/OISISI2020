package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import enums.CurrentYear;
import enums.Semestar;

public class Subject implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2508998L;
	private String idOfSubject;
	private String nameOfSubject;
	private Semestar semestar;
	private CurrentYear yearOfListening;
	private Professor professor;
	private List<Student> listOfStudentsPassed;
	private List<Student> listOfStudentsFailed;
	public Subject(String idOfSubject, String nameOfSubject, Semestar semestar, CurrentYear yearOfListening,
			Professor professor) {
		super();
		this.idOfSubject = idOfSubject;
		this.nameOfSubject = nameOfSubject;
		this.semestar = semestar;
		this.yearOfListening = yearOfListening;
		this.professor = professor;
		this.listOfStudentsPassed = new ArrayList<Student>();
		this.listOfStudentsFailed= new ArrayList<Student>();
	}

	public Subject() 
	{
		// TODO Auto-generated constructor stub
		this.listOfStudentsPassed= new ArrayList<Student>();
		this.listOfStudentsFailed= new ArrayList<Student>();
	}

	public String getIdOfSubject() {
		return idOfSubject;
	}
	
	public List<Student> getListOfStudentsPassed() {
		return listOfStudentsPassed;
	}

	public void setListOfStudentsPassed(List<Student> listOfStudentsPassed) {
		this.listOfStudentsPassed = listOfStudentsPassed;
	}

	public List<Student> getListOfStudentsFailed() {
		return listOfStudentsFailed;
	}

	public void setListOfStudentsFailed(List<Student> listOfStudentsFailed) {
		this.listOfStudentsFailed = listOfStudentsFailed;
	}

	public void setIdOfSubject(String idOfSubject) {
		this.idOfSubject = idOfSubject;
	}

	public String getNameOfSubject() {
		return nameOfSubject;
	}

	public void setNameOfSubject(String nameOfSubject) {
		this.nameOfSubject = nameOfSubject;
	}

	public Semestar getSemestar() {
		return semestar;
	}

	public void setSemestar(Semestar semestar) {
		this.semestar = semestar;
	}

	public CurrentYear getYearOfListening() {
		return yearOfListening;
	}

	public void setYearOfListening(CurrentYear yearOfListening) {
		this.yearOfListening = yearOfListening;
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	public List<Student> getlistOfStudentsPassed() {
		return listOfStudentsPassed;
	}

	public void setlistOfStudentsPassed(List<Student> listOfStudentsPassed) {
		this.listOfStudentsPassed = listOfStudentsPassed;
	}
	
	
	
}
