package ir.msghobadian.dong.dao;

import ir.msghobadian.dong.model.Debt;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DebtRepository extends CrudRepository<Debt, Long> {

}
