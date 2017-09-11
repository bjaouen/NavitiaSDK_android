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

/**
 * MultiLineStringSchema
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.NavitiaSDKJavaClientCodegen", date = "2017-09-11T17:13:37.346+02:00")
public class MultiLineStringSchema {
  @SerializedName("type")
  private String type = null;

  @SerializedName("coordinates")
  private List<List<List<Float>>> coordinates = null;

  public MultiLineStringSchema type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(value = "")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public MultiLineStringSchema coordinates(List<List<List<Float>>> coordinates) {
    this.coordinates = coordinates;
    return this;
  }

  public MultiLineStringSchema addCoordinatesItem(List<List<Float>> coordinatesItem) {
    if (this.coordinates == null) {
      this.coordinates = new ArrayList<List<List<Float>>>();
    }
    this.coordinates.add(coordinatesItem);
    return this;
  }

   /**
   * Get coordinates
   * @return coordinates
  **/
  @ApiModelProperty(value = "")
  public List<List<List<Float>>> getCoordinates() {
    return coordinates;
  }

  public void setCoordinates(List<List<List<Float>>> coordinates) {
    this.coordinates = coordinates;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MultiLineStringSchema multiLineStringSchema = (MultiLineStringSchema) o;
    return Objects.equals(this.type, multiLineStringSchema.type) &&
        Objects.equals(this.coordinates, multiLineStringSchema.coordinates);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, coordinates);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MultiLineStringSchema {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    coordinates: ").append(toIndentedString(coordinates)).append("\n");
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
