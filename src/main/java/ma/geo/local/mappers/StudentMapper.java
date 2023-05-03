package ma.geo.local.mappers;

import ma.geo.local.entities.StudentEntity;
import ma.geo.local.models.StudentDTO;
import ma.geo.local.entities.StudentId;
import ma.geo.local.models.StudentIdDTO;

import org.mapstruct.Mapper;

import java.util.List;

//@Component(value = "mapper1")
@Mapper
public interface  StudentMapper {


   // StudentEntity studentDtoToEntity(StudentDTO dto);
   // StudentDTO studentEntityToDto(StudentEntity studentEntity);
   // List<StudentDTO> studentEntitiesToDtos(List<StudentEntity> studentEntities) ;

    StudentEntity studentDtoToEntity(StudentDTO dto);
    StudentDTO studentEntityToDto(StudentEntity studentEntity) ;
    List<StudentDTO> studentEntitiesToDos(List<StudentEntity> studentEntities) ;
    StudentId studentIdDTOToStudentId(StudentIdDTO studentIdDTO);
}
