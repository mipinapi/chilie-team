package org.springframework.chilieteam.services.springdatajpa;

import org.springframework.chilieteam.model.Boots;
import org.springframework.chilieteam.repositories.BootsRepository;
import org.springframework.chilieteam.services.BootsService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("springdatajpa")
public class BootsSDJpaService implements BootsService {

    private final BootsRepository bootsRepository;

    public BootsSDJpaService(BootsRepository bootsRepository) {
        this.bootsRepository = bootsRepository;
    }

    @Override
    public Set<Boots> findAll() {
        Set<Boots> boots = new HashSet<>();
        bootsRepository.findAll().forEach(boots::add);
        return boots;
    }

    @Override
    public Boots findById(Long aLong) {
        return bootsRepository.findById(aLong).orElse(null);
    }

    @Override
    public Boots save(Boots object) {
        return bootsRepository.save(object);
    }

    @Override
    public void delete(Boots object) {
        bootsRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        bootsRepository.deleteById(aLong);
    }
}
