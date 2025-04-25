package com.example.project2ai;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    @FXML
    private BorderPane borderPane;
    @FXML
    private TextField tRField;
    @FXML
    private TextField nField;
    @FXML
    private ChoiceBox <String> hiddenFuncChoiceBox;
    @FXML
    private ImageView image;
    @FXML
    private HBox weightsHBox;
    @FXML
    private TextField w13TF;
    @FXML
    private TextField w14TF;
    @FXML
    private TextField w23TF;
    @FXML
    private TextField w24TF;
    @FXML
    private TextField w35TF;
    @FXML
    private TextField w45TF;
    @FXML
    private TextField thr3TF;
    @FXML
    private TextField thr4TF;
    @FXML
    private TextField thr5TF;
    @FXML
    private TextField w1TF;
    @FXML
    private TextField w2TF;
    @FXML
    private TextField thr1TF;
    @FXML
    private ChoiceBox <String> weightChoiceBox;
    @FXML
    private ChoiceBox <String> gateChoiceBox;
    @FXML
    private ChoiceBox <String> outFuncChoiceBox;
    private final double [] weightsArray = new double[12];;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        String [] choices = {"Random weights and thresholds", "Custom weights and thresholds"};
        String [] gates = {"NOT", "AND", "NAND", "OR", "NOR", "XOR", "XNOR"};
        String [] hiddenFunctions = { "Sigmoid Function", "Tanh Function"};
        String [] outFunctions = {"Step Function", "Sigmoid Function"};
        String [] outFunctions2 = {"Sigmoid Function", "Tanh Function"};
        weightsHBox.setVisible(false);
        weightChoiceBox.getItems().addAll(choices);
        weightChoiceBox.getSelectionModel().selectFirst();
        weightChoiceBox.getSelectionModel().selectedItemProperty().addListener((v, oldValue, newValue) -> {
            if(newValue.equals("Custom weights and thresholds")) {
                weightsHBox.setVisible(true);
                if(gateChoiceBox.getValue().equals("XOR") || gateChoiceBox.getValue().equals("XNOR")){
                    w13TF.setText(null);
                    w14TF.setText(null);
                    w23TF.setText(null);
                    w24TF.setText(null);
                    w35TF.setText(null);
                    w45TF.setText(null);
                    thr3TF.setText(null);
                    thr4TF.setText(null);
                    thr5TF.setText(null);
                    w13TF.setEditable(true);
                    w14TF.setEditable(true);
                    w23TF.setEditable(true);
                    w24TF.setEditable(true);
                    w35TF.setEditable(true);
                    w45TF.setEditable(true);
                    thr3TF.setEditable(true);
                    thr4TF.setEditable(true);
                    thr5TF.setEditable(true);

                    w1TF.setText("(Not Used)");
                    w2TF.setText("(Not Used)");
                    thr1TF.setText("(Not Used)");
                    w1TF.setEditable(false);
                    w2TF.setEditable(false);
                    thr1TF.setEditable(false);
                }
                else {
                    w13TF.setText("(Not Used)");
                    w14TF.setText("(Not Used)");
                    w23TF.setText("(Not Used)");
                    w24TF.setText("(Not Used)");
                    w35TF.setText("(Not Used)");
                    w45TF.setText("(Not Used)");
                    thr3TF.setText("(Not Used)");
                    thr4TF.setText("(Not Used)");
                    thr5TF.setText("(Not Used)");
                    w13TF.setEditable(false);
                    w14TF.setEditable(false);
                    w23TF.setEditable(false);
                    w24TF.setEditable(false);
                    w35TF.setEditable(false);
                    w45TF.setEditable(false);
                    thr3TF.setEditable(false);
                    thr4TF.setEditable(false);
                    thr5TF.setEditable(false);

                    w1TF.setText(null);
                    w2TF.setText(null);
                    thr1TF.setText(null);
                    w1TF.setEditable(true);
                    w2TF.setEditable(true);
                    thr1TF.setEditable(true);
                }
            }
            else{
                weightsHBox.setVisible(false);

            }
        });
        gateChoiceBox.getItems().addAll(gates);
        gateChoiceBox.getSelectionModel().selectFirst();
        gateChoiceBox.getSelectionModel().selectedItemProperty().addListener((v, oldValue, newValue) -> {
            String path = "src\\main\\resources\\com\\example\\project2ai\\images\\" + newValue.toLowerCase() + ".png";
            File file = new File(path);
            image.setImage(new Image(file.toURI().toString()));
            if(newValue.equals("XOR") || newValue.equals("XNOR")) {
                outFuncChoiceBox.getItems().setAll(outFunctions2);
                hiddenFuncChoiceBox.setMouseTransparent(false);
                hiddenFuncChoiceBox.getSelectionModel().selectFirst();
                outFuncChoiceBox.getSelectionModel().selectFirst();


                w13TF.setText(null);
                w14TF.setText(null);
                w23TF.setText(null);
                w24TF.setText(null);
                w35TF.setText(null);
                w45TF.setText(null);
                thr3TF.setText(null);
                thr4TF.setText(null);
                thr5TF.setText(null);
                w13TF.setEditable(true);
                w14TF.setEditable(true);
                w23TF.setEditable(true);
                w24TF.setEditable(true);
                w35TF.setEditable(true);
                w45TF.setEditable(true);
                thr3TF.setEditable(true);
                thr4TF.setEditable(true);
                thr5TF.setEditable(true);

                w1TF.setText("(Not Used)");
                w2TF.setText("(Not Used)");
                thr1TF.setText("(Not Used)");
                w1TF.setEditable(false);
                w2TF.setEditable(false);
                thr1TF.setEditable(false);
            } else{
                outFuncChoiceBox.getItems().setAll(outFunctions);
                outFuncChoiceBox.getSelectionModel().selectFirst();
                hiddenFuncChoiceBox.setMouseTransparent(true);
                hiddenFuncChoiceBox.getSelectionModel().select("(No Hidden Layer)");

                w14TF.setText("(Not Used)");
                w23TF.setText("(Not Used)");
                w24TF.setText("(Not Used)");
                w35TF.setText("(Not Used)");
                w45TF.setText("(Not Used)");
                thr3TF.setText("(Not Used)");
                thr4TF.setText("(Not Used)");
                thr5TF.setText("(Not Used)");
                w13TF.setEditable(false);
                w14TF.setEditable(false);
                w23TF.setEditable(false);
                w24TF.setEditable(false);
                w35TF.setEditable(false);
                w45TF.setEditable(false);
                thr3TF.setEditable(false);
                thr4TF.setEditable(false);
                thr5TF.setEditable(false);

                w1TF.setText(null);
                w2TF.setText(null);
                thr1TF.setText(null);
                w1TF.setEditable(true);
                w2TF.setEditable(true);
                thr1TF.setEditable(true);
            }
        });
        hiddenFuncChoiceBox.setMouseTransparent(true);
        hiddenFuncChoiceBox.getSelectionModel().select("(No Hidden Layer)");
        hiddenFuncChoiceBox.getItems().addAll(hiddenFunctions);
        outFuncChoiceBox.getItems().removeAll();
        outFuncChoiceBox.getItems().addAll(outFunctions);
        outFuncChoiceBox.getSelectionModel().selectFirst();
        tRField.setText("0.1");
        nField.setText("1000");
    }
    private double sigmoid(double x){
        return 1 / (1 + Math.exp(-x));
    }
    private double dSigmoid(double x){
        return (1 - x);
    }
    private double step(double x){
        return x >= 0 ? 1 : 0;
    }
    private double tanH(double x){
        return Math.tanh(x);
    }
    @FXML
    private void GateButtonClicked(){
        if (weightChoiceBox.getValue().equals("Custom weights and thresholds")) {
            try {
                if(gateChoiceBox.getValue().equals("XOR") || gateChoiceBox.getValue().equals("XNOR")){
                    weightsArray[0] = Double.parseDouble(w13TF.getText());
                    weightsArray[1] = Double.parseDouble(w14TF.getText());
                    weightsArray[2] = Double.parseDouble(w23TF.getText());
                    weightsArray[3] = Double.parseDouble(w24TF.getText());
                    weightsArray[4] = Double.parseDouble(w35TF.getText());
                    weightsArray[5] = Double.parseDouble(w45TF.getText());
                    weightsArray[6] = Double.parseDouble(thr3TF.getText());
                    weightsArray[7] = Double.parseDouble(thr4TF.getText());
                    weightsArray[8] = Double.parseDouble(thr5TF.getText());
                    for (int i = 0; i < 9; i++) {
                        if (weightsArray[i] > 1.2 || weightsArray[i] < -1.2) {
                            JOptionPane.showMessageDialog(null, "Choose weights' and/or thresholds' values to be between 1.2 and -1.2!");
                            return;
                        }
                    }
                }
                else{
                    weightsArray[9] = Double.parseDouble(w1TF.getText());
                    weightsArray[10] = Double.parseDouble(w2TF.getText());
                    weightsArray[11] = Double.parseDouble(thr1TF.getText());
                    for (int i = 9; i < 12; i++) {

                        if (weightsArray[i] > 1 || weightsArray[i] < -1) {
                            JOptionPane.showMessageDialog(null, "Choose weights' and/or thresholds' values to be between 1 and -1!");
                            return;
                        }
                    }
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "The value/values entered MUST be a number!");
                return;
            } catch (NullPointerException e) {
                JOptionPane.showMessageDialog(null, "Please fill all the necessary fields!");
                return;
            }
        }
        try {
            double value = Double.parseDouble(tRField.getText());
            if(value < 0.1 || value > 0.9){
                JOptionPane.showMessageDialog(null, "Please choose a training rate value between 0.1 and 0.9.");
                return;
            }
            int value2 = Integer.parseInt(nField.getText());
            if(value2 < 100 || value2 > 10000){
                JOptionPane.showMessageDialog(null, "Please choose a number of epochs that's an INTEGER between 100 and 10000.");
                return;
            }
        } catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "The value/values entered MUST be a number!");
            return;
        }
        String func = outFuncChoiceBox.getValue();
        String s = gateChoiceBox.getValue();
        switch (s) {
            case "NOT":
                twoInputNoHiddenLayerPerceptron(new int[]{0, 1, 2, 2}, func);
                break;
            case "AND":
                twoInputNoHiddenLayerPerceptron(new int[]{0, 0, 0, 1}, func);
                break;
            case "NAND":
                twoInputNoHiddenLayerPerceptron(new int[]{1, 1, 1, 0}, func);
                break;
            case "OR":
                twoInputNoHiddenLayerPerceptron(new int[]{0, 1, 1, 1}, func);
                break;
            case "NOR":
                twoInputNoHiddenLayerPerceptron(new int[]{1, 0, 0, 0}, func);
                break;
            case "XOR":
                towInputOneHiddenLayerPerceptron(0);
                break;
            case "XNOR":
                towInputOneHiddenLayerPerceptron(1);
                break;
        }
    }

    void twoInputNoHiddenLayerPerceptron(int []gateOut, String func){
        int [][] gateIn = {{0, 0, 1, 1}, {0, 1, 0, 1}}; // Array of gate inputs
        int x1; // input 1
        int x2; // input 2
        double w1; // weight 1
        double w2; // weight 2
        double thr; // threshold
        if(weightChoiceBox.getValue().equals("Custom weights and thresholds")){
            w1 = weightsArray[9];
            w2 = weightsArray[10];
            thr = weightsArray[11];
        }
        else {
            w1 = Math.random() * 2 - 1;
            w2 = Math.random() * 2 - 1;
            thr = Math.random() * 2 - 1;
        }
        double ya; // actual output
        double e; // error on output
        double a = Double.parseDouble(tRField.getText()); // training rate
        int epochs = Integer.parseInt(nField.getText());
        JFrame frame = new JFrame();
        for(int i = 0; i < epochs; i++) {
            for (int j = 0; j < 4; j++) {
                x1 = gateIn[0][j];
                x2 = gateIn[1][j];
                if(gateOut[2] + gateOut[3] == 4){
                    if (j == 0){
                        x1 = 0;
                        x2 = 0;
                    } else if (j == 1) {
                        x1 = 1;
                        x2 = 0;
                    }
                    else
                        break;
                }
                ya = (x1 * w1 + x2 * w2 + thr);
                switch (func){
                    case "Step Function":
                        ya = step(ya);
                        break;
                    case "Sigmoid Function":
                        ya = sigmoid(ya);
                        break;
                    default:
                        break;
                }
                e = gateOut[j] - ya;
                w1 += a * x1 * e;
                w2 += a * x2 * e;
                thr += a * e;
            }
            drawPlot(w1, w2, -1 * thr, 0, 0, 0, gateOut, frame);
        }

    }

    void towInputOneHiddenLayerPerceptron(int xor) {
        int[][] gateIn = {{1, 1, 0, 0}, {1, 0, 1, 0}}; // inputs
        int[][] gateOut = {{0, 1, 1, 0}, {1, 0, 0, 1}}; // XOR and XNOR outputs
        int x1, x2;
        double x3, x4;
        double w13;
        double w14;
        double w23;
        double w24;
        double w35;
        double w45;
        double thr3;
        double thr4;
        double thr5;
        if(weightChoiceBox.getValue().equals("Custom weights and thresholds")){
            w13 = weightsArray[0];
            w14 = weightsArray[1];
            w23 = weightsArray[2];
            w24 = weightsArray[3];
            w35 = weightsArray[4];
            w45 = weightsArray[5];
            thr3 = weightsArray[6];
            thr4 = weightsArray[7];
            thr5 = weightsArray[8];
        }
        else {
            w13 = Math.random() * 2.4 - 1.2;
            w14 = Math.random() * 2.4 - 1.2;
            w23 = Math.random() * 2.4 - 1.2;
            w24 = Math.random() * 2.4 - 1.2;
            w35 = Math.random() * 2.4 - 1.2;
            w45 = Math.random() * 2.4 - 1.2;
            thr3 = Math.random() * 2.4 - 1.2;
            thr4 = Math.random() * 2.4 - 1.2;
            thr5 = Math.random() * 2.4 - 1.2;
        }
        double ya; // Output
        double e; // Error
        double sumE = 0;
        int j;
        double b5, b3, b4;
        double a = Double.parseDouble(tRField.getText());
        int epochs = Integer.parseInt(nField.getText());
        String hiddenFunc = hiddenFuncChoiceBox.getValue();
        String outFunc = outFuncChoiceBox.getValue();
        JFrame frame = new JFrame();

        for (j = 0; j < epochs; j++) {
            for (int i = 0; i < 4; i++) {
                // Forward pass
                x1 = gateIn[0][i];
                x2 = gateIn[1][i];
                x3 = x1 * w13 + x2 * w23 - thr3;
                x4 = x1 * w14 + x2 * w24 - thr4;

                switch (hiddenFunc){
                    case "Tanh Function":
                        x3 = tanH(x3);
                        x4 = tanH(x4);
                        break;
                    case "Sigmoid Function":
                        x3 = sigmoid(x3);
                        x4 = sigmoid(x4);
                        break;
                    default:
                        break;
                }

                ya = x3 * w35 + x4 * w45 - thr5;

                switch (outFunc){
                    case "Step Function":
                        ya = step(ya);
                        e = gateOut[xor][i] - ya;
                        b5 = ya * e;
                        break;
                    case "Sigmoid Function":
                        ya = sigmoid(ya);
                        e = gateOut[xor][i] - ya;
                        b5 = ya * dSigmoid(ya) * e;
                        break;
                    case "Tanh Function":
                        ya = tanH(ya);
                        e = gateOut[xor][i] - ya;
                        b5 = (1 - ya * ya) * e;
                        break;
                    default:
                        e = gateOut[xor][i] - ya;
                        b5 = ya * e;
                }

                switch (hiddenFunc){
                    case "Tanh Function":
                        b3 = (1 - x3 * x3) * b5 * w35;
                        b4 = (1 - x4 * x4) * b5 * w45;
                        break;
                    case "Sigmoid Function":
                        b3 = x3 * dSigmoid(x3) * b5 * w35;
                        b4 = x4 * dSigmoid(x4) * b5 * w45;
                        break;
                    default:
                        b3 = x3 * b5 * w35;
                        b4 = x4 * b5 * w45;
                        break;
                }

                w13 += a * x1 * b3;
                w14 += a * x1 * b4;
                w23 += a * x2 * b3;
                w24 += a * x2 * b4;
                w35 += a * x3 * b5;
                w45 += a * x4 * b5;
                thr3 += a * -1 * b3;
                thr4 += a * -1 * b4;
                thr5 += a * -1 * b5;
                sumE += Math.pow(e, 2);
            }
            drawPlot(w13, w23, thr3, w14, w24, thr4, gateOut[xor], frame);
            if (sumE <= 0.05)
                break;
            sumE = 0;
        }
    }

    public static void drawPlot(double a, double b, double c, double x, double y, double z, int[] gateOut, JFrame frame) {

            LineAndPointPanel panel = new LineAndPointPanel(a, b, c, x, y, z, gateOut);
            panel.setPreferredSize(new Dimension(400, 400));
            frame.add(panel);
            frame.pack();
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
    }

}