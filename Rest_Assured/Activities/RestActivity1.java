package RestAssured;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class RestActivity1 {
    final static String ROOT_URI = "https://petstore.swagger.io/v2/pet";

    @Test(priority=1)
    public void addPet()
    {
        String requestBody = "{"
                + "\"id\": 77340,"
                + "\"name\": \"Jerry\","
                + " \"status\": \"alive\""
                + "}";

        Response response =
                given().contentType(ContentType.JSON)
                        .body(requestBody)
                        .when().post(ROOT_URI);


        response.then().body("id", equalTo(77340));
        response.then().body("name", equalTo("Jerry"));
        response.then().body("status", equalTo("alive"));
    }

    @Test(priority=2)
    public void getPetDetails() {
        Response response =
                given().contentType(ContentType.JSON)
                        .when().pathParam("petId", "77340")
                        .get(ROOT_URI + "/{petId}");

        response.then().body("id", equalTo(77340));
        response.then().body("name", equalTo("Jerry"));
        response.then().body("status", equalTo("alive"));
    }

    @Test(priority=3)
    public void deletePetDetails() {
        Response response =
                given().contentType(ContentType.JSON)
                        .when().pathParam("petId", "77340")
                        .delete(ROOT_URI + "/{petId}");

        response.then().body("code", equalTo(200));
        response.then().body("message", equalTo("77340"));
    }
}
