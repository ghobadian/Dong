package ir.msghobadian.dong.preloader;

import ir.msghobadian.dong.dao.PersonRepository;
import ir.msghobadian.dong.dao.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

import static ir.msghobadian.dong.preloader.Dongs.dong1;
import static ir.msghobadian.dong.preloader.Dongs.dong2;
import static ir.msghobadian.dong.preloader.Users.*;

@Configuration
public class PreLoad {
    @Bean
    public CommandLineRunner loadData(PersonRepository personRepository, ProductRepository productRepository) {
        return (args) -> {
            loadUsers(personRepository);
            loadDongs(productRepository);
        };
    }

    private void loadDongs(ProductRepository productRepository) {
//        dong1.setUsers(List.of(saeed, mohammadMehdi));
//        dong2.setUsers(List.of(ali, saeed, mohammadMehdi, mohammadSadegh, hossein, amirHossein));
        productRepository.saveAll(List.of(dong1, dong2));
    }

    private void loadUsers(PersonRepository personRepository) {
        personRepository.saveAll(List.of(ali, mohammadSadegh, saeed, mohammadMehdi, hossein, amirHossein));
    }
}
