
package fassetar.blogger.webapi.android;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "name",
    "uri",
    "email",
    "gd$image"
})
public class Author_ {

    @JsonProperty("name")
    public Name_ name;
    @JsonProperty("uri")
    public Uri uri;
    @JsonProperty("email")
    public Email_ email;
    @JsonProperty("gd$image")
    public Gd$image_ gd$image;

}
