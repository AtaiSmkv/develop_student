package kg.mega.student.repositories;

import kg.mega.student.models.Exam;
import kg.mega.student.models.Rates;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RateRepo extends JpaRepository<Rates, Long> {
}
