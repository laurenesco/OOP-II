import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.math.RoundingMode;
import java.text.NumberFormat;

public class LoanCalculatorController {

    // Instance variables
    private static final NumberFormat currency = NumberFormat.getCurrencyInstance();
    private double finalPayment;
    private double months = 36;
    private double apr;
    private double discount = 0.0;

    @FXML private ToggleGroup autoPayToggleGroup;
    @FXML private ToggleGroup creditRatingToggleGroup;
    @FXML private Button btnCalculatePayment;
    @FXML private Label lblTermLength;
    @FXML private RadioButton radExcellent;
    @FXML private RadioButton radFair;
    @FXML private RadioButton radGood;
    @FXML private RadioButton radNo;
    @FXML private RadioButton radPoor;
    @FXML private RadioButton radYes;
    @FXML private Slider sldTerm;
    @FXML private TextField txtInterest;
    @FXML private TextField txtPayment;
    @FXML private TextField txtAmount;


    @FXML
    void calculatePayment(ActionEvent event) {
        // Calculate the payment
        try {
            // Get variables ready/isolate in event of error
            Double newAPR = apr/100;
            Double rate = newAPR/12;
            Double costOfProperty = Double.valueOf(txtAmount.getText());
            Double formulae = Double.valueOf((Math.pow(1 + rate, months) - 1) / (rate * Math.pow(1 + rate, months)));

            // Perform calculation
            finalPayment = costOfProperty/formulae;

            // Set text
            txtPayment.setText(currency.format(finalPayment));

            } catch (NumberFormatException ex) {
            // Catch if no amount entered
            txtAmount.setText("Enter a loan amount");
            txtAmount.selectAll();
            txtAmount.requestFocus();
        }
    }

    @FXML
    void updatePayMethod(ActionEvent event) {
        // Update discount
        updateDiscount();
    }

    @FXML
    void updateCreditRating(ActionEvent event) {
        // Update APR
        updateAPR();
    }

    private void updateDiscount() {
        // Update discount variable based on selection
        if (radYes.isSelected()) {
            discount = 1;
        } else if (radNo.isSelected()) {
            discount = 0;
        } else {
            discount = 0; // Default value
        }
        // After variable updated, update text
        updateAPR();
    }

    private void updateAPR() {
        // Update APR variable based on selection
        if (radExcellent.isSelected()) {
            apr = 9.99 - discount;
        } else if (radGood.isSelected()) {
            apr = 11.99 - discount;
        } else if (radFair.isSelected()) {
            apr = 13.49 - discount;
        } else if (radPoor.isSelected()) {
            apr = 15.99 - discount;
        } else {
            apr = 15.99; // Default value
        }
        // After variable updated, update text
        txtInterest.textProperty().set(String.valueOf(apr));
    }

    public void initialize() {
        // Set rounding mode for final payment amount
        currency.setRoundingMode(RoundingMode.HALF_UP);

        // Add a listener for slider changes, update months variable upon change
        sldTerm.valueProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observableValue, Number oldValue, Number newValue) {
                months = Integer.valueOf(newValue.intValue());
                lblTermLength.setText(String.valueOf(months));
            }
        });

        // Update the APR and discount variable
        updateAPR();
        updateDiscount();
    }
}
