/*
     * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
     * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Homepage;

import Animations.SwitchForms;
import Database.Database;
import com.jfoenix.controls.JFXButton;
import java.io.IOException;

import com.jfoenix.controls.JFXTextField;
import javafx.animation.TranslateTransition;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;
import javafx.util.Duration;

import java.net.URL;
import java.sql.SQLException;
import java.util.*;

import javafx.animation.Animation;
import javafx.animation.FadeTransition;
import javafx.animation.ParallelTransition;
import javafx.animation.SequentialTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Rectangle2D;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.stage.Screen;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 *
 * @author Ervhyne
 */
public class HomepageController implements Initializable {

    @FXML
    private AnchorPane topPane;

    @FXML
    private AnchorPane centrePane;

    @FXML
    private Pane starsPane;

    @FXML
    private AnchorPane home_form;

    @FXML
    private AnchorPane hf_bookFlight;

    @FXML
    private JFXButton returnToDesti_btn1;

    @FXML
    private JFXButton book_btn;

    @FXML
    private AnchorPane hf_chooseSeat;

    @FXML
    private JFXButton proceed_btn;

    @FXML
    private JFXButton returnToDesti_btn;

    @FXML
    private AnchorPane hf_searchDesti;

    @FXML
    private Label promptLabel1;

    @FXML
    private Label promptLabel2;

    @FXML
    private TextField searchTextField;

    @FXML
    private JFXButton booking_btn1;

    @FXML
    private JFXButton booking_btn4;

    @FXML
    private JFXButton booking_btn3;

    @FXML
    private JFXButton booking_btn2;

    @FXML
    private JFXButton returnToHome_btn;

    @FXML
    private AnchorPane hf_home;

    @FXML
    private JFXButton bookFlight_btn;

    @FXML
    private AnchorPane flightStats_form;

    @FXML
    private AnchorPane whereWeFly_form;

    @FXML
    private AnchorPane account_form;

    @FXML
    private AnchorPane top_form;

    @FXML
    private AnchorPane aboutUs_form;

    @FXML
    private JFXButton menuBtn1;

    @FXML
    private AnchorPane menuSlider;

    @FXML
    private JFXButton menu_home;

    @FXML
    private JFXButton menu_flightStats;

    @FXML
    private JFXButton menu_whereWeFly;

    @FXML
    private JFXButton menu_account;

    @FXML
    private JFXButton menu_TOP;

    @FXML
    private JFXButton menu_aboutUs;

    @FXML
    private JFXButton menu_logout;

    @FXML
    private JFXButton menuBtn;

    @FXML
    private TextField f_name, m_name, l_name, suffix, birth_date,  age, destination, origin, s_class, seat, mode_payment;

    private boolean menuOpen = false;

    private double defaultSliderWidth = 280;
    private double defaultSliderHeight = 43;

    // Create a reference to the currently selected button
    private JFXButton currentSelectedButton;

    private double x = 0;
    private double y = 0;
    
    //MENU BAR SLIDER FUNCTION AND ANIMATION
    public void toggleMenuSlider() {
        if (menuOpen) {
            closeMenuSlider();
        } else {
            openMenuSlider();
        }
    }

    private void openMenuSlider() {
        // Define the animation for opening the menu slider
        TranslateTransition openTransition = new TranslateTransition(Duration.millis(300), menuSlider);
        openTransition.setToX(0);
        openTransition.play();
        openTransition.setNode(menuSlider);

        // Update the menuOpen flag
        menuOpen = true;
    }

    private void closeMenuSlider() {
        // Set the height explicitly
        menuSlider.setPrefHeight(defaultSliderHeight);

        // Define the animation for closing the menu slider
        TranslateTransition closeTransition = new TranslateTransition(Duration.millis(300), menuSlider);
        closeTransition.setToX(-defaultSliderWidth);
        closeTransition.play();
        closeTransition.setNode(menuSlider);

        // Update the menuOpen flag
        menuOpen = false;
    }

    //LOG OUT FUNCTION
    public void logout() throws IOException {
        SwitchForms switchForms = new SwitchForms();
        switchForms.Logout((Stage) menu_logout.getScene().getWindow());
    }

    //FOR HOMEPAGE STAR BG ANIMATION
    private void createTwinklingStars() {
        int numStars = 60;
        ParallelTransition parallelTransition = new ParallelTransition();

        for (int i = 0; i < numStars; i++) {
            Pane star = createStar();
            starsPane.getChildren().add(star);

            FadeTransition fadeTransition = new FadeTransition(Duration.seconds(1), star);
            fadeTransition.setFromValue(1.0);
            fadeTransition.setToValue(0.0);
            fadeTransition.setCycleCount(Animation.INDEFINITE);
            fadeTransition.setAutoReverse(true);

            // Add a random initial delay to each star
            Duration initialDelay = Duration.seconds(Math.random() * 5);
            fadeTransition.setDelay(initialDelay);

            parallelTransition.getChildren().add(fadeTransition);
        }

        parallelTransition.play();
    }

    private Pane createStar() {
        Pane star = new Pane();

        // Set a fixed size for the star, adjust as needed
        double starSize = new Random().nextInt(5) + 1;
        star.setPrefSize(starSize, starSize);

        star.setLayoutX(new Random().nextDouble() * starsPane.getPrefWidth());
        star.setLayoutY(new Random().nextDouble() * starsPane.getPrefHeight());

        // Set the background color and radius directly
        star.setStyle("-fx-background-color: white; -fx-background-radius: 50%;");

        star.setOpacity(1.0);

        return star;
    }

    //SWITCH FORM FUNCTIONS
    @FXML
    private void switchToForm(ActionEvent event) {
        JFXButton selectedButton = (JFXButton) event.getSource();
        AnchorPane targetForm = null;

        // Determine the target form based on the selected button
        if (selectedButton == menu_home) {
            targetForm = home_form;
        } else if (selectedButton == menu_flightStats) {
            targetForm = flightStats_form;
        } else if (selectedButton == menu_whereWeFly) {
            targetForm = whereWeFly_form;
        } else if (selectedButton == menu_account) {
            targetForm = account_form;
        } else if (selectedButton == menu_TOP) {
            targetForm = top_form;
        } else if (selectedButton == menu_aboutUs) {
            targetForm = aboutUs_form;
        } else if (selectedButton == bookFlight_btn) {
            targetForm = hf_searchDesti;
        } else if (selectedButton == returnToHome_btn) {
            targetForm = hf_home;
        } else if (selectedButton == returnToDesti_btn) {
            targetForm = hf_searchDesti;
        } else if (selectedButton == returnToDesti_btn1) {
            targetForm = hf_searchDesti;
        } else if (selectedButton == booking_btn1) {
            targetForm = hf_chooseSeat;
        } else if (selectedButton == booking_btn2) {
            targetForm = hf_chooseSeat;
        } else if (selectedButton == booking_btn3) {
            targetForm = hf_chooseSeat;
        } else if (selectedButton == booking_btn4) {
            targetForm = hf_chooseSeat;
        } else if (selectedButton == proceed_btn) {
            targetForm = hf_bookFlight;
        }

        if (targetForm != null) {
            switchForm(targetForm, selectedButton);
            switchPages(targetForm, selectedButton);
        }
    }

    private void switchForm(AnchorPane targetForm, JFXButton selectedButton) {
        // Hide all forms
        home_form.setVisible(false);
        flightStats_form.setVisible(false);
        whereWeFly_form.setVisible(false);
        account_form.setVisible(false);
        top_form.setVisible(false);
        aboutUs_form.setVisible(false);

        // Show the selected form
        targetForm.setVisible(true);

        // Update button styles
        if (currentSelectedButton != null) {
            currentSelectedButton.getStyleClass().remove("selected-button");
        }

        currentSelectedButton = selectedButton;
        currentSelectedButton.getStyleClass().add("selected-button");
    }

    private void switchPages(AnchorPane targetForm, JFXButton selectedButton) {
        // Hide all pages
        hf_home.setVisible(false);
        hf_searchDesti.setVisible(false);
        hf_chooseSeat.setVisible(false);
        hf_bookFlight.setVisible(false);

        // Show the selected page
        if (targetForm == home_form) {
            hf_home.setVisible(true);
        } else if (targetForm == hf_searchDesti) {
            hf_searchDesti.setVisible(true);
        } else if (targetForm == hf_chooseSeat) {
            hf_chooseSeat.setVisible(true);
        } else if (targetForm == hf_bookFlight) {
            hf_bookFlight.setVisible(true);
        }

        // Show the selected form
        targetForm.setVisible(true);
        currentSelectedButton = selectedButton;
    }

    public void book() throws SQLException {
        // Insert Data
        List<String> columnNames;
        List<Object> values;

        String flight_id = "test";
        String flight_no = "test";

        columnNames = Arrays.asList(
                "flight_id",
                "first_name",
                "middle_name",
                "last_name",
                "suffix",
                "age",
                "birth_date",
                "destination",
                "origin",
                "class",
                "seat",
                "mode_payment",
                "flight_no"
        );

        values = Arrays.asList(
                flight_id,
                f_name.getText(),
                m_name.getText(),
                l_name.getText(),
                suffix.getText(),
                Integer.parseInt(age.getText()),
                birth_date.getText(),
                destination.getText(),
                origin.getText(),
                s_class.getText(),
                seat.getText(),
                mode_payment.getText(),
                flight_no
        );

        Database booked_flights = new Database();
        booked_flights.insertData("booked_flights", columnNames, values);


        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/Homepage/Notif.fxml"));
            Parent root = loader.load();
            Stage notifStage = new Stage();
            Scene scene = new Scene(root);

            notifStage.setOnShown(event -> {
                Rectangle2D primScreenBounds = Screen.getPrimary().getVisualBounds();
                notifStage.setX((primScreenBounds.getWidth() - notifStage.getWidth()) / 2);
                notifStage.setY((primScreenBounds.getHeight() - notifStage.getHeight()) / 2);
            });

            Image icon = new Image(getClass().getResourceAsStream("/Images/Plane logo.png"));
            notifStage.initStyle(StageStyle.UNDECORATED);
            notifStage.setResizable(false);
            notifStage.setScene(scene);

            root.setOnMousePressed((javafx.scene.input.MouseEvent event) -> {
                x = event.getSceneX();
                y = event.getSceneY();
            });

            root.setOnMouseDragged((javafx.scene.input.MouseEvent event) -> {
                notifStage.setX(event.getScreenX() - x);
                notifStage.setY(event.getScreenY() - y);

            });


            // Get the controller of Notif.fxml to set the reference to HomepageController
            NotifController notifController = loader.getController();
            notifController.setHomepageController(this);

            notifStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Method to switch the form to hf_searchDesti
    public void switchToSearchDestiForm() {
        switchForm(hf_searchDesti, returnToDesti_btn);
        switchPages(hf_searchDesti, returnToDesti_btn);
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        // Initialize the menu slider in the closed state
        closeMenuSlider();

        // Add event handlers to the overlayPane and topPane
        centrePane.setOnMouseClicked(event -> {
            if (menuOpen) {
                closeMenuSlider();
            }
        });

        topPane.setOnMouseClicked(event -> {
            if (menuOpen) {
                closeMenuSlider();
            }
        });

        // Make the starsPane visible when the application is running
        starsPane.setVisible(true);

        createTwinklingStars();

        // Initially, set the labels to be visible
        promptLabel1.setVisible(true);
        promptLabel2.setVisible(true);

        // Add focus event handler to hide labels when TextField is focused
        searchTextField.setOnMouseClicked(e -> {
            promptLabel1.setVisible(false);
            promptLabel2.setVisible(false);
        });

        // Add focus event handler to show labels when TextField loses focus and is empty
        searchTextField.focusedProperty().addListener((obs, oldVal, newVal) -> {
            if (!newVal && searchTextField.getText().isEmpty()) {
                promptLabel1.setVisible(true);
                promptLabel2.setVisible(true);
            }
        });

        // Add text change event handler to hide labels when text is entered
        searchTextField.textProperty().addListener((obs, oldVal, newVal) -> {
            if (!newVal.isEmpty()) {
                promptLabel1.setVisible(false);
                promptLabel2.setVisible(false);
            }
        });

    }
}
