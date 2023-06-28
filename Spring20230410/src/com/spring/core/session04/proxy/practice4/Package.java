package com.spring.core.session04.proxy.practice4;

public class Package {
	private String packageId;
    private String sender;
    private String recipient;
    private DeliveryStatus deliveryStatus;
    
    public Package(String packageId, String sender, String recipient, DeliveryStatus deliveryStatus) {
        this.packageId = packageId;
        this.sender = sender;
        this.recipient = recipient;
        this.deliveryStatus = deliveryStatus;
    }

	public String getPackageId() {
		return packageId;
	}

	public void setPackageId(String packageId) {
		this.packageId = packageId;
	}

	public String getSender() {
		return sender;
	}

	public void setSender(String sender) {
		this.sender = sender;
	}

	public String getRecipient() {
		return recipient;
	}

	public void setRecipient(String recipient) {
		this.recipient = recipient;
	}

	public DeliveryStatus getDeliveryStatus() {
		return deliveryStatus;
	}

	public void setDeliveryStatus(DeliveryStatus deliveryStatus) {
		this.deliveryStatus = deliveryStatus;
	}
    
}
