package MiniProject;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.image.*;

public class CardFrame extends JLabel {
    BufferedImage image;

    public CardFrame(Card c) throws IOException {
        super(new ImageIcon(ImageIO.read(new File("MiniProject/cards_jpeg_zip/JPEG/" + c.getFile()))));
        this.setSize(105, 160);
    }
}
