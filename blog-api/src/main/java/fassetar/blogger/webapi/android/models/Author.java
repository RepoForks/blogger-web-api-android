
package fassetar.blogger.webapi.android;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "name",
    "email",
    "gd$image"
})
public class Author {

    @JsonProperty("name")
    public Name name;
    @JsonProperty("email")
    public Email email;
    @JsonProperty("gd$image")
    public Gd$image gd$image;

}
