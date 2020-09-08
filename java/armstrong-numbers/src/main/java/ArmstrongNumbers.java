class ArmstrongNumbers {

    boolean isArmstrongNumber(int numberToCheck) {
        if(String.valueOf(numberToCheck).length() == 1)
            return true;
         
        String[] numberString = String.valueOf(numberToCheck).split("");
        int accumulator = 0;

        for(var number : numberString)
            accumulator += Math.pow(Integer.valueOf(number), numberString.length);
        
        return accumulator == numberToCheck;
    }

}
