package com.KerrYip.ClientApplication;

import com.KerrYip.ClientController.ClientGUIController;

/**
 * This class is meant to be the main application class for the client side of
 * the client server application
 * 
 * @author Tyler Yip
 * @author Will Kerr
 * @version 2.0
 * @since 04/07/20
 *
 */
public class RegistrationAppClient {
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		ClientGUIController cgc = new ClientGUIController(1200, 800, "localhost", 9898);
	}
}