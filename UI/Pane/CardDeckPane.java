package UI.Pane;

import javax.swing.*;
import java.awt.*;

public class CardDeckPane extends JLayeredPane{
    // 보유 카드 덱에 있는 카드 보여주는 JLayeredPane
    public static final int width = 160;
    public static final int height = 210;

    public CardDeckPane() {
        setBounds(20,635,75,75);
        setOpaque(true);
        setBackground(Color.YELLOW);
        setAlignmentX(Component.CENTER_ALIGNMENT); 
    }
}
