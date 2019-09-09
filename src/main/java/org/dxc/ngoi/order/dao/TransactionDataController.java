package org.dxc.ngoi.order.dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import org.dxc.ngoi.order.dao.TransactionLog;
import org.dxc.ngoi.order.dao.TransactionLogRepository;



@RestController    // This means that this class is a Controller
@RequestMapping(path="/TransactionData") // This means URL's start with /demo (after Application path)
public class TransactionDataController {
	
	@Autowired 
	private TransactionLogRepository TransactionLogRepository;
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@PostMapping(path="/add") // Map ONLY POST Requests
	public TransactionLog addNewTransactionLog (@RequestBody TransactionLog transactionLog) {	
	
		TransactionLog transactionLogUpdated = TransactionLogRepository.save(transactionLog);		
		logger.info("Created TransactionLog", transactionLogUpdated);
		return transactionLogUpdated;
		
		// actualy this should return the location of the new resource like 
		// return ResponseEntity.created(location).build().
	}
	
	@GetMapping(path="/all")
	public List<TransactionLog>  getAllTransactionLogs() {
	// This returns a JSON or XML with the TransactionLogs
		return TransactionLogRepository.findAll();
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<?> deleteTransactionLog(@PathVariable Integer id) {
		TransactionLog TransactionLogFromDB = TransactionLogRepository.findById(id)
                .orElseThrow(() -> new TransactionLogNotFoundException("TransactionLog with id "+id+" not found"));
		TransactionLogRepository.deleteById(id);
		return ResponseEntity.ok().build();
		// or else throw is on Optional object
	}
	
	@PutMapping("/update/{id}")
    public  TransactionLog updateTransactionLog(@PathVariable(value = "id") Integer id, @RequestBody TransactionLog TransactionLog) {
		TransactionLog TransactionLogFromDB = TransactionLogRepository.findById(id)
                .orElseThrow(() -> new TransactionLogNotFoundException("TransactionLog with id "+id+" not found"));
		TransactionLog.setMessageId(id);
		TransactionLogRepository.save(TransactionLog);
	
		return TransactionLog;
	}
}