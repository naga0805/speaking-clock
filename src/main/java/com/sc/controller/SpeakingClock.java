package com.sc.controller;

import java.util.Scanner;

import org.springframework.stereotype.Service;

@Service
public class SpeakingClock {

	static String[] arrHours = { "tweleve", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine",
			"Ten", "Eleven" };
	static String[] arrNum = { "", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine" };

	static String[] arrTeens = { "Ten", "Eleven", "Tweleve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "SevenTeen",
			"Eighteen", "NineTeen" };
	static String[] arrTys = { "", "", "Twenty", "Thirty", "Forty", "Fifty" };

	public String convertToString(String time) {

		String[] arrOfStr = time.split(":");

		int h = Integer.parseInt(arrOfStr[0]);
		int m = Integer.parseInt(arrOfStr[1]);
		String minutes = "";
		if (m < 10) {
			minutes = arrNum[m];
		} else if (m < 20) {
			minutes = arrTeens[m % 10];
		} else if (m < 20) {
			minutes = arrTeens[m % 10];
		} else {
			minutes = arrTys[(int) Math.floor(m / 10)] + " " + arrNum[m % 10];

		}
		String s = (h < 12) ? "AM" : "PM";
		
		String outPut = "It's " + arrHours[h % 12] + " " + minutes + " " + s;
		return outPut;
	}

	/*
	 * public static void main(String[] args) { Scanner sc = new Scanner(System.in);
	 * System.out.print("Enter Time( eg: 10:15)  "); // reading the number of
	 * elements from the that we want to enter String str = sc.nextLine(); // reads
	 * string convertToString(str); }
	 */

}
