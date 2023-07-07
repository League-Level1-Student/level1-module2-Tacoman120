package _99_extra._04_tea_party;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
public class TeaParty {
public String welcome(String name, boolean isWoman, boolean isKnighted) {
        

	String response = "Hello ";
	if(isWoman==true) {
		if(isKnighted==true){
        	response+="Lady ";
        }else {
        	response+="Ms. ";
        }
	}else {
        if(isKnighted==true){
        	response+="Sir ";
        }else {
        	response+="Mr. ";
        }
    }
	response+=name;
	System.out.println(response);
	return response;
	
}



	}