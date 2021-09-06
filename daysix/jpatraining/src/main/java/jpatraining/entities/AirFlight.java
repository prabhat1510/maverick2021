package main.java.jpatraining.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "air_flight")
//Building static queries
@NamedQueries(
		{
			@NamedQuery(name="allFlights",query="select af from AirFlight af"),
			@NamedQuery(name = "flightsToChennai",
				query="select af from AirFlight af where af.toLocation='CHENNAI'")
		}
		)
public class AirFlight {
	@Id
	@Column(name = "flight_id")
	private String flightId;
	@Column(name = "airline_id")
	private String airlineId;
	@Column(name = "airline_name")
	private String airlineName;
	@Column(name = "from_location")
	private String fromLocation;
	@Column(name = "to_location")
	private String toLocation;
	@Temporal(TemporalType.TIME)
	@Column(name = "departure_time")
	private Date departureTime;
	@Temporal(TemporalType.TIME)
	@Column(name = "arrival_time")
	private Date arrivalTime;
	@Temporal(TemporalType.TIME)
	private Date duration;
	@Column(name = "total_seats")
	private Integer totalSeats;
	
	@Override
	public String toString() {
		return "AirFlight [flightId=" + flightId + ", airlineId=" + airlineId + ", airlineName=" + airlineName
				+ ", fromLocation=" + fromLocation + ", toLocation=" + toLocation + ", departureTime=" + departureTime
				+ ", arrivalTime=" + arrivalTime + ", duration=" + duration + ", totalSeats=" + totalSeats + "]";
	}
	
	
}
