package app.models;

import java.awt.Color;
import java.awt.Font;

/**
 *
 * @author Titu
 */
public class Constants {

    public static final Color PRIMARY = new Color(156, 15, 72);
    public static final Color PRIMARY_LIGHT_1 = new Color(253, 232, 240);
    public static final Color PRIMARY_LIGHT_2 = Color.decode("#FEFAFC");
    public static final Color LIGHT_GRAY_250 = new Color(250, 250, 250);
    public static final Color LIGHT_GRAY_243 = new Color(243, 243, 243);
    public static final Color GREEN = Color.decode("#0D9276");
    public static final Color BLUE = Color.decode("#0B60B0");
    public static final Color BLUE_1 = new Color(234,245,255);
    public static final Color GOLD = Color.decode("#FFA447");

    public static final Font PRIMARY_12_SB = new Font("Rajdhani Semibold", 0, 12);
    public static final Font PRIMARY_13_SB = new Font("Rajdhani Semibold", 0, 13);
    public static final Font PRIMARY_14_SB = new Font("Rajdhani Semibold", 0, 14);

    public static final Font PRIMARY_12_BOLD = new Font("Rajdhani", 1, 12);
    public static final Font PRIMARY_13_BOLD = new Font("Rajdhani", 1, 13);
    public static final Font PRIMARY_14_BOLD = new Font("Rajdhani", 1, 14);

    private static final CustomArrayList<String> ICONS;

    static {
        ICONS = new CustomArrayList();
        ICONS.addItems("sysygyDashboard.png", "plus.png", "completedOrder.png");
    }

    public static CustomArrayList<String> getIcons() {
        return ICONS;
    }
}
