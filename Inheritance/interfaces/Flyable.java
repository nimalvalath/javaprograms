interface Flyable {

public int a=1; //
double MAX_SPEED= 5000;

/*-any variables in interface will be automatically
 	converted to final static field
-- empy methods are allowed but concrete methods are not
-- all the member methods get a public Access Modifier by default
*/
public void start();
public void fly();
public void land();
//we can also specify as --
void stop();


}
