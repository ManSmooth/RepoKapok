# Stack driven expression parser
- ## Manual Stack implementation
    - LinkedList done manually
- ## Error checking
    - Throws a RuntimeException
    - Parentheses parity check
    - Double operator check
    - Binary operator check
    - Only allows `0-9` `a-z` `A-Z` as operands

# How to use
1. Modify the `input.txt` file to change the prompts.
2. Compile and run.
   - Runs with `input.txt` file as the input file by default.
   - Specify an Input file with `-i <Path>` (Case Sentitive)
   - For example: `java "stackPostfix.java" -i input2.txt`
## Files
- `Driver.java` - contains the `main` method and all classes implemented.
- `input.txt` - contains input to the program.

# Output Example
###### inside Input.txt
> a-b/(c+d-e)*(f^g*h+i)
```
> abcd+e-/fg^h*i+*-
```
###### inside Input.txt
> 12+34^+
```
> abcd+e-/fg^h*i+*-
```

###### *642115046 Sarin Patanompee*
