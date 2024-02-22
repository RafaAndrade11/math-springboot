/**
 * 
 */
package br.com.randrade.controller;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.randrade.converter.NumberConverter;
import br.com.randrade.exceptions.UnsupportedMathOperationException;

/**
 * 
 */
@RestController
public class MathController {

	private final AtomicLong counter = new AtomicLong();

	//SOMA
	@RequestMapping(value = "/sum/{numberOne}/{numberTwo}",
			method = RequestMethod.GET)
	public Double sum(
			@PathVariable(value = "numberOne") String numberOne,
			@PathVariable(value = "numberTwo") String numberTwo
			) throws Exception {
		
		if(!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) {
			throw new UnsupportedMathOperationException("Please set a numeric value!");
		}
		
		return (NumberConverter.convertToDouble(numberOne)) + (NumberConverter.convertToDouble(numberTwo));
	}
	
	//SUBTRAÇÃO
	@RequestMapping(value = "/subtration/{numberOne}/{numberTwo}",
			method = RequestMethod.GET)
	public Double subtration(
			@PathVariable(value = "numberOne") String numberOne,
			@PathVariable(value = "numberTwo") String numberTwo
			) throws Exception {
		
		if(!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) {
			throw new UnsupportedMathOperationException("Please set a numeric value!");
		}
		
		return (NumberConverter.convertToDouble(numberOne)) - (NumberConverter.convertToDouble(numberTwo));
	}
	
	//MULTIPLICAÇÃO
	@RequestMapping(value = "/mult/{numberOne}/{numberTwo}",
			method = RequestMethod.GET)
	public Double mult(
			@PathVariable(value = "numberOne") String numberOne,
			@PathVariable(value = "numberTwo") String numberTwo
			) throws Exception {
		
		if(!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) {
			throw new UnsupportedMathOperationException("Please set a numeric value!");
		}
		
		return (NumberConverter.convertToDouble(numberOne)) * (NumberConverter.convertToDouble(numberTwo));
	}
	
	//DIVISÃO
	@RequestMapping(value = "/div/{numberOne}/{numberTwo}",
			method = RequestMethod.GET)
	public Double div(
			@PathVariable(value = "numberOne") String numberOne,
			@PathVariable(value = "numberTwo") String numberTwo
			) throws Exception {
		
		if(!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) {
			throw new UnsupportedMathOperationException("Please set a numeric value!");
		}
		
		return (NumberConverter.convertToDouble(numberOne)) / (NumberConverter.convertToDouble(numberTwo));
	}
	
	//MÉDIA
	@RequestMapping(value = "/media/{numberOne}/{numberTwo}",
			method = RequestMethod.GET)
	public Double media(
			@PathVariable(value = "numberOne") String numberOne,
			@PathVariable(value = "numberTwo") String numberTwo
			) throws Exception {
		
		if(!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) {
			throw new UnsupportedMathOperationException("Please set a numeric value!");
		}
		
		return ((NumberConverter.convertToDouble(numberOne)) + (NumberConverter.convertToDouble(numberTwo))) / 2;
	}
	
}
