package com.debuggeando_ideas.best_travel.infraestructure.abstract_service;

import com.debuggeando_ideas.best_travel.api.request.TicketRequest;
import com.debuggeando_ideas.best_travel.api.responses.TicketResponse;

import java.math.BigDecimal;
import java.util.UUID;

public interface ITicketService extends CrudService<TicketRequest, TicketResponse, UUID> {
    BigDecimal findPrice(Long flyId);
}
