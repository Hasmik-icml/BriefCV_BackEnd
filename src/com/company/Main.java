package com.company;


import com.company.controller.PeopleController;
import com.company.model.People;
//import com.company.service.impl.JsonParserImpl;
import com.company.repository.FileRepository;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import jdk.jfr.internal.Repository;

import java.io.File;

public class Main {


    public static void main(String[] args) {
        PeopleController peopleController = new PeopleController();
        peopleController.generateData();
        peopleController.writeInFileWithJson();

    }
}

