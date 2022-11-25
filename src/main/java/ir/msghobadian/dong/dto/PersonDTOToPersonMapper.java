package ir.msghobadian.dong.dto;

import ir.msghobadian.dong.model.PersonEntity;

import java.util.ArrayList;

public class PersonDTOToPersonMapper {
    public static PersonEntity toPersonEntity(PersonEntityInputDTO personEntityInputDTO) {
        return PersonEntity.builder()
                .firstName(personEntityInputDTO.getFirstName())
                .lastName(personEntityInputDTO.getLastName())
                .studentId(personEntityInputDTO.getStudentId())
                .build();
    }
}
