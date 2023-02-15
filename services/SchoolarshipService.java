package kg.mega.student.services;

import kg.mega.student.models.Schoolarship;
import kg.mega.student.models.Student;
import kg.mega.student.models.dto.SchoolarshipDto;

import java.util.List;

public interface SchoolarshipService {
    SchoolarshipDto save(SchoolarshipDto schoolarshipDto);

    SchoolarshipDto findById(Long id);
    List<Schoolarship> findAll();


}
