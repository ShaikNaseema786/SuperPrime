class Seat{
        String name;
        int seatno;
        String destination;
        Seat next;

        Seat(String name,int seatno,String destination)
        {
            this.name=name;
            this.seatno=seatno;
            this.destination=destination;
            this.next=null;

        }
    }
public class H5{
    Seat see;
    H5(){
        this.see=null;
    }

}
