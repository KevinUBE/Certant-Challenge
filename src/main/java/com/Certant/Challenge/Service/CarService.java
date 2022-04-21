package com.Certant.Challenge.Service;

import java.util.List;
import com.Certant.Challenge.Entity.CarEntity;
//Preguntar que es el DTO, tambien donde pingo puso los getter y setter

public interface CarService {
	
	//Select de todas los regitros
	List<CarEntity> getCars();
	
	//Select pasando como parametro de la PK
	CarEntity getCar(String domain);
	
	//Insert de una tupla
	void saveCar(CarEntity car);
	
	//Update de una tupla
	
	//void updateCar(CarEntity car);
	
	//Delete de una tupla
	
	void deleteCar(String domain);

	
}
