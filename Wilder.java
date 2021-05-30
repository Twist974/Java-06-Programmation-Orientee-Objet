package com.wcs;

public class Wilder {

	//attributes
		private String firstname;
		private boolean aware;
		
		//constructor
		public Wilder(String firstname) {
			 this.firstname = firstname;
			 this.aware = false;
			}
		
		// getters firstname
		public String getFirstname() {
			return firstname;
		}

		// setters firstname
		public void setFirstname(String firstname) {
			this.firstname = firstname;
		}

		// getters aware
		public boolean isAware() {
			return aware;
		}

		// setters aware
		public void setAware(boolean aware) {
			this.aware = aware;
		}

	    public String whoAmI() {
	    	if (aware) {
	    	return "Je m'appelle " + this.getFirstname() + " et je suis aware";
	        } 
	    	else {
	    	return "Je m'appelle " + this.getFirstname() + " et je ne suis pas aware";
	        }
	      }
}
