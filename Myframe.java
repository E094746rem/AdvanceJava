import javax.swing.JFrame;

public class Myframe extends Jbutton{
Myframe(){

    
        // seting a closing for our app EXIT,DO_NOTHING,HIDE
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Seting a diemention of x and y axisis
        this.setSize(680, 780);
        // by seting this value to true we can see our page
        this.setVisible(true);
        // to show a text in our JFrame by adding
        this.setLayout(null);
        this.setTitle("The JFrame Title goes HERE!!<[^]_[^]>");
}
    
}