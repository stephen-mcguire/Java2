/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

/**
 *
 * @author sbmcguire
 */
public class testFile {
    
    int write100 = 100;
        int[] randomizer = new int[write100];
        Random random = new Random();

    File file = new File("src/Stephen McGuire/lab3"); //File path

    if(file.exists())
{   //If the file exists, print out each element on the file.
    Scanner input = new Scanner(file);
    int count = 0;
    while(input.hasNextInt())
    {
        randomizer[count++] = input.nextInt();
    }
    input.close();
    Arrays.sort(randomizer);

    for(int i = 0; i < write100; i++) {
        System.out.println(randomizer[i]);
    }
}
    else
    {   //If the file isn't found, create it and write 100 random numbers to it.
        try(PrintWriter output = new PrintWriter(file))
        {
            for(int i = 0; i < write100; i++)
            {
                randomizer[i] += random.nextInt(101);
            }
                Arrays.sort(randomizer);
            for(int i = 0; i < write100; i++) {
    output.print(randomizer[i] + " "); // Write the array to the file
}    
                output.print(randomizer[i] + " ");
                
            }
        }           
        //Exception handling
        catch(FileNotFoundException ex)
        {
            System.out.println("File was not found.");  
        }
        catch(Exception ex)
        {
            System.out.println("Something went wrong.");
        }
    }
    
}
