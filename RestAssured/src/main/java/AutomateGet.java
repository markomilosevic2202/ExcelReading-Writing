import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import org.json.simple.JSONObject;
import org.junit.Assert;
import org.openqa.selenium.devtools.v100.fetch.model.AuthChallengeResponse;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class AutomateGet {
    @Test
    public void test_1(){

        Response response =   RestAssured.get("https://reqres.in/api/users?page=2");

        System.out.println(response.getStatusCode());
        System.out.println(response.getTime());
        System.out.println(response.getBody().asString());
        System.out.println(response.getStatusLine());
        System.out.println(response.getHeader("content-type"));
        int statusCode= response.getStatusCode();

        Assert.assertEquals(statusCode, 200);
    }
    @Test
    public void test_2(){
    baseURI ="https://reqres.in/api";

    given().
            get("/users?page=2").
            then().
            statusCode(200).body("data[1].id",equalTo(8))
            .log().all();

}

    @Test
    public void test_3(){
        baseURI ="https://reqres.in/api";

        given().
                get("/users?page=2").
                then().
                statusCode(200).
                body("data[4].first_name",equalTo("George"));
               // .body("data.first_name",hasItems("George","Rachel"));

    }

    @Test
    public void test_4() {
        baseURI = "https://reqres.in/api";
        Map<String,Object> map = new HashMap<String,Object>();

        map.put("name" , "Raghav");
        map.put("job" , "Teacher");

        System.out.println(map);
        JSONObject request = new JSONObject(map);
        System.out.println(request.toJSONString());
        given().
                header("Content-Type","aplication/json").
                contentType(ContentType.JSON).accept(ContentType.JSON).
                body(request.toJSONString())
                .when().
                post("/users").
                then().
                statusCode(201)
                .log().all();
    }

    @Test
    public void test_5put() {
        baseURI = "https://reqres.in/api";
        Map<String,Object> map = new HashMap<String,Object>();

        map.put("name" , "Raghav");
        map.put("job" , "Teacher");

        System.out.println(map);
        JSONObject request = new JSONObject(map);
        System.out.println(request.toJSONString());
        given().
                header("Content-Type","aplication/json").
                contentType(ContentType.JSON).accept(ContentType.JSON).
                body(request.toJSONString())
                .when().
                put("/users/2").
                then().
                statusCode(200)
                .log().all();
    }

    @Test
    public void test_6delete() {
        baseURI = "https://reqres.in";


        when().
                delete("api/users/2").
                then().
                statusCode(204)
                .log().all();
    }

}
