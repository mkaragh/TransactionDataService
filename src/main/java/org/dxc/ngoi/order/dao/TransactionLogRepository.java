package org.dxc.ngoi.order.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;


public interface TransactionLogRepository extends JpaRepository<TransactionLog, Integer> {
	
	@Modifying
	@Query("update TransactionLog t set t.gsMsg = ?1 where t.messageId = ?2")
	int setGsMsg(String gsMsg, String messageId);
	
	@Query("select t.gsMsg from TransactionLog t where t.messageId = ?1 ")
	String getGsMag(String messageId);
	

}
