package kg.mega.student.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;

@Entity
@Table(name = "students")
@FieldDefaults (level = AccessLevel.PRIVATE)
@Data
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    @JsonProperty("last_name")
    String lastName;
    String name;
    String patronomyic;
    boolean active;
    String address;
    @ManyToOne

    Subject subject;

}
