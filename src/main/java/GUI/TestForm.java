package GUI;

import Items.Collection;
import Items.Game;
import Items.Properties.Platform;
import Items.Properties.Region;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.time.LocalDate;
import java.util.ArrayList;

public class TestForm {
    private JButton showGamesButton;
    private JPanel jPanelMain;

    private static String message = "";

    public TestForm() {
        showGamesButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                JOptionPane.showMessageDialog(null, message);
            }
        });
    }

    public static void main(String[] args) {

        Game castlevania = new Game.Builder("Castlevania", Platform.NES)
                .genre("Whipping platformer")
                .description("Stairs are soooo hard")
                .purchasePrice(200.0)
                .purchaseDate(LocalDate.now())
                .region(Region.NTSC_US)
                .completed(true)
                .build();

        Game mario = new Game.Builder("Mario World", Platform.SNES)
                .genre("Platformer")
                .description("Yoshi!")
                .purchasePrice(100.0)
                .purchaseDate(LocalDate.of(2005, 2, 14))
                .region(Region.NTSC_US)
                .completed(true)
                .build();

        Collection collection = new Collection();
        collection.add(castlevania);
        collection.add(mario);

        StringBuilder builder = new StringBuilder();

        ArrayList<Game> games = collection.getGames();
        for (int i = 0; i < games.size()-1; i++) {
            builder.append(games.get(i).getTitle());
            builder.append(", ");
        }
        builder.append(" ");
        builder.append(games.get(games.size()-1).getTitle());

        message = builder.toString();

        JFrame frame = new JFrame("Game Collector");
        frame.setContentPane(new TestForm().jPanelMain);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(400, 300));
        frame.pack();
        frame.setVisible(true);
    }
}
