
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
    "xmlns",
    "xmlns$openSearch",
    "xmlns$blogger",
    "xmlns$georss",
    "xmlns$gd",
    "xmlns$thr",
    "id",
    "updated",
    "category",
    "title",
    "subtitle",
    "link",
    "author",
    "generator",
    "openSearch$totalResults",
    "openSearch$startIndex",
    "openSearch$itemsPerPage",
    "entry"
})
public class Feed {

    @JsonProperty("xmlns")
    public String xmlns;
    @JsonProperty("xmlns$openSearch")
    public String xmlns$openSearch;
    @JsonProperty("xmlns$blogger")
    public String xmlns$blogger;
    @JsonProperty("xmlns$georss")
    public String xmlns$georss;
    @JsonProperty("xmlns$gd")
    public String xmlns$gd;
    @JsonProperty("xmlns$thr")
    public String xmlns$thr;
    @JsonProperty("id")
    public Id id;
    @JsonProperty("updated")
    public Updated updated;
    @JsonProperty("category")
    public List<Category> category = new ArrayList<Category>();
    @JsonProperty("title")
    public Title title;
    @JsonProperty("subtitle")
    public Subtitle subtitle;
    @JsonProperty("link")
    public List<Link> link = new ArrayList<Link>();
    @JsonProperty("author")
    public List<Author> author = new ArrayList<Author>();
    @JsonProperty("generator")
    public Generator generator;
    @JsonProperty("openSearch$totalResults")
    public OpenSearch$totalResults openSearch$totalResults;
    @JsonProperty("openSearch$startIndex")
    public OpenSearch$startIndex openSearch$startIndex;
    @JsonProperty("openSearch$itemsPerPage")
    public OpenSearch$itemsPerPage openSearch$itemsPerPage;
    @JsonProperty("entry")
    public List<Entry> entry = new ArrayList<Entry>();

}
