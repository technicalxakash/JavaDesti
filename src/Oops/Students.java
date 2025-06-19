package Oops;

public class Students {
	private int id;
	private String name;
	private String grade;
	

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public Students(int id, String name, String grade) {
		
		this.id = id;
		this.name = name;
		this.grade = grade;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getGrade() {
		return grade;
	}


	public void setGrade(String grade) {
		this.grade = grade;
	}


	@Override
	public String toString() {
		return "Students [id=" + id + ", name=" + name + ", grade=" + grade + "]";
	}
	
	



}
