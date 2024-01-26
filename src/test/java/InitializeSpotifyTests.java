import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.hasSize;

public class InitializeSpotifyTests {
    @Test
    public void searchTracks(){
        given()
                .queryParam("q", "Summer")
                .queryParam("type", "track")
                .when()
                .get("https://api.spotify.com/v1/search")
                .then()
                .statusCode(401)
                .body("tracks.items", hasSize(greaterThan(0)));
    }
}
