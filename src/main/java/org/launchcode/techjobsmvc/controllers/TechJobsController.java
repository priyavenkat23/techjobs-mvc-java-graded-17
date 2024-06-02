package org.launchcode.techjobsmvc.controllers;


import org.springframework.web.bind.annotation.*;

import java.util.HashMap;


public class TechJobsController {

    static HashMap<String, String> actionChoices = new HashMap<>();

    public TechJobsController(){
        actionChoices.put("search", "Search");
        actionChoices.put("list", "List");

    }

    @ModelAttribute("actions")

    public HashMap getActionChoices(HashMap actions){
        return actionChoices;
    }

    @ModelAttribute("columns")

    public HashMap getColumnChoices(HashMap columns){
        return columns;
    }


}