package com.jirasoftwaresolutions.movies.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import java.util.List;

@Document(collection = "movies")
@Data //creates getters, setters and toString methods(instead of creating them manually)
@AllArgsConstructor //creates a constructor that takes all the private fields as arguments
@NoArgsConstructor // creates a constructor that takes no parameters
public class Movie {
    @Id
    private ObjectId id;
    private String imdbId;
    private String title;
    private String releaseDate;
    private String trailerLink;
    private String poster;
    private List<String> genres;
    private List<String> backdrops;

    //Creating foreign keys in mongo db
    @DocumentReference
    private List<Review> reviewIds;
}
