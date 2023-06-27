package Examples;

import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.lessThanOrEqualTo;

public class FirstTest {
    String baseURI = "https://petstore.swagger.io/v2/pet";

    @Test
    public void getRequestWithQueryParam() {

        Response response = given().header("Content-Type", "application/json")
                                    .queryParams("status", "alive")
                                    .when().get(baseURI + "/findByStatus");

        //Response Body
        //System.out.println(response.getBody().asString());
        System.out.println(response.getBody().asPrettyString());

        //Response Header
        System.out.println(response.getHeaders().asList());

        //Extract JSON properties
        String petStatus = response.then().extract().path("[0].status");
        System.out.println("Status of pet 1 is" + petStatus);

        //TestNG Assertions
        //Assert.assertEquals(petStatus, "alive");
        Assert.assertEquals(petStatus, "alive");

        //RESTAssured
        response.then().statusCode(200);
        response.then().body("[0].status", equalTo("alive"));
        response.then().body("[0].name", equalTo("Riley"));
        response.then().time(lessThanOrEqualTo(3000L));

    }

    @Test
    public void getRequestWithParam() {

        given()
                .header("Content-Type", "application/json")
                .pathParam("id", 77232)
                .when()
                .get(baseURI + "/{petID}")
                .then().statusCode(200).body("status", equalTo("alive"))
                .body("name", equalTo("Riley"))
                .time(lessThanOrEqualTo(3000L));


    }

}
