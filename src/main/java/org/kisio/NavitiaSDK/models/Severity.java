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
 * Severity
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.NavitiaSDKJavaClientCodegen", date = "2018-10-18T16:32:06.285+02:00")
public class Severity implements Parcelable {
  @SerializedName("color")
  private String color = null;

  @SerializedName("priority")
  private Integer priority = null;

  @SerializedName("name")
  private String name = null;

  /**
   * Gets or Sets effect
   */
  public enum EffectEnum {
    @SerializedName("NO_SERVICE")
    NO_SERVICE("NO_SERVICE"),
    
    @SerializedName("REDUCED_SERVICE")
    REDUCED_SERVICE("REDUCED_SERVICE"),
    
    @SerializedName("SIGNIFICANT_DELAYS")
    SIGNIFICANT_DELAYS("SIGNIFICANT_DELAYS"),
    
    @SerializedName("DETOUR")
    DETOUR("DETOUR"),
    
    @SerializedName("ADDITIONAL_SERVICE")
    ADDITIONAL_SERVICE("ADDITIONAL_SERVICE"),
    
    @SerializedName("MODIFIED_SERVICE")
    MODIFIED_SERVICE("MODIFIED_SERVICE"),
    
    @SerializedName("OTHER_EFFECT")
    OTHER_EFFECT("OTHER_EFFECT"),
    
    @SerializedName("UNKNOWN_EFFECT")
    UNKNOWN_EFFECT("UNKNOWN_EFFECT"),
    
    @SerializedName("STOP_MOVED")
    STOP_MOVED("STOP_MOVED");

    private String value;

    EffectEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("effect")
  private EffectEnum effect = null;

  public Severity color(String color) {
    this.color = color;
    return this;
  }

   /**
   * Get color
   * @return color
  **/
  @ApiModelProperty(value = "")
  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public Severity priority(Integer priority) {
    this.priority = priority;
    return this;
  }

   /**
   * Get priority
   * @return priority
  **/
  @ApiModelProperty(value = "")
  public Integer getPriority() {
    return priority;
  }

  public void setPriority(Integer priority) {
    this.priority = priority;
  }

  public Severity name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Severity effect(EffectEnum effect) {
    this.effect = effect;
    return this;
  }

   /**
   * Get effect
   * @return effect
  **/
  @ApiModelProperty(value = "")
  public EffectEnum getEffect() {
    return effect;
  }

  public void setEffect(EffectEnum effect) {
    this.effect = effect;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Severity severity = (Severity) o;
    return Objects.equals(this.color, severity.color) &&
        Objects.equals(this.priority, severity.priority) &&
        Objects.equals(this.name, severity.name) &&
        Objects.equals(this.effect, severity.effect);
  }

  @Override
  public int hashCode() {
    return Objects.hash(color, priority, name, effect);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Severity {\n");
    
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    effect: ").append(toIndentedString(effect)).append("\n");
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
     
    out.writeValue(color);

    out.writeValue(priority);

    out.writeValue(name);

    out.writeValue(effect);
  }

  public Severity() {
    super();
  }

  Severity(Parcel in) {
    
    color = (String)in.readValue(null);
    priority = (Integer)in.readValue(null);
    name = (String)in.readValue(null);
    effect = (EffectEnum)in.readValue(null);
  }
  
  public int describeContents() {
    return 0;
  }

  public static final Parcelable.Creator<Severity> CREATOR = new Parcelable.Creator<Severity>() {
    public Severity createFromParcel(Parcel in) {
      return new Severity(in);
    }
    public Severity[] newArray(int size) {
      return new Severity[size];
    }
  };
}

