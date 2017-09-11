/*
 * navitia
 *      navitia.io is the open API for building cool stuff with mobility data. It provides the following services      * journeys computation     * line schedules     * next departures     * exploration of public transport data / search places     * and sexy things such as isochrones      navitia is a HATEOAS API that returns JSON formated results     
 *
 * OpenAPI spec version: v2.38.0
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
import org.kisio.NavitiaSDK.models.Disruption;
import org.kisio.NavitiaSDK.models.Error;
import org.kisio.NavitiaSDK.models.FeedPublisher;
import org.kisio.NavitiaSDK.models.LineGroup;
import org.kisio.NavitiaSDK.models.Pagination;

/**
 * LineGroups
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.NavitiaSDKJavaClientCodegen", date = "2017-09-11T17:13:37.346+02:00")
public class LineGroups {
  @SerializedName("disruptions")
  private List<Disruption> disruptions = new ArrayList<Disruption>();

  @SerializedName("pagination")
  private Pagination pagination = null;

  @SerializedName("error")
  private Error error = null;

  @SerializedName("line_groups")
  private List<LineGroup> lineGroups = null;

  @SerializedName("feed_publishers")
  private List<FeedPublisher> feedPublishers = new ArrayList<FeedPublisher>();

  public LineGroups disruptions(List<Disruption> disruptions) {
    this.disruptions = disruptions;
    return this;
  }

  public LineGroups addDisruptionsItem(Disruption disruptionsItem) {
    this.disruptions.add(disruptionsItem);
    return this;
  }

   /**
   * Get disruptions
   * @return disruptions
  **/
  @ApiModelProperty(required = true, value = "")
  public List<Disruption> getDisruptions() {
    return disruptions;
  }

  public void setDisruptions(List<Disruption> disruptions) {
    this.disruptions = disruptions;
  }

  public LineGroups pagination(Pagination pagination) {
    this.pagination = pagination;
    return this;
  }

   /**
   * Get pagination
   * @return pagination
  **/
  @ApiModelProperty(required = true, value = "")
  public Pagination getPagination() {
    return pagination;
  }

  public void setPagination(Pagination pagination) {
    this.pagination = pagination;
  }

  public LineGroups error(Error error) {
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

  public LineGroups lineGroups(List<LineGroup> lineGroups) {
    this.lineGroups = lineGroups;
    return this;
  }

  public LineGroups addLineGroupsItem(LineGroup lineGroupsItem) {
    if (this.lineGroups == null) {
      this.lineGroups = new ArrayList<LineGroup>();
    }
    this.lineGroups.add(lineGroupsItem);
    return this;
  }

   /**
   * Get lineGroups
   * @return lineGroups
  **/
  @ApiModelProperty(value = "")
  public List<LineGroup> getLineGroups() {
    return lineGroups;
  }

  public void setLineGroups(List<LineGroup> lineGroups) {
    this.lineGroups = lineGroups;
  }

  public LineGroups feedPublishers(List<FeedPublisher> feedPublishers) {
    this.feedPublishers = feedPublishers;
    return this;
  }

  public LineGroups addFeedPublishersItem(FeedPublisher feedPublishersItem) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LineGroups lineGroups = (LineGroups) o;
    return Objects.equals(this.disruptions, lineGroups.disruptions) &&
        Objects.equals(this.pagination, lineGroups.pagination) &&
        Objects.equals(this.error, lineGroups.error) &&
        Objects.equals(this.lineGroups, lineGroups.lineGroups) &&
        Objects.equals(this.feedPublishers, lineGroups.feedPublishers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(disruptions, pagination, error, lineGroups, feedPublishers);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LineGroups {\n");
    
    sb.append("    disruptions: ").append(toIndentedString(disruptions)).append("\n");
    sb.append("    pagination: ").append(toIndentedString(pagination)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    lineGroups: ").append(toIndentedString(lineGroups)).append("\n");
    sb.append("    feedPublishers: ").append(toIndentedString(feedPublishers)).append("\n");
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
  
}

