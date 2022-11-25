package ir.msghobadian.dong.preloader;

import ir.msghobadian.dong.model.ProductEntity;

import java.time.LocalDateTime;
import java.util.List;

import static ir.msghobadian.dong.preloader.Users.*;

public class Dongs {
    public final static ProductEntity dong1 = ProductEntity.builder()
            .name("condom")
            .price(13)
            .buyingDate(LocalDateTime.of(1401, 8, 29, 18, 29))
            .buyer(mohammadSadegh)
            .build();
    public final static ProductEntity dong2 = ProductEntity.builder()
            .name("saboon")
            .price(50)
            .buyingDate(LocalDateTime.of(1401, 8, 30, 18, 29))
            .buyer(mohammadSadegh)
            .build();
}
