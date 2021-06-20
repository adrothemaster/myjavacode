package OfficeHours_now;

public class SalaryCalculator_NestedCondition {
    public static void main(String[] args) {
        int hourlyRate = 10;
        int weeklyHours = 40;
        int numberOfWeeks = 52;

        boolean hourlyRateIsValid = hourlyRate > 0;
        boolean weeklyHoursAreValid = weeklyHours > 0 && weeklyHours <= 65;
        boolean numberOfWeeksValid = numberOfWeeks > 0 && numberOfWeeks <= 52;
        if (hourlyRateIsValid) {

            if (weeklyHoursAreValid){

                if (numberOfWeeksValid){
                    System.out.println("salary is: " + (hourlyRate * weeklyHours * numberOfWeeks));

                }else{
                    System.out.println("number of weeks cannot be less than 1 or greater than 52");
                }
             }else {
                System.out.println("weekly hours cannot be zero, negative or more than 65");

             }
          }else{
            System.out.println("hourly rate cannot be negative or zero");
        }
        //if (hourlyRateIsValid && weeklyHoursAreValid && numberOfWeeksValid) {
         //   System.out.println("salary is: " + (hourlyRate * weeklyHours * numberOfWeeks));
       // }
    }
}
