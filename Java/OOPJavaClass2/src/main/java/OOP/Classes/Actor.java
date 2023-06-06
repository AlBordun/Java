package OOP.Classes;

import OOP.Interfaces.IActorBehaviour;

abstract public class Actor implements IActorBehaviour {


    protected String FirstName;
    protected String LastName;
    protected boolean isTakeOrder;
    protected boolean isMakeOrder;

    public Actor(String FirstName, String LastName) {
        this.FirstName = FirstName;
        this.LastName = LastName;
    }

    abstract public String GetFirstName();

    abstract public String GetLastName();

}
