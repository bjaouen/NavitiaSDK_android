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
import org.kisio.NavitiaSDK.models.StopPoint;
import android.os.Parcelable;
import android.os.Parcel;

/**
 * JourneyPatternPoint
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.NavitiaSDKJavaClientCodegen", date = "2018-10-18T16:32:06.285+02:00")
public class JourneyPatternPoint implements Parcelable {
  @SerializedName("stop_point")
  private StopPoint stopPoint = null;

  @SerializedName("id")
  private String id = null;

  public JourneyPatternPoint stopPoint(StopPoint stopPoint) {
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

  public JourneyPatternPoint id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(required = true, value = "")
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
    JourneyPatternPoint journeyPatternPoint = (JourneyPatternPoint) o;
    return Objects.equals(this.stopPoint, journeyPatternPoint.stopPoint) &&
        Objects.equals(this.id, journeyPatternPoint.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(stopPoint, id);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JourneyPatternPoint {\n");
    
    sb.append("    stopPoint: ").append(toIndentedString(stopPoint)).append("\n");
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
  
  public void writeToParcel(Parcel out, int flags) {
     
    out.writeValue(stopPoint);

    out.writeValue(id);
  }

  public JourneyPatternPoint() {
    super();
  }

  JourneyPatternPoint(Parcel in) {
    
    stopPoint = (StopPoint)in.readValue(StopPoint.class.getClassLoader());
    id = (String)in.readValue(null);
  }
  
  public int describeContents() {
    return 0;
  }

  public static final Parcelable.Creator<JourneyPatternPoint> CREATOR = new Parcelable.Creator<JourneyPatternPoint>() {
    public JourneyPatternPoint createFromParcel(Parcel in) {
      return new JourneyPatternPoint(in);
    }
    public JourneyPatternPoint[] newArray(int size) {
      return new JourneyPatternPoint[size];
    }
  };
}

