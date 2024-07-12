package observer;

import java.util.ArrayList;
import java.util.List;

public class course implements Subject{
private String name;
private String availability;

private List<Observer> observerList;
 public course(String name) {
	 this.name=name;
	 observerList = new ArrayList<Observer>();
 }
@Override
public void subscribe(Observer observer) {
	// TODO Auto-generated method stub
	observerList.add(observer);
}
@Override
public void unsubscribe(Observer observer) {
	// TODO Auto-generated method stub
	observerList.remove(observer);
}
@Override
public void notifiyallsubscribe() {
	// TODO Auto-generated method stub
	for (Observer observer : observerList) {
		observer.update(availability);
	}
}
public void setAvailability(boolean available) {
	availability = this.name +( available ? " available" : " not available");
	notifiyallsubscribe();
	
} 
}
