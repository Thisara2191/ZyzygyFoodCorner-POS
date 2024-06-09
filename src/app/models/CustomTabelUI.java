/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.models;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import javax.swing.JTable;
import static javax.swing.SwingConstants.CENTER;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumnModel;

public class CustomTabelUI {
    
    public static JTable tabelUI(JTable tb, int[] columnWidths, Color Primary, Color PrimaryLight) {
        JTableHeader header = tb.getTableHeader();
        header.setBorder(new MatteBorder(1, 1, 1, 1, Constants.LIGHT_GRAY_243));
        header.setForeground(Primary);
        header.setBackground(Constants.LIGHT_GRAY_250);
        header.setFont(Constants.PRIMARY_12_SB);
        header.setPreferredSize(new Dimension(header.getWidth(), 35));
        tb.setGridColor(Constants.LIGHT_GRAY_243);
        tb.setBorder(new MatteBorder(0, 1, 1, 1, Constants.LIGHT_GRAY_243));
        tb.setRowHeight(35);
        tb.setSelectionBackground(PrimaryLight);
        tb.setSelectionForeground(Primary);
        
        setColumnWidths(tb, columnWidths);
        setColumPropreties(tb);
        
        return tb;
    }
    
    private static JTable setColumnWidths(JTable tb, int[] columnWidths) {
        TableColumnModel columnModel = tb.getColumnModel();
        for (int i = 0; i < columnWidths.length; i++) {
            columnModel.getColumn(i).setPreferredWidth(columnWidths[i]);
        }
        return tb;
    }
    
    private static void setColumPropreties(JTable tb) {
        for (int i = 0; i < tb.getColumnModel().getColumnCount(); i++) {
            tb.getColumnModel().getColumn(i).setCellRenderer(new DefaultTableCellRenderer() {
                @Override
                public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                    super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
                    setBorder(new EmptyBorder(0, 15, 0, 15));
                    setHorizontalAlignment(CENTER);
                    if (isSelected) {
                        setBorder(new MatteBorder(0,0,1,1,Constants.LIGHT_GRAY_243));
                    }
                    return this;
                }
                
            });
        }
        
    }
    
}
