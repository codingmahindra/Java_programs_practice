class CodeProblem:
    @staticmethod
    def solve(input1: int, input2: int) -> int:
        """
        This function checks if both input1 and input2 are >= 2.
        If true, returns their product; otherwise, returns 0.
        """
        # Check if both inputs are >= 2
        if input1 >= 2 and input2 >= 2:
            # Return the product if the condition is satisfied
            return input1 * input2
        else:
            # Return 0 if either condition fails
            return 0
