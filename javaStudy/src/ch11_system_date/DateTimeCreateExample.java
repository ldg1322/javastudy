package ch11_system_date;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

public class DateTimeCreateExample throws InterruptedException
{
	LocalDate currDate=LocalDate.now();
	System.out.println("현재날짜:"+currDate);
	LocalDate targetDate=LocalDate.of(2024,5,10);
	System.out.println("목표날짜:"+targetDate+"\n");
	// 시간얻기
	LocalTime currTime=LocalTime.now();
	System.out.println("현재시간:"+currTime);
	LocalTime targetTime=LocalTime.of(6,30,0,0);
	System.out.println("목표시간:"+targetTime+"\n");
	// 날짜와시간얻기
	LocalDateTime currDateTime=LocalDateTime.now();
	System.out.println("현재날짜와시간:"+currDateTime);
	LocalDateTime targetDateTime=LocalDateTime.of(2024,5,10,6,30,0,0);
	System.out.println("목표날짜와시간:"+targetDateTime+"\n");
	// 협정세계시와시간존(TimeZone)
	ZonedDateTime utcDateTime=ZonedDateTime.now(ZoneId.of("UTC"));
	System.out.println("협정세계시:"+utcDateTime);
	ZonedDateTime newyorkDateTime=ZonedDateTime.now(ZoneId.of("America/New_York"));
	System.out.println("뉴욕시간존:"+newyorkDateTime+"\n");
	// 특정시점의타임스탬프얻기
	Instant instant1=Instant.now();
	Thread.sleep(10);
	Instant instant2=Instant.now();
	if(instant1.isBefore(instant2))
	{
		System.out.println("instant1이빠릅니다.");
	}else if(instant1.isAfter(instant2)){
	System.out.println("instant1이늦습니다.");
	}else{
	System.out.println("동일한시간입니다.");
	}
	System.out.println("차이(nanos):"+instant1.until(instant2,
	ChronoUnit.NANOS));
	}
}
