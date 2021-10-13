import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;

@RestController
@EnableAutoConfiguration
public class Example {

    @RequestMapping(path = "/index", produces = "application/json; charset=UTF-8" )
    public String home() throws JSONException  {
    	JSONObject entity = new JSONObject();
    	entity.put("ContextRoot", "/landing");
    	HashMap<String, String> objMap = new HashMap<>();
    	Gson gson = new Gson();
        String json = gson.toJson(entity);
        System.out.println(json);
        //return "Context root-path for springboot rest controller!";
    	//return entity;
        return json;
        
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Example.class, args);
    }

}

