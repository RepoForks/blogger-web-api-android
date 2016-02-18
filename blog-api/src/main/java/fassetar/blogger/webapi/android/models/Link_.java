
package fassetar.blogger.webapi.android;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "rel",
    "type",
    "href",
    "title"
})
public class Link_ {

    @JsonProperty("rel")
    public String rel;
    @JsonProperty("type")
    public String type;
    @JsonProperty("href")
    public String href;
    @JsonProperty("title")
    public String title;

}