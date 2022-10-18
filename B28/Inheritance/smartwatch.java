class Analog{
    void SetTime(){
        System.out.println("We can set the time");
    }
    }
    public class smartwatch extends Analog{
        void Mobile_device(){
            super.SetTime();
            System.out.println("Its a mobile connection device");
        } 
    
    public static void main(String[] args){
        smartwatch sw = new smartwatch();
        sw.Mobile_device();
        }
    }
