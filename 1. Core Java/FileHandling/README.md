# File-Handling in Java

Java FileWriter and FileReader classes are used to write and read data from text files.

## 1. File Writer

FileWriter is useful to create a file writing characters into it. 

    - This class inherits from the OutputStream class.
    - The constructors of this class assume that the default character encoding and the default byte-buffer  size are acceptable.
    - To specify these values yourself, construct an OutputStreamWriter on a FileOutputStream.

### 1.1 Constructors

- <b>FileWriter(File file)</b> – Constructs a FileWriter object given a File object.
- <b>FileWriter (File file, boolean append)</b> – constructs a FileWriter object given a File object.
- <b>FileWriter (FileDescriptor fd)</b> – constructs a FileWriter object associated with a file descriptor.
- <b>FileWriter (String fileName)</b> – constructs a FileWriter object given a file name.
- <b>FileWriter (String fileName, Boolean append)</b> – Constructs a FileWriter object given a file name with a Boolean indicating whether or not to append the data written.

## 2. File Reader

FileReader is useful to read data in the form of characters from a ‘text’ file. 
    - This class inherited from the InputStreamReader Class.
    - The constructors of this class assume that the default character encoding and the default byte-buffer size are appropriate. 
    - To specify these values yourself, construct an InputStreamReader on a FileInputStream. 

### 3.2 Constructors

- <b>FileReader(File file)</b> – Creates a FileReader , given the File to read from
- <b>FileReader(FileDescripter fd)</b> – Creates a new FileReader , given the FileDescripter to read from
- <b>FileReader(String fileName)</b> – Creates a new FileReader , given the name of the file to read from