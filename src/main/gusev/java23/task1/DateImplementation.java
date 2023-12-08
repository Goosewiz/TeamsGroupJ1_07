package main.gusev.java23.task1;

import java.time.LocalDate;

public class DateImplementation implements SomeInterface<LocalDate> {
    private LocalDate currentDate;

    @Override
    public LocalDate getData() {
        LocalDate answer = currentDate;
        return answer;
    }

    @Override
    public boolean validate(LocalDate data) {
        return true;
    }
    public String validate(String date){
        return "";
    }
}
