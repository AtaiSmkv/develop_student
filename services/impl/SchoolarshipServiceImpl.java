package kg.mega.student.services.impl;

import kg.mega.student.mappers.SchoolarshipMapper;
import kg.mega.student.models.Schoolarship;
import kg.mega.student.models.dto.SchoolarshipDto;
import kg.mega.student.repositories.SchoolarshipRepo;
import kg.mega.student.services.SchoolarshipService;
import org.springframework.stereotype.Service;

@Service
public class SchoolarshipServiceImpl implements SchoolarshipService {
    private final SchoolarshipMapper schoolarshipMapper;
    private final SchoolarshipRepo schoolarshipRepo;

    public SchoolarshipServiceImpl(SchoolarshipMapper schoolarshipMapper, SchoolarshipRepo schoolarshipRepo) {
        this.schoolarshipMapper = schoolarshipMapper;
        this.schoolarshipRepo = schoolarshipRepo;
    }

    public SchoolarshipDto save(SchoolarshipDto schoolarshipDto) {
        Schoolarship schoolarship = this.schoolarshipMapper.schoolarshipDtoToSchoolarship(schoolarshipDto);
        schoolarship = (Schoolarship)this.schoolarshipRepo.save(schoolarship);
        schoolarshipDto.setId(schoolarshipDto.getId());
        return schoolarshipDto;
    }

    public SchoolarshipDto findById(Long id) {
        Schoolarship schoolarship = (Schoolarship)this.schoolarshipRepo.findById(id).orElseThrow();
        SchoolarshipDto schoolarshipDto = this.schoolarshipMapper.schoolarshipToSchoolarshipDto(schoolarship);
        return schoolarshipDto;
    }
}
