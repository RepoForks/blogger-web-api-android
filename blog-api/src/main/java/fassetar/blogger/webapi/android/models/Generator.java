
package fassetar.blogger.webapi.android;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "version",
    "uri",
    "$t"
})
public class Generator {

    @JsonProperty("version")
    public String version;
    @JsonProperty("uri")
    public String uri;
    @JsonProperty("$t")
    public String $t;

}
