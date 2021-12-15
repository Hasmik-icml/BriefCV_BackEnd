package com.company.controller;

import com.company.commons.constants.FileConstants;
import com.company.model.People;

import com.company.repository.FileRepository;
import com.company.service.JsonParser;
import com.company.service.impl.JsonParserGson;


import java.util.LinkedList;
import java.util.List;

public class PeopleController {
    List<People> peopleList = new LinkedList<>();

    public void generateData() {
//        create list of peoples with 10pcs
        People people = new People(
                "Alexandr",
                "Hambardzumyan",
                "+37493114415",
                "alexanhambarcumyan@gmail.com",
                "Shushi Technology university",
                "AIPC",
                "not filled",
                FileConstants.IMAGE_RESOURCE_PATH);
        peopleList.add(people);

        people = new People(
                "Anahit",
                "Khechumyan",
                "+37444148000",
                "Khechumyan63@gmail.com",
                "Yerevan State University",
                "School Principal-School N67",
                "not filled",
                FileConstants.IMAGE_RESOURCE_PATH);
        peopleList.add(people);

        people = new People(
                "Ani",
                "Antonyan",
                "+37499111111",
                "ani@gmail.com",
                "Yerevan State University",
                "not filled",
                "not filled",
                FileConstants.IMAGE_RESOURCE_PATH);
        peopleList.add(people);

        people = new People(
                "Armenak",
                "Qocharyan",
                "+37494902171",
                "qocharyanarmenak@gmail.com",
                "Բարձրագույն զինվորական",
                "ՀՀ ՊՆ",
                "not filled",
                FileConstants.IMAGE_RESOURCE_PATH);
        peopleList.add(people);

        people=new People(
                "Arusyak",
                "Aghajanyan",
                "+37455900155",
                "aghajanyanarusyak@gmail.com",
                "YSUGU",
                "InecoBank CJSC, Risk meneger",
                "BasicItCenter,",
                FileConstants.IMAGE_RESOURCE_PATH);
        peopleList.add(people);

        people = new People(
                "Anna",
                "Hayriyan",
                "+37498144450",
                "annhayriyan@gmail.com",
                "ASUE",
                "Scott logistics",
                "RELQ",
                FileConstants.IMAGE_RESOURCE_PATH);
        peopleList.add(people);

        people=new People(
                "Afina",
                "Panyan",
                "not filled",
                "not filled",
                "not filled",
                "not filled",
                "Relq",
                FileConstants.IMAGE_RESOURCE_PATH);
        peopleList.add(people);

        people=new People(
                "Babken",
                "Tadevosyan",
                "+37493285595",
                "not filled",
                "not filled",
                "not filled",
                "Relq",
                FileConstants.IMAGE_RESOURCE_PATH);
        peopleList.add(people);

        people=new People(
                "Hasmik",
                "Gevorgyan",
                "+37499463623",
                "gevorgyan.icml@gmail.com",
                "YEREVAN STATE COLLEGE OF INFORMATICS",
                "Mon Amie Flowers & Design boutique",
                "Relq",
                FileConstants.IMAGE_RESOURCE_PATH);
        peopleList.add(people);

        people=new People(
                "Hermine",
                "Melkumyan",
                "not filled",
                "not filled",
                "not filled",
                "not filled",
                "Relq",
                FileConstants.IMAGE_RESOURCE_PATH);
        peopleList.add(people);

        people=new People(
                "Larine",
                "Danielyan",
                "+37497759599",
                "danielyanlari@gmail.com",
                "Economics and Menegment",
                "Martuninsky district Medical Association",
                "Relq",
                FileConstants.IMAGE_RESOURCE_PATH);
        peopleList.add(people);

        people=new People(
                "Liana",
                "Dashyan",
                "+37491555374",
                "dashyanlian@gmail.com",
                "YSU",
                "GYU NGO",
                "Relq",
                FileConstants.IMAGE_RESOURCE_PATH);
        peopleList.add(people);

        people=new People(
                "Lusine",
                "Yeremyan",
                "+37443181834",
                "lusineer@gmail.com",
                "Economist",
                "Municipality",
                "Relq" ,
                FileConstants.IMAGE_RESOURCE_PATH);
        peopleList.add(people);

        people=new People(
                "Lusine",
                "Petrosyan",
                "+37493322902",
                "plusine99@gmail.com",
                "Armenian State University faculty of Radiophysics",
                "not filled",
                "Relq",
                FileConstants.IMAGE_RESOURCE_PATH);
        peopleList.add(people);

        people = new People(
                "Karen",
                "Darbinyan",
                "+37498156247",
                "kar31100@gmail.com",
                "YSU",
                "alam asxarh",
                "RELQ",
                FileConstants.IMAGE_RESOURCE_PATH);
        peopleList.add(people);

        people=new People(
                "Marat",
                "Harutyunyan",
                "+37444055150",
                "maratharutyunyan.mh.mh@gmail.com",
                "ASIPCS",
                "EL Market",
                "Relq School",
                FileConstants.IMAGE_RESOURCE_PATH);
        peopleList.add(people);


        people=new People(
                "Narek",
                "Tovmasyan",
                "+37494276700",
                "narektom333@gmail.com",
                "ASUE",
                "Ameria Bank",
                "Relq School",
                FileConstants.IMAGE_RESOURCE_PATH);
        peopleList.add(people);

        people=new People(
                "Seda",
                "Shahnazaryan",
                "+37498313871",
                "shahnazaryan.seda@mail.ru",
                "Higher Education:Historian",
                "not filled",
                "TechBoost4Women" ,
                FileConstants.IMAGE_RESOURCE_PATH);
        peopleList.add(people);

        people=new People(
                "Seryozha",
                "Asatryan",
                "+37494246880",
                "seryozha.asatryan02@gmail.com",
                "Economics",
                "not filled",
                "Relq School",
                FileConstants.IMAGE_RESOURCE_PATH);
        peopleList.add(people);

        people=new People(
                "Sevak",
                "Stepanyan",
                "+37477121696",
                "stepanyansevak9@gamil.com",
                "Economics and Menegment",
                "not filled",
                "Relq School",
                FileConstants.IMAGE_RESOURCE_PATH);
        peopleList.add(people);

        people=new People(
                "Silva",
                "Ohanyan",
                "not filled",
                "not filled",
                "not filled",
                "not filled",
                "Relq School",
                FileConstants.IMAGE_RESOURCE_PATH);
        peopleList.add(people);

        people=new People(
                "Suren",
                "Galstyan",
                "not filled",
                "not filled",
                "not filled",
                "not filled",
                "Relq School",
                FileConstants.IMAGE_RESOURCE_PATH);
        peopleList.add(people);

        people=new People(
                "Tigran",
                "Martirosyan",
                "+37477151868",
                "martirosyant01@mail.ru",
                "not filled",
                "not filled",
                "Relq School",
                FileConstants.IMAGE_RESOURCE_PATH);
        peopleList.add(people);
    }

    private void parseToJson(){
        //people list parse to json with our just writed service class, with some changes
        //write converted data to the file
    }


    public void writeInFileWithJson() {
        JsonParser jp = new JsonParserGson();
        jp.parseToJsonAndWriteInFile(peopleList.toArray(new People[0]));

        System.out.println("everything is OKAY, you are god Narek");

    }


}
