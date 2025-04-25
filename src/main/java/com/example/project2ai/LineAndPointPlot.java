package com.example.project2ai;

import javax.swing.*;
import java.awt.*;

class LineAndPointPanel extends JPanel {

    private double a, b, c, x, y, z;
    private int [] gateType;

    public LineAndPointPanel(double a, double b, double c, double x, double y, double z, int [] gateType) {
        this.a = a;
        this.b = b;
        this.c = 100 * c;
        this.x = x;
        this.y = y;
        this.z = 100 * z;
        this.gateType = gateType;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;

        int width = getWidth();
        int height = getHeight();

        g2.drawLine(0, height / 2, width, height / 2); // x-axis
        g2.drawLine(width / 2, 0, width / 2, height); // y-axis


        if (b != 0) {
            double x1 = (double) -width / 2;
            double y1 = (c - a * x1) / b;
            double x2 = (double) width / 2;
            double y2 = (c - a * x2) / b;

            int x1Panel = (int) (width / 2 + x1);
            int y1Panel = (int) (height / 2 - y1);
            int x2Panel = (int) (width / 2 + x2);
            int y2Panel = (int) (height / 2 - y2);

            g2.drawLine(x1Panel, y1Panel, x2Panel, y2Panel);
        } else if (a != 0) {
            double w = c / a;
            int xPanel = (int) (width / 2 + w);
            g2.drawLine(xPanel, 0, xPanel, height);
        }

        if (y != 0) {
            double x1 = (double) -width / 2;
            double y1 = (z - x * x1) / y;
            double x2 = (double) width / 2;
            double y2 = (z - x * x2) / y;

            int x1Panel = (int) (width / 2 + x1);
            int y1Panel = (int) (height / 2 - y1);
            int x2Panel = (int) (width / 2 + x2);
            int y2Panel = (int) (height / 2 - y2);

            g2.drawLine(x1Panel, y1Panel, x2Panel, y2Panel);
        } else if (x != 0) {
            double w = z / x;
            int xPanel = (int) (width / 2 + w);
            g2.drawLine(xPanel, 0, xPanel, height);
        }


        double pointX = 100;
        double pointY = 100;

        int pointXPanel = (int) (width / 2 + pointX);
        int pointYPanel = (int) (height / 2 - pointY);
        if(gateType[3] == 0)
            g2.drawOval(pointXPanel - 3, pointYPanel - 3, 6, 6);
        else if (gateType[3] != 2)
            g2.fillOval(pointXPanel - 3, pointYPanel - 3, 6, 6);

        pointX = 0;
        pointXPanel = (int) (width / 2 + pointX);
        if(gateType[2] == 0)
            g2.drawOval(pointXPanel - 3, pointYPanel - 3, 6, 6);
        else if (gateType[2] != 2)
            g2.fillOval(pointXPanel - 3, pointYPanel - 3, 6, 6);
        pointY = 0;
        pointYPanel = (int) (width / 2 + pointY);
        if(gateType[0] == 0)
            g2.drawOval(pointXPanel - 3, pointYPanel - 3, 6, 6);
        else
            g2.fillOval(pointXPanel - 3, pointYPanel - 3, 6, 6);

        pointX = 100;
        pointXPanel = (int) (width / 2 + pointX);
        if(gateType[1] == 0)
            g2.drawOval(pointXPanel - 3, pointYPanel - 3, 6, 6);
        else
            g2.fillOval(pointXPanel - 3, pointYPanel - 3, 6, 6);

    }

}
