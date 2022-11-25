package ir.msghobadian.dong.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Getter
@RequiredArgsConstructor
public class DongInputDTO {
    private final String nameOfProduct;
    //TODO add description field
    private final double price;
    private final Long buyerId;
    private final List<Long> userIds;


}
