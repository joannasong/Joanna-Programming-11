package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;


public class Controller {
    //user inputted first and last name
    public TextField txtFirstName;
    public TextField txtLastName;
    //user inputted birth day, month, and year
    public TextField txtDay;
    public TextField txtMonth;
    public TextField txtYear;
    //user inputted phone number
    public TextField txtPhone;
    //stores all friends
    public ListView <Friend> listFriends = new ListView<>();
    //display friend's properties
    public Label lbFirstName;
    public Label lbLastName;
    public Label lbBirthdate;
    public Label lbPhoneNumber;
    //delete and create friend button
    public Button btnDelete;
    public Button btnCreate;
    //menu selection on create friend page
    public MenuItem menuPropGroupA;
    public MenuItem menuPropGroupB;
    public MenuButton menuPropButton;
    //menu selection on friend list page
    public MenuButton menuInfoButton;
    public MenuItem menuInfoGroupA;
    public MenuItem menuInfoGroupB;
    public MenuItem menuInfoAll;

    /*Takes user's inputted text in each text field and creates a friend with those properties
     then saves to txt file; must select a group
     */
    public void CreateFriend(ActionEvent actionEvent) throws IOException {
        Friend newFriend = new Friend(txtFirstName.getText(), txtLastName.getText(), Integer.parseInt(txtDay.getText()),
                Integer.parseInt(txtMonth.getText()), Integer.parseInt(txtYear.getText()), txtPhone.getText(), menuPropButton.getText());
        newFriend.storeFriend();
        txtFirstName.clear();
        txtLastName.clear();
        txtDay.clear();
        txtMonth.clear();
        txtYear.clear();
        txtPhone.clear();
        menuPropButton.setText("Select Friend Group");
    }

    //displays selected friend's properties
    public void displayFriend(MouseEvent mouseEvent) {
        btnDelete.setDisable(false);
        Friend newFriend;
        newFriend = listFriends.getSelectionModel().getSelectedItem();
        lbFirstName.setText(newFriend.firstName);
        lbLastName.setText(newFriend.lastName);
        lbBirthdate.setText(newFriend.day + "/" + newFriend.month + "/" + newFriend.year);
        lbPhoneNumber.setText(newFriend.phone);
    }

    //removes selected friend from list
    public void DeleteFriend(ActionEvent actionEvent) {
        Friend delete;
        delete = listFriends.getSelectionModel().getSelectedItem();
        listFriends.getItems().remove(delete);
        lbFirstName.setText("");
        lbLastName.setText("");
        lbBirthdate.setText("");
        lbPhoneNumber.setText("");
        btnDelete.setDisable(true);
    }

    //set create friend menu buttons to display correct text
    public void setGroupA(ActionEvent actionEvent) {
        menuPropButton.setText("Group A");
    }

    public void setGroupB(ActionEvent actionEvent) {
        menuPropButton.setText("Group B");
    }

    //set view friend menu buttons to display correct text and loads selected txt file
    public void loadGroupA(ActionEvent actionEvent) throws IOException {
        listFriends.getItems().clear();
        ArrayList<Friend> a = loadFriends.loadAllFriends("groupA.txt");
        for(Friend f : a){
            listFriends.getItems().add(f);
        }
        lbFirstName.setText("");
        lbLastName.setText("");
        lbBirthdate.setText("");
        lbPhoneNumber.setText("");
        btnDelete.setDisable(true);
        menuInfoButton.setText("Group A");
    }

    public void loadGroupB(ActionEvent actionEvent) throws IOException {
        listFriends.getItems().clear();
        ArrayList<Friend> b = loadFriends.loadAllFriends("groupB.txt");
        for(Friend f : b){
            listFriends.getItems().add(f);
        }
        lbFirstName.setText("");
        lbLastName.setText("");
        lbBirthdate.setText("");
        lbPhoneNumber.setText("");
        btnDelete.setDisable(true);
        menuInfoButton.setText("Group B");
    }

    public void loadAll(ActionEvent actionEvent) throws IOException {
        listFriends.getItems().clear();
        ArrayList<Friend> all = loadFriends.loadAllFriends("storedFriends.txt");
        for(Friend f : all){
            listFriends.getItems().add(f);
        }
        lbFirstName.setText("");
        lbLastName.setText("");
        lbBirthdate.setText("");
        lbPhoneNumber.setText("");
        btnDelete.setDisable(true);
        menuInfoButton.setText("All");
    }
}
