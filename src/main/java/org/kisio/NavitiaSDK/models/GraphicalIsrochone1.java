/*
 * navitia
 *      navitia.io is the open API for building cool stuff with mobility data. It provides the following services      * journeys computation     * line schedules     * next departures     * exploration of public transport data / search places     * and sexy things such as isochrones      navitia is a HATEOAS API that returns JSON formated results     
 *
 * OpenAPI spec version: v2.64.0
 * Contact: navitia@googlegroups.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package org.kisio.NavitiaSDK.models;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.kisio.NavitiaSDK.models.BetaEndpoints;
import org.kisio.NavitiaSDK.models.Context;
import org.kisio.NavitiaSDK.models.Error;
import org.kisio.NavitiaSDK.models.FeedPublisher;
import org.kisio.NavitiaSDK.models.GraphicalIsrochone;
import org.kisio.NavitiaSDK.models.LinkSchema;
import android.os.Parcelable;
import android.os.Parcel;

/**
 * GraphicalIsrochone1
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.NavitiaSDKJavaClientCodegen", date = "2018-10-18T16:32:06.285+02:00")
public class GraphicalIsrochone1 implements Parcelable {
  @SerializedName("links")
  private List<LinkSchema> links = new ArrayList<LinkSchema>();

  @SerializedName("warnings")
  private List<BetaEndpoints> warnings = new ArrayList<BetaEndpoints>();

  @SerializedName("feed_publishers")
  private List<FeedPublisher> feedPublishers = new ArrayList<FeedPublisher>();

  @SerializedName("isochrones")
  private List<GraphicalIsrochone> isochrones = new ArrayList<GraphicalIsrochone>();

  @SerializedName("context")
  private Context context = null;

  @SerializedName("error")
  private Error error = null;

  public GraphicalIsrochone1 links(List<LinkSchema> links) {
    this.links = links;
    return this;
  }

  public GraphicalIsrochone1 addLinksItem(LinkSchema linksItem) {
    this.links.add(linksItem);
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @ApiModelProperty(required = true, value = "")
  public List<LinkSchema> getLinks() {
    return links;
  }

  public void setLinks(List<LinkSchema> links) {
    this.links = links;
  }

  public GraphicalIsrochone1 warnings(List<BetaEndpoints> warnings) {
    this.warnings = warnings;
    return this;
  }

  public GraphicalIsrochone1 addWarningsItem(BetaEndpoints warningsItem) {
    this.warnings.add(warningsItem);
    return this;
  }

   /**
   * Get warnings
   * @return warnings
  **/
  @ApiModelProperty(required = true, value = "")
  public List<BetaEndpoints> getWarnings() {
    return warnings;
  }

  public void setWarnings(List<BetaEndpoints> warnings) {
    this.warnings = warnings;
  }

  public GraphicalIsrochone1 feedPublishers(List<FeedPublisher> feedPublishers) {
    this.feedPublishers = feedPublishers;
    return this;
  }

  public GraphicalIsrochone1 addFeedPublishersItem(FeedPublisher feedPublishersItem) {
    this.feedPublishers.add(feedPublishersItem);
    return this;
  }

   /**
   * Get feedPublishers
   * @return feedPublishers
  **/
  @ApiModelProperty(required = true, value = "")
  public List<FeedPublisher> getFeedPublishers() {
    return feedPublishers;
  }

  public void setFeedPublishers(List<FeedPublisher> feedPublishers) {
    this.feedPublishers = feedPublishers;
  }

  public GraphicalIsrochone1 isochrones(List<GraphicalIsrochone> isochrones) {
    this.isochrones = isochrones;
    return this;
  }

  public GraphicalIsrochone1 addIsochronesItem(GraphicalIsrochone isochronesItem) {
    this.isochrones.add(isochronesItem);
    return this;
  }

   /**
   * Get isochrones
   * @return isochrones
  **/
  @ApiModelProperty(required = true, value = "")
  public List<GraphicalIsrochone> getIsochrones() {
    return isochrones;
  }

  public void setIsochrones(List<GraphicalIsrochone> isochrones) {
    this.isochrones = isochrones;
  }

  public GraphicalIsrochone1 context(Context context) {
    this.context = context;
    return this;
  }

   /**
   * Get context
   * @return context
  **/
  @ApiModelProperty(value = "")
  public Context getContext() {
    return context;
  }

  public void setContext(Context context) {
    this.context = context;
  }

  public GraphicalIsrochone1 error(Error error) {
    this.error = error;
    return this;
  }

   /**
   * Get error
   * @return error
  **/
  @ApiModelProperty(value = "")
  public Error getError() {
    return error;
  }

  public void setError(Error error) {
    this.error = error;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GraphicalIsrochone1 graphicalIsrochone1 = (GraphicalIsrochone1) o;
    return Objects.equals(this.links, graphicalIsrochone1.links) &&
        Objects.equals(this.warnings, graphicalIsrochone1.warnings) &&
        Objects.equals(this.feedPublishers, graphicalIsrochone1.feedPublishers) &&
        Objects.equals(this.isochrones, graphicalIsrochone1.isochrones) &&
        Objects.equals(this.context, graphicalIsrochone1.context) &&
        Objects.equals(this.error, graphicalIsrochone1.error);
  }

  @Override
  public int hashCode() {
    return Objects.hash(links, warnings, feedPublishers, isochrones, context, error);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GraphicalIsrochone1 {\n");
    
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    warnings: ").append(toIndentedString(warnings)).append("\n");
    sb.append("    feedPublishers: ").append(toIndentedString(feedPublishers)).append("\n");
    sb.append("    isochrones: ").append(toIndentedString(isochrones)).append("\n");
    sb.append("    context: ").append(toIndentedString(context)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
  public void writeToParcel(Parcel out, int flags) {
     
    out.writeValue(links);

    out.writeValue(warnings);

    out.writeValue(feedPublishers);

    out.writeValue(isochrones);

    out.writeValue(context);

    out.writeValue(error);
  }

  public GraphicalIsrochone1() {
    super();
  }

  GraphicalIsrochone1(Parcel in) {
    
    links = (List<LinkSchema>)in.readValue(LinkSchema.class.getClassLoader());
    warnings = (List<BetaEndpoints>)in.readValue(BetaEndpoints.class.getClassLoader());
    feedPublishers = (List<FeedPublisher>)in.readValue(FeedPublisher.class.getClassLoader());
    isochrones = (List<GraphicalIsrochone>)in.readValue(GraphicalIsrochone.class.getClassLoader());
    context = (Context)in.readValue(Context.class.getClassLoader());
    error = (Error)in.readValue(Error.class.getClassLoader());
  }
  
  public int describeContents() {
    return 0;
  }

  public static final Parcelable.Creator<GraphicalIsrochone1> CREATOR = new Parcelable.Creator<GraphicalIsrochone1>() {
    public GraphicalIsrochone1 createFromParcel(Parcel in) {
      return new GraphicalIsrochone1(in);
    }
    public GraphicalIsrochone1[] newArray(int size) {
      return new GraphicalIsrochone1[size];
    }
  };
}

