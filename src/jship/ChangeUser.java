package jship;

import java.awt.GridLayout;
import java.awt.event.*;
import java.util.Arrays;
import javax.swing.*;
import users.ChangeUserDetails;
import users.CreateUser;
import users.CurrentUser;
import users.LoginUser;


/**
 * Form for registering users, logging in, logging out, changing the current user’s password
 * and deleting the current user.
 *
 * @author blackk100
 */
final class ChangeUser extends JFrame {

	/**
	 * Creates new form Login
	 */
	ChangeUser() {
		this.initComponents();
		this.updateAndReset();
		this.setLocationRelativeTo(null);
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    ConfirmP = new JPanel();
    ConfirmL = new JLabel();
    ConfirmPF = new JPasswordField();
    ChangePassP = new JPanel();
    ChangePassL = new JLabel();
    ChangePassPF = new JPasswordField();
    VerifyPassP = new JPanel();
    VerifyPassL = new JLabel();
    VerifyPassPF = new JPasswordField();
    InputP = new JPanel();
    TitleL = new JLabel();
    CurrentUserL = new JLabel();
    CurrentUserTF = new JTextField();
    UserL = new JLabel();
    UserTF = new JTextField();
    PassL = new JLabel();
    PassPF = new JPasswordField();
    ButtonsP = new JPanel();
    LoginB = new JButton();
    Spacer1L = new JLabel();
    LogoutB = new JButton();
    ChangeB = new JButton();
    Spacer2L = new JLabel();
    DeleteB = new JButton();
    RegisterB = new JButton();
    Spacer3L = new JLabel();
    BackB = new JButton();

    ConfirmL.setLabelFor(ConfirmPF);
    ConfirmL.setText("Please confirm your password:");

    GroupLayout ConfirmPLayout = new GroupLayout(ConfirmP);
    ConfirmP.setLayout(ConfirmPLayout);
    ConfirmPLayout.setHorizontalGroup(ConfirmPLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
      .addGroup(ConfirmPLayout.createSequentialGroup()
        .addContainerGap()
        .addGroup(ConfirmPLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
          .addComponent(ConfirmPF, GroupLayout.PREFERRED_SIZE, 321, GroupLayout.PREFERRED_SIZE)
          .addComponent(ConfirmL))
        .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    ConfirmPLayout.setVerticalGroup(ConfirmPLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
      .addGroup(ConfirmPLayout.createSequentialGroup()
        .addContainerGap()
        .addComponent(ConfirmL)
        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(ConfirmPF, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    ChangePassL.setLabelFor(ChangePassPF);
    ChangePassL.setText("Enter the new password:");

    GroupLayout ChangePassPLayout = new GroupLayout(ChangePassP);
    ChangePassP.setLayout(ChangePassPLayout);
    ChangePassPLayout.setHorizontalGroup(ChangePassPLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
      .addGroup(ChangePassPLayout.createSequentialGroup()
        .addContainerGap()
        .addGroup(ChangePassPLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
          .addComponent(ChangePassPF)
          .addGroup(ChangePassPLayout.createSequentialGroup()
            .addComponent(ChangePassL)
            .addGap(0, 200, Short.MAX_VALUE)))
        .addContainerGap())
    );
    ChangePassPLayout.setVerticalGroup(ChangePassPLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
      .addGroup(ChangePassPLayout.createSequentialGroup()
        .addContainerGap()
        .addComponent(ChangePassL)
        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(ChangePassPF, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    VerifyPassL.setLabelFor(VerifyPassPF);
    VerifyPassL.setText("Verify the new password:");

    GroupLayout VerifyPassPLayout = new GroupLayout(VerifyPassP);
    VerifyPassP.setLayout(VerifyPassPLayout);
    VerifyPassPLayout.setHorizontalGroup(VerifyPassPLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
      .addGroup(VerifyPassPLayout.createSequentialGroup()
        .addContainerGap()
        .addGroup(VerifyPassPLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
          .addGroup(VerifyPassPLayout.createSequentialGroup()
            .addComponent(VerifyPassL)
            .addGap(0, 198, Short.MAX_VALUE))
          .addComponent(VerifyPassPF))
        .addContainerGap())
    );
    VerifyPassPLayout.setVerticalGroup(VerifyPassPLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
      .addGroup(VerifyPassPLayout.createSequentialGroup()
        .addContainerGap()
        .addComponent(VerifyPassL)
        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(VerifyPassPF, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
    setTitle("User Management");
    setResizable(false);

    TitleL.setHorizontalAlignment(SwingConstants.CENTER);
    TitleL.setText("User Management");

    CurrentUserL.setLabelFor(CurrentUserTF);
    CurrentUserL.setText("Current User:");

    CurrentUserTF.setEditable(false);

    UserL.setLabelFor(UserTF);
    UserL.setText("Username:");

    PassL.setLabelFor(PassPF);
    PassL.setText("Password:");

    GroupLayout InputPLayout = new GroupLayout(InputP);
    InputP.setLayout(InputPLayout);
    InputPLayout.setHorizontalGroup(InputPLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
      .addGroup(InputPLayout.createSequentialGroup()
        .addContainerGap()
        .addGroup(InputPLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
          .addComponent(TitleL, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addGroup(InputPLayout.createSequentialGroup()
            .addGroup(InputPLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
              .addComponent(CurrentUserL, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
              .addComponent(UserL, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
              .addComponent(PassL, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGap(18, 18, 18)
            .addGroup(InputPLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
              .addComponent(PassPF)
              .addComponent(UserTF)
              .addComponent(CurrentUserTF))))
        .addContainerGap())
    );
    InputPLayout.setVerticalGroup(InputPLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
      .addGroup(InputPLayout.createSequentialGroup()
        .addGap(18, 18, 18)
        .addComponent(TitleL)
        .addGap(18, 18, 18)
        .addGroup(InputPLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
          .addComponent(CurrentUserL)
          .addComponent(CurrentUserTF, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        .addGap(18, 18, 18)
        .addGroup(InputPLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
          .addComponent(UserL)
          .addComponent(UserTF, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        .addGap(18, 18, 18)
        .addGroup(InputPLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
          .addComponent(PassL)
          .addComponent(PassPF, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    ButtonsP.setLayout(new GridLayout(3, 3, 30, 10));

    LoginB.setText("Login");
    LoginB.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent evt) {
        Login(evt);
      }
    });
    ButtonsP.add(LoginB);
    ButtonsP.add(Spacer1L);

    LogoutB.setText("Logout");
    LogoutB.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent evt) {
        Logout(evt);
      }
    });
    ButtonsP.add(LogoutB);

    ChangeB.setText("Change Password");
    ChangeB.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent evt) {
        Change(evt);
      }
    });
    ButtonsP.add(ChangeB);
    ButtonsP.add(Spacer2L);

    DeleteB.setText("Delete User");
    DeleteB.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent evt) {
        Delete(evt);
      }
    });
    ButtonsP.add(DeleteB);

    RegisterB.setText("Register");
    RegisterB.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent evt) {
        Register(evt);
      }
    });
    ButtonsP.add(RegisterB);
    ButtonsP.add(Spacer3L);

    BackB.setText("Go Back");
    BackB.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent evt) {
        GoBack(evt);
      }
    });
    ButtonsP.add(BackB);

    GroupLayout layout = new GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
          .addComponent(ButtonsP, GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE)
          .addComponent(InputP, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        .addContainerGap())
    );
    layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(InputP, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        .addGap(18, 18, 18)
        .addComponent(ButtonsP, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        .addGap(11, 11, 11))
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

	/**
	 * Updates the current user.
	 * Resets all input fields.
	 */
	private void updateAndReset() {
		boolean guest = CurrentUser.getCurrentUser().equals("guest");
		boolean admin = CurrentUser.getCurrentUser().equals("admin");

		this.CurrentUserTF.setText(CurrentUser.getCurrentUser());
		this.UserTF.setText("");
		this.PassPF.setText("");

		this.ChangeB.setEnabled(!guest);
		this.DeleteB.setEnabled(!guest && !admin);

		this.ConfirmPF.setText("");
		this.ChangePassPF.setText("");
		this.VerifyPassPF.setText("");
	}

	/**
	 * Logs the user into the program.
	 *
	 * @param evt Button Click
	 */
	private void Login(ActionEvent evt) {//GEN-FIRST:event_Login
		String user = this.UserTF.getText();
		char[] pass = this.PassPF.getPassword();

		if (user.isEmpty()) {                       // Checks if a username is entered
			System.out.println("Please enter a Username!");
			JOptionPane.showMessageDialog(null, "Please enter a Username!");
		} else if (pass.length == 0) {              // Checks if a password is entered
			System.out.println("Please enter a Password!");
			JOptionPane.showMessageDialog(null, "Please enter a Password!");
		} else {                                    // A Username and a Password has been entered
			LoginUser lu = new LoginUser(user, pass); // Created the LoginUser object
			int res = lu.login();

			this.updateAndReset();
			if (res == -3) {                     // Unknown Exception
				System.out.println("Fatal Error Occured! Contact Developer!");
				JOptionPane.showMessageDialog(null, "Fatal Error Occured! Contact Developer!");
			} else if (res == -2 || res == -1) { // SQL Exception; Class Not Found Exception
				System.out.println("Error Occured! Contact Developer!");
				JOptionPane.showMessageDialog(null, "Error Occured! Contact Developer!");
			} else if (res == 0) {               // ChangeUser Failed
				System.out.println("We could not find a matching user! Please register first!");
				JOptionPane.showMessageDialog(null, "We could not find a matching user! Please register first!");
			} else if (res == 1) {               // ChangeUser Successful
				System.out.println("Logged in!");
				JOptionPane.showMessageDialog(null, "Logged in!");
			} else {                             // Unknown Return Value
				System.out.println("Unknown Return Value! Contact Developer");
				JOptionPane.showMessageDialog(null, "Unknown Return Value! Contact Developer!");
			}
		}
	}//GEN-LAST:event_Login

	/**
	 * Logs the current user out.
	 *
	 * @param evt Button Click
	 */
	private void Logout(ActionEvent evt) {//GEN-FIRST:event_Logout
		if (CurrentUser.getCurrentUser().equals("guest")) { // No User is logged in
			System.out.println("No User is logged in!");
			JOptionPane.showMessageDialog(null, "No User is logged in!");
		} else {                                            // A User is logged in. Logging out.
			CurrentUser.logout();
			this.updateAndReset();
			System.out.println("User logged out!");
			JOptionPane.showMessageDialog(null, "User logged out!");
		}
	}//GEN-LAST:event_Logout

	/**
	 * Registers the user.
	 *
	 * @param evt Button Click
	 */
	private void Register(ActionEvent evt) {//GEN-FIRST:event_Register
		String user = this.UserTF.getText();
		char[] pass = this.PassPF.getPassword();

		if (user.isEmpty()) {                         // Checks if a username is entered
			System.out.println("Please enter a Username!");
			JOptionPane.showMessageDialog(null, "Please enter a Username!");
		} else if (pass.length == 0) {                // Checks if a password is entered
			System.out.println("Please enter a Password!");
			JOptionPane.showMessageDialog(null, "Please enter a Password!");
		} else {                                      // A Username and a Password has been entered
			CreateUser cu = new CreateUser(user, pass); // Created the CreateUser object
			int res = cu.create();

			this.updateAndReset();
			if (res == -4) {                     // User Already Registered Exception
				System.out.println("This Username is not available!");
				JOptionPane.showMessageDialog(null, "This Username is not available!");
			} else if (res == -3) {              // Unknown Exception
				System.out.println("Fatal Error Occured! Contact Developer!");
				JOptionPane.showMessageDialog(null, "Fatal Error Occured! Contact Developer!");
			} else if (res == -2 || res == -1) { // SQL Exception; Class Not Found Exception
				System.out.println("Error Occured! Contact Developer!");
				JOptionPane.showMessageDialog(null, "Error Occured! Contact Developer!");
			} else if (res == 0) {               // ChangeUser Passed
				System.out.println("Registration successful1!");
				JOptionPane.showMessageDialog(null, "Registration successful!");
			} else {                             // Unknown Return Value
				System.out.println("Unknown Return Value! Contact Developer");
				JOptionPane.showMessageDialog(null, "Unknown Return Value! Contact Developer!");
			}
		}
	}//GEN-LAST:event_Register

	/**
	 * Goes back to the main frame.
	 *
	 * @param evt Button Click
	 */
	private void GoBack(ActionEvent evt) {//GEN-FIRST:event_GoBack
		JShip JShip = new JShip(); // Creates the JShip Form object
		JShip.setVisible(true);    // Makes the JShip Form to be visible

		this.dispose();            // Destroys the current form object
	}//GEN-LAST:event_GoBack

	/**
	 * Changes the user's password.
	 *
	 * @param evt button click.
	 */
  private void Change(ActionEvent evt) {//GEN-FIRST:event_Change
		int confirmRes = JOptionPane.showConfirmDialog(null, this.ConfirmP, "Confirm Password", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
		ChangeUserDetails change = new ChangeUserDetails();

		boolean flag = confirmRes == 0;
		confirmLoop:
		while (flag) {              // Checks if the user clicked Yes
			char[] password = this.ConfirmPF.getPassword();

			if (change.checkHash(password) == ChangeUserDetails.getCurrentHash()) { // Checks if the correct current password was entered.
				Arrays.fill(password, '0');             // Security measure

				while (flag) {
					int changeRes = JOptionPane.showConfirmDialog(null, this.ChangePassP, "New Password", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
					if (changeRes != 0) { // Checks if the user clicked Yes
						break confirmLoop;
					}
					char[] newPassword = this.ChangePassPF.getPassword();

					int verifyRes = JOptionPane.showConfirmDialog(null, this.VerifyPassP, "Verify New Password", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
					if (verifyRes != 0) { // Checks if the user clicked Yes
						break confirmLoop;
					}
					char[] verifyPassword = this.VerifyPassPF.getPassword();

					if (newPassword.length == verifyPassword.length) {  // Checks if the new and the verification of the new password match length.
						boolean check = true;

						checkLoop:
						for (int i = 0; i < verifyPassword.length; i++) { // Checks if the new and the verification of the new password match.
							if (verifyPassword[i] != newPassword[i]) {
								check = false;
								break checkLoop;
							}
						}

						if (check) {        // Checks if the new and the verification of the new password match length
							change.updatePassword(newPassword);

							Arrays.fill(newPassword, '0');    // Security measure
							Arrays.fill(verifyPassword, '0'); // Security measure
							JOptionPane.showMessageDialog(null, "Your password has been changed.", "Password Changed", JOptionPane.INFORMATION_MESSAGE);
							this.updateAndReset();
							return;
						} else {            // New and the verification of the new password don't match.
							JOptionPane.showMessageDialog(null, "The Passwords entered don't match!", "Passwords don't Match!", JOptionPane.ERROR_MESSAGE);
						}
					} else {              // New and the verification of the new password don't match.
						JOptionPane.showMessageDialog(null, "The Passwords entered don't match!", "Passwords don't Match!", JOptionPane.ERROR_MESSAGE);
					}
				}
			} else {                  // Incorrect current password entered.
				JOptionPane.showMessageDialog(null, "Incorrect Password entered!", "Password Incorrect", JOptionPane.ERROR_MESSAGE);
				break confirmLoop;
			}
		}
  }//GEN-LAST:event_Change

	/**
	 * Deletes the current user.
	 *
	 * @param evt Button Click
	 */
  private void Delete(ActionEvent evt) {//GEN-FIRST:event_Delete
		int response = JOptionPane.showConfirmDialog(null, this.ConfirmP, "Confirm Password", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
		ChangeUserDetails change = new ChangeUserDetails();

		if (response == 0) { // Checks if the user clicked Yes
			char[] password = this.ConfirmPF.getPassword();

			if (change.checkHash(password) == ChangeUserDetails.getCurrentHash()) { // Checks if the correct current password was entered.
				int res = change.deleteUser();

				if (res < 0) {
					JOptionPane.showMessageDialog(null, "An Error Occurred!", "ERROR", JOptionPane.ERROR_MESSAGE);
				} else {
					JOptionPane.showMessageDialog(null, "User Deleted!", "Delete Performed", JOptionPane.INFORMATION_MESSAGE);
					this.updateAndReset();
				}
			} else { // Incorrect current password entered.
				JOptionPane.showMessageDialog(null, "Incorrect Password entered!", "Password Incorrect", JOptionPane.ERROR_MESSAGE);
			}
		}
  }//GEN-LAST:event_Delete

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private JButton BackB;
  private JPanel ButtonsP;
  private JButton ChangeB;
  private JLabel ChangePassL;
  private JPanel ChangePassP;
  private JPasswordField ChangePassPF;
  private JLabel ConfirmL;
  private JPanel ConfirmP;
  private JPasswordField ConfirmPF;
  private JLabel CurrentUserL;
  private JTextField CurrentUserTF;
  private JButton DeleteB;
  private JPanel InputP;
  private JButton LoginB;
  private JButton LogoutB;
  private JLabel PassL;
  private JPasswordField PassPF;
  private JButton RegisterB;
  private JLabel Spacer1L;
  private JLabel Spacer2L;
  private JLabel Spacer3L;
  private JLabel TitleL;
  private JLabel UserL;
  private JTextField UserTF;
  private JLabel VerifyPassL;
  private JPanel VerifyPassP;
  private JPasswordField VerifyPassPF;
  // End of variables declaration//GEN-END:variables
}
