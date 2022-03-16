package org.phone;

public class PhoneInfo {

	private void stubphoneName() {
		System.out.println("stubphoneName");		
	}
	private void phoneMieiNum() {
		System.out.println("phoneMieiNum");		
	}
	private void Camera() {
		System.out.println("Camera");		
	}
	private void storage() {
		System.out.println("storage");		
	}
	private void osName() {
		System.out.println("osName");		
	}
	public static void main(String args[]) {
		
		PhoneInfo c = new PhoneInfo();
		c.stubphoneName();
		c.phoneMieiNum();
		c.Camera();
		c.storage();
		c.osName();
	}
	

}
