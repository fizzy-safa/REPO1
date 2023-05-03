package ma.geo.local.services;

import ma.geo.local.entities.StudentEntity;
import ma.geo.local.models.StudentDTO;

import java.util.List;

public interface StudentService {
    long save(StudentDTO s);

    long update(StudentDTO s);

    Boolean deletebyId(Long id);

    List<StudentDTO> selectAll();
}
