package telran.drones.service;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import telran.drones.dto.*;
import telran.drones.repo.*;

@Service
@RequiredArgsConstructor
public class DronesServiceImpl implements DronesService {
	
	final DroneRepo droneRepo;
	final MedicationRepo medicatioRepo;
	final LogRepo logRepo;
	
	@Override
	public DroneDto registerDrone(DroneDto droneDto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public LogDto loadDrone(String droneNumber, String medicationCode) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<MedicationDto> checkMedicationItems(String droneNumber) {
		// TODO Auto-generated method stub
		return null;
	}

}
