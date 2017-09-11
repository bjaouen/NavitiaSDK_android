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
import org.kisio.NavitiaSDK.models.JourneyPatternPoint;
import org.kisio.NavitiaSDK.models.Route;

/**
 * JourneyPattern
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.NavitiaSDKJavaClientCodegen", date = "2017-09-11T17:13:37.346+02:00")
public class JourneyPattern {
  @SerializedName("route")
  private Route route = null;

  @SerializedName("journey_pattern_points")
  private List<JourneyPatternPoint> journeyPatternPoints = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("id")
  private String id = null;

  public JourneyPattern route(Route route) {
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

  public JourneyPattern journeyPatternPoints(List<JourneyPatternPoint> journeyPatternPoints) {
    this.journeyPatternPoints = journeyPatternPoints;
    return this;
  }

  public JourneyPattern addJourneyPatternPointsItem(JourneyPatternPoint journeyPatternPointsItem) {
    if (this.journeyPatternPoints == null) {
      this.journeyPatternPoints = new ArrayList<JourneyPatternPoint>();
    }
    this.journeyPatternPoints.add(journeyPatternPointsItem);
    return this;
  }

   /**
   * Get journeyPatternPoints
   * @return journeyPatternPoints
  **/
  @ApiModelProperty(value = "")
  public List<JourneyPatternPoint> getJourneyPatternPoints() {
    return journeyPatternPoints;
  }

  public void setJourneyPatternPoints(List<JourneyPatternPoint> journeyPatternPoints) {
    this.journeyPatternPoints = journeyPatternPoints;
  }

  public JourneyPattern name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the object
   * @return name
  **/
  @ApiModelProperty(value = "Name of the object")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public JourneyPattern id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Identifier of the object
   * @return id
  **/
  @ApiModelProperty(value = "Identifier of the object")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JourneyPattern journeyPattern = (JourneyPattern) o;
    return Objects.equals(this.route, journeyPattern.route) &&
        Objects.equals(this.journeyPatternPoints, journeyPattern.journeyPatternPoints) &&
        Objects.equals(this.name, journeyPattern.name) &&
        Objects.equals(this.id, journeyPattern.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(route, journeyPatternPoints, name, id);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JourneyPattern {\n");
    
    sb.append("    route: ").append(toIndentedString(route)).append("\n");
    sb.append("    journeyPatternPoints: ").append(toIndentedString(journeyPatternPoints)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

