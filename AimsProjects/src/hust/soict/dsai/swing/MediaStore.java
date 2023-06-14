package hust.soict.dsai.swing;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.media.Media;
import hust.soict.dsai.aims.media.Playable;

public class MediaStore extends JPanel {
    private Media media;
    private Cart cart;
    public MediaStore(Media media) {
        this.media = media;
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        JLabel title = new JLabel(media.getTitle());
        title.setFont(new Font(title.getFont().getName(), Font.PLAIN, 20));
        title.setAlignmentX(CENTER_ALIGNMENT);

        JLabel cost = new JLabel("" + media.getCost() + "$");
        cost.setAlignmentX(CENTER_ALIGNMENT);

        JPanel container = new JPanel();
        container.setLayout(new FlowLayout(FlowLayout.CENTER));

        JButton addCartButton = new JButton("Add to cart"); 
        container.add(addCartButton);
        addCartButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cart.addMedia(media);
                JDialog playDialog = new JDialog();

                JLabel l = new JLabel("Media play");

                playDialog.add(l);
                playDialog.setSize(100, 100);
                playDialog.setVisible(true);
            }
        });
        if (media instanceof Playable) {
            JButton playButton = new JButton("Play");
            container.add(playButton);
            playButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    JDialog playDialog = new JDialog();

                    JLabel l = new JLabel("Media play");

                    playDialog.add(l);
                    playDialog.setSize(100, 100);
                    playDialog.setVisible(true);
                }
            });
        }

        this.add(Box.createVerticalGlue());
        this.add(title);
        this.add(cost);
        this.add(Box.createVerticalGlue());
        this.add(container);

        this.setBorder(BorderFactory.createLineBorder(Color.BLACK));
    }

    private class ButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            // TODO Auto-generated method stub
            String s = e.getActionCommand();
            if (s.equals("Play")) {
                JDialog playDialog = new JDialog();

                JLabel l = new JLabel("Media play");

                playDialog.add(l);
                playDialog.setSize(100, 100);
                playDialog.setVisible(true);
            } else if (s.equals("Add to cart")) {
                
            }
        }
    }
}
