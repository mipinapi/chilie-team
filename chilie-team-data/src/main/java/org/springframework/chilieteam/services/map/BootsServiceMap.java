package org.springframework.chilieteam.services.map;

import org.springframework.chilieteam.model.Boots;
import org.springframework.chilieteam.services.BootsService;
import org.springframework.chilieteam.services.CrudService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
@Profile({"default", "map"})
public class BootsServiceMap extends AbstractServiceMap<Boots, Long> implements BootsService {

    @Override
    public Set<Boots> findAll() {
        return super.findAll();
    }

    @Override
    public Boots findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Boots save(Boots object) {
        return super.save(object);
    }

    @Override
    public void delete(Boots object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
