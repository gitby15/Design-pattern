package com.adaptorpattern.client;


import com.adaptorpattern.headset.*;

public class HeadsetClient {
	public static void main(String[] args) {
		Target target = new Adaptor();
		target.provide25();
	}
}
