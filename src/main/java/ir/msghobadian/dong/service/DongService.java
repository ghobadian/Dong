package ir.msghobadian.dong.service;

import com.google.common.collect.Lists;
import ir.msghobadian.dong.dao.DebtRepository;
import ir.msghobadian.dong.dao.PersonRepository;
import ir.msghobadian.dong.dao.ProductRepository;
import ir.msghobadian.dong.dto.DongInputDTO;
import ir.msghobadian.dong.dto.DongInputDTOToProductEntityMapper;
import ir.msghobadian.dong.model.Debt;
import ir.msghobadian.dong.model.PersonEntity;
import ir.msghobadian.dong.model.ProductEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class DongService {
    private final ProductRepository productRepository;
    private final PersonRepository personRepository;
    private final DongInputDTOToProductEntityMapper dongInputDTOToProductEntityMapper;
    private final DebtRepository debtRepository;

    public ProductEntity saveDong(DongInputDTO dong) {

        ProductEntity productEntity = dongInputDTOToProductEntityMapper.toProductEntity(dong);
//        productEntity.setUsers(Lists.newArrayList(personRepository.findAllById(dong.getUserIds())));
        //TODO use DTO for return type and input type
        productEntity = productRepository.save(productEntity);
        processDong(productEntity);
        return productEntity;
    }

    private void processDong(ProductEntity productEntity) {
        PersonEntity creditor = productEntity.getBuyer();
        double price = productEntity.getPrice();
        List<PersonEntity> debtors = productEntity.getUsers();
        int numberOfDebtors = debtors.size();
        double averagePrice = price / numberOfDebtors;
        for(PersonEntity debtor: debtors) {
            Debt newDebt = Debt.builder().from(creditor).to(debtor).amount(averagePrice).build();
            debtRepository.save(newDebt);
            debtor.getDebts().add(newDebt);
            personRepository.save(debtor);
        }
    }

    public List<ProductEntity> findAll() {
        return Lists.newArrayList(productRepository.findAll());
    }

    public List<ProductEntity> findByUserId(Long userId) {
        return findAll().stream()
                .filter(product -> product.getUsers().stream().anyMatch(user -> user.getStudentId().equals(userId)))
                .collect(Collectors.toList());
    }
}
