package kr.co.ezenac.put.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kr.co.ezenac.put.dto.PutRequestDto;

@RestController
@RequestMapping("/api")
public class PutApiController {

	@PutMapping("/put")
	public PutRequestDto put(@RequestBody PutRequestDto requestDto) {
		System.out.println(requestDto);
		return requestDto;
	}
	
	@PutMapping("/put2/{userId}")
	public PutRequestDto put2(@RequestBody PutRequestDto requestDto, @PathVariable Long userId) {
		System.out.println(userId);
		return requestDto;
	}
	
	@PutMapping("/put3/{userId}")
	public PutRequestDto put3(@RequestBody PutRequestDto requestDto, @PathVariable(name = "userId") Long id) {
		System.out.println(id);
		return requestDto;
	}
}







