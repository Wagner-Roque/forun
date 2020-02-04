package br.com.qintess.mapstruct;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import br.com.qintess.mapstruct.car.Car;
import br.com.qintess.mapstruct.car.CarDto;
import br.com.qintess.mapstruct.car.CarMapper;

@SpringBootTest
class CarMapStructApplicationTests {

	@Test
	public void shouldMapCarToDto () {

		Car car = new Car();

		CarDto carDto = CarMapper.INSTANCE.carToCarDto (car);
		
		assertThat (carDto).isNotNull();
		assertThat(carDto).getClass();
//		assertThat (carDto).getMake().isEqualTo("Morris");
//		assertThat (carDto).getSeatCount().isEqualTo (5);
//		assertThat (carDto).getType().isEqualTo ("SEDAN");

	} 
}
