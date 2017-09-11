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
import org.kisio.NavitiaSDK.models.JourneyPattern;
import org.kisio.NavitiaSDK.models.Pagination;

/**
 * JourneyPatterns
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.NavitiaSDKJavaClientCodegen", date = "2017-09-11T17:13:37.346+02:00")
public class JourneyPatterns {
  @SerializedName("disruptions")
  private List<Disruption> disruptions = new ArrayList<Disruption>();

  @SerializedName("pagination")
  private Pagination pagination = null;

  @SerializedName("error")
  private Error error = null;

  @SerializedName("journey_patterns")
  private List<JourneyPattern> journeyPatterns = null;

  @SerializedName("feed_publishers")
  private List<FeedPublisher> feedPublishers = new ArrayList<FeedPublisher>();

  public JourneyPatterns disruptions(List<Disruption> disruptions) {
    this.disruptions = disruptions;
    return this;
  }

  public JourneyPatterns addDisruptionsItem(Disruption disruptionsItem) {
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

  public JourneyPatterns pagination(Pagination pagination) {
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

  public JourneyPatterns error(Error error) {
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

  public JourneyPatterns journeyPatterns(List<JourneyPattern> journeyPatterns) {
    this.journeyPatterns = journeyPatterns;
    return this;
  }

  public JourneyPatterns addJourneyPatternsItem(JourneyPattern journeyPatternsItem) {
    if (this.journeyPatterns == null) {
      this.journeyPatterns = new ArrayList<JourneyPattern>();
    }
    this.journeyPatterns.add(journeyPatternsItem);
    return this;
  }

   /**
   * Get journeyPatterns
   * @return journeyPatterns
  **/
  @ApiModelProperty(value = "")
  public List<JourneyPattern> getJourneyPatterns() {
    return journeyPatterns;
  }

  public void setJourneyPatterns(List<JourneyPattern> journeyPatterns) {
    this.journeyPatterns = journeyPatterns;
  }

  public JourneyPatterns feedPublishers(List<FeedPublisher> feedPublishers) {
    this.feedPublishers = feedPublishers;
    return this;
  }

  public JourneyPatterns addFeedPublishersItem(FeedPublisher feedPublishersItem) {
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
    JourneyPatterns journeyPatterns = (JourneyPatterns) o;
    return Objects.equals(this.disruptions, journeyPatterns.disruptions) &&
        Objects.equals(this.pagination, journeyPatterns.pagination) &&
        Objects.equals(this.error, journeyPatterns.error) &&
        Objects.equals(this.journeyPatterns, journeyPatterns.journeyPatterns) &&
        Objects.equals(this.feedPublishers, journeyPatterns.feedPublishers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(disruptions, pagination, error, journeyPatterns, feedPublishers);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JourneyPatterns {\n");
    
    sb.append("    disruptions: ").append(toIndentedString(disruptions)).append("\n");
    sb.append("    pagination: ").append(toIndentedString(pagination)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    journeyPatterns: ").append(toIndentedString(journeyPatterns)).append("\n");
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
