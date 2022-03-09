package com.skyblue.mart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.swing.plaf.synth.SynthEditorPaneUI;

@SpringBootApplication
public class MartApplication {

	public static void main(String[] args) {
		SpringApplication.run(MartApplication.class, args);
		System.out.println("Application is Running");
	}

}
