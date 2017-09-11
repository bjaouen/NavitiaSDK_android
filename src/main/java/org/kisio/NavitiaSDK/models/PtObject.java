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
import org.kisio.NavitiaSDK.models.CommercialMode;
import org.kisio.NavitiaSDK.models.Line;
import org.kisio.NavitiaSDK.models.Network;
import org.kisio.NavitiaSDK.models.Route;
import org.kisio.NavitiaSDK.models.StopArea;
import org.kisio.NavitiaSDK.models.Trip;

/**
 * PtObject
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.NavitiaSDKJavaClientCodegen", date = "2017-09-11T17:13:37.346+02:00")
public class PtObject {
  @SerializedName("embedded_type")
  private String embeddedType = null;

  @SerializedName("network")
  private Network network = null;

  @SerializedName("route")
  private Route route = null;

  @SerializedName("stop_area")
  private StopArea stopArea = null;

  @SerializedName("commercial_mode")
  private CommercialMode commercialMode = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("line")
  private Line line = null;

  @SerializedName("quality")
  private Integer quality = null;

  @SerializedName("trip")
  private Trip trip = null;

  @SerializedName("name")
  private String name = null;

  public PtObject embeddedType(String embeddedType) {
    this.embeddedType = embeddedType;
    return this;
  }

   /**
   * Get embeddedType
   * @return embeddedType
  **/
  @ApiModelProperty(value = "")
  public String getEmbeddedType() {
    return embeddedType;
  }

  public void setEmbeddedType(String embeddedType) {
    this.embeddedType = embeddedType;
  }

  public PtObject network(Network network) {
    this.network = network;
    return this;
  }

   /**
   * Get network
   * @return network
  **/
  @ApiModelProperty(value = "")
  public Network getNetwork() {
    return network;
  }

  public void setNetwork(Network network) {
    this.network = network;
  }

  public PtObject route(Route route) {
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

  public PtObject stopArea(StopArea stopArea) {
    this.stopArea = stopArea;
    return this;
  }

   /**
   * Get stopArea
   * @return stopArea
  **/
  @ApiModelProperty(value = "")
  public StopArea getStopArea() {
    return stopArea;
  }

  public void setStopArea(StopArea stopArea) {
    this.stopArea = stopArea;
  }

  public PtObject commercialMode(CommercialMode commercialMode) {
    this.commercialMode = commercialMode;
    return this;
  }

   /**
   * Get commercialMode
   * @return commercialMode
  **/
  @ApiModelProperty(value = "")
  public CommercialMode getCommercialMode() {
    return commercialMode;
  }

  public void setCommercialMode(CommercialMode commercialMode) {
    this.commercialMode = commercialMode;
  }

  public PtObject id(String id) {
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

  public PtObject line(Line line) {
    this.line = line;
    return this;
  }

   /**
   * Get line
   * @return line
  **/
  @ApiModelProperty(value = "")
  public Line getLine() {
    return line;
  }

  public void setLine(Line line) {
    this.line = line;
  }

  public PtObject quality(Integer quality) {
    this.quality = quality;
    return this;
  }

   /**
   * Get quality
   * @return quality
  **/
  @ApiModelProperty(value = "")
  public Integer getQuality() {
    return quality;
  }

  public void setQuality(Integer quality) {
    this.quality = quality;
  }

  public PtObject trip(Trip trip) {
    this.trip = trip;
    return this;
  }

   /**
   * Get trip
   * @return trip
  **/
  @ApiModelProperty(value = "")
  public Trip getTrip() {
    return trip;
  }

  public void setTrip(Trip trip) {
    this.trip = trip;
  }

  public PtObject name(String name) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PtObject ptObject = (PtObject) o;
    return Objects.equals(this.embeddedType, ptObject.embeddedType) &&
        Objects.equals(this.network, ptObject.network) &&
        Objects.equals(this.route, ptObject.route) &&
        Objects.equals(this.stopArea, ptObject.stopArea) &&
        Objects.equals(this.commercialMode, ptObject.commercialMode) &&
        Objects.equals(this.id, ptObject.id) &&
        Objects.equals(this.line, ptObject.line) &&
        Objects.equals(this.quality, ptObject.quality) &&
        Objects.equals(this.trip, ptObject.trip) &&
        Objects.equals(this.name, ptObject.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(embeddedType, network, route, stopArea, commercialMode, id, line, quality, trip, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PtObject {\n");
    
    sb.append("    embeddedType: ").append(toIndentedString(embeddedType)).append("\n");
    sb.append("    network: ").append(toIndentedString(network)).append("\n");
    sb.append("    route: ").append(toIndentedString(route)).append("\n");
    sb.append("    stopArea: ").append(toIndentedString(stopArea)).append("\n");
    sb.append("    commercialMode: ").append(toIndentedString(commercialMode)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    line: ").append(toIndentedString(line)).append("\n");
    sb.append("    quality: ").append(toIndentedString(quality)).append("\n");
    sb.append("    trip: ").append(toIndentedString(trip)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

