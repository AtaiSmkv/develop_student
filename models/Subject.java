package kg.mega.student.models;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;

@Entity
@Table(name = "subjects")
@FieldDefaults(level = AccessLevel.PRIVATE)
@Data
public class Subject {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    long id;
    String title;
    boolean active;
    @ManyToOne
    Teacher teacher;

}
