package L.Calendar;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class Program {

	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
		
		Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
		
		System.out.println(sdf.format(d));
		
		// declarando a variável Calendar
		Calendar cal = Calendar.getInstance();
		
		// calendário recebe a data
		cal.setTime(d);
	
		// adicionando 4 horas no calendário
		cal.add(Calendar.HOUR_OF_DAY, 4);
		d = cal.getTime();
		
		System.out.println(sdf.format(d));
		
		int minutos = cal.get(Calendar.MINUTE);
		System.out.println("minutos: " +  minutos);
		
		int mes = 1 + cal.get(Calendar.MONTH); // no caso do retorno do mes acrescenta - se 1
		System.out.println("minutos: " +  mes);
		

	}

}
