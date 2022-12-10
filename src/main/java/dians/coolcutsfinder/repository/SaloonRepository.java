package dians.coolcutsfinder.repository;

import dians.coolcutsfinder.model.Saloon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SaloonRepository extends JpaRepository<Saloon,Long> {

    Saloon findSaloonByName(String name);
    Saloon findSaloonById(Long id);
}
