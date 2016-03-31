package com.happy;

/**
 * Created by Happy on 3/31/2016.
 */
import java.util.*;

public class Ticket {

    private int priority;
    private String reporter; //Stores person or department who reported issue
    private String description;
    private Date dateReported;
    private String resolution;
    private Date resolutionDate;



    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {

        this.resolution = resolution;
    }

    public Date getResolutionDate() {

        return resolutionDate;
    }

    public void setResolutionDate(Date resolutionDate) {

        this.resolutionDate = resolutionDate;
    }

    //STATIC Counter - accessible to all Ticket objects of this class and if modified, all Ticket objects  will be modified.

    private static int staticTicketIDCounter = 1; //only accessible to this package

    //Each Ticket(instance variable) in this package will have its own tickectID variable

    protected int ticketID;

    public Ticket(String desc, int p, String rep, Date date) {
        this.description = desc;
        this.priority = p;
        this.reporter = rep;
        this.dateReported = date;

        this.ticketID = staticTicketIDCounter;
        staticTicketIDCounter++;
    }
    // constructor  to change ticket id by not reset 1 when the user restart program

    public Ticket(String desc, int p, String rep, Date date, int id) {
        this.description = desc;
        this.priority = p;
        this.reporter = rep;
        this.dateReported = date;

        staticTicketIDCounter = id + 1;
        this.ticketID = id;
    }


    protected int getPriority() {
        return priority;
    }
    public String getDescription(){
        return  description;
    }


    public String toString() {
        String resolutions = (resolutionDate == null) ? "unresolved":
                this.resolutionDate.toString();
        String resoluting = (this.resolution ==null) ? "unsolved":
                this.resolution.toString();
        return ("ID= " + this.ticketID + " Issued: " + this.description + " Priority: "
                + this.priority + " Reported by: "
                + this.reporter + " Reported on: " + this.dateReported + " Resolution: " + resoluting
                + " Resolved Date: " + resolution);
    }
    public int getTicketID(){
        return ticketID;
    }

}



