package com.project.ElasticQL.Model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ShowRequest {
    private Long id;
    private String showName;
    private String showGenre;
    private Long showYear;
    private Long showRating;
}
