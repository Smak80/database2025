package ru.gr36x.db;


import io.ebean.Model;
import jakarta.persistence.*;

@Entity
public class Grade extends Model {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String subject;
    private int score;

    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student student;

    public Grade(String subject, int score, Student student) {
        this.subject = subject;
        this.score = score;
        this.student = student;
    }

    public Long getId() { return id; }
    public String getSubject() { return subject; }
    public void setSubject(String subject) { this.subject = subject; }
    public int getScore() { return score; }
    public void setScore(int score) { this.score = score; }
    public Student getStudent() { return student; }
    public void setStudent(Student student) { this.student = student; }
}
