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
import org.kisio.NavitiaSDK.models.Cost;
import org.kisio.NavitiaSDK.models.LinkSchema;
import android.os.Parcelable;
import android.os.Parcel;

/**
 * Fare
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.NavitiaSDKJavaClientCodegen", date = "2018-10-18T16:32:06.285+02:00")
public class Fare implements Parcelable {
  @SerializedName("found")
  private Boolean found = null;

  @SerializedName("total")
  private Cost total = null;

  @SerializedName("links")
  private List<LinkSchema> links = new ArrayList<LinkSchema>();

  public Fare found(Boolean found) {
    this.found = found;
    return this;
  }

   /**
   * Get found
   * @return found
  **/
  @ApiModelProperty(value = "")
  public Boolean getFound() {
    return found;
  }

  public void setFound(Boolean found) {
    this.found = found;
  }

  public Fare total(Cost total) {
    this.total = total;
    return this;
  }

   /**
   * Get total
   * @return total
  **/
  @ApiModelProperty(value = "")
  public Cost getTotal() {
    return total;
  }

  public void setTotal(Cost total) {
    this.total = total;
  }

  public Fare links(List<LinkSchema> links) {
    this.links = links;
    return this;
  }

  public Fare addLinksItem(LinkSchema linksItem) {
    this.links.add(linksItem);
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @ApiModelProperty(required = true, value = "")
  public List<LinkSchema> getLinks() {
    return links;
  }

  public void setLinks(List<LinkSchema> links) {
    this.links = links;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Fare fare = (Fare) o;
    return Objects.equals(this.found, fare.found) &&
        Objects.equals(this.total, fare.total) &&
        Objects.equals(this.links, fare.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(found, total, links);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Fare {\n");
    
    sb.append("    found: ").append(toIndentedString(found)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
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
     
    out.writeValue(found);

    out.writeValue(total);

    out.writeValue(links);
  }

  public Fare() {
    super();
  }

  Fare(Parcel in) {
    
    found = (Boolean)in.readValue(null);
    total = (Cost)in.readValue(Cost.class.getClassLoader());
    links = (List<LinkSchema>)in.readValue(LinkSchema.class.getClassLoader());
  }
  
  public int describeContents() {
    return 0;
  }

  public static final Parcelable.Creator<Fare> CREATOR = new Parcelable.Creator<Fare>() {
    public Fare createFromParcel(Parcel in) {
      return new Fare(in);
    }
    public Fare[] newArray(int size) {
      return new Fare[size];
    }
  };
}

