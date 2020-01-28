package com.fms.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Event
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-01-27T17:18:52.993+05:30[Asia/Calcutta]")
public class Event   {
  @JsonProperty("base_location")
  private String baseLocation = null;

  @JsonProperty("event_date")
  private OffsetDateTime eventDate = null;

  @JsonProperty("event_id")
  private Integer eventId = null;

  @JsonProperty("event_name")
  private String eventName = null;

  @JsonProperty("event_status")
  private String eventStatus = null;

  @JsonProperty("total_travel_hour")
  private Integer totalTravelHour = null;

  @JsonProperty("total_volunteer_hour")
  private Integer totalVolunteerHour = null;

  @JsonProperty("total_volunteers")
  private Integer totalVolunteers = null;

  @JsonProperty("venue_address")
  private String venueAddress = null;

  public Event baseLocation(String baseLocation) {
    this.baseLocation = baseLocation;
    return this;
  }

  /**
   * Get baseLocation
   * @return baseLocation
  **/
  @ApiModelProperty(value = "")
  
    public String getBaseLocation() {
    return baseLocation;
  }

  public void setBaseLocation(String baseLocation) {
    this.baseLocation = baseLocation;
  }

  public Event eventDate(OffsetDateTime eventDate) {
    this.eventDate = eventDate;
    return this;
  }

  /**
   * Get eventDate
   * @return eventDate
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public OffsetDateTime getEventDate() {
    return eventDate;
  }

  public void setEventDate(OffsetDateTime eventDate) {
    this.eventDate = eventDate;
  }

  public Event eventId(Integer eventId) {
    this.eventId = eventId;
    return this;
  }

  /**
   * Get eventId
   * @return eventId
  **/
  @ApiModelProperty(value = "")
  
    public Integer getEventId() {
    return eventId;
  }

  public void setEventId(Integer eventId) {
    this.eventId = eventId;
  }

  public Event eventName(String eventName) {
    this.eventName = eventName;
    return this;
  }

  /**
   * Get eventName
   * @return eventName
  **/
  @ApiModelProperty(value = "")
  
    public String getEventName() {
    return eventName;
  }

  public void setEventName(String eventName) {
    this.eventName = eventName;
  }

  public Event eventStatus(String eventStatus) {
    this.eventStatus = eventStatus;
    return this;
  }

  /**
   * Get eventStatus
   * @return eventStatus
  **/
  @ApiModelProperty(value = "")
  
    public String getEventStatus() {
    return eventStatus;
  }

  public void setEventStatus(String eventStatus) {
    this.eventStatus = eventStatus;
  }

  public Event totalTravelHour(Integer totalTravelHour) {
    this.totalTravelHour = totalTravelHour;
    return this;
  }

  /**
   * Get totalTravelHour
   * @return totalTravelHour
  **/
  @ApiModelProperty(value = "")
  
    public Integer getTotalTravelHour() {
    return totalTravelHour;
  }

  public void setTotalTravelHour(Integer totalTravelHour) {
    this.totalTravelHour = totalTravelHour;
  }

  public Event totalVolunteerHour(Integer totalVolunteerHour) {
    this.totalVolunteerHour = totalVolunteerHour;
    return this;
  }

  /**
   * Get totalVolunteerHour
   * @return totalVolunteerHour
  **/
  @ApiModelProperty(value = "")
  
    public Integer getTotalVolunteerHour() {
    return totalVolunteerHour;
  }

  public void setTotalVolunteerHour(Integer totalVolunteerHour) {
    this.totalVolunteerHour = totalVolunteerHour;
  }

  public Event totalVolunteers(Integer totalVolunteers) {
    this.totalVolunteers = totalVolunteers;
    return this;
  }

  /**
   * Get totalVolunteers
   * @return totalVolunteers
  **/
  @ApiModelProperty(value = "")
  
    public Integer getTotalVolunteers() {
    return totalVolunteers;
  }

  public void setTotalVolunteers(Integer totalVolunteers) {
    this.totalVolunteers = totalVolunteers;
  }

  public Event venueAddress(String venueAddress) {
    this.venueAddress = venueAddress;
    return this;
  }

  /**
   * Get venueAddress
   * @return venueAddress
  **/
  @ApiModelProperty(value = "")
  
    public String getVenueAddress() {
    return venueAddress;
  }

  public void setVenueAddress(String venueAddress) {
    this.venueAddress = venueAddress;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Event event = (Event) o;
    return Objects.equals(this.baseLocation, event.baseLocation) &&
        Objects.equals(this.eventDate, event.eventDate) &&
        Objects.equals(this.eventId, event.eventId) &&
        Objects.equals(this.eventName, event.eventName) &&
        Objects.equals(this.eventStatus, event.eventStatus) &&
        Objects.equals(this.totalTravelHour, event.totalTravelHour) &&
        Objects.equals(this.totalVolunteerHour, event.totalVolunteerHour) &&
        Objects.equals(this.totalVolunteers, event.totalVolunteers) &&
        Objects.equals(this.venueAddress, event.venueAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(baseLocation, eventDate, eventId, eventName, eventStatus, totalTravelHour, totalVolunteerHour, totalVolunteers, venueAddress);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Event {\n");
    
    sb.append("    baseLocation: ").append(toIndentedString(baseLocation)).append("\n");
    sb.append("    eventDate: ").append(toIndentedString(eventDate)).append("\n");
    sb.append("    eventId: ").append(toIndentedString(eventId)).append("\n");
    sb.append("    eventName: ").append(toIndentedString(eventName)).append("\n");
    sb.append("    eventStatus: ").append(toIndentedString(eventStatus)).append("\n");
    sb.append("    totalTravelHour: ").append(toIndentedString(totalTravelHour)).append("\n");
    sb.append("    totalVolunteerHour: ").append(toIndentedString(totalVolunteerHour)).append("\n");
    sb.append("    totalVolunteers: ").append(toIndentedString(totalVolunteers)).append("\n");
    sb.append("    venueAddress: ").append(toIndentedString(venueAddress)).append("\n");
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
