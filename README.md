# Synthetic Disease
Imagine you are a senior public health researcher in an alternate universe where diseases are not made up of DNA, but are instead made up of Java code.
Your task is to extend the Disease Blueprint framework (an abstract Java class) to synthesize a new disease strain for testing purposes. This synthetic disease will be used in lab trials to test junior researchers' skills in programming, analysis, and public health.

## Learning Objectives
- Develop a disease that shows off Java concepts
- Reflect on your design process by maintaining a journal

## Tools
- **Cloud9**: an online development environment that allows you to develop, compile, an execute Java programs without installing Java locally.
- **GitHub**: a platform for version control, helping you keep track of files and changes for your projects.
- **Google Docs**: an online tool for storing and editing files. Use documents to keep track of your journaling and sheets to store and graph data from your simulations.

## Getting Started
Accept your invitation to the Cloud9 education platform. This will allow you to create a Cloud9 account without entering any payment information. Select the "Clone workspace" tab and choose the workspace called `syntheticdisease`. This will ensure that you have Java configured on your workspace in Cloud9 and all the files from this repository.

Navigate to the directory that contains the Java files and, in your command line, run:
```
javac *.java
```
This will compile all files in the directory that have the `.java` extension. Then run:
```
java SimulatedHost
```
This will run the main method of the SimulatedHost class. In your terminal, you'll get an output for the sample disease that might look like this:
```
Patient infection log for an adult host:
Day,Energy,Bacteria,Description
1,100,0,Day 1: Infection multiplied.
2,150,8,Day 2: Infection multiplied.
3,224,16,Day 3: Infection multiplied.
4,322,24,Day 4: Infection multiplied.
5,444,32,Day 5: Infection multiplied.
6,590,40,Day 6: Infection multiplied.
7,760,48,Day 7: Infection multiplied.
8,954,56,Day 8: Toxin released.
9,618,54,Day 9: Infection exited the host.
10,402,52,Day 10: Toxin released.
11,90,50,Day 11: Infection multiplied.
12,290,58,Day 12: Failed to release toxin.
13,-58,56,Day 13: Infection died out.
```
Now that you're set up, change the file name of your disease from `YourDisease.java` to something more interesting. Change the class name in the `SimulatedHost.java` file as well. Then, make sure it runs as before and save your changes.

## Saving Changes
To save your changes in GitHub, run the commands below in your command line. First, add all your changes: (`-A` means all)
```
git add -A
```
Then create a message for this *commit*: (`-m` means message)
```
git commit -m "Start your message with a verb about what you changed"
```
Save your changes by *pushing* them to your repository:
```
git push
```
You will enter your username and password to the prompts to complete the push.

## Journaling
Keep your journal of work on this assignment in a Google Doc. It is up to you how to structure this. Before you start this activity, write a response to this question:

> How do you think the SimulatedHost works?

Here are some examples of things to keep track of while you journal:
- Links you use to learn about Java or address problems you run into.
- Scientific thinking: anything that explains your process for creating your disease.
- Pseudocode or plans for what you want to implement in your disease. This helps you plan before you code and gives others insight into your thinking process even if you cannot implement the ideas in this exercise.
- Notes about when you use abstractions.
- Notes about when you test your disease.
- Implications of your disease if it were involved in a real public health scenario.

## API
API stands for application programming interface, it defines what these programs can do. Below is an explanation of the API for your synthetic disease.

### Disease
To create a new disease, write a new class that extends the abstract DiseaseBlueprint class. Some examples are already in the project for you to refer to. Change the class name and returned name property for your disease. For now, ignore the infectivity, toxigencity, and resistance methods and focus only on developing a new move method.

#### Move Method
This method defines your disease's behavior once it has infected a host. Each day the disease is alive in the simulation, this function will run.
- Params: `SimulatedHost host`, the host that has been infected
- Return: `DiseaseAction`, the action to take on a given day.

#### DiseaseAction Enum
The move method can return any of these options. Search on Google if you want to learn more about enums.
- `DiseaseAction.MULTIPLY`, represents the disease expanding within the host.
- `DiseaseAction.EXIT`, represents the disease leaving the host and getting into the environment (e.g., by causing the host to cough or have a runny nose).
- `DiseaseAction.RELEASE`, represents the disease releasing toxins into the host.

#### Host Reference

##### isLatent()
When the *latent period* ends, the disease is able to exit the host.
- Return: `boolean`, whether or not the disease has become latent.

##### isIncubated()
When the *incubation period* ends, the disease is able to release toxins.
- Return: `boolean`, whether or not the disease has fully incubated.

##### getEnergy()
If the disease has no energy left in the host, it will die out.
- Return: `int`, amount of energy the disease has in the host.

##### getBacteria()
See if you can figure out the impact that bacteria levels have on the disease's infection of the host.
- Return `int`, amount of bacteria the disease has in the host.

##### getDaysSinceInfection()
- Return `int`, number of days that have passed since the infection began.

There are two more public methods: `getDiseaseEvents()` and `getDiseaseData()`. Can you figure out what they do and if they would be useful to you in synthesizing a new disease?
