package dians.coolcutsfinder.service;

import dians.coolcutsfinder.model.Saloon;

import java.util.List;

public interface SaloonService {

    Saloon createSaloon(Saloon saloon);

    List<Saloon> getAllSaloons();

    Saloon getSaloonById(Long id);

    Saloon getSaloonByName(String name);

    void updateSaloon(Long id, Saloon saloon);

    void deleteSaloon(Long id);
}
