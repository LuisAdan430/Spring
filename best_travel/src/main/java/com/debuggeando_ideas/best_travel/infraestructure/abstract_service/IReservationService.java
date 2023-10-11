package com.debuggeando_ideas.best_travel.infraestructure.abstract_service;

import com.debuggeando_ideas.best_travel.api.request.ReservationRequest;
import com.debuggeando_ideas.best_travel.api.responses.ReservationResponse;

import java.math.BigDecimal;
import java.util.UUID;

public interface IReservationService extends CrudService<ReservationRequest, ReservationResponse, UUID>{
    public BigDecimal findPrice(Long hotelId);
}
