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
import android.os.Parcelable;
import android.os.Parcel;

/**
 * Distances
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.NavitiaSDKJavaClientCodegen", date = "2018-10-18T16:32:06.285+02:00")
public class Distances implements Parcelable {
  @SerializedName("car")
  private Integer car = null;

  @SerializedName("walking")
  private Integer walking = null;

  @SerializedName("bike")
  private Integer bike = null;

  @SerializedName("ridesharing")
  private Integer ridesharing = null;

  public Distances car(Integer car) {
    this.car = car;
    return this;
  }

   /**
   * Total distance by car of the journey (meters)
   * @return car
  **/
  @ApiModelProperty(required = true, value = "Total distance by car of the journey (meters)")
  public Integer getCar() {
    return car;
  }

  public void setCar(Integer car) {
    this.car = car;
  }

  public Distances walking(Integer walking) {
    this.walking = walking;
    return this;
  }

   /**
   * Total walking distance of the journey (meters)
   * @return walking
  **/
  @ApiModelProperty(required = true, value = "Total walking distance of the journey (meters)")
  public Integer getWalking() {
    return walking;
  }

  public void setWalking(Integer walking) {
    this.walking = walking;
  }

  public Distances bike(Integer bike) {
    this.bike = bike;
    return this;
  }

   /**
   * Total distance by bike of the journey (meters)
   * @return bike
  **/
  @ApiModelProperty(required = true, value = "Total distance by bike of the journey (meters)")
  public Integer getBike() {
    return bike;
  }

  public void setBike(Integer bike) {
    this.bike = bike;
  }

  public Distances ridesharing(Integer ridesharing) {
    this.ridesharing = ridesharing;
    return this;
  }

   /**
   * Total distance by ridesharing of the journey (meters)
   * @return ridesharing
  **/
  @ApiModelProperty(required = true, value = "Total distance by ridesharing of the journey (meters)")
  public Integer getRidesharing() {
    return ridesharing;
  }

  public void setRidesharing(Integer ridesharing) {
    this.ridesharing = ridesharing;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Distances distances = (Distances) o;
    return Objects.equals(this.car, distances.car) &&
        Objects.equals(this.walking, distances.walking) &&
        Objects.equals(this.bike, distances.bike) &&
        Objects.equals(this.ridesharing, distances.ridesharing);
  }

  @Override
  public int hashCode() {
    return Objects.hash(car, walking, bike, ridesharing);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Distances {\n");
    
    sb.append("    car: ").append(toIndentedString(car)).append("\n");
    sb.append("    walking: ").append(toIndentedString(walking)).append("\n");
    sb.append("    bike: ").append(toIndentedString(bike)).append("\n");
    sb.append("    ridesharing: ").append(toIndentedString(ridesharing)).append("\n");
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
     
    out.writeValue(car);

    out.writeValue(walking);

    out.writeValue(bike);

    out.writeValue(ridesharing);
  }

  public Distances() {
    super();
  }

  Distances(Parcel in) {
    
    car = (Integer)in.readValue(null);
    walking = (Integer)in.readValue(null);
    bike = (Integer)in.readValue(null);
    ridesharing = (Integer)in.readValue(null);
  }
  
  public int describeContents() {
    return 0;
  }

  public static final Parcelable.Creator<Distances> CREATOR = new Parcelable.Creator<Distances>() {
    public Distances createFromParcel(Parcel in) {
      return new Distances(in);
    }
    public Distances[] newArray(int size) {
      return new Distances[size];
    }
  };
}

