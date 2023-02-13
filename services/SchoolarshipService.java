package kg.mega.student.services;

import kg.mega.student.models.dto.SchoolarshipDto;

public interface SchoolarshipService {
    SchoolarshipDto save(SchoolarshipDto schoolarshipDto);

    SchoolarshipDto findById(Long id);
}
