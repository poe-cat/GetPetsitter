package org.poecat.services;

import org.poecat.entities.Profile;

import java.util.HashMap;
import java.util.Map;

public class ProfileService {

    private Map<String, Profile> profiles = new HashMap<>();

    public void createProfile(Profile profile) {
        profiles.put(profile.getUserId(), profile);
    }

    public Profile getProfile(String userId) {
        return profiles.get(userId);
    }

    public void updateProfile(Profile profile) {
        profiles.put(profile.getUserId(), profile);
    }
}
