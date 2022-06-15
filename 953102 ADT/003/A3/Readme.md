# ADT-953102 Programming Assignment 3   
Written by 642115003 Kan Katpark    
Discord: Query#1976    
Email: kan_k@cmu.ac.th  
Github: <a href="https://github.com/hoshizaki-iori">hoshizaki-iori</a>  
 

# How to compile and run code.  

1. Open to source code folder.  


2. Open Command prompt or Powershell at the source code directory.  


3. Compile code by type:  
    ```
	 javac *.java
    ```

4. Run code by type:    
    ```
	 java A3 [INPUT_FILE_PATH]   
    ```
**! Make sure you enter the input file path correctly.**   
  
# Example Output
Example output
```
PS D:\work\ADT\A3> javac *.java  
PS D:\work\ADT\A3> java A3 input.txt    

Infix                      | Postfix    

a-b/(c+d-e)*(f^g*h+i)      | abcd+e-/fg^h*i+*-  
1+2+3^4                    | 12+34^+  
(a-b*c                     | Invalid expression  
a-b)                       | Invalid expression  
2*(2+1)^5                  | 221+5^*  
```