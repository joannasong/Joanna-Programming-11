package sample;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Friend {
    //friend's first and last name
    public String firstName;
    public String lastName;
    //friend's birth day, month, and year
    public int day;
    public int month;
    public int year;
    //friend's phone number
    public String phone;
    //friend's friend group
    public String group;

    Friend(String fn, String ln, int d, int m, int y, String phone, String g){
        firstName = fn;
        lastName = ln;
        day = d;
        month = m;
        year = y;
        this.phone = phone;
        group = g;
    }

    public String toString(){
        return firstName + " " + lastName;
    }

    //writes friend to txt file containing all friends and its own group's txt file
    public void storeFriend() throws IOException{
        FileWriter fwStored = new FileWriter("storedFriends.txt", true);
        BufferedWriter bwStored = new BufferedWriter(fwStored);
        bwStored.write(firstName + ",\r");
        bwStored.write(lastName + ",\r");
        bwStored.write(day + ",\r");
        bwStored.write(month + ",\r");
        bwStored.write(year + ",\r");
        bwStored.write(phone + ",\r");
        bwStored.write(group + "\r;\r");
        switch (group){
            case "Group A":
                FileWriter fwGroupA = new FileWriter("groupA.txt", true);
                BufferedWriter bwGroupA = new BufferedWriter(fwGroupA);
                bwGroupA.write(firstName + ",\r");
                bwGroupA.write(lastName + ",\r");
                bwGroupA.write(day + ",\r");
                bwGroupA.write(month + ",\r");
                bwGroupA.write(year + ",\r");
                bwGroupA.write(phone + ",\r");
                bwGroupA.write(group + "\r;\r");
                bwGroupA.close();
                break;
            case "Group B":
                FileWriter fwGroupB = new FileWriter("groupB.txt", true);
                BufferedWriter bwGroupB = new BufferedWriter(fwGroupB);
                bwGroupB.write(firstName + ",\r");
                bwGroupB.write(lastName + ",\r");
                bwGroupB.write(day + ",\r");
                bwGroupB.write(month + ",\r");
                bwGroupB.write(year + ",\r");
                bwGroupB.write(phone + ",\r");
                bwGroupB.write(group + "\r;\r");
                bwGroupB.close();
                break;
        }
        bwStored.close();
    }

}
