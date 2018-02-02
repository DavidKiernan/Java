package flight;

import java.util.ArrayList;

public class Flight {
    private int capacity;
    private double duration;
    private ArrayList <Passenger> pList = new ArrayList <Passenger>();

    public Flight(int c,double dur)
    {
        capacity = c;
        duration = dur;
    }


    public void fillList(Passenger p)
    {
        pList.add(p);
    }
    public void printList()
    {
        for (int i=0;i<pList.size();i++)
        {
            System.out.println(pList.get(i).name +","+ pList.get(i).age);
        }

    }

    public int checkAvailability()
    {
        int seatsTaken = pList.size();
        int remainder=0;

        remainder = capacity - seatsTaken;

        return remainder;

    }

    public String calcOldestpassenger()
    {
        int max=0;
        String name=null;
        for (int i=0;i<pList.size();i++)
        {
            if (pList.get(i).age > max)
            {
                max = pList.get(i).age;
                name = pList.get(i).name;
            }		     

        }

        return "Oldest Person is:" +name+ " age:" +max;

    }


	class Passenger
	{
            private String name;
            private int age;

            public Passenger(String name, int age)
            {
                    this.name=name;
                    this.age=age;
            }

	}
}
