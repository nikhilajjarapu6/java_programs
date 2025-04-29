package streamAPI_Project;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class StudentDatabase {
	public static List<Student> getStudents() {
        return List.of(
            new Student(
                "Alice Johnson",
                22,
                Arrays.asList(85, 90, 78),
                Arrays.asList("Mathematics", "Physics", "Computer Science"),
                "New York",
                true,
                Map.of("Java", 4.5, "Python", 4.2),
                LocalDate.of(2023, 9, 1)
            ),
            new Student(
                "Bob Smith",
                20,
                Arrays.asList(88, 76, 92),
                Arrays.asList("Biology", "Chemistry", "Physics"),
                "Los Angeles",
                false,
                Map.of("C++", 4.0, "JavaScript", 3.8),
                LocalDate.of(2022, 8, 15)
            ),
            new Student(
                "Carol Lee",
                19,
                Arrays.asList(95, 89, 94),
                Arrays.asList("English", "History", "Mathematics"),
                "Chicago",
                true,
                Map.of("HTML", 4.9, "CSS", 4.7),
                LocalDate.of(2024, 1, 10)
            ),
            new Student(
                "David Brown",
                23,
                Arrays.asList(70, 75, 80),
                Arrays.asList("Economics", "Statistics", "Finance"),
                "San Francisco",
                true,
                Map.of("Java", 4.8, "SQL", 4.6),
                LocalDate.of(2023, 6, 5)
            ),
            new Student(
                "Emma Davis",
                21,
                Arrays.asList(88, 84, 91),
                Arrays.asList("Music", "Art", "Theater"),
                "Boston",
                false,
                Map.of("Java", 4.5, "SQL", 4.0),
                LocalDate.of(2023, 5, 20)
            ),
            new Student(
                "Frank Green",
                18,
                Arrays.asList(92, 85, 88),
                Arrays.asList("Computer Science", "Mathematics", "Physics"),
                "Seattle",
                true,
                Map.of("Java", 4.7, "SQL", 4.3),
                LocalDate.of(2024, 2, 12)
            ),
            new Student(
                "Grace Hall",
                24,
                Arrays.asList(78, 81, 85),
                Arrays.asList("Psychology", "Philosophy", "Sociology"),
                "Houston",
                false,
                Map.of("Java", 4.4, "Python", 4.2),
                LocalDate.of(2021, 7, 15)
            ),
            new Student(
                "Henry Wilson",
                25,
                Arrays.asList(65, 70, 72),
                Arrays.asList("Physical Education", "Health", "Sports Science"),
                "Miami",
                true,
                Map.of("SQL", 4.9, "Java", 4.8),
                LocalDate.of(2020, 9, 25)
            ),
            new Student(
                "Isabella Thomas",
                22,
                Arrays.asList(82, 87, 90),
                Arrays.asList("Biology", "Genetics", "Chemistry"),
                "San Diego",
                true,
                Map.of("Java", 4.5, "Python", 4.3),
                LocalDate.of(2023, 3, 14)
            ),
            new Student(
                "Jack Martinez",
                20,
                Arrays.asList(77, 83, 86),
                Arrays.asList("Engineering", "Mechanics", "Mathematics"),
                "Austin",
                false,
                Map.of("AutoCAD", 4.6, "SolidWorks", 4.4),
                LocalDate.of(2022, 11, 1)
            ),
            new Student(
                "Kelly Adams",
                21,
                Arrays.asList(89, 92, 93),
                Arrays.asList("Law", "Political Science", "History"),
                "Philadelphia",
                true,
                Map.of("Debate", 4.8, "Public Speaking", 4.7),
                LocalDate.of(2023, 4, 8)
            ),
            new Student(
                "Liam White",
                19,
                Arrays.asList(90, 91, 88),
                Arrays.asList("Mathematics", "Physics", "Computer Science"),
                "Denver",
                true,
                Map.of("Java", 4.8, "Python", 4.7),
                LocalDate.of(2024, 1, 15)
            ),
            new Student(
                "Mia Harris",
                22,
                Arrays.asList(87, 86, 84),
                Arrays.asList("Business", "Marketing", "Economics"),
                "Chicago",
                false,
                Map.of("SEO", 4.3, "Data Visualization", 4.5),
                LocalDate.of(2022, 10, 5)
            ),
            new Student(
                "Nathan King",
                23,
                Arrays.asList(79, 81, 85),
                Arrays.asList("History", "Geography", "Political Science"),
                "Phoenix",
                true,
                Map.of("Writing", 4.4, "Editing", 4.6),
                LocalDate.of(2023, 6, 18)
            ),
            new Student(
                "Olivia Walker",
                18,
                Arrays.asList(93, 95, 97),
                Arrays.asList("Art", "Design", "Photography"),
                "Las Vegas",
                true,
                Map.of("Photoshop", 4.9, "Illustrator", 4.8),
                LocalDate.of(2024, 3, 1)
            )
        );
    }
	
}
