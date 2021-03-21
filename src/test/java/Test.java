import io.restassured.*;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;
import static org.hamcrest.Matchers.equalTo;

public class Test {

    @org.testng.annotations.Test
    public void getUsers() {
        when()
                .request("GET", "https://reqres.in/api/users?page=2")
        .then()
                .assertThat()
                .body("page", equalTo(2))
                .and()
                .statusCode(200);


    }
}
