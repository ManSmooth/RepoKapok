package MiniProject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import java.util.concurrent.*;

public class Main {
    private static JLabel playerText, dealerText, dealerSplash, playerSplash;
    private static HandPanel dealer, player;
    private static boolean stand, natural, dealerNatural;
    private static int playerVal, dealerVal;
    private static ScheduledExecutorService executorService;
    private static JFrame frame;

    public static void main(String[] args) throws IOException {
        frame = new JFrame("Blackjack");
        frame.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        stand = false;
        natural = true;
        dealerNatural = true;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.anchor = GridBagConstraints.NORTH;
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        gbc.gridx = 0;
        gbc.gridy = 0;
        dealer = new HandPanel();
        dealer.draw(1, 1);
        frame.add(dealer, gbc);

        dealerSplash = new JLabel();
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.anchor = GridBagConstraints.CENTER;
        gbc.gridwidth = 1;
        gbc.gridx = 0;
        gbc.gridy = 1;
        dealerSplash.setHorizontalAlignment(JLabel.CENTER);
        dealerSplash.setPreferredSize(new Dimension(100, 20));
        frame.add(dealerSplash, gbc);

        dealerText = new JLabel();
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.anchor = GridBagConstraints.CENTER;
        gbc.gridwidth = 1;
        gbc.gridx = 0;
        gbc.gridy = 2;
        dealerText.setHorizontalAlignment(JLabel.CENTER);
        dealerText.setPreferredSize(new Dimension(100, 20));
        frame.add(dealerText, gbc);

        JButton Hit = new JButton("Hit");
        gbc.fill = GridBagConstraints.NONE;
        gbc.anchor = GridBagConstraints.CENTER;
        gbc.gridwidth = 1;
        gbc.gridx = 0;
        gbc.gridy = 3;
        Hit.setPreferredSize(new Dimension(100, 20));
        frame.add(Hit, gbc);

        JButton Stand = new JButton("Stand");
        gbc.fill = GridBagConstraints.NONE;
        gbc.anchor = GridBagConstraints.CENTER;
        gbc.gridwidth = 1;
        gbc.gridx = 0;
        gbc.gridy = 4;
        Stand.setPreferredSize(new Dimension(100, 20));
        frame.add(Stand, gbc);

        playerText = new JLabel();
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.anchor = GridBagConstraints.CENTER;
        gbc.gridwidth = 1;
        gbc.gridx = 0;
        gbc.gridy = 5;
        playerText.setHorizontalAlignment(JLabel.CENTER);
        playerText.setPreferredSize(new Dimension(100, 20));
        frame.add(playerText, gbc);

        playerSplash = new JLabel();
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.anchor = GridBagConstraints.CENTER;
        gbc.gridwidth = 1;
        gbc.gridx = 0;
        gbc.gridy = 6;
        playerSplash.setHorizontalAlignment(JLabel.CENTER);
        playerSplash.setPreferredSize(new Dimension(100, 20));
        frame.add(playerSplash, gbc);

        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.anchor = GridBagConstraints.SOUTH;
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        gbc.gridx = 0;
        gbc.gridy = 7;
        player = new HandPanel();
        player.draw(2, 0);
        frame.add(player, gbc);
        
        Refresh();
        Stand.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                stand = true;
                Refresh();
            }
        });

        Hit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                natural = false;
                player.draw(1, 0);
                Refresh();
            }
        });
        frame.setSize(800, 640);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    private static void RefreshValue() {
        playerVal = player.getValue();
        dealerVal = dealer.getValue();
        dealerText.setText(String.valueOf(dealerVal));
        playerText.setText(String.valueOf(playerVal));
        playerSplash.setText("");
        if (playerVal == 21) {
            if (natural) {
                playerSplash.setText("Natural Blackjack!");
            } else {
                playerSplash.setText("Blackjack!");
            }
            stand = true;
        } else if (playerVal > 21) {
            playerSplash.setText("Bust!");
            stand = true;
        }
        dealerSplash.setText("");
        if (dealerVal == 21) {
            if (dealerNatural) {
                dealerSplash.setText("Natural Blackjack!");
            } else {
                dealerSplash.setText("Blackjack!");
            }
        } else if (dealerVal > 21) {
            dealerSplash.setText("Bust!");
        }
        System.out.println(player.getHand());
        System.out.println(dealer.getHand());
        System.out.println();
    }

    private static void Refresh() {
        RefreshValue();
        if (stand) {
            dealer.reveal();
            RefreshValue();
            executorService = Executors.newSingleThreadScheduledExecutor();
            executorService.scheduleAtFixedRate(Main::DealerPlay, 1, 1, TimeUnit.SECONDS);
        }
    }

    private static void DealerPlay() {
        if (dealerVal < playerVal && dealerVal < 21 && playerVal <= 21 && !(natural && playerVal == 21)) {
            dealer.draw(1, 0);
            dealerNatural = false;
            RefreshValue();
        } else {
            executorService.shutdown();
            GameEnd();
        }
    }

    private static void GameEnd() {
        String temp = "";
        if (dealerVal > 21 && playerVal > 21) {
            temp = "It's a draw.";
        } else if (dealerNatural && !natural && dealerVal == 21) {
            temp = "You lose.";
        } else if (dealerVal == playerVal) {
            temp = "It's a draw.";
        } else if (dealerVal > 21) {
            temp = "You win!";
        } else if (playerVal > 21) {
            temp = "You lose.";
        } else if (dealerVal < playerVal) {
            temp = "You win!";
        } else if (dealerVal > playerVal) {
            temp = "You lose.";
        }
        Object[] options = { "Yes", "No" };
        int p = JOptionPane.showOptionDialog(frame, "Would you like to continue?", temp, JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE, null, options, "No");
        if (p == 0) {
            stand = false;
            natural = true;
            dealerNatural = true;
            player.reset(2, 0);
            dealer.reset(1, 1);
            Refresh();
        } else {
            frame.dispatchEvent(new WindowEvent(frame, WindowEvent.WINDOW_CLOSING));
        }
    }
}   
