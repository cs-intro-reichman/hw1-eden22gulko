// Represents the hh:mm time format using an AM/PM format. 
public class TimeFormat {
	public static void main(String[] args) {
		String time = args[0];
        
		char one = time.charAt(0);
		char two = time.charAt(1);
		char three = time.charAt(3);
		char four = time.charAt(4);

// arrays of hours and minutes
		char[] first = {one, two};
		char[] second = {three, four};

// convert from char to int
		int hours = (first[0] - '0') * 10 + (first[1] - '0');
		int minutes = (second[0] - '0') * 10 + (second[1] - '0');

		if (hours < 12) {
			if (minutes < 10) {
				
			 System.out.print(hours + ":0" + minutes + " AM ");
			}else{
				System.out.print (hours + ":" + minutes + " AM ");
			}
		}else{
			if (minutes < 10) {
			System.out.print(hours - 12 + ":0" + minutes + " PM ");
			}else{
				System.out.print (hours - 12 + ":" + minutes + " AM ");
			}
		}

		}

	}
