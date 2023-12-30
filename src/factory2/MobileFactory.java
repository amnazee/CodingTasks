package factory2;

import factorymethod.IPlayer;
import factorymethod.LinuxPlayer;
import factorymethod.WindowsPlayer;

public class MobileFactory {
    public Mobile produceMobile(String companyName) {
        if(null==companyName || companyName.isEmpty()){
          return null;
      } else if ("IPHONE".equals(companyName)) {
            return new IPhone();
        } else if ("Vivo".equals(companyName)) {
            return new VIvo();
        }
        else if("Samsung".equals(companyName)){
            return new Samsung();
        }
        else{return null;}
    }
}
