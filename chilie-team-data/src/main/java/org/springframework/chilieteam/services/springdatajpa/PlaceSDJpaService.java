package org.springframework.chilieteam.services.springdatajpa;

import org.springframework.chilieteam.model.Match;
import org.springframework.chilieteam.model.Place;
import org.springframework.chilieteam.repositories.PlaceRepository;
import org.springframework.chilieteam.services.PlaceService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("springdatajpa")
public class PlaceSDJpaService implements PlaceService {

    private final PlaceRepository placeRepository;

    public PlaceSDJpaService(PlaceRepository placeRepository) {
        this.placeRepository = placeRepository;
    }

    @Override
    public Set<Place> findAll() {
        Set<Place> places = new HashSet<>();
        placeRepository.findAll().forEach(places::add);
        return places;
    }

    @Override
    public Place findById(Long aLong) {
        return placeRepository.findById(aLong).orElse(null);
    }

    @Override
    public Place save(Place object) {
        return placeRepository.save(object);
    }

    @Override
    public void delete(Place object) {
        placeRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        placeRepository.deleteById(aLong);
    }
}
