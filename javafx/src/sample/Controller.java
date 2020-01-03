package sample;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXDrawer;
import com.jfoenix.controls.JFXHamburger;
import com.jfoenix.transitions.hamburger.HamburgerSlideCloseTransition;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.chart.*;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    @FXML
    private HBox top_bar;

    @FXML
    private JFXHamburger ham_menu;

    @FXML
    private ImageView admin_icon;

    @FXML
    private HBox bar_box;

    @FXML
    private Pane bar_pane;

    @FXML
    private JFXDrawer drawer;

    @FXML
    private JFXButton btn_login;

    @FXML
    private PieChart piechart;


    @FXML
    private BarChart<?, ?> main_barchart;

    @FXML
    private CategoryAxis x;

    @FXML
    private NumberAxis y;

    @FXML
    private BarChart<?, ?> cust_bar;

    @FXML
    private CategoryAxis cust_x;

    @FXML
    private NumberAxis cust_y;

    @FXML
    private LineChart<?, ?> growth_rate;

    @FXML
    private CategoryAxis growthrate_x;

    @FXML
    private NumberAxis growthrate_y;


    @FXML
    private LineChart<?, ?> product_rate;


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        //initDrawer();
        //piechart1();
        //barchar1();
        //custbar();
        //linecahrt();
        product_line();
    }

    private void product_line() {

        XYChart.Series set1=new XYChart.Series<>();
        set1.getData().add(new XYChart.Data("A",100) );
        set1.getData().add(new XYChart.Data("B",92) );
        set1.getData().add(new XYChart.Data("C",50) );
        set1.getData().add(new XYChart.Data("D",100) );
        set1.getData().add(new XYChart.Data("E",69) );
        set1.getData().add(new XYChart.Data("F",69) );

        XYChart.Series set2=new XYChart.Series<>();
        set2.getData().add(new XYChart.Data("A",10) );
        set2.getData().add(new XYChart.Data("B",50) );
        set2.getData().add(new XYChart.Data("C",70) );
        set2.getData().add(new XYChart.Data("D",80) );
        set2.getData().add(new XYChart.Data("E",69) );
        set2.getData().add(new XYChart.Data("F",75) );

        XYChart.Series set3=new XYChart.Series<>();
        set3.getData().add(new XYChart.Data("A",97) );
        set3.getData().add(new XYChart.Data("B",53) );
        set3.getData().add(new XYChart.Data("C",75) );
        set3.getData().add(new XYChart.Data("D",86) );
        set3.getData().add(new XYChart.Data("E",93) );
        set3.getData().add(new XYChart.Data("F",79) );

        XYChart.Series set4=new XYChart.Series<>();
        set4.getData().add(new XYChart.Data("A",12) );
        set4.getData().add(new XYChart.Data("B",59) );
        set4.getData().add(new XYChart.Data("C",24) );
        set4.getData().add(new XYChart.Data("D",6) );
        set4.getData().add(new XYChart.Data("E",36) );
        set4.getData().add(new XYChart.Data("F",77) );

        XYChart.Series set5=new XYChart.Series<>();
        set5.getData().add(new XYChart.Data("A",35) );
        set5.getData().add(new XYChart.Data("B",30) );
        set5.getData().add(new XYChart.Data("C",67) );
        set5.getData().add(new XYChart.Data("D",45) );
        set5.getData().add(new XYChart.Data("E",77) );
        set5.getData().add(new XYChart.Data("F",26) );

        XYChart.Series set6=new XYChart.Series<>();
        set6.getData().add(new XYChart.Data("A",15) );
        set6.getData().add(new XYChart.Data("B",95) );
        set6.getData().add(new XYChart.Data("C",85) );
        set6.getData().add(new XYChart.Data("D",40) );
        set6.getData().add(new XYChart.Data("E",30) );
        set6.getData().add(new XYChart.Data("F",20) );

        product_rate.getYAxis().setTickLabelsVisible(false);
        product_rate.getYAxis().setTickMarkVisible(false);
        product_rate.getXAxis().setTickMarkVisible(false);
        product_rate.getXAxis().setTickLabelsVisible(false);
        product_rate.getData().addAll(set1,set2,set3,set4,set5,set6);
    }

    private void linecahrt() {

        XYChart.Series set=new XYChart.Series<>();
        set.getData().add(new XYChart.Data("A",100) );
        set.getData().add(new XYChart.Data("B",92) );
        set.getData().add(new XYChart.Data("C",50) );
        set.getData().add(new XYChart.Data("D",100) );
        set.getData().add(new XYChart.Data("E",69) );
        set.getData().add(new XYChart.Data("F",69) );
        growth_rate.getYAxis().setTickLabelsVisible(false);
        growth_rate.getYAxis().setTickMarkVisible(false);
        growth_rate.getXAxis().setTickMarkVisible(false);
        growth_rate.getXAxis().setTickLabelsVisible(false);
        growth_rate.getData().addAll(set);

    }

    private void custbar() {
        XYChart.Series set=new XYChart.Series<>();
        set.getData().add(new XYChart.Data("A",100) );
        set.getData().add(new XYChart.Data("B",92) );
        set.getData().add(new XYChart.Data("C",50) );
        set.getData().add(new XYChart.Data("D",100) );
        set.getData().add(new XYChart.Data("E",69) );
        set.getData().add(new XYChart.Data("F",69) );
        cust_bar.getYAxis().setTickLabelsVisible(false);
        cust_bar.getYAxis().setTickMarkVisible(false);
        cust_bar.getXAxis().setTickMarkVisible(false);
        cust_bar.getXAxis().setTickLabelsVisible(false);
        cust_bar.getData().addAll(set);


    }

    private void barchar1() {
        XYChart.Series set1=new XYChart.Series<>();
        set1.getData().add(new XYChart.Data("Jan",100) );
        set1.getData().add(new XYChart.Data("Feb",92) );
        set1.getData().add(new XYChart.Data("Mar",10) );
        set1.getData().add(new XYChart.Data("Apr",100) );
        set1.getData().add(new XYChart.Data("May",69) );
        set1.getData().add(new XYChart.Data("Jun",72) );
        set1.getData().add(new XYChart.Data("Jul",80) );
        set1.getData().add(new XYChart.Data("Aug",20) );
        set1.getData().add(new XYChart.Data("Sept",10) );
        set1.getData().add(new XYChart.Data("Oct",75) );
        set1.getData().add(new XYChart.Data("Nov",65) );
        set1.getData().add(new XYChart.Data("Dec",29) );

        XYChart.Series set2=new XYChart.Series<>();
        set2.getData().add(new XYChart.Data("Jan",10) );
        set2.getData().add(new XYChart.Data("Feb",30) );
        set2.getData().add(new XYChart.Data("Mar",72) );
        set2.getData().add(new XYChart.Data("Apr",10) );
        set2.getData().add(new XYChart.Data("May",39) );
        set2.getData().add(new XYChart.Data("Jun",75) );
        set2.getData().add(new XYChart.Data("Jul",64) );
        set2.getData().add(new XYChart.Data("Aug",99) );
        set2.getData().add(new XYChart.Data("Sept",60) );
        set2.getData().add(new XYChart.Data("Oct",85) );
        set2.getData().add(new XYChart.Data("Nov",30) );
        set2.getData().add(new XYChart.Data("Dec",25) );

        main_barchart.getData().addAll(set1,set2);


    }

    private void piechart1() {
        ObservableList<PieChart.Data> pieChartData =
                FXCollections.observableArrayList(
                        new PieChart.Data("Cotton", 13),
                        new PieChart.Data("Terrycot", 25),
                        new PieChart.Data("Silk", 10),
                        new PieChart.Data("Polyster", 22),
                        new PieChart.Data("Syntatic", 32),
                        new PieChart.Data("Velvet", 30));
        piechart.setData(pieChartData);
    }

    private void initDrawer()  {
        try {
            VBox box=FXMLLoader.load(getClass().getResource("/sample/drawer.fxml"));
            drawer.setSidePane(box);
        } catch (IOException e) {
            e.printStackTrace();
        }
        HamburgerSlideCloseTransition burgerTask = new HamburgerSlideCloseTransition(ham_menu);
        burgerTask.setRate(-1);
        ham_menu.addEventHandler(MouseEvent.MOUSE_CLICKED,(event) ->  {
            burgerTask.setRate(burgerTask.getRate()*-1);
                burgerTask.play();
                 if(drawer.isClosed()){
                     drawer.open();
                 }else{
                     drawer.close();
                 }

        });
    }

}

