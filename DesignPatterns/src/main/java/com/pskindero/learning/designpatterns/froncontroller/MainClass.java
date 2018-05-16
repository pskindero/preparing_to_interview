package com.pskindero.learning.designpatterns.froncontroller;

/**
 * FRONT CONTROLLER
 * - web pattern
 * 
 * Used to provide a centralized request handling mechanism so that all requests will be handled by 
 * a single handler. This handler can do the authentication/ authorization/ logging or tracking of 
 * request and then pass the requests to corresponding handlers.
 * Used e.g. in Spring MVC
 */
public class MainClass {

	public static void main(String[] args) {
		FrontController fc = new FrontController();
		fc.dispatchRequest("/about");
	}
}

class FrontController {
	RequestDispatcher dispatcher= new RequestDispatcher();
	
	private void auditLog(String request) {System.out.println("Received request: " + request);}
	
	private boolean isAuthenticated( ) {return true;}
	
	public void dispatchRequest(String request) {
		auditLog(request);
		
		if (isAuthenticated()) {
			dispatcher.dispatch(request);
		}
	}
}

class RequestDispatcher {
	HomePageView homeView = new HomePageView();
	AboutPageView aboutView = new AboutPageView();
	
	public void dispatch(String request) {
		if (request.equals("/about"))
			aboutView.show();
		else
			homeView.show();
	}
}

class HomePageView implements View {
	@Override public void show() {System.out.println("Home Page");}
}

class AboutPageView implements View {
	@Override public void show() {System.out.println("About Page");}
}

interface View {
	void show();
}