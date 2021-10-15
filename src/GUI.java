import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI {

    public GUI() {
        JFrame frame = new JFrame("Address Book Creator");
        frame.setLayout(new BorderLayout());
        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("Menu");
        AddressBook addressBook = new AddressBook();
        JList<BuddyInfo> list = new JList<>(addressBook);
        frame.add(list);
        JMenuItem createAddressBook = new JMenuItem("Create Address Book");
        createAddressBook.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                list.removeAll();
                JOptionPane.showMessageDialog(null, "New Address Book Created");
            }
        });
        JMenuItem addBuddy = new JMenuItem("Add BuddyInfo");
        addBuddy.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String name = JOptionPane.showInputDialog("Enter Buddy Name:");
                String address = JOptionPane.showInputDialog("Enter Buddy Address:");
                String phoneNumber = JOptionPane.showInputDialog("Enter Buddy Phone Number");
                BuddyInfo buddy = new BuddyInfo(name, address, phoneNumber);
                addressBook.addElement(buddy);
            }
        });
        JMenuItem removeBuddy = new JMenuItem("Remove BuddyInfo");
        removeBuddy.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                addressBook.removeBuddy(list.getSelectedValue());
            }
        });
        menu.add(createAddressBook);
        menu.add(addBuddy);
        menu.add(removeBuddy);
        menuBar.add(menu);
        frame.setJMenuBar(menuBar);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,300);
        frame.setLocation(100,100);
        frame.setVisible(true);
    }
}
