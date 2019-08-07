package com.nts.reservation.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ReservationController {
	@GetMapping("mainpage")
	public String mainpage() {
		return "mainpage";
	}

	@GetMapping("detail")
	public String productDetail(@RequestParam(value = "id") int displayInfoId) {
		if (displayInfoId <= 0) {
			throw new IllegalArgumentException("DisplayInfoId is below 0.");
		}
		return "detail";
	}

	@GetMapping("review")
	public String review(@RequestParam(value = "id") int displayInfoId) {
		return "review";
	}

	@GetMapping("reserve")
	public String reserve(@RequestParam(value = "id") int displayInfoId) {
		return "review";
	}

	@GetMapping("myreservation")
	public String myreservation(@RequestParam(value = "id") int displayInfoId) {
		return "review";
	}

}
