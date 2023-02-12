package kg.mega.student.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "exams")
@FieldDefaults(level = AccessLevel.PRIVATE)
@Data
public class Exam {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    long id;
    @JsonProperty("exam_date")
    Date examDate;
    double duration;
    int score;
    @ManyToOne
    Subject subject;
}
