package guru.springframework.sfgdi.services;

import org.springframework.stereotype.Component;

@Component
public class SigletonBean {

    public SigletonBean() {
        System.out.println("Creating a Singleton Bean!!!");
    }

    public String getMyScope(){
        return "Im a Singleton";
    }
}
