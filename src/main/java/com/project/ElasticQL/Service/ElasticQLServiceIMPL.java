package com.project.ElasticQL.Service;

import com.project.ElasticQL.Entity.Show;
import com.project.ElasticQL.Model.ShowRequest;
import com.project.ElasticQL.Repository.ElasticQLRepository;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Service
@Log4j2
public class ElasticQLServiceIMPL implements ElasticQLService {

    @Autowired
    private ElasticQLRepository elasticQLRepository;
    @Override
    public Show addShow(ShowRequest showRequest) {
        Show show = Show.builder()
                .id(showRequest.getId())
                .showName(showRequest.getShowName())
                .showGenre(showRequest.getShowGenre())
                .showYear(showRequest.getShowYear())
                .showRating(showRequest.getShowRating())
                .build();
        elasticQLRepository.save(show);
        return show;
    }

    @Override
    public Iterable<Show> showAll() {
        return elasticQLRepository.findAll();
    }

    @Override
    public Show show(String showName) {

        return elasticQLRepository.findByShowName(showName);
    }
}
