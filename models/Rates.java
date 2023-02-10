package kg.mega.student.models;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;

@Entity
@Table(name = "rates")
@FieldDefaults(level = AccessLevel.PRIVATE)
@Data
public class Rates {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    long id;
    @ManyToOne
    Student student;
    @ManyToOne
    Exam exam;
}
