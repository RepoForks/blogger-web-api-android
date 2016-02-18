
package fassetar.blogger.webapi.android;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "id",
    "published",
    "updated",
    "category",
    "title",
    "summary",
    "link",
    "author",
    "georss$featurename",
    "georss$point",
    "georss$box"
})
public class Entry {

    @JsonProperty("id")
    public Id_ id;
    @JsonProperty("published")
    public Published published;
    @JsonProperty("updated")
    public Updated_ updated;
    @JsonProperty("category")
    public List<Category_> category = new ArrayList<Category_>();
    @JsonProperty("title")
    public Title_ title;
    @JsonProperty("summary")
    public Summary summary;
    @JsonProperty("link")
    public List<Link_> link = new ArrayList<Link_>();
    @JsonProperty("author")
    public List<Author_> author = new ArrayList<Author_>();
    @JsonProperty("georss$featurename")
    public Georss$featurename georss$featurename;
    @JsonProperty("georss$point")
    public Georss$point georss$point;
    @JsonProperty("georss$box")
    public Georss$box georss$box;

}
