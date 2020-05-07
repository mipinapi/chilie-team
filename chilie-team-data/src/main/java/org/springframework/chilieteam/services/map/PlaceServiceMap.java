package org.springframework.chilieteam.services.map;

import org.springframework.chilieteam.model.Place;
import org.springframework.chilieteam.model.Player;
import org.springframework.chilieteam.services.PlaceService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class PlaceServiceMap extends AbstractServiceMap<Place, Long> implements PlaceService {

    @Override
    public Set<Place> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Place object) {
        super.delete(object);
    }

    @Override
    public Place save(Place object) {
        return super.save(object);
    }

    @Override
    public Place findById(Long id) {
        return super.findById(id);
    }
}
