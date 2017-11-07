/*
 * navitia
 *      navitia.io is the open API for building cool stuff with mobility data. It provides the following services      * journeys computation     * line schedules     * next departures     * exploration of public transport data / search places     * and sexy things such as isochrones      navitia is a HATEOAS API that returns JSON formated results     
 *
 * OpenAPI spec version: v2.43.0-34-g30b0bcf
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
import android.os.Parcelable;
import android.os.Parcel;

/**
 * TravelerProfiles
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.NavitiaSDKJavaClientCodegen", date = "2017-11-03T11:50:27.015+01:00")
public class TravelerProfiles implements Parcelable {
  @SerializedName("last_section_mode")
  private List<String> lastSectionMode = null;

  @SerializedName("walking_speed")
  private Float walkingSpeed = null;

  @SerializedName("is_from_db")
  private Boolean isFromDb = null;

  @SerializedName("traveler_type")
  private String travelerType = null;

  @SerializedName("wheelchair")
  private Boolean wheelchair = null;

  @SerializedName("max_bss_duration_to_pt")
  private Integer maxBssDurationToPt = null;

  @SerializedName("max_walking_duration_to_pt")
  private Integer maxWalkingDurationToPt = null;

  @SerializedName("first_section_mode")
  private List<String> firstSectionMode = null;

  @SerializedName("max_bike_duration_to_pt")
  private Integer maxBikeDurationToPt = null;

  @SerializedName("bike_speed")
  private Float bikeSpeed = null;

  @SerializedName("car_speed")
  private Float carSpeed = null;

  @SerializedName("max_car_duration_to_pt")
  private Integer maxCarDurationToPt = null;

  @SerializedName("bss_speed")
  private Float bssSpeed = null;

  public TravelerProfiles lastSectionMode(List<String> lastSectionMode) {
    this.lastSectionMode = lastSectionMode;
    return this;
  }

  public TravelerProfiles addLastSectionModeItem(String lastSectionModeItem) {
    if (this.lastSectionMode == null) {
      this.lastSectionMode = new ArrayList<String>();
    }
    this.lastSectionMode.add(lastSectionModeItem);
    return this;
  }

   /**
   * Get lastSectionMode
   * @return lastSectionMode
  **/
  @ApiModelProperty(value = "")
  public List<String> getLastSectionMode() {
    return lastSectionMode;
  }

  public void setLastSectionMode(List<String> lastSectionMode) {
    this.lastSectionMode = lastSectionMode;
  }

  public TravelerProfiles walkingSpeed(Float walkingSpeed) {
    this.walkingSpeed = walkingSpeed;
    return this;
  }

   /**
   * Get walkingSpeed
   * @return walkingSpeed
  **/
  @ApiModelProperty(value = "")
  public Float getWalkingSpeed() {
    return walkingSpeed;
  }

  public void setWalkingSpeed(Float walkingSpeed) {
    this.walkingSpeed = walkingSpeed;
  }

  public TravelerProfiles isFromDb(Boolean isFromDb) {
    this.isFromDb = isFromDb;
    return this;
  }

   /**
   * Get isFromDb
   * @return isFromDb
  **/
  @ApiModelProperty(value = "")
  public Boolean getIsFromDb() {
    return isFromDb;
  }

  public void setIsFromDb(Boolean isFromDb) {
    this.isFromDb = isFromDb;
  }

  public TravelerProfiles travelerType(String travelerType) {
    this.travelerType = travelerType;
    return this;
  }

   /**
   * Get travelerType
   * @return travelerType
  **/
  @ApiModelProperty(value = "")
  public String getTravelerType() {
    return travelerType;
  }

  public void setTravelerType(String travelerType) {
    this.travelerType = travelerType;
  }

  public TravelerProfiles wheelchair(Boolean wheelchair) {
    this.wheelchair = wheelchair;
    return this;
  }

   /**
   * Get wheelchair
   * @return wheelchair
  **/
  @ApiModelProperty(value = "")
  public Boolean getWheelchair() {
    return wheelchair;
  }

  public void setWheelchair(Boolean wheelchair) {
    this.wheelchair = wheelchair;
  }

  public TravelerProfiles maxBssDurationToPt(Integer maxBssDurationToPt) {
    this.maxBssDurationToPt = maxBssDurationToPt;
    return this;
  }

   /**
   * Get maxBssDurationToPt
   * @return maxBssDurationToPt
  **/
  @ApiModelProperty(value = "")
  public Integer getMaxBssDurationToPt() {
    return maxBssDurationToPt;
  }

  public void setMaxBssDurationToPt(Integer maxBssDurationToPt) {
    this.maxBssDurationToPt = maxBssDurationToPt;
  }

  public TravelerProfiles maxWalkingDurationToPt(Integer maxWalkingDurationToPt) {
    this.maxWalkingDurationToPt = maxWalkingDurationToPt;
    return this;
  }

   /**
   * Get maxWalkingDurationToPt
   * @return maxWalkingDurationToPt
  **/
  @ApiModelProperty(value = "")
  public Integer getMaxWalkingDurationToPt() {
    return maxWalkingDurationToPt;
  }

  public void setMaxWalkingDurationToPt(Integer maxWalkingDurationToPt) {
    this.maxWalkingDurationToPt = maxWalkingDurationToPt;
  }

  public TravelerProfiles firstSectionMode(List<String> firstSectionMode) {
    this.firstSectionMode = firstSectionMode;
    return this;
  }

  public TravelerProfiles addFirstSectionModeItem(String firstSectionModeItem) {
    if (this.firstSectionMode == null) {
      this.firstSectionMode = new ArrayList<String>();
    }
    this.firstSectionMode.add(firstSectionModeItem);
    return this;
  }

   /**
   * Get firstSectionMode
   * @return firstSectionMode
  **/
  @ApiModelProperty(value = "")
  public List<String> getFirstSectionMode() {
    return firstSectionMode;
  }

  public void setFirstSectionMode(List<String> firstSectionMode) {
    this.firstSectionMode = firstSectionMode;
  }

  public TravelerProfiles maxBikeDurationToPt(Integer maxBikeDurationToPt) {
    this.maxBikeDurationToPt = maxBikeDurationToPt;
    return this;
  }

   /**
   * Get maxBikeDurationToPt
   * @return maxBikeDurationToPt
  **/
  @ApiModelProperty(value = "")
  public Integer getMaxBikeDurationToPt() {
    return maxBikeDurationToPt;
  }

  public void setMaxBikeDurationToPt(Integer maxBikeDurationToPt) {
    this.maxBikeDurationToPt = maxBikeDurationToPt;
  }

  public TravelerProfiles bikeSpeed(Float bikeSpeed) {
    this.bikeSpeed = bikeSpeed;
    return this;
  }

   /**
   * Get bikeSpeed
   * @return bikeSpeed
  **/
  @ApiModelProperty(value = "")
  public Float getBikeSpeed() {
    return bikeSpeed;
  }

  public void setBikeSpeed(Float bikeSpeed) {
    this.bikeSpeed = bikeSpeed;
  }

  public TravelerProfiles carSpeed(Float carSpeed) {
    this.carSpeed = carSpeed;
    return this;
  }

   /**
   * Get carSpeed
   * @return carSpeed
  **/
  @ApiModelProperty(value = "")
  public Float getCarSpeed() {
    return carSpeed;
  }

  public void setCarSpeed(Float carSpeed) {
    this.carSpeed = carSpeed;
  }

  public TravelerProfiles maxCarDurationToPt(Integer maxCarDurationToPt) {
    this.maxCarDurationToPt = maxCarDurationToPt;
    return this;
  }

   /**
   * Get maxCarDurationToPt
   * @return maxCarDurationToPt
  **/
  @ApiModelProperty(value = "")
  public Integer getMaxCarDurationToPt() {
    return maxCarDurationToPt;
  }

  public void setMaxCarDurationToPt(Integer maxCarDurationToPt) {
    this.maxCarDurationToPt = maxCarDurationToPt;
  }

  public TravelerProfiles bssSpeed(Float bssSpeed) {
    this.bssSpeed = bssSpeed;
    return this;
  }

   /**
   * Get bssSpeed
   * @return bssSpeed
  **/
  @ApiModelProperty(value = "")
  public Float getBssSpeed() {
    return bssSpeed;
  }

  public void setBssSpeed(Float bssSpeed) {
    this.bssSpeed = bssSpeed;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TravelerProfiles travelerProfiles = (TravelerProfiles) o;
    return Objects.equals(this.lastSectionMode, travelerProfiles.lastSectionMode) &&
        Objects.equals(this.walkingSpeed, travelerProfiles.walkingSpeed) &&
        Objects.equals(this.isFromDb, travelerProfiles.isFromDb) &&
        Objects.equals(this.travelerType, travelerProfiles.travelerType) &&
        Objects.equals(this.wheelchair, travelerProfiles.wheelchair) &&
        Objects.equals(this.maxBssDurationToPt, travelerProfiles.maxBssDurationToPt) &&
        Objects.equals(this.maxWalkingDurationToPt, travelerProfiles.maxWalkingDurationToPt) &&
        Objects.equals(this.firstSectionMode, travelerProfiles.firstSectionMode) &&
        Objects.equals(this.maxBikeDurationToPt, travelerProfiles.maxBikeDurationToPt) &&
        Objects.equals(this.bikeSpeed, travelerProfiles.bikeSpeed) &&
        Objects.equals(this.carSpeed, travelerProfiles.carSpeed) &&
        Objects.equals(this.maxCarDurationToPt, travelerProfiles.maxCarDurationToPt) &&
        Objects.equals(this.bssSpeed, travelerProfiles.bssSpeed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastSectionMode, walkingSpeed, isFromDb, travelerType, wheelchair, maxBssDurationToPt, maxWalkingDurationToPt, firstSectionMode, maxBikeDurationToPt, bikeSpeed, carSpeed, maxCarDurationToPt, bssSpeed);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TravelerProfiles {\n");
    
    sb.append("    lastSectionMode: ").append(toIndentedString(lastSectionMode)).append("\n");
    sb.append("    walkingSpeed: ").append(toIndentedString(walkingSpeed)).append("\n");
    sb.append("    isFromDb: ").append(toIndentedString(isFromDb)).append("\n");
    sb.append("    travelerType: ").append(toIndentedString(travelerType)).append("\n");
    sb.append("    wheelchair: ").append(toIndentedString(wheelchair)).append("\n");
    sb.append("    maxBssDurationToPt: ").append(toIndentedString(maxBssDurationToPt)).append("\n");
    sb.append("    maxWalkingDurationToPt: ").append(toIndentedString(maxWalkingDurationToPt)).append("\n");
    sb.append("    firstSectionMode: ").append(toIndentedString(firstSectionMode)).append("\n");
    sb.append("    maxBikeDurationToPt: ").append(toIndentedString(maxBikeDurationToPt)).append("\n");
    sb.append("    bikeSpeed: ").append(toIndentedString(bikeSpeed)).append("\n");
    sb.append("    carSpeed: ").append(toIndentedString(carSpeed)).append("\n");
    sb.append("    maxCarDurationToPt: ").append(toIndentedString(maxCarDurationToPt)).append("\n");
    sb.append("    bssSpeed: ").append(toIndentedString(bssSpeed)).append("\n");
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
     
    out.writeValue(lastSectionMode);

    out.writeValue(walkingSpeed);

    out.writeValue(isFromDb);

    out.writeValue(travelerType);

    out.writeValue(wheelchair);

    out.writeValue(maxBssDurationToPt);

    out.writeValue(maxWalkingDurationToPt);

    out.writeValue(firstSectionMode);

    out.writeValue(maxBikeDurationToPt);

    out.writeValue(bikeSpeed);

    out.writeValue(carSpeed);

    out.writeValue(maxCarDurationToPt);

    out.writeValue(bssSpeed);
  }

  public TravelerProfiles() {
    super();
  }

  TravelerProfiles(Parcel in) {
    
    lastSectionMode = (List<String>)in.readValue(null);
    walkingSpeed = (Float)in.readValue(null);
    isFromDb = (Boolean)in.readValue(null);
    travelerType = (String)in.readValue(null);
    wheelchair = (Boolean)in.readValue(null);
    maxBssDurationToPt = (Integer)in.readValue(null);
    maxWalkingDurationToPt = (Integer)in.readValue(null);
    firstSectionMode = (List<String>)in.readValue(null);
    maxBikeDurationToPt = (Integer)in.readValue(null);
    bikeSpeed = (Float)in.readValue(null);
    carSpeed = (Float)in.readValue(null);
    maxCarDurationToPt = (Integer)in.readValue(null);
    bssSpeed = (Float)in.readValue(null);
  }
  
  public int describeContents() {
    return 0;
  }

  public static final Parcelable.Creator<TravelerProfiles> CREATOR = new Parcelable.Creator<TravelerProfiles>() {
    public TravelerProfiles createFromParcel(Parcel in) {
      return new TravelerProfiles(in);
    }
    public TravelerProfiles[] newArray(int size) {
      return new TravelerProfiles[size];
    }
  };
}
