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
import org.kisio.NavitiaSDK.models.DateTimeType;
import org.kisio.NavitiaSDK.models.LinkSchema;
import org.kisio.NavitiaSDK.models.Route;
import org.kisio.NavitiaSDK.models.RouteDisplayInformation;
import org.kisio.NavitiaSDK.models.StopPoint;
import android.os.Parcelable;
import android.os.Parcel;

/**
 * StopSchedule
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.NavitiaSDKJavaClientCodegen", date = "2018-10-18T16:32:06.285+02:00")
public class StopSchedule implements Parcelable {
  @SerializedName("stop_point")
  private StopPoint stopPoint = null;

  @SerializedName("links")
  private List<LinkSchema> links = null;

  @SerializedName("date_times")
  private List<DateTimeType> dateTimes = new ArrayList<DateTimeType>();

  @SerializedName("route")
  private Route route = null;

  @SerializedName("additional_informations")
  private String additionalInformations = null;

  @SerializedName("display_informations")
  private RouteDisplayInformation displayInformations = null;

  @SerializedName("last_datetime")
  private DateTimeType lastDatetime = null;

  @SerializedName("first_datetime")
  private DateTimeType firstDatetime = null;

  public StopSchedule stopPoint(StopPoint stopPoint) {
    this.stopPoint = stopPoint;
    return this;
  }

   /**
   * Get stopPoint
   * @return stopPoint
  **/
  @ApiModelProperty(value = "")
  public StopPoint getStopPoint() {
    return stopPoint;
  }

  public void setStopPoint(StopPoint stopPoint) {
    this.stopPoint = stopPoint;
  }

  public StopSchedule links(List<LinkSchema> links) {
    this.links = links;
    return this;
  }

  public StopSchedule addLinksItem(LinkSchema linksItem) {
    if (this.links == null) {
      this.links = new ArrayList<LinkSchema>();
    }
    this.links.add(linksItem);
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @ApiModelProperty(value = "")
  public List<LinkSchema> getLinks() {
    return links;
  }

  public void setLinks(List<LinkSchema> links) {
    this.links = links;
  }

  public StopSchedule dateTimes(List<DateTimeType> dateTimes) {
    this.dateTimes = dateTimes;
    return this;
  }

  public StopSchedule addDateTimesItem(DateTimeType dateTimesItem) {
    this.dateTimes.add(dateTimesItem);
    return this;
  }

   /**
   * Get dateTimes
   * @return dateTimes
  **/
  @ApiModelProperty(required = true, value = "")
  public List<DateTimeType> getDateTimes() {
    return dateTimes;
  }

  public void setDateTimes(List<DateTimeType> dateTimes) {
    this.dateTimes = dateTimes;
  }

  public StopSchedule route(Route route) {
    this.route = route;
    return this;
  }

   /**
   * Get route
   * @return route
  **/
  @ApiModelProperty(value = "")
  public Route getRoute() {
    return route;
  }

  public void setRoute(Route route) {
    this.route = route;
  }

  public StopSchedule additionalInformations(String additionalInformations) {
    this.additionalInformations = additionalInformations;
    return this;
  }

   /**
   * Get additionalInformations
   * @return additionalInformations
  **/
  @ApiModelProperty(required = true, value = "")
  public String getAdditionalInformations() {
    return additionalInformations;
  }

  public void setAdditionalInformations(String additionalInformations) {
    this.additionalInformations = additionalInformations;
  }

  public StopSchedule displayInformations(RouteDisplayInformation displayInformations) {
    this.displayInformations = displayInformations;
    return this;
  }

   /**
   * Get displayInformations
   * @return displayInformations
  **/
  @ApiModelProperty(value = "")
  public RouteDisplayInformation getDisplayInformations() {
    return displayInformations;
  }

  public void setDisplayInformations(RouteDisplayInformation displayInformations) {
    this.displayInformations = displayInformations;
  }

  public StopSchedule lastDatetime(DateTimeType lastDatetime) {
    this.lastDatetime = lastDatetime;
    return this;
  }

   /**
   * Get lastDatetime
   * @return lastDatetime
  **/
  @ApiModelProperty(value = "")
  public DateTimeType getLastDatetime() {
    return lastDatetime;
  }

  public void setLastDatetime(DateTimeType lastDatetime) {
    this.lastDatetime = lastDatetime;
  }

  public StopSchedule firstDatetime(DateTimeType firstDatetime) {
    this.firstDatetime = firstDatetime;
    return this;
  }

   /**
   * Get firstDatetime
   * @return firstDatetime
  **/
  @ApiModelProperty(value = "")
  public DateTimeType getFirstDatetime() {
    return firstDatetime;
  }

  public void setFirstDatetime(DateTimeType firstDatetime) {
    this.firstDatetime = firstDatetime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StopSchedule stopSchedule = (StopSchedule) o;
    return Objects.equals(this.stopPoint, stopSchedule.stopPoint) &&
        Objects.equals(this.links, stopSchedule.links) &&
        Objects.equals(this.dateTimes, stopSchedule.dateTimes) &&
        Objects.equals(this.route, stopSchedule.route) &&
        Objects.equals(this.additionalInformations, stopSchedule.additionalInformations) &&
        Objects.equals(this.displayInformations, stopSchedule.displayInformations) &&
        Objects.equals(this.lastDatetime, stopSchedule.lastDatetime) &&
        Objects.equals(this.firstDatetime, stopSchedule.firstDatetime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(stopPoint, links, dateTimes, route, additionalInformations, displayInformations, lastDatetime, firstDatetime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StopSchedule {\n");
    
    sb.append("    stopPoint: ").append(toIndentedString(stopPoint)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    dateTimes: ").append(toIndentedString(dateTimes)).append("\n");
    sb.append("    route: ").append(toIndentedString(route)).append("\n");
    sb.append("    additionalInformations: ").append(toIndentedString(additionalInformations)).append("\n");
    sb.append("    displayInformations: ").append(toIndentedString(displayInformations)).append("\n");
    sb.append("    lastDatetime: ").append(toIndentedString(lastDatetime)).append("\n");
    sb.append("    firstDatetime: ").append(toIndentedString(firstDatetime)).append("\n");
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
     
    out.writeValue(stopPoint);

    out.writeValue(links);

    out.writeValue(dateTimes);

    out.writeValue(route);

    out.writeValue(additionalInformations);

    out.writeValue(displayInformations);

    out.writeValue(lastDatetime);

    out.writeValue(firstDatetime);
  }

  public StopSchedule() {
    super();
  }

  StopSchedule(Parcel in) {
    
    stopPoint = (StopPoint)in.readValue(StopPoint.class.getClassLoader());
    links = (List<LinkSchema>)in.readValue(LinkSchema.class.getClassLoader());
    dateTimes = (List<DateTimeType>)in.readValue(DateTimeType.class.getClassLoader());
    route = (Route)in.readValue(Route.class.getClassLoader());
    additionalInformations = (String)in.readValue(null);
    displayInformations = (RouteDisplayInformation)in.readValue(RouteDisplayInformation.class.getClassLoader());
    lastDatetime = (DateTimeType)in.readValue(DateTimeType.class.getClassLoader());
    firstDatetime = (DateTimeType)in.readValue(DateTimeType.class.getClassLoader());
  }
  
  public int describeContents() {
    return 0;
  }

  public static final Parcelable.Creator<StopSchedule> CREATOR = new Parcelable.Creator<StopSchedule>() {
    public StopSchedule createFromParcel(Parcel in) {
      return new StopSchedule(in);
    }
    public StopSchedule[] newArray(int size) {
      return new StopSchedule[size];
    }
  };
}

