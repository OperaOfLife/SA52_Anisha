package com.example.SA52AnishaFibonacci.fibonacci;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class FibonacciController 
{
	@Autowired
	FibonacciService fservice;
	
	@PostMapping(value="/fibonacci/{elements}")
	public Map<String, List> fibonacci(@PathVariable Integer elements)
	{
		List<Integer> fibolist = fservice.fibo(elements);
		List<Integer> sortedlist = fservice.sort(fibolist);
		Map<String, List> imap = new LinkedHashMap<String, List>();
		
        imap.put("Fibolist", fibolist);	
        imap.put("Sortedlist", sortedlist);	
		
        return imap;
		
	}
}
