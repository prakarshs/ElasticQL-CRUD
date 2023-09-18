package com.project.ElasticQL.Repository;

import com.project.ElasticQL.Entity.Show;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ElasticQLRepository extends ElasticsearchRepository<Show,Long> {
    Show findByShowName(String showName);
}
