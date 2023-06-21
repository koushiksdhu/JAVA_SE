public class interfacesSmartPhone {
    public static void main(String args[]){
        SmartPhone s = new SmartPhone();
        // ICamera c = s;
        // IMusicPlayer m = s;
        // ICamera c = new SmartPhone();
        // IMusicPlayer m = new SmartPhone();
        s.call();
        s.videoCall();
        s.pause();
        s.record();
    }
}

class Phone{
    public void call(){
        System.out.println("Calling");
    }
    public void sms(){
        System.out.println("Sending SMS");
    }
}

interface ICamera{
    public void click();
    public void record();
}

interface IMusicPlayer{
    public void play();
    public void pause();    
    }

class SmartPhone extends Phone implements ICamera, IMusicPlayer{
    public void videoCall(){
        System.out.println("Video Calling");
    }
    public void click(){
        System.out.println("Clicking Photos");
    }
    public void record(){
        System.out.println("Recording Video");        
    }
    public void play(){
        System.out.println("Playing Songs");
    }
    public void pause(){
        System.out.println("Pausing Song");
    }
}
