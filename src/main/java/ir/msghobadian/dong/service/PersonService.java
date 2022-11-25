package ir.msghobadian.dong.service;

import com.google.common.collect.Lists;
import ir.msghobadian.dong.dao.PersonRepository;
import ir.msghobadian.dong.dto.PersonEntityInputDTO;
import ir.msghobadian.dong.model.PersonEntity;
import ir.msghobadian.dong.model.ProductEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

import static ir.msghobadian.dong.dto.PersonDTOToPersonMapper.toPersonEntity;

@Service
@RequiredArgsConstructor
public class PersonService {
    private final PersonRepository repository;
    public PersonEntity savePerson(PersonEntityInputDTO person) {
        return repository.save(toPersonEntity(person));
    }

    public List<PersonEntity> findAll() {
        return Lists.newArrayList(repository.findAll());
    }
}
