package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;

public class Controller {

    @FXML
    private ComboBox<Integer> blue_color;

    @FXML
    private ColorPicker color;

    @FXML
    private ComboBox<Integer> red_color;

    @FXML
    private ComboBox<Integer> green_color;

    @FXML
    private Label red;

    @FXML
    private Label green;

    @FXML
    private Label blue;

    @FXML
    private TextField rgbC;

    ObservableList<Integer> redC =
            FXCollections.observableArrayList(
                    51,
                    102,
                    153,
                    204,
                    255
            );

    ObservableList<Integer> blueC =
            FXCollections.observableArrayList(
                    255,
                    204,
                    153,
                    102,
                    51
            );

    ObservableList<Integer> greenC =
            FXCollections.observableArrayList(
                    153,
                    255,
                    102,
                    204,
                    51
            );

    ObservableList<Integer> rgb =
            FXCollections.observableArrayList(
                    51,
                    102,
                    153,
                    204,
                    255,

                    255,
                    204,
                    153,
                    102,
                    51,

                    153,
                    51,
                    255,
                    102,
                    204
            );

    int fnc(int value)
    {
        if (value > 0 && value < 10)
            return (int) (value * 0.1);
        else if (value > 9 && value < 100)
            return (int) (value * 0.01);
        else if (value > 99 && value < 256)
            return (int) (value * 0.001);
        else
            return 0;
    }

    @FXML
    void action(){
        color.setValue(Color.rgb(red_color.getValue(),blue_color.getValue(),green_color.getValue()));
    }

    @FXML
    void initialize()
    {
        red_color.getItems().addAll(redC);
        green_color.setItems(greenC);
        blue_color.setItems(blueC);
        red_color.setValue(red_color.getItems().get(0));
        green_color.setValue(green_color.getItems().get(0));
        blue_color.setValue(blue_color.getItems().get(0));
        color.setValue(Color.rgb(red_color.getValue(),blue_color.getValue(),green_color.getValue()));
        String s = "";
        for (int i = 0; i < 9; i++)
        {
            s += rgb.get(i) + " ";
        }
        rgbC.setText(s);
    }

}
