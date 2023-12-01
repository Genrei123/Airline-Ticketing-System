/*
     * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
     * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Homepage;

import Animations.SwitchForms;
import Database.Database;
import LogIn.AlertManager;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXDatePicker;
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
import javafx.animation.KeyFrame;
import javafx.animation.ParallelTransition;
import javafx.animation.PauseTransition;
import javafx.animation.Timeline;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import org.controlsfx.control.textfield.TextFields;

public class HomepageController implements Initializable {

    @FXML
    private AnchorPane topPane;

    @FXML
    private AnchorPane centrePane;

    @FXML
    private Pane starsPane;

    @FXML
    private AnchorPane aboutUs_form;

    @FXML
    private AnchorPane top_form;

    @FXML
    private AnchorPane account_form;

    @FXML
    private AnchorPane whereWeFly_form;

    @FXML
    private AnchorPane flightStats_form;

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
    private JFXTextField cs_destination;

    @FXML
    private JFXTextField cs_origin;

    @FXML
    private JFXTextField cs_seatNum;

    @FXML
    private JFXComboBox<?> cs_seatClass;

    @FXML
    private JFXButton seat_a1;

    @FXML
    private JFXButton seat_a2;

    @FXML
    private JFXButton seat_a3;

    @FXML
    private JFXButton seat_a4;

    @FXML
    private JFXButton proceed_btn;

    @FXML
    private JFXButton returnToDesti_btn;

    @FXML
    private AnchorPane topPlaneSeat;

    @FXML
    private JFXButton planeSeat_1;

    @FXML
    private AnchorPane hf_searchDesti;

    @FXML
    private Label promptLabel1;

    @FXML
    private Label promptLabel2;

    @FXML
    private TextField searchTextField;

    @FXML
    private JFXButton booking_btn4;

    @FXML
    private JFXButton booking_btn3;

    @FXML
    private JFXButton booking_btn2;

    @FXML
    private JFXButton booking_btn1;

    @FXML
    private JFXButton returnToHome_btn;

    @FXML
    private AnchorPane hf_home;

    @FXML
    private JFXButton bookFlight_btn;

    @FXML
    private AnchorPane carousel;

    @FXML
    private AnchorPane c_slide1;

    @FXML
    private JFXButton c_bookingBtn1;

    @FXML
    private JFXButton c_bookingBtn2;

    @FXML
    private JFXButton c_bookingBtn3;

    @FXML
    private AnchorPane c_slide2;

    @FXML
    private JFXButton c_bookingBtn4;

    @FXML
    private JFXButton c_bookingBtn5;

    @FXML
    private JFXButton c_bookingBtn6;

    @FXML
    private AnchorPane c_slide3;

    @FXML
    private JFXButton c_bookingBtn7;

    @FXML
    private JFXButton c_bookingBtn8;

    @FXML
    private JFXButton c_bookingBtn9;

    @FXML
    private JFXButton slideToLeft_btn;

    @FXML
    private JFXButton slideToRight_btn;

    @FXML
    private AnchorPane overlayPane;

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
    private JFXComboBox<?> typeOfPayment;

    @FXML
    private Label book_alert;

    @FXML
    private JFXDatePicker birth_date;

    @FXML
    private AnchorPane overlayPane1;

    @FXML
    private AnchorPane payment_form;

    @FXML
    private AnchorPane topPane1;

    @FXML
    private Pane starsPane1;

    @FXML
    private JFXButton closeButton;

    @FXML
    private AnchorPane paymentForms;

    @FXML
    private JFXButton cardBtn;

    @FXML
    private JFXButton payPalBtn;

    @FXML
    private JFXButton gcashBtn;

    @FXML
    private AnchorPane cardForm;

    @FXML
    private ScrollPane c_form1;

    @FXML
    private JFXTextField cardNumber;

    @FXML
    private JFXTextField expirationDate;

    @FXML
    private JFXTextField securityCode;

    @FXML
    private JFXTextField cardOwner;

    @FXML
    private JFXButton c_nextBtn1;

    @FXML
    private JFXButton c_backBtn1;

    @FXML
    private ScrollPane c_form2;

    @FXML
    private JFXComboBox<String> c_country;

    @FXML
    private JFXTextField c_name;

    @FXML
    private JFXTextField c_address1;

    @FXML
    private JFXTextField c_address2;

    @FXML
    private JFXTextField c_city;

    @FXML
    private JFXTextField c_state;

    @FXML
    private JFXTextField c_postalCode;

    @FXML
    private JFXButton c_nextBtn2;

    @FXML
    private JFXButton c_backBtn2;

    @FXML
    private AnchorPane gcashForm;

    @FXML
    private ScrollPane g_form1;

    @FXML
    private JFXComboBox<String> g_country;

    @FXML
    private JFXTextField g_name;

    @FXML
    private JFXTextField g_address1;

    @FXML
    private JFXTextField g_address2;

    @FXML
    private JFXTextField g_city;

    @FXML
    private JFXTextField g_state;

    @FXML
    private JFXTextField g_postalCode;

    @FXML
    private JFXButton g_nextBtn;

    @FXML
    private JFXButton g_backBtn;

    @FXML
    private AnchorPane paypalForm;

    @FXML
    private JFXTextField p_phoneNumber;

    @FXML
    private JFXButton p_nextBtn;

    @FXML
    private JFXButton p_backBtn;

    @FXML
    private AnchorPane paymentPane;

    @FXML
    private TextField f_name, m_name, l_name, suffix, age, destination, origin, s_class, seat;

    private boolean menuOpen = false;

    private double defaultSliderWidth = 280;
    private double defaultSliderHeight = 43;

    // Create a Timeline for auto-sliding
    private Timeline autoSlideTimeline;
    // Variable to store the time of the last manual slide change
    private long lastSlideChangeTime = 0;

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

        overlayPane.setVisible(true);
        overlayPane.setStyle("-fx-background-color: rgba(0, 0, 0, 0.5);");
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

        overlayPane.setVisible(false);
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

    // Add this method to create twinkling stars for starsPane1
    private void createTwinklingStarsForPane1() {
        int numStars = 20;
        ParallelTransition parallelTransition = new ParallelTransition();

        // Set preferred size explicitly
        //starsPane1.setPrefSize(510, 106);
        for (int i = 0; i < numStars; i++) {
            Pane star = createStar();
            starsPane1.getChildren().add(star);

            // Set a random initial position within the bounds of starsPane1
            double initialX = Math.random() * (starsPane1.getWidth() + 510);  // Adjusted to consider star size
            double initialY = Math.random() * (starsPane1.getHeight() + 90); // Adjusted to consider star size
            star.setLayoutX(initialX);
            star.setLayoutY(initialY);

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

    // Call this method in your initialize method to create twinkling stars for starsPane1
    private void initializeTwinklingStars() {
        createTwinklingStars();  // For starsPane
        createTwinklingStarsForPane1();  // For starsPane1
    }

    //CAROUSEL FUNCTIONS
    private void initializeAutoSlideTimeline() {
        // Set the duration and create a KeyFrame
        Duration duration = Duration.seconds(5); // adjust the duration as needed
        KeyFrame keyFrame = new KeyFrame(duration, this::autoSlide);

        // Create a timeline with the keyframe, set it to indefinite to repeat
        autoSlideTimeline = new Timeline(keyFrame);
        autoSlideTimeline.setCycleCount(Timeline.INDEFINITE);

        // Play the auto-slide timeline
        autoSlideTimeline.play();
    }

    // Auto-slide method
    private void autoSlide(ActionEvent event) {
        // If the user manually changed slides recently, wait for 10s before resuming auto-slide
        if (System.currentTimeMillis() - lastSlideChangeTime < 10000) {
            return;
        }

        // Perform the auto-slide action (slide to the left)
        slideToLeft(event);
    }

    // Modify the existing slideToLeft and slideToRight methods
    int show = 0;

    @FXML
    private void slideToRight(ActionEvent event) {
        if (show == 0) {
            switchForm(c_slide2);
            show++;
        } else if (show == 1) {
            switchForm(c_slide3);
            show++;
        } else if (show == 2) {
            switchForm(c_slide1);
            show = 0;
        }

        // Record the time of the manual slide change
        lastSlideChangeTime = System.currentTimeMillis();
        autoSlideTimeline.playFromStart(); // Resume auto-slide
    }

    @FXML
    private void slideToLeft(ActionEvent event) {
        if (show == 0) {
            switchForm(c_slide3);
            show = 2;
        } else if (show == 1) {
            switchForm(c_slide1);
            show--;
        } else if (show == 2) {
            switchForm(c_slide2);
            show--;
        }

        // Record the time of the manual slide change
        lastSlideChangeTime = System.currentTimeMillis();
        autoSlideTimeline.playFromStart(); // Resume auto-slide
    }

    //SWITCH FORM FUNCTIONS FOR CAROUSEL
    private void switchForm(AnchorPane targetForm) {
        //carousel slides
        c_slide1.setVisible(false);
        c_slide2.setVisible(false);
        c_slide3.setVisible(false);

        // Show the selected form or carousel slide
        targetForm.setVisible(true);
    }

    //SWITCH FORM FUNCTIONS FOR home_form
    private void switchForm(AnchorPane targetForm, JFXButton selectedButton) {
        hf_home.setVisible(false);
        hf_searchDesti.setVisible(false);
        hf_chooseSeat.setVisible(false);
        hf_bookFlight.setVisible(false);
        // Show the selected form
        targetForm.setVisible(true);
    }

    //SWITCH FORM FUNCTIONS FOR home_form
    public void switchForm(ActionEvent event) {
        if (event.getSource() == menu_home) {
            //For PARENT FORMS
            home_form.setVisible(true);
            flightStats_form.setVisible(false);
            whereWeFly_form.setVisible(false);
            account_form.setVisible(false);
            top_form.setVisible(false);
            aboutUs_form.setVisible(false);

            //For home_form
            hf_home.setVisible(true);
            hf_searchDesti.setVisible(false);
            hf_chooseSeat.setVisible(false);
            hf_bookFlight.setVisible(false);
        } else if (event.getSource() == menu_flightStats) {
            home_form.setVisible(false);
            flightStats_form.setVisible(true);
            whereWeFly_form.setVisible(false);
            account_form.setVisible(false);
            top_form.setVisible(false);
            aboutUs_form.setVisible(false);

        } else if (event.getSource() == menu_whereWeFly) {
            home_form.setVisible(false);
            flightStats_form.setVisible(false);
            whereWeFly_form.setVisible(true);
            account_form.setVisible(false);
            top_form.setVisible(false);
            aboutUs_form.setVisible(false);
        } else if (event.getSource() == menu_account) {
            home_form.setVisible(false);
            flightStats_form.setVisible(false);
            whereWeFly_form.setVisible(false);
            account_form.setVisible(true);
            top_form.setVisible(false);
            aboutUs_form.setVisible(false);
        } else if (event.getSource() == menu_TOP) {
            home_form.setVisible(false);
            flightStats_form.setVisible(false);
            whereWeFly_form.setVisible(false);
            account_form.setVisible(false);
            top_form.setVisible(true);
            aboutUs_form.setVisible(false);
        } else if (event.getSource() == menu_aboutUs) {
            home_form.setVisible(false);
            flightStats_form.setVisible(false);
            whereWeFly_form.setVisible(false);
            account_form.setVisible(false);
            top_form.setVisible(false);
            aboutUs_form.setVisible(true);
        }
    }

    public void handleNextButtonClick(ActionEvent event) throws SQLException {
        // Switch to paymentForms initially
        switchPaymentForm(cardBtn);

        // Determine which button was clicked
        Button clickedButton = (Button) event.getSource();

        // Check the ID or other properties of the button
        if (clickedButton.getId().equals("c_nextBtn2")) {
            // Code for c_nextBtn2

            // Insert data into the database
            insertDataIntoDatabase();

            // Show notification
            showNotification();
        } else if (clickedButton.getId().equals("g_nextBtn")) {
            // Code for g_nextBtn

            // Insert data into the database
            insertDataIntoDatabase();

            // Show notification
            showNotification();
        } else if (clickedButton.getId().equals("p_nextBtn")) {
            // Code for p_nextBtn

            // Insert data into the database
            insertDataIntoDatabase();

            // Show notification
            showNotification();
        }

        // Rest of your code
    }

    // Method to show notification
    private void showNotification() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/Homepage/Notif.fxml"));
            Parent root = loader.load();

            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.setTitle("Notification");
            stage.show();
        } catch (IOException e) {
            e.printStackTrace(); // Handle the exception appropriately
        }
    }

    private void insertDataIntoDatabase() throws SQLException {
        // Insert Data into the database
        List<String> columnNames = Arrays.asList(
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
                "flight_no"
        );

        List<Object> values = Arrays.asList(
                "test", // flight_id
                f_name.getText(),
                m_name.getText(),
                l_name.getText(),
                suffix.getText(),
                Integer.parseInt(age.getText()),
                (birth_date.getValue() != null) ? birth_date.getValue().toString() : null,
                destination.getText(),
                origin.getText(),
                s_class.getText(),
                seat.getText(),
                "test" // flight_no
        );

        Database booked_flights = new Database();
        booked_flights.insertData("booked_flights", columnNames, values);

    }

    private boolean areAllFieldsExceptSuffixEmpty() {
        return f_name.getText().isEmpty()
                && m_name.getText().isEmpty()
                && l_name.getText().isEmpty()
                && age.getText().isEmpty()
                && (birth_date.getValue() == null) // Check if JFXDatePicker value is null
                && destination.getText().isEmpty()
                && origin.getText().isEmpty()
                && s_class.getText().isEmpty()
                && seat.getText().isEmpty();
    }

    private boolean areFieldsEmpty() {
        // Check if all fields (except suffix) are empty
        if (areAllFieldsExceptSuffixEmpty() && suffix.getText().isEmpty()) {
            AlertManager alert = new AlertManager(book_alert);
            alert.setAlertText("Please fill in at least one field (excluding suffix).", "red");

            // Schedule a task to hide the alert after 5 seconds
            PauseTransition delay = new PauseTransition(Duration.seconds(5));
            delay.setOnFinished(event -> alert.hideAlert());
            delay.play();

            return true; // Exit the method since all fields (except suffix) are empty
        }

        // Check if any of the required fields (excluding suffix) is empty
        boolean anyFieldEmpty = isNullOrEmpty(f_name)
                || isNullOrEmpty(m_name)
                || isNullOrEmpty(l_name)
                || isNullOrEmpty(age)
                || isNullOrEmpty(birth_date)
                || isNullOrEmpty(destination)
                || isNullOrEmpty(origin)
                || isNullOrEmpty(s_class)
                || isNullOrEmpty(seat);

        // If any required field (excluding suffix) is empty, show an alert
        if (anyFieldEmpty) {
            AlertManager alert = new AlertManager(book_alert);
            alert.setAlertText("Please fill in all required fields.", "red");

            // Schedule a task to hide the alert after 5 seconds
            PauseTransition delay = new PauseTransition(Duration.seconds(5));
            delay.setOnFinished(event -> alert.hideAlert());
            delay.play();

            return true; // Exit the method since any required field (excluding suffix) is empty
        }

        return false; // All required fields (excluding suffix) are filled
    }

    // Method to check if a TextField is null or empty
    private boolean isNullOrEmpty(TextField textField) {
        return textField != null && textField.getText().trim().isEmpty();
    }

    // Method to check if a JFXDatePicker is null or its value is empty
    private boolean isNullOrEmpty(JFXDatePicker datePicker) {
        return datePicker == null || datePicker.getValue() == null;
    }

    //COMBO-BOX for Seat Class
    private String[] classList = {"Economy", "Premium Economy", "Business", "First Class"};

    public void seatClass() {
        List<String> listC = new ArrayList<>();

        listC.addAll(Arrays.asList(classList));

        ObservableList listData = FXCollections.observableArrayList(listC);
        cs_seatClass.setItems(listData);
    }

    // Add this method to initialize the booking buttons
    private void initializeBookingButtons() {
        setBookingButtonAction(booking_btn1, "Boracay", "Manila");
        setBookingButtonAction(booking_btn2, "Coron", "Manila");
        setBookingButtonAction(booking_btn3, "Samar", "Manila");
        setBookingButtonAction(booking_btn4, "Bohol", "Manila");
        // Add more booking buttons as needed
    }

// Generic method to set the action for booking buttons
    private void setBookingButtonAction(JFXButton bookingButton, String destination, String origin) {
        bookingButton.setOnAction(event -> {
            switchForm(hf_chooseSeat, bookingButton);
            setDestinationAndOrigin(destination, origin);
        });
    }

    // Method to set destination and origin in cs_destination and cs_origin text fields
    private void setDestinationAndOrigin(String destination, String origin) {
        cs_destination.setText(destination);
        cs_origin.setText(origin);
    }

    // Method to clear seat selection fields
    private void clearSeatSelectionFields() {
        cs_seatNum.clear();
        cs_seatClass.getSelectionModel().clearSelection(); // Clear the selection
    }

    // Method to handle return to destination button click
    public void handleReturnToDestiButtonClick() {
        switchForm(hf_searchDesti, returnToDesti_btn);
        switchForm(hf_searchDesti, returnToDesti_btn1);

        clearSeatSelectionFields();
    }

    // Add this method to initialize the seat buttons
    private void initializeSeatButtons() {
        setSeatButtonAction(seat_a1, "A1");
        setSeatButtonAction(seat_a2, "A2");
        setSeatButtonAction(seat_a3, "A3");
        setSeatButtonAction(seat_a4, "A4");
        // Add more seat buttons as needed
    }

    // Generic method to set the action for seat buttons
    private void setSeatButtonAction(JFXButton seatButton, String seatNumber) {
        seatButton.setOnAction(event -> {
            cs_seatNum.setText(seatNumber);
        });
    }

    // Method to handle proceed button click
    public void proceedBooking() {
        // Switch form to hf_bookFlight
        switchForm(hf_bookFlight, proceed_btn);

        // Set values in text fields
        seat.setText(cs_seatNum.getText());
        destination.setText(cs_destination.getText());
        origin.setText(cs_origin.getText());

        // Check if cs_seatClass has a selected item before accessing it
        if (cs_seatClass.getSelectionModel().getSelectedItem() != null) {
            s_class.setText(cs_seatClass.getSelectionModel().getSelectedItem().toString());
        }
    }

    // Method to update the state of the proceed button based on cs_seatNum and cs_seatClass
    private void updateProceedButtonState() {
        boolean isDisabled = cs_seatNum.getText().isEmpty() || cs_seatClass.getSelectionModel().isEmpty();
        proceed_btn.setDisable(isDisabled);
    }

    // Additional methods from PaymentController to be integrated into HomepageController
    private void initializeCountryComboBoxes() {
        List<String> countries = getAllCountries();
        setComboBoxItems(c_country, countries);
        setComboBoxItems(g_country, countries);

        makeComboBoxSearchable(c_country);
        makeComboBoxSearchable(g_country);
    }

    private List<String> getAllCountries() {
        String[] countriesArray = {
            "Afghanistan", "Albania", "Algeria", /* ... (add all countries here) ... */ "Zimbabwe"
        };

        // Convert array to a List
        return Arrays.asList(countriesArray);
    }

    private void setComboBoxItems(JFXComboBox<String> comboBox, List<String> items) {
        comboBox.getItems().addAll(items);
    }

    private void makeComboBoxSearchable(JFXComboBox<String> comboBox) {
        TextFields.bindAutoCompletion(comboBox.getEditor(), comboBox.getItems());
    }

    private void switchPaymentForm(JFXButton selectedButton) {
        cardForm.setVisible(false);
        gcashForm.setVisible(false);
        paypalForm.setVisible(false);

        if (selectedButton == cardBtn) {
            paymentForms.setVisible(false);
            cardForm.setVisible(true);
        } else if (selectedButton == gcashBtn) {
            paymentForms.setVisible(false);
            gcashForm.setVisible(true);
        } else if (selectedButton == payPalBtn) {
            paymentForms.setVisible(false);
            paypalForm.setVisible(true);
        }
    }

    private void switchCardForm(String buttonId) {
        switch (buttonId) {
            case "c_nextBtn1":
                c_form1.setVisible(false);
                c_form2.setVisible(true);
                break;
            case "c_backBtn1":
                paymentForms.setVisible(true);
                cardForm.setVisible(false);
                gcashForm.setVisible(false);
                paypalForm.setVisible(false);
                c_form1.setVisible(true);
                c_form2.setVisible(false);
                clearCardFormFields();
                break;
            case "c_backBtn2":
                c_form1.setVisible(true);
                c_form2.setVisible(false);
                break;
            // Add more cases as needed
        }
    }

    private void switchGcashForm(String buttonId) {
        switch (buttonId) {
            case "g_backBtn":
                paymentForms.setVisible(true);
                gcashForm.setVisible(false);
                clearCardFormFields();
                break;
            // Add more cases as needed
        }
    }

    private void switchPaypalForm(String buttonId) {
        switch (buttonId) {
            case "p_backBtn":
                paymentForms.setVisible(true);
                paypalForm.setVisible(false);
                clearCardFormFields();
                break;
            // Add more cases as needed
        }
    }

    public void handleBookButtonClick() {
        // Check if all fields in hf_bookFlight are empty
        if (areFieldsEmpty()) {
            AlertManager alert = new AlertManager(book_alert);
            alert.setAlertText("Please fill in at least one field in Book Flight.", "red");

            // Schedule a task to hide the alert after 5 seconds
            PauseTransition delay = new PauseTransition(Duration.seconds(5));
            delay.setOnFinished(event -> alert.hideAlert());
            delay.play();

            return; // Exit the method since there are validation issues
        }

        // Switch to paymentForms initially
        switchPaymentForm(book_btn);

        // Open/visible the payment_form
        payment_form.setVisible(true);
        paymentForms.setVisible(true);
        // Make the overlayPane1 visible and dim
        overlayPane1.setVisible(true);
        overlayPane1.setStyle("-fx-background-color: rgba(0, 0, 0, 0.5);");

    }

    public void switchPaymentForm(ActionEvent event) {
        JFXButton selectedButton = (JFXButton) event.getSource();
        switchPaymentForm(selectedButton);
    }

    public void switchCardForm(ActionEvent event) {
        String buttonId = ((JFXButton) event.getSource()).getId();
        switchCardForm(buttonId);
    }

    public void switchGcashForm(ActionEvent event) {
        String buttonId = ((JFXButton) event.getSource()).getId();
        switchGcashForm(buttonId);
    }

    public void switchPaypalForm(ActionEvent event) {
        String buttonId = ((JFXButton) event.getSource()).getId();
        switchPaypalForm(buttonId);
    }

    public void closeForm() {
        clearPaymentForms(); // Clear fields in paymentForms
        // Hide the overlayPane1 and main_form
        overlayPane1.setVisible(false);
        payment_form.setVisible(false);
        paymentForms.setVisible(true);

    }

    // Add these methods to clear the fields in each form
    private void clearCardFormFields() {
        cardNumber.clear();
        expirationDate.clear();
        securityCode.clear();
        cardOwner.clear();
        c_country.getSelectionModel().clearSelection();
        c_name.clear();
        c_address1.clear();
        c_address2.clear();
        c_city.clear();
        c_state.clear();
        c_postalCode.clear();
    }

    private void clearGcashFormFields() {
        g_country.getSelectionModel().clearSelection();
        g_name.clear();
        g_address1.clear();
        g_address2.clear();
        g_city.clear();
        g_state.clear();
        g_postalCode.clear();
    }

    private void clearPaypalFormFields() {
        p_phoneNumber.clear();
    }

    // Add these methods to clear fields when the "Close" button is clicked
    public void clearPaymentForms() {
        clearCardFormFields();
        clearGcashFormFields();
        clearPaypalFormFields();
    }

    //Paymen Forms BTN's disabler
    private void updateCardNextButtonState() {
        boolean isDisabled = cardNumber.getText().isEmpty()
                || expirationDate.getText().isEmpty()
                || securityCode.getText().isEmpty()
                || cardOwner.getText().isEmpty();
        c_nextBtn1.setDisable(isDisabled);
    }

    private void updateCardAddressButtonState() {
        boolean isDisabled = c_country.getSelectionModel().isEmpty()
                || c_name.getText().isEmpty()
                || c_address1.getText().isEmpty()
                || c_address2.getText().isEmpty()
                || c_city.getText().isEmpty()
                || c_state.getText().isEmpty()
                || c_postalCode.getText().isEmpty();
        c_nextBtn2.setDisable(isDisabled);
    }

    private void updateGcashButtonState() {
        boolean isDisabled = g_country.getSelectionModel().isEmpty()
                || g_name.getText().isEmpty()
                || g_address1.getText().isEmpty()
                || g_address2.getText().isEmpty()
                || g_city.getText().isEmpty()
                || g_state.getText().isEmpty()
                || g_postalCode.getText().isEmpty();
        g_nextBtn.setDisable(isDisabled);
    }

    private void updatePaypalButtonState() {
        boolean isDisabled = p_phoneNumber.getText().isEmpty();
        p_nextBtn.setDisable(isDisabled);
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        //Combo-Box initialize
        seatClass();
        // Initialize the menu slider in the closed state
        closeMenuSlider();

        // Initialize the auto-slide timeline
        initializeAutoSlideTimeline();

        // Initialize the method to create twinkling stars
        initializeTwinklingStars();
        createTwinklingStarsForPane1();

        overlayPane.setVisible(false);
        overlayPane1.setVisible(false);

        // Add event handlers to the overlayPane and topPane
        overlayPane.setOnMouseClicked(event -> {
            if (menuOpen) {
                closeMenuSlider();
            }
        });

        // Make the starsPane visible when the application is running
        starsPane.setVisible(true);
        starsPane1.setVisible(true);

        // Switch Forms for home_form
        bookFlight_btn.setOnAction(e -> switchForm(hf_searchDesti, bookFlight_btn));
        //Clear textFields of hf_chooseSeat textFields
        returnToDesti_btn.setOnAction(e -> handleReturnToDestiButtonClick());
        returnToDesti_btn1.setOnAction(e -> handleReturnToDestiButtonClick());

        // Return actions for home_form
        returnToHome_btn.setOnAction(e -> switchForm(hf_home, returnToHome_btn));

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

        // Initialize seat buttons
        initializeSeatButtons();

        // Initialize booking buttons
        initializeBookingButtons();

        // Add listeners to cs_seatNum and cs_seatClass
        cs_seatNum.textProperty().addListener((observable, oldValue, newValue) -> updateProceedButtonState());
        cs_seatClass.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> updateProceedButtonState());

        // Initially update the state of the proceed button
        updateProceedButtonState();

        // Initialize country combo-boxes
        initializeCountryComboBoxes();

        // Listeners for CardForm
        cardNumber.textProperty().addListener((observable, oldValue, newValue) -> updateCardNextButtonState());
        expirationDate.textProperty().addListener((observable, oldValue, newValue) -> updateCardNextButtonState());
        securityCode.textProperty().addListener((observable, oldValue, newValue) -> updateCardNextButtonState());
        cardOwner.textProperty().addListener((observable, oldValue, newValue) -> updateCardNextButtonState());

        c_country.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> updateCardAddressButtonState());
        c_name.textProperty().addListener((observable, oldValue, newValue) -> updateCardAddressButtonState());
        c_address1.textProperty().addListener((observable, oldValue, newValue) -> updateCardAddressButtonState());
        c_address2.textProperty().addListener((observable, oldValue, newValue) -> updateCardAddressButtonState());
        c_city.textProperty().addListener((observable, oldValue, newValue) -> updateCardAddressButtonState());
        c_state.textProperty().addListener((observable, oldValue, newValue) -> updateCardAddressButtonState());
        c_postalCode.textProperty().addListener((observable, oldValue, newValue) -> updateCardAddressButtonState());

        // Listeners for GcashForm
        g_country.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> updateGcashButtonState());
        g_name.textProperty().addListener((observable, oldValue, newValue) -> updateGcashButtonState());
        g_address1.textProperty().addListener((observable, oldValue, newValue) -> updateGcashButtonState());
        g_address2.textProperty().addListener((observable, oldValue, newValue) -> updateGcashButtonState());
        g_city.textProperty().addListener((observable, oldValue, newValue) -> updateGcashButtonState());
        g_state.textProperty().addListener((observable, oldValue, newValue) -> updateGcashButtonState());
        g_postalCode.textProperty().addListener((observable, oldValue, newValue) -> updateGcashButtonState());

        // Listeners for PaypalForm
        p_phoneNumber.textProperty().addListener((observable, oldValue, newValue) -> updatePaypalButtonState());

        updateCardNextButtonState();
        updateCardAddressButtonState();
        updateGcashButtonState();
        updatePaypalButtonState();

    }
}
