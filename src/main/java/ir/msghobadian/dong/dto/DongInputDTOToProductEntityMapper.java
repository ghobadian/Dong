package ir.msghobadian.dong.dto;

import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.google.common.primitives.Ints;
import ir.msghobadian.dong.dao.PersonRepository;
import ir.msghobadian.dong.dao.ProductRepository;
import ir.msghobadian.dong.model.ProductEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.ZoneId;

@Component
@RequiredArgsConstructor
public class DongInputDTOToProductEntityMapper {
    private final PersonRepository personRepository;
    public final ProductEntity toProductEntity(DongInputDTO dongInputDTO) {
        return ProductEntity.builder()
                .buyer(personRepository.findById(dongInputDTO.getBuyerId()).get())
                .buyingDate(LocalDateTime.now(ZoneId.of("Asia/Tehran")))
                .name(dongInputDTO.getNameOfProduct())
                .price(dongInputDTO.getPrice())
                .build();
    }
}
