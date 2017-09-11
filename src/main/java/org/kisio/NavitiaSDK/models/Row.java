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
import org.kisio.NavitiaSDK.models.DateTimeType;
import org.kisio.NavitiaSDK.models.StopPoint;

/**
 * Row
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.NavitiaSDKJavaClientCodegen", date = "2017-09-11T17:13:37.346+02:00")
public class Row {
  @SerializedName("stop_point")
  private StopPoint stopPoint = null;

  @SerializedName("date_times")
  private List<DateTimeType> dateTimes = new ArrayList<DateTimeType>();

  public Row stopPoint(StopPoint stopPoint) {
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

  public Row dateTimes(List<DateTimeType> dateTimes) {
    this.dateTimes = dateTimes;
    return this;
  }

  public Row addDateTimesItem(DateTimeType dateTimesItem) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Row row = (Row) o;
    return Objects.equals(this.stopPoint, row.stopPoint) &&
        Objects.equals(this.dateTimes, row.dateTimes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(stopPoint, dateTimes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Row {\n");
    
    sb.append("    stopPoint: ").append(toIndentedString(stopPoint)).append("\n");
    sb.append("    dateTimes: ").append(toIndentedString(dateTimes)).append("\n");
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
