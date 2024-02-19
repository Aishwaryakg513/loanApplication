package com.example.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoanCheckController {
	@GetMapping("/loanChcek/{cs}/{loanamt}/{salary}")
	public ResponseEntity<LoanResponse> checkLoanLimit(@PathVariable("cs") int cs, @PathVariable("loanamt") int loanamt, @PathVariable int salary){
		System.out.println("in check loan limit" + loanamt);
		
		int approvedLoanamt=0;
		int status=0;
		if(salary>50000 && cs>700)
		{
			status=1;
			if(loanamt>1000000) {
				approvedLoanamt=1000000;
			}
			else {
				approvedLoanamt=loanamt;
			}
		}
		LoanResponse lr = new LoanResponse(approvedLoanamt, status);
		return ResponseEntity.ok(lr) ;
	}
}
