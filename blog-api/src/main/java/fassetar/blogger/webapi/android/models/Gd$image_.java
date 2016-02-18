
package fassetar.blogger.webapi.android;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "rel",
    "width",
    "height",
    "src"
})
public class Gd$image_ {

    @JsonProperty("rel")
    public String rel;
    @JsonProperty("width")
    public String width;
    @JsonProperty("height")
    public String height;
    @JsonProperty("src")
    public String src;

}
