functions can be defined in 2 ways .
using def and can be defined as first class variables.

>>>>> standard function definition -
def standardFunction (a:Int,b:Int) : Int = { a }

>>>>First class function is a variable with a type,of the function.
for example -  the above can be declared as a fist class function this way -
var firstClassFunctionUsingFunctionLiteral : (Int,Int) => Int = (a:Int,b:Int) => a

>>>>A standard function can be assigned to a variable with explicit type defined and that turns into a first class function.
For example -

val firstClassFunctionFromStdFunction : (Int,Int)=> Int = standardFunction;

>>>> A first class function can be created by assigning a standard function to a variable/value with out explicit type defined
using a wild card character _ which copies the type of the function

val firstClassFunctionFromStdFunctionWithNoType = standardFunction _;

>>>a first class function variable can be assigned to any number of variables and can be handled like a normal variable/value
==================

Any function that accepts another function as a parameter,is called a higher order function.
Higher order functions enables declarative programming where the behaviour is being passed
as a parameter than hard coding behaviour in the function call.



