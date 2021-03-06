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
 * LinkSchema
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.NavitiaSDKJavaClientCodegen", date = "2018-10-18T16:32:06.285+02:00")
public class LinkSchema implements Parcelable {
  @SerializedName("title")
  private String title = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("href")
  private String href = null;

  @SerializedName("rel")
  private String rel = null;

  @SerializedName("templated")
  private Boolean templated = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("internal")
  private Boolean internal = null;

  public LinkSchema title(String title) {
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  @ApiModelProperty(value = "")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public LinkSchema id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public LinkSchema href(String href) {
    this.href = href;
    return this;
  }

   /**
   * Get href
   * @return href
  **/
  @ApiModelProperty(value = "")
  public String getHref() {
    return href;
  }

  public void setHref(String href) {
    this.href = href;
  }

  public LinkSchema rel(String rel) {
    this.rel = rel;
    return this;
  }

   /**
   * Get rel
   * @return rel
  **/
  @ApiModelProperty(value = "")
  public String getRel() {
    return rel;
  }

  public void setRel(String rel) {
    this.rel = rel;
  }

  public LinkSchema templated(Boolean templated) {
    this.templated = templated;
    return this;
  }

   /**
   * Get templated
   * @return templated
  **/
  @ApiModelProperty(value = "")
  public Boolean getTemplated() {
    return templated;
  }

  public void setTemplated(Boolean templated) {
    this.templated = templated;
  }

  public LinkSchema type(String type) {
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

  public LinkSchema internal(Boolean internal) {
    this.internal = internal;
    return this;
  }

   /**
   * Get internal
   * @return internal
  **/
  @ApiModelProperty(value = "")
  public Boolean getInternal() {
    return internal;
  }

  public void setInternal(Boolean internal) {
    this.internal = internal;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LinkSchema linkSchema = (LinkSchema) o;
    return Objects.equals(this.title, linkSchema.title) &&
        Objects.equals(this.id, linkSchema.id) &&
        Objects.equals(this.href, linkSchema.href) &&
        Objects.equals(this.rel, linkSchema.rel) &&
        Objects.equals(this.templated, linkSchema.templated) &&
        Objects.equals(this.type, linkSchema.type) &&
        Objects.equals(this.internal, linkSchema.internal);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, id, href, rel, templated, type, internal);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LinkSchema {\n");
    
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    rel: ").append(toIndentedString(rel)).append("\n");
    sb.append("    templated: ").append(toIndentedString(templated)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    internal: ").append(toIndentedString(internal)).append("\n");
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
     
    out.writeValue(title);

    out.writeValue(id);

    out.writeValue(href);

    out.writeValue(rel);

    out.writeValue(templated);

    out.writeValue(type);

    out.writeValue(internal);
  }

  public LinkSchema() {
    super();
  }

  LinkSchema(Parcel in) {
    
    title = (String)in.readValue(null);
    id = (String)in.readValue(null);
    href = (String)in.readValue(null);
    rel = (String)in.readValue(null);
    templated = (Boolean)in.readValue(null);
    type = (String)in.readValue(null);
    internal = (Boolean)in.readValue(null);
  }
  
  public int describeContents() {
    return 0;
  }

  public static final Parcelable.Creator<LinkSchema> CREATOR = new Parcelable.Creator<LinkSchema>() {
    public LinkSchema createFromParcel(Parcel in) {
      return new LinkSchema(in);
    }
    public LinkSchema[] newArray(int size) {
      return new LinkSchema[size];
    }
  };
}

