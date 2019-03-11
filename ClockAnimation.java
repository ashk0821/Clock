package IntroductionCS.u12.day01;
import javax.swing.JFrame;
import javax.swing.Timer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClockAnimation extends JFrame {
    private StillClock clock = new StillClock();

    public ClockAnimation () {
        add (clock);

        Timer timer = new Timer (1000, new  ActionListener () {
            public void actionPerformed(ActionEvent e) {
                clock.setCurrentTime();
                clock.repaint();
            }
        });
        timer.start();
    }

    public static void main(String[] args) {
        ClockAnimation frame = new ClockAnimation();
        frame.setTitle("Clock");
        frame.setSize(200,200);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}


