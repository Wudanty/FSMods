package com.stasoft.models;

import com.stasoft.enums.Games;
import com.stasoft.enums.TagGroup;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Mod {
    private TagGroup tagGroup;
    private String name;
    private String description;
    private String author;
    private String version;
    private Date releaseDate;
    private String downloadSize;
    private Games game;

}


