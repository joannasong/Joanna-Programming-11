package sample;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class loadFriends {
    private static String firstName;
    private static String lastName;
    private static String day;
    private static String month;
    private static String year;
    private static String phone;
    private static String group;
    private static FileReader fr;
    private static BufferedReader br;
    private static ArrayList<Friend> f = new ArrayList<>();

    //reads txt file and creates friends based on txt file's info, and adds them to an arraylist
    public static ArrayList loadAllFriends(String file) throws IOException {
        f.clear();
        fr = new FileReader(file);
        br = new BufferedReader(fr);
        String line;
        String friendInfo = "";
        while((line = br.readLine()) != null){
            if(!line.equals(";")){
                friendInfo += line;
            }
            else {
                parseFriend(friendInfo);
                friendInfo = "";
            }
        }
        return f;
    }

    //scans string for friend's properties and adds to an arraylist
    private static void parseFriend(String string) {
        int pos = 0;
        firstName = "";
        lastName = "";
        day = "";
        month = "";
        year = "";
        phone = "";
        group = "";
        for(int i = 0; i < string.length();i++){
            if(string.substring(i-pos, i-pos+1).equals(",")){
                if(firstName.equals("")){
                    firstName = string.substring(0,i-pos);
                    string = string.substring(i-pos+1);
                    pos += i-pos+1;
                }
                else if (lastName.equals("")) {
                    lastName = string.substring(0, i - pos);
                    string = string.substring(i - pos + 1);
                    pos += i - pos + 1;
                }
                else if(day.equals("")){
                            day = string.substring(0,i-pos);
                            string = string.substring(i-pos+1);
                            pos += i-pos+1;
                        }
                else if(month.equals("")){
                    month = string.substring(0,i-pos);
                    string = string.substring(i-pos+1);
                    pos += i-pos+1;
                }
                else if(year.equals("")){
                    year = string.substring(0,i-pos);
                    string = string.substring(i-pos+1);
                    pos += i-pos+1;
                }
            }
        }
        phone = string.substring(0,string.length() - 8);
        f.add(new Friend(firstName, lastName, Integer.parseInt(day),Integer.parseInt(month),Integer.parseInt(year),phone,group));
    }

}








