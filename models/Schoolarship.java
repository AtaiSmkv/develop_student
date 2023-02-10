package kg.mega.student.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "schoolarships")
@FieldDefaults(level = AccessLevel.PRIVATE)
@Data
public class Schoolarship {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    int amount;
    @JsonProperty("start_date")
    @JsonFormat(pattern = "dd.MM.yyy hh:mm")
    Date startDate;
    @JsonProperty("end_date")
    @JsonFormat(pattern = "dd.MM.yyy hh:mm")
    Date endDate;
    @ManyToOne
    Student student;
}
