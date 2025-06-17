package streamAPI_Project;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

public class Student {
	 private String name;
	    private int age;
	    private List<Integer> grades;
	    private List<String> subjects;
	    private String city;
	    private boolean isActive;
	    private Map<String, Double> skillRatings; // Skill name and rating (e.g., "Java" -> 4.5)
	    private LocalDate enrollmentDate;
		
	    
	    public Student(String name, int age, List<Integer> grades, List<String> subjects, String city, boolean isActive,
				Map<String, Double> skillRatings, LocalDate enrollmentDate) {
			super();
			this.name = name;
			this.age = age;
			this.grades = grades;
			this.subjects = subjects;
			this.city = city;
			this.isActive = isActive;
			this.skillRatings = skillRatings;
			this.enrollmentDate = enrollmentDate;
		}
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public List<Integer> getGrades() {
			return grades;
		}
		public void setGrades(List<Integer> grades) {
			this.grades = grades;
		}
		public List<String> getSubjects() {
			return subjects;
		}
		public void setSubjects(List<String> subjects) {
			this.subjects = subjects;
		}
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		public boolean isActive() {
			return isActive;
		}
		public void setActive(boolean isActive) {
			this.isActive = isActive;
		}
		public Map<String, Double> getSkillRatings() {
			return skillRatings;
		}
		public void setSkillRatings(Map<String, Double> skillRatings) {
			this.skillRatings = skillRatings;
		}
		public LocalDate getEnrollmentDate() {
			return enrollmentDate;
		}
		public void setEnrollmentDate(LocalDate enrollmentDate) {
			this.enrollmentDate = enrollmentDate;
		}

		@Override
		public String toString() {
			return "Student [name=" + name + ", age=" + age + ", grades=" + grades + ", subjects=" + subjects
					+ ", city=" + city + ", isActive=" + isActive + ", skillRatings=" + skillRatings
					+ ", enrollmentDate=" + enrollmentDate + "]";
		}
	    
		
	    
}
