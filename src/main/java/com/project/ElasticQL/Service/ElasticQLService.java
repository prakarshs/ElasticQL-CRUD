package com.project.ElasticQL.Service;

import com.project.ElasticQL.Entity.Show;
import com.project.ElasticQL.Model.ShowRequest;

import java.util.List;

public interface ElasticQLService {
    Show addShow(ShowRequest showRequest);

    Iterable<Show> showAll();

    Show show(String showName);
}
