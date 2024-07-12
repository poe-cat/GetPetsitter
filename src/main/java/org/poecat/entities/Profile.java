package org.poecat.entities;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Profile {

    private String userId;
    private String name;
    private String description;
    private List<String> reviews;

}
