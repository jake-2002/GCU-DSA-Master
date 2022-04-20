package controllers;

import daos.DAO;
import daos.listDAOImpl;
import datastructures.ADTSingleLinkedList;
import helpers.InputHelper;
import helpers.OutputHelper;
import helpers.TextColours;
import model.*;

public class controller {
    listDAOImpl dao;
    ADTSingleLinkedList adtSingleLinkedList;
    OutputHelper outputHelper;
    InputHelper inputHelper;
    TextColours txtClrs;
    ADTDate adtDate;
    Task task;
    TeamMember teamMember;

    public controller() {
        dao = new listDAOImpl();
        adtSingleLinkedList = new ADTSingleLinkedList();
        inputHelper = new InputHelper();
        outputHelper = new OutputHelper();
        txtClrs = new TextColours();
        adtDate = new ADTDate();
        task = new Task();
        teamMember = new TeamMember();
    }

    public void run(){
        this.setup();
        boolean finished = false;

        int iChoice = 0;

        do {
            this.theMenu();
            iChoice = inputHelper.readInt("Enter choice", 8,1);
            switch (iChoice) {
                // Add more cases
                case 1:
                    System.out.println();
                    break;

                default: // invalid option
                    System.out.println("Oops! Something has went wrong!");
                    break;
            }
        }while(!finished);
    }

    private void setup(){
        // Add your code here
    }

    private void theMenu() {
        // Print menu to console
        // Add your code here
    }

    // Add your code here
    // Add more private methods for each of your cases
}
