package ir.msghobadian.dong.model;

import ir.msghobadian.dong.model.PersonEntity;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Getter
@Setter
@Builder
@Table(name = "PRODUCT")
@AllArgsConstructor
@NoArgsConstructor
public class ProductEntity {
    @Id
    @Column(nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String name;
    @Column
    private LocalDateTime buyingDate;
    @Column
    private double price;
    @OneToOne
    private PersonEntity buyer;
}
