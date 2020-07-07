package com.hangmanGame.controller;

import java.util.ArrayList;
import java.util.List;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 9; i++) {
			String str = "";
			if(i==0 || i==8) {
				for (int j = 0; j < 8; j++) {
					str+="*";
				}
			} else {
				for (int j = 0; j < 8; j++) {
					if(j==0 || j==7) {
						str+="*";
					} else {
						str+=" ";
					}
				}
			}
			System.out.println(str);
		}
	}
}
