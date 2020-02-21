package nz.co.rajees.back2work.utils;

import org.junit.Test;

import java.time.LocalDateTime;
import java.time.temporal.ChronoField;
import java.util.Calendar;
import java.util.Date;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class DateUtilsTest {

    @Test
    public void testConvertDateToLocalDateTime() {
        // arrange
        Calendar calendar = Calendar.getInstance();
        calendar.set(2010, 10, 10, 8, 20, 4);
        Date dateToConvert = calendar.getTime();

        // act
        LocalDateTime localDateTime = DateUtils.convertDateToLocalDateTime(dateToConvert);

        // assert
        assertThat(localDateTime.get(ChronoField.YEAR), is(equalTo(2010)));
        assertThat(localDateTime.get(ChronoField.MONTH_OF_YEAR), is(equalTo(11)));
        assertThat(localDateTime.get(ChronoField.DAY_OF_MONTH), is(equalTo(10)));
        assertThat(localDateTime.get(ChronoField.HOUR_OF_DAY), is(equalTo(8)));
        assertThat(localDateTime.get(ChronoField.MINUTE_OF_HOUR), is(equalTo(20)));
        assertThat(localDateTime.get(ChronoField.SECOND_OF_MINUTE), is(equalTo(4)));

    }
}