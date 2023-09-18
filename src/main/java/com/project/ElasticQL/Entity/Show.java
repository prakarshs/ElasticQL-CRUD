package com.project.ElasticQL.Entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Document(indexName = "shows")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Show {
    private Long id;
    private String showName;
    private String showGenre;
    private Long showYear;
    private Long showRating;
}
