package kg.mega.student.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;

@Entity
@Table(name = "subjects")
@FieldDefaults(level = AccessLevel.PRIVATE)
@Data
public class Teacher {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)

    long id;
    @JsonProperty ("last_name")
    String lastName;

    String name;

    String patronymic;
    boolean active;


}
