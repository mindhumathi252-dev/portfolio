```java
public class IndhumathiProfile {

    public static void main(String[] args) {

        // Personal Information
        String name = "Indhumathi";
        String course = "B.Tech Information Technology";
        String college = "KGISL Institute of Technology";
        String careerGoal = "Software Engineer";

        // Skills
        String[] skills = {
            "Python",
            "Java",
            "C",
            "Data Structures",
            "Git & GitHub",
            "Cloud Computing",
            "DevOps"
        };

        // Projects
        String[] projects = {
            "Smart Traffic Management System",
            "Rural Tele-Diagnosis Assistant",
            "Smart Medicine Availability Network"
        };

        // Display Profile
        System.out.println("========================================");
        System.out.println("          INDHUMATHI - PROFILE");
        System.out.println("========================================");

        System.out.println("\nABOUT ME");
        System.out.println("----------------------------------------");
        System.out.println("Name        : " + name);
        System.out.println("Course      : " + course);
        System.out.println("College     : " + college);
        System.out.println("Career Goal : " + careerGoal);

        System.out.println("\nSKILLS");
        System.out.println("----------------------------------------");

        for (String skill : skills) {
            System.out.println("- " + skill);
        }

        System.out.println("\nPROJECTS");
        System.out.println("----------------------------------------");

        for (String project : projects) {
            System.out.println("- " + project);
        }

        System.out.println("\nCURRENTLY LEARNING");
        System.out.println("----------------------------------------");
        System.out.println("- Python Programming");
        System.out.println("- Java Programming");
        System.out.println("- Data Structures & Algorithms");
        System.out.println("- Cloud Computing");
        System.out.println("- DevOps");

        System.out.println("\nACTIVITIES");
        System.out.println("----------------------------------------");
        System.out.println("- PyExpo 2026");
        System.out.println("- Smart India Hackathon exploration");
        System.out.println("- Technical Presentations");
        System.out.println("- College Projects");

        System.out.println("\nCAREER GOAL");
        System.out.println("----------------------------------------");
        System.out.println(
            "To become a skilled Software Engineer " +
            "with strong programming and problem-solving skills."
        );

        System.out.println("\n========================================");
        System.out.println(" Learning -> Practicing -> Building");
        System.out.println(" Improving -> Growing");
        System.out.println("========================================");
    }
}
```
