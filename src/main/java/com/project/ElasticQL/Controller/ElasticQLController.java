package com.project.ElasticQL.Controller;

import com.project.ElasticQL.Entity.Show;
import com.project.ElasticQL.Model.ShowRequest;
import com.project.ElasticQL.Service.ElasticQLService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class ElasticQLController {

    @Autowired
    private ElasticQLService elasticQLService;
    @MutationMapping("addShow")
    public Show add(@Argument ShowRequest showRequest){
        return elasticQLService.addShow(showRequest);
    }
    @QueryMapping("showAll")
    public Iterable<Show> showAll(){
        return elasticQLService.showAll();
    }
    @QueryMapping("show")
    public Show show(@Argument String showName){
        return elasticQLService.show(showName);
    }


}
