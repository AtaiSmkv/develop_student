package kg.mega.student.services.impl;

import kg.mega.student.mappers.SubjectMapper;
import kg.mega.student.models.Subject;
import kg.mega.student.models.dto.SubjectDto;
import kg.mega.student.repositories.SubjectRepo;
import kg.mega.student.services.SubjectService;
import org.springframework.stereotype.Service;

@Service
public class SubjectServiceImpl implements SubjectService {
    public final SubjectRepo subjectRepo;
    public final SubjectMapper subjectMapper;

    public SubjectServiceImpl(SubjectRepo subjectRepo, SubjectMapper subjectMapper) {
        this.subjectRepo = subjectRepo;
        this.subjectMapper = subjectMapper;
    }

    public SubjectDto save(SubjectDto subjectDto) {
        Subject subject = this.subjectMapper.subjectDtoToSubject(subjectDto);
        subject = (Subject)this.subjectRepo.save(subject);
        subjectDto.setId(subjectDto.getId());
        return subjectDto;
    }

    public SubjectDto findById(Long id) {
        Subject subject = (Subject)this.subjectRepo.findById(id).orElseThrow(() -> {
            return new RuntimeException("Запись не найдена!");
        });
        SubjectDto subjectDto = this.subjectMapper.subjectToSubjectDto(subject);
        return subjectDto;
    }
}
