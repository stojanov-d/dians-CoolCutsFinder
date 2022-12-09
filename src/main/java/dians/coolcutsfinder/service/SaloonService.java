package dians.coolcutsfinder.service;

import dians.coolcutsfinder.model.Saloon;

import java.util.List;
import java.util.Optional;

public interface SaloonService {

    Saloon createSaloon(Saloon saloon);

    List<Saloon> getAllSaloons();

    Optional<Saloon> getSaloonById(Long id);

    Saloon getSaloonByName(String name);

    void updateSaloon(Long id, Saloon saloon);

    void deleteSaloon(Long id);
}
