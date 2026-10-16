class CalculatorConundrum {
    public String calculate(int operand1, int operand2, String operation) {
        // Task 2 : le vigile à l'entrée
        if (operation == null) {
            throw new IllegalArgumentException("Operation cannot be null");
        }
        if (operation.isEmpty()) {
            throw new IllegalArgumentException("Operation cannot be empty");
        }

        // Task 1 : les calculs
        int result;
        if (operation.equals("+")) {
            result = operand1 + operand2;
        } else if (operation.equals("*")) {
            result = operand1 * operand2;
        } else if (operation.equals("/")) {
            // Task 3 : la division par zéro
            try {
                result = operand1 / operand2;
            } catch (ArithmeticException e) {
                throw new IllegalOperationException("Division by zero is not allowed", e);
            }
        } else {
            // Task 2 : symbole inconnu
            throw new IllegalOperationException("Operation '" + operation + "' does not exist");
        }

        return operand1 + " " + operation + " " + operand2 + " = " + result;
    }
}