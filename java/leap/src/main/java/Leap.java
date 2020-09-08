class Leap {
    boolean isMultiple(int number1, int number2){
    		return number1 % number2 == 0;
    }
    
    boolean isLeapYear(int year) {
        return (isMultiple(year, 400) || isMultiple(year, 4) && !isMultiple(year, 100));
    }

}
