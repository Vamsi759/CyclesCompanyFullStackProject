package demo.service;

import org.springframework.stereotype.Service;

import demo.entity.Component;
import demo.entity.Cycle;
import demo.repository.CycleRepository;

@Service
public class PricingService {

	private CycleRepository cycleRepository;

	public PricingService(CycleRepository cycleRepository) {

		this.cycleRepository = cycleRepository;

	}

	public double calculatePrice(Long cycleId) {

		Cycle cycle = cycleRepository.findById(cycleId).get();

		double total = 0;

		for (Component c : cycle.getComponents()) {

			total += c.getPrice();

		}

		return total;

	}

}
