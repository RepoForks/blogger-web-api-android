
package fassetar.blogger.webapi.android;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "version",
    "encoding",
    "feed"
})
public class Blog {

    @JsonProperty("version")
    public String version;
    @JsonProperty("encoding")
    public String encoding;
    @JsonProperty("feed")
    public Feed feed;

}
