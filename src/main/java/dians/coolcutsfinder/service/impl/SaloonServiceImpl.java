package dians.coolcutsfinder.service.impl;

import dians.coolcutsfinder.model.Saloon;
import dians.coolcutsfinder.repository.SaloonRepository;
import dians.coolcutsfinder.service.SaloonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SaloonServiceImpl implements SaloonService {
    private final SaloonRepository saloonRepository;
    @Autowired
    public SaloonServiceImpl(SaloonRepository saloonRepository) {
        this.saloonRepository = saloonRepository;
    }


    @Override
    public Saloon createSaloon(Saloon saloon) {
        return saloonRepository.save(saloon);
    }

    @Override
    public List<Saloon> getAllSaloons() {
        return saloonRepository.findAll();
    }

    @Override
    public Optional<Saloon> getSaloonById(Long id) {
        return saloonRepository.findById(id);
    }

    @Override
    public Saloon getSaloonByName(String name) {
        return saloonRepository.findSaloonByName(name);
    }

    @Override
    public void updateSaloon(Long id, Saloon saloon) {
        Optional<Saloon> saloon1 = saloonRepository.findById(id);
        Saloon saloon2 =saloon1.get();
        saloon2.setName(saloon.getName());
        saloon2.setAddress(saloon.getAddress());
        saloonRepository.save(saloon2);
    }

    @Override
    public void deleteSaloon(Long id) {
        Optional<Saloon> saloon = saloonRepository.findById(id);
        saloonRepository.delete(saloon.get());
    }
}
