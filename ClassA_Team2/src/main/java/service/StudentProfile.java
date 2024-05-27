package service;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity//データベース追加する
//このエンティティに関連付けられたデータベーステーブルの名前を指定
@Table(name = "StudentProfile")
public class StudentProfile {
		
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column
	    private int id;
	    
	    @Column
	    private String StudentName;
	    
	    @Column
	    private int StudentGrade;
	    
	    @Column
	    private int StudentClass;
	    
	    @Column
	    private int StudentNumber;

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getStudentName() {
			return StudentName;
		}

		public void setStudentName(String studentName) {
			StudentName = studentName;
		}

		public int getStudentGrade() {
			return StudentGrade;
		}

		public void setStudentGrade(int studentGrade) {
			StudentGrade = studentGrade;
		}

		public int getStudentClass() {
			return StudentClass;
		}

		public void setStudentClass(int studentClass) {
			StudentClass = studentClass;
		}

		public int getStudentNumber() {
			return StudentNumber;
		}

		public void setStudentNumber(int studentNumber) {
			StudentNumber = studentNumber;
		}
}
