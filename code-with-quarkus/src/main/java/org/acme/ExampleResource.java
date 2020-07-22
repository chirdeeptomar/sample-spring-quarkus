package org.acme;

import com.example.demo.TestService;
import org.eclipse.microprofile.graphql.Description;
import org.eclipse.microprofile.graphql.GraphQLApi;
import org.eclipse.microprofile.graphql.Query;

import javax.inject.Inject;

@GraphQLApi
public class ExampleResource {
    @Inject
    TestService service;

    @Query("allFilms")
    @Description("Get all Films from a galaxy far far away")
    public boolean getAllFilms() {
        return service.test();
    }
}