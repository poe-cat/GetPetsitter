package org.poecat.services;


import org.poecat.entities.Profile;

import java.util.List;
import java.util.stream.Collectors;

public class SearchService {

    private List<Profile> petsitters;

    public List<Profile> searchPetsitters(String location, String availability) {
        return petsitters.stream()
                .filter(petsitter -> petsitter.getDescription().contains(location) && petsitter.getDescription().contains(availability))
                .collect(Collectors.toList());
    }
}
