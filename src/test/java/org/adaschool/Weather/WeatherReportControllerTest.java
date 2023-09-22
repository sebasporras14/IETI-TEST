package org.adaschool.Weather;

import org.adaschool.Weather.controller.WeatherReportController;
import org.adaschool.Weather.data.WeatherReport;
import org.adaschool.Weather.service.WeatherReportService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import static org.mockito.Mockito.when;

@SpringBootTest
public class WeatherReportControllerTest {

	@MockBean
	WeatherReportService weatherReportService;

	@Autowired
	WeatherReportController weatherReportController;

	@Test
	public void testGetWeatherReportWhenValidLatitudeAndLongitudeShowReport() {
		// Arrange
		Double latitude = 26.7156;
		Double longitude = -121.3442;
		WeatherReport weatherReport = new WeatherReport();
		weatherReport.setHumidity(72.0);
		weatherReport.setTemperature(0.0);
		// Assert
		when(weatherReportService.getWeatherReport(latitude, longitude)).thenReturn(weatherReport);
	}
}