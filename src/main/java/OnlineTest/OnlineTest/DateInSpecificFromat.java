package OnlineTest.OnlineTest;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateInSpecificFromat {

	public static void main(String[] args) {
		String pattern = "MM/dd/yyyy"; //MM-DD-YYYY, DD-MM-YYYY , MM-DD-YY etc
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);

		String date = simpleDateFormat.format(new Date());
		System.out.println(date); 

	}

}
