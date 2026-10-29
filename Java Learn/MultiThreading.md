MULTI TASKING: executing the multiple task simultaneously then it is known as multi tasking.



Multi tasking is the ability of an Operating system to run the multiple task by sharing the CPU time among them.





&#x20;                          USER



&#x20;                           │



&#x20;                           ▼



&#x20;         Opens Chrome, Spotify, MS Word



&#x20;                           │



┌────────────────────────────────────────────┐



│          OPERATING SYSTEM (OS)  (manage)   │



│                                            │



│ 1. Process Manager                         │



│    │                                       │



│    ├── Creates Chrome Process              │



│    ├── Creates Spotify Process             │



│    └── Creates MS Word Process             │



│                    │                       │



│                    ▼                       │



│ 2. Ready Queue                             │



│                                            │



│   Chrome Process                           │



│   Spotify Process                          │



│   MS Word Process                          │



│                    │                       │



│                    ▼                       │



│ 3. Scheduler                              │



│                                            │



│   Chooses One Process                      │



│                    │                       │



│                    ▼                       │



│ 4. Allocates CPU Time                     │



│                                            │



│   Chrome → 5 ms                           │



└────────────────────┬───────────────────────┘



&#x20;                    │



&#x20;                    ▼



&#x20;             ┌──────────────┐



&#x20;             │     CPU      │



&#x20;             │              │



&#x20;             │ Fetch        │



&#x20;             │ Decode       │



&#x20;             │ Execute      │



&#x20;             │ Store        │



&#x20;             └──────┬───────┘



&#x20;                    │



&#x20;                    ▼



&#x20;            Time Slice Ends



&#x20;                    │



&#x20;                    ▼



┌────────────────────────────────────────────┐



│          OPERATING SYSTEM (OS)             │



│                                            │



│ 5. Context Switching                       │



│                                            │



│   Stops Current Process                    │



│   Chooses Next Process                     │



└────────────────────┬───────────────────────┘



&#x20;                    │



&#x20;                    ▼



&#x20;                Ready Queue again



&#x20;                    │



&#x20;                    ▼



&#x20;                Scheduler  again



&#x20;                    │



&#x20;                    ▼



&#x20;         Spotify → CPU → Execute



&#x20;                    │



&#x20;                    ▼



&#x20;              (Cycle Repeats)







Fetch   → Read the instruction

Decode  → Understand the operation

Execute → Perform the operation

Store   → Save the result





There are two types of Multitasking.



&#x20;               Multitasking

&#x20;                    │

&#x20;        ┌───────────┴───────────┐



&#x20;        │                       │



&#x20;        ▼                       ▼



Process-Based            Thread-Based



&#x20; Multitasking             Multitasking







**Process-Based Multitasking:**

Running multiple applications at the same time is called Process-Based Multitasking.

or

(professional way)



Process-Based Multitasking is the ability of the Operating System to run multiple independent applications (processes) by allocating CPU time to each process.



**Real-Time Example**



Suppose you are working on your laptop.



You do three different activities at the same time:



🌐 Chrome → Searching Java interview questions.



🎵 Spotify → Playing songs.



📝 MS Word → Writing notes.







These are three different applications.

Each application is an independent process.



Laptop



🌐 Chrome     → Process 1



🎵 Spotify    → Process 2



📝 MS Word    → Process 3



What Happens Internally?



Step 1: You open three applications.



User



│



▼



Chrome



Spotify



MS Word



Step 2: The Operating System creates three processes.



Operating System Creates



│



▼



Chrome Process



Spotify Process



MS Word Process



Step 3: The OS places them in the Ready Queue.



Ready Queue



1\. Chrome Process



2\. Spotify Process



3\. MS Word Process



Step 4: The Scheduler selects one process.



Suppose Chrome is selected first.

Ready Queue



Chrome   ✔



Spotify



MS Word



Step 5: CPU Executes Chrome



CPU



Execute Chrome

Suppose Chrome gets 5 ms.



Step 6: Time Slice Ends



The OS performs context switching.

Now the Scheduler selects Spotify.



CPU

Execute Spotify

Again, after 5 ms:

CPU

Execute MS Word



Step 7: This Cycle Repeats



CPU Timeline



Chrome



&#x20;  ↓



Spotify



&#x20;  ↓



MS Word



&#x20;  ↓



Chrome



&#x20;  ↓



Spotify



&#x20;  ↓



MS Word



&#x20;  ↓



...

This continues while you use the laptop.



Why Is This Called Process-Based Multitasking?



Because:



Chrome = One Process



Spotify = One Process



MS Word = One Process



The Operating System manages multiple independent processes and gives each one CPU time.



Real-Time Example: WhatsApp

Suppose you open WhatsApp.

Inside WhatsApp, multiple threads are created.

WhatsApp Application



&#x20;       │



┌──────┼───────────┬─────────────┐



│      │           │             │



Receive Send     Download      UI Update



Thread  Thread     Thread         Thread





Now let's see what the Operating System does internally.



1\. Maintains Thread Ready Queue



All threads are waiting for CPU time.



Operating System



Thread Ready Queue



1\. Receive Message Thread



2\. Send Message Thread



3\. Download Image Thread



4\. UI Update Thread



Think of it like people standing in a queue at a bank.



2\. Contains Scheduler



The Scheduler checks the queue and decides:

"Which thread should get the CPU first?"

Suppose a new message arrives.

The Scheduler chooses the Receive Message Thread.



Scheduler



✔ Receive Message Thread



3\. Allocates CPU Time



The Operating System says:

Receive Message Thread

&#x20;     ↓



CPU Time = 5 ms

The Scheduler sends this thread to the CPU.

OS



│



▼



Receive Thread → 5 ms



4\. CPU Executes the Thread



Now the CPU executes the thread.

CPU

│

▼



Receive Message

The message is received successfully.



5\. Performs Context Switching

The 5 ms time slice ends.

The Operating System saves the Receive Thread's state.

Now it selects the Download Image Thread.

Receive Thread Finished



&#x20;       │



&#x20;       ▼



Context Switching



&#x20;       │



&#x20;       ▼



Download Image Thread



6\. CPU Executes the Next Thread



CPU



│



▼



Download Image







Again, after 5 ms, the OS switches to another thread.











THREAD







A thread is the smallest unit of execution inside a process. It performs a specific task, and the CPU executes threads to complete the work of the process.















Chrome is a process.(process does not work , thread only work with different task)



.A process contain multiple thread , the thread only work











Inside Chrome, there are many tasks.







Chrome (Process)--> app







├── Load Webpage



├── Download File



├── Play YouTube Video



└── Render Screen







These tasks are called threads.











One Application (Chrome)



&#x20;         │



&#x20;         ▼



&#x20;   Multiple Threads



&#x20;         │



┌────────┼────────┬────────┐



▼        ▼        ▼        ▼



Load    Download  Play    Render



Page      File    Video   Screen



&#x20;         │



&#x20;         ▼



CPU Executes Threads



&#x20;         │



&#x20;         ▼



Fast \& Responsive Application



















&#x20;                     USER



&#x20;                       │



&#x20;                       ▼



&#x20;              Opens Google Chrome



&#x20;                       │



&#x20;                       ▼



&#x20;             Chrome Process Created



&#x20;                       │



&#x20;                       ▼



&#x20;            Chrome Creates Threads



&#x20;                       │



&#x20;       ┌───────────────┼───────────────┬───────────────┐



&#x20;       ▼               ▼               ▼               ▼



Load Webpage      Download File    Play Video    Render Screen



&#x20; (Thread 1)        (Thread 2)      (Thread 3)     (Thread 4)



&#x20;       │               │               │               │



&#x20;       └───────────────┼───────────────┼───────────────┘



&#x20;                       ▼



&#x20;       ┌───────────────────────────────────────────┐



&#x20;       │           OPERATING SYSTEM                │



&#x20;       │                                           │



&#x20;       │ 1. Maintains Thread Ready Queue           │



&#x20;       │                                           │



&#x20;       │ 2. Thread Scheduler                       │



&#x20;       │    Selects the next thread               │



&#x20;       │                                           │



&#x20;       │ 3. Allocates CPU Time Quantum            │



&#x20;       │                                           │



&#x20;       │ 4. Dispatcher                            │



&#x20;       │    Sends the selected thread to CPU      │



&#x20;       └─────────────────────┬─────────────────────┘



&#x20;                             │



&#x20;                             ▼



&#x20;                   ┌─────────────────┐



&#x20;                   │       CPU       │



&#x20;                   │                 │



&#x20;                   │ Fetch           │



&#x20;                   │ Decode          │



&#x20;                   │ Execute         │



&#x20;                   │ Store           │



&#x20;                   └────────┬────────┘



&#x20;                            │



&#x20;                            ▼



&#x20;                   Time Quantum Ends



&#x20;                            │



&#x20;                            ▼



&#x20;       ┌───────────────────────────────────────────┐



&#x20;       │           OPERATING SYSTEM                │



&#x20;       │                                           │



&#x20;       │ Context Switching                         │



&#x20;       │ Save Current Thread State                 │



&#x20;       │ Select Next Thread                        │



&#x20;       └─────────────────────┬─────────────────────┘



&#x20;                             │



&#x20;                             ▼



&#x20;                            CPU















thread







method1



method2



method3



method4







i want execute the method in simultaneous manner but i have execute , so we have to use a thread for each methods .then  only execute simultaneous.







Two way to create a thread?



.Implementing runnable interface



.extending thread class











interface Runnable     (predefined interface)



{



&#x20;   void run();







}











class Thread implements Runnable {



















}



















thread life cycle







new:Thread t = new Thread();











runnable:



After calling start(), the thread enters the RUNNABLE state. It is ready to execute and is waiting for CPU time.







running



if thread shedular decide only thread enter into the block state or dead state







block state:



. if thread decide into the block state they use  a method like



&#x20; wait(), sleep(), , and then again into to the runnable state







dead state:



.if suppose the thread schedular decide to the dead state , the



process completion execute is sucessfull  



&#x20; multi tasking

