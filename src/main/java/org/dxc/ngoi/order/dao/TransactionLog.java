package org.dxc.ngoi.order.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TRANSACTION_LOG")
public class TransactionLog {
	
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)	
	@Column(name = "MESSAGE_ID") 
	private Integer messageId;
	 
	@Column(name = "RECEIVED_DATE") 
	private String receivedDate;
	
	@Column(name = "CUSTOMER_ID")
	private String customerId;
	
	@Column(name = "ORDERSOURCE")
	private String orderSource;
	
	@Column(name = "CUSTOMER_PONBR")
	private String customerPonbr;	 
	
	@Column(name = "REQUEST_MSG")
	private String requestMsg;
	 
	@Column(name = "ACK_MSG")
	 private String ackMsg; 
	
	@Column(name = "GS_MSG")
	 private String gsMsg;
	
	@Column(name = "OUTGOING_MSG")
	 private String outgoingMsg;
	
	@Column(name = "STATUS")
	 private String status;
	
	@Column(name = "SERVER")
	 private String server;
	 
	public Integer getMessageId() {
		return messageId;
	}
	public void setMessageId(Integer messageId) {
		this.messageId = messageId;
	}
	public String getReceivedDate() {
		return receivedDate;
	}
	public void setReceivedDate(String receivedDate) {
		this.receivedDate = receivedDate;
	}
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getOrderSource() {
		return orderSource;
	}
	public void setOrderSource(String orderSource) {
		this.orderSource = orderSource;
	}
	public String getCustomerPonbr() {
		return customerPonbr;
	}
	public void setCustomerPonbr(String customerPonbr) {
		this.customerPonbr = customerPonbr;
	}
	public String getRequestMsg() {
		return requestMsg;
	}
	public void setRequestMsg(String requestMsg) {
		this.requestMsg = requestMsg;
	}
	public String getAckMsg() {
		return ackMsg;
	}
	public void setAckMsg(String ackMsg) {
		this.ackMsg = ackMsg;
	}
	public String getGsMsg() {
		return gsMsg;
	}
	public void setGsMsg(String gsMsg) {
		this.gsMsg = gsMsg;
	}
	public String getOutgoingMsg() {
		return outgoingMsg;
	}
	public void setOutgoingMsg(String outgoingMsg) {
		this.outgoingMsg = outgoingMsg;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getServer() {
		return server;
	}
	public void setServer(String server) {
		this.server = server;
	}
	

	

}
