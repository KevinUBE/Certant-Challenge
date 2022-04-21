package com.Certant.Challenge.Service.imp;

import java.util.List;

import org.springframework.stereotype.Service;

import com.Certant.Challenge.Entity.CarEntity;
//import com.Certant.Challenge.Exception.ParamNotFound;
import com.Certant.Challenge.Repository.CarRepository;
import com.Certant.Challenge.Service.CarService;

@Service
public class CarServiceImp implements CarService {
	
	private CarRepository carRepository;

	@Override
	public List<CarEntity> getCars() {
		
		return carRepository.findAll();
		
	}

	@Override
	public CarEntity getCar(String domain) {
		
		return carRepository.findById(domain).get();
		
	}

	@Override
	public void saveCar(CarEntity car) {
		
		carRepository.save(car);
		
	}

	/*@Override
	public void updateCar(CarEntity car) {
		// TODO Auto-generated method stub
		
	}*/

	@Override
	public void deleteCar(String domain) {
		
		/*if(carRepository.findById(domain).isEmpty()) {
			throw new ParamNotFound("dominio no encontrado");
		}*/
		carRepository.deleteById(domain);
		
	}
	

}
