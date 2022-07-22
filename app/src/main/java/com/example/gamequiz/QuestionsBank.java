package com.example.gamequiz;

import java.util.ArrayList;
import java.util.List;

public class QuestionsBank {

    private static List<QuestionList> javaQuestions(){

        final List<QuestionList> questionLists = new ArrayList<>();

        final QuestionList question1 = new QuestionList("What guarantees type-safety in a collection?", "Generics", "Abstract classes", "Interfaces", "Collection", "", "Generics");
        final QuestionList question2 = new QuestionList("HashSet internally uses?", "Set", "HashMap", "List", "Collection", "", "Set");
        final QuestionList question3 = new QuestionList("The most used interfaces from the collection framework are?", "List", "Map", "Set", "Collection", "", "Map");
        final QuestionList question4 = new QuestionList("The root interface of Java collection framework hierarchy is –", "Collection", "Root", "Collections", "List/Set", "", "List/Set");
        final QuestionList question5 = new QuestionList("Which of those is synchronized?", "ArrayList", "LinkedList", "VECTOR", "None of the above", "", "VECTOR");
        final QuestionList question6 = new QuestionList("ArrayList implements that of the following?", "List", "RandomAccess","Cloneable", "All of these;", "", "All of these" );
        final QuestionList question7 = new QuestionList("Which of those permits the storage of the many null values?", "Set", "List", "None of these", "All of these", "", "All of these");
        final QuestionList question8 = new QuestionList("nextIndex() and previousIndex() are methods of which interface?", "IndexIterator", "Iterator", "ListIterator", "NextPreviousIterator", "", "Iterator");
        final QuestionList question9 = new QuestionList("Vector extends that of these?", "ArrayList", "LinkedList", "AbstractList", "None", "", "AbstractList");
        final QuestionList question10 = new QuestionList("LinkedList implements?", "Deque", "List", "None of the above", "Both of above", "", "Both of above");
        final QuestionList question11 = new QuestionList("In Iterator, nextElement() method of Enumeration has been changed to:", "next()", "genNext()", "returnNext()", "name remains same", "", "name remains same");
        final QuestionList question12 = new QuestionList("Enumeration returned by Vector is?", "fail-fast", "fail-safe","none", "All of these;", "", "fail-fast" );
        final QuestionList question13 = new QuestionList("From Java five onwards, that one among these is suggested to replace Hashtable?", "ConcurrentHashMap", "HashMap", "ConcurrentHashtable", "None", "", "HashMap");
        final QuestionList question14 = new QuestionList("Which doesn't permit to store a null value?", "TreeSet", "LinkedHashSet", "HashSet", "None", "", "TreeSet");
        final QuestionList question15 = new QuestionList("Iterator returned by Vector is?", "fail-fast", "fail-safe", "none", "Collection", "", "fail-fast");
        final QuestionList question16 = new QuestionList("What describes an algorithm performs in best, average or worse case scenarios?", "Big-B", "Big-O", "Big-Data", "Big-N", "", "Big-O");
        final QuestionList question17 = new QuestionList("State the search time complexity of an ordered array.", "O(n)", "O(1)", "O(log n)", "O(n-1)", "", "O(n)");
        final QuestionList question18 = new QuestionList("Name the map that should be kept in a multi-threading environment to keep up the natural order of keys?", "ConcurrentHashMap", "ConcurrentSkipListMap","ConcurrentMap", "All of these;", "", "ConcurrentHashMap" );
        final QuestionList question19 = new QuestionList("TreeMap implements?", "Dictionary", "HashMap", "AbstractMap", "Navigable Map", "", "Navigable Map");
        final QuestionList question20 = new QuestionList("Which list class should be most popular in a multi-threading environment, considering performance constraint?", "Vector", "CopyOnWriteArrayList", "ArrayList", "ConcurrentArrayList", "", "CopyOnWriteArrayList");
        final QuestionList question21 = new QuestionList("Which Map class should be most popular in a multi-threading environment, considering performance constraint?", "Hashtable", "CopyOnWriteMap", "ConcurrentHashMap", "ConcurrentMap", "", "CopyOnWriteMap");
        final QuestionList question22 = new QuestionList("The Comparator interface contains the method?", "compareWith", "compareTo()", "compare()", "None of the above", "", "compare()");
        final QuestionList question23 = new QuestionList("Which allows the removal of elements from a collection?", "Enumeration", "Iterator", "Both", "None of the above", "", "None of the above");
        final QuestionList question24 = new QuestionList("Which of those is synchronized?", "TreeMap", "HashMap","Hashtable", "All of these;", "", "Hashtable" );
        final QuestionList question25 = new QuestionList("Which offers the best performance?", "TreeMap", "HashMap", "LinkedHashMap", "None", "", "HashMap");
        final QuestionList question26 = new QuestionList("What should we use when add and remove operations are more frequent than get operations", "LinkedList", "LinkedHashSet", "ArrayList", "None", "", "LinkedList");
        final QuestionList question27 = new QuestionList("Iterator returned by Hashtable on key, value and entry are?", "fail-fast", "Fail-fast", "Fail-safe", "None of the above", "", "fail-fast");
        final QuestionList question28 = new QuestionList("WWhich Set implementation is sorted and synchronized?", "LinkedHashSet", "ConcurrentSkipListSet", "TreeSet", "CopyOnWriteArraySet", "", "ConcurrentSkipListSet");
        final QuestionList question29 = new QuestionList("Which interface should be implemented for sorting on basis of many criteria’s?", "Comparator", "Comparable", "O(log n)", "Serializable", "", "Comparator");
        final QuestionList question30 = new QuestionList("Which of those isn’t an interface within the Collections Framework?", "Collection", "Group","ConcurrentMap", "All of these;", "", "Group" );


        questionLists.add(question1);
        questionLists.add(question2);
        questionLists.add(question3);
        questionLists.add(question4);
        questionLists.add(question5);
        questionLists.add(question6);
        questionLists.add(question7);
        questionLists.add(question8);
        questionLists.add(question9);
        questionLists.add(question10);
        questionLists.add(question11);
        questionLists.add(question12);
        questionLists.add(question13);
        questionLists.add(question14);
        questionLists.add(question15);
        questionLists.add(question16);
        questionLists.add(question17);
        questionLists.add(question18);
        questionLists.add(question19);
        questionLists.add(question20);
        questionLists.add(question21);
        questionLists.add(question22);
        questionLists.add(question23);
        questionLists.add(question24);
        questionLists.add(question25);
        questionLists.add(question26);
        questionLists.add(question27);
        questionLists.add(question28);
        questionLists.add(question29);
        questionLists.add(question30);

        return questionLists;
    }

    private static List<QuestionList> phpQuestions(){

        final List<QuestionList> questionLists = new ArrayList<>();


        final QuestionList question1 = new QuestionList("PHP stands for -?", "Hypertext Preprocessor", "Pretext Hypertext Preprocessor", "Personal Home Processor", "None of the above", "", "Hypertext Preprocessor");
        final QuestionList question2 = new QuestionList("Who is known as the father of PHP?", "Drek Kolkevi", "List Barely", "Rasmus Lerdrof", "None of the above", "", "Rasmus Lerdrof");
        final QuestionList question3 = new QuestionList("Variable name in PHP starts with -", "(Exclamation)", "(Dollar)", "(Ampersand)", "(Hash)", "", "(Dollar)");
        final QuestionList question4 = new QuestionList("Which of the following is the default file extension of PHP?", "php", "hphp", "xml", "html", "", "php");
        final QuestionList question5 = new QuestionList("Which of the following is not a variable scope in PHP?", "Extern", "Local", "Static", "Global", "", "Extern");
        final QuestionList question6 = new QuestionList("Which of the following is correct to add a comment in php?", "& …… &", "// ……","/* …… */", "Both (b) and (c)", "", "Both (b) and (c)" );
        final QuestionList question7 = new QuestionList("Which of the following is used to display the output in PHP?", "echo", "write", "print", "Both (a) and (c)", "", "Both (a) and (c)");
        final QuestionList question8 = new QuestionList("Which of the following is the use of strlen() function in PHP?", "The strlen() function returns the type of string", "The strlen() function returns the length of string", "The strlen() function returns the value of string", "The strlen() function returns both value and type of string", "", "The strlen() function returns the length of string");
        final QuestionList question9 = new QuestionList("Which of the following is used for concatenation in PHP?", "+ (plus)", "* (Asterisk)", "(dot)", "append()", "", "(dot)");
        final QuestionList question10 = new QuestionList("Which of the following starts with __ (double underscore) in PHP?", "Inbuilt constants", "User-defined constants", "Magic constants", "Default constants  ", "", "Magic constants");
        final QuestionList question11 = new QuestionList("Which of the following is the use of strpos() function in PHP?", "The strpos() function is used to search for the spaces in a string", "The strpos() function is used to search for a number in a string", "The strpos() function is used to search for a character/text in a string", "The strpos() function is used to search for a capitalize character in a string", "", "The strpos() function is used to search for a character/text in a string");
        final QuestionList question12 = new QuestionList("What does PEAR stands for?", "PHP extension and application repository", "PHP enhancement and application reduce","PHP event and application repository", "None of the above", "", "PHP extension and application repository" );
        final QuestionList question13 = new QuestionList("Which of the following is the correct way to create a function in PHP?", "Create myFunction()", "New_function myFunction()", "function myFunction()", "None of the above", "", "function myFunction()");
        final QuestionList question14 = new QuestionList("Which of the following PHP function is used to generate unique id?", "id()", "mdid()", "uniqueid()", "None of the above", "", "uniqueid()");
        final QuestionList question15 = new QuestionList("Which of the following is the correct way of defining a variable in PHP?", "$variable name = value;", "$variable_name = value;", "$variable_name = value", "$variable name as value;", "", "$variable_name = value");
        final QuestionList question16 = new QuestionList("Which of the following is the correct use of the strcmp() function in PHP?", "The strcmp() function is used to compare the strings excluding case", "The strcmp() function is used to compare the uppercase strings", "The strcmp() function is used to compare the lowercase strings", "The strcmp() function is used to compare the strings including case", "", "The strcmp() function is used to compare the strings including case");
        final QuestionList question17 = new QuestionList("What is the use of fopen() function in PHP?", "The fopen() function is used to open folders in PHP", "The fopen() function is used to open remote server", "The fopen() function is used to open files in PHP", "None of the above", "", "The fopen() function is used to open files in PHP");
        final QuestionList question18 = new QuestionList("What is the use of isset() function in PHP?", "The isset() function is used to check whether variable is set or not", "The isset() function is used to check whether the variable is free or not","The isset() function is used to check whether the variable is string or not", "All of these;", "", "The isset() function is used to check whether variable is set or not" );
        final QuestionList question19 = new QuestionList("What is the use of sprintf() function in PHP?", "The sprintf() function is used to print the output of program", "The sprintf() function is used to send output to variable", "Both of the above", "None of the above", "", "The sprintf() function is used to send output to variable");
        final QuestionList question20 = new QuestionList("Which of the following is the correct way to open the file sample.txt as readable?", "fopen(\"sample.txt\", \"r\");", "fopen(\"sample.txt\", \"r+\");", "fopen(\"sample.txt\", \"read\");", "fopen(\"sample.txt\");", "", "fopen(\"sample.txt\", \"r\");");
        final QuestionList question21 = new QuestionList("Which of the following function displays the information about PHP and its configuration?", "php_info()", "phpinfo()", "info()", "None of the above", "", "phpinfo()");
        final QuestionList question22 = new QuestionList("Which of the following function is used to find files in PHP?", "glob()", "fold()", "file()", "None of the above", "", "glob()");
        final QuestionList question23 = new QuestionList("Which of the following function is used to set cookie in PHP?", "createcookie()", "makecookie()", "setcookie()", "None of the above", "", "setcookie()");
        final QuestionList question24 = new QuestionList("Which of the following function is used to get the ASCII value of a character in PHP?", "val()", "asc()","ascii()", "chr()", "", "chr()" );
        final QuestionList question25 = new QuestionList("Which of the following function is used to unset a variable in PHP?", "delete()", "unset()", "unlink()", "None of the above", "", "unset()");
        final QuestionList question26 = new QuestionList("Which of the following function is used to sort an array in descending order?", "sort()", "asrot()", "dsort()", "rsort()", "", "rsort()");
        final QuestionList question27 = new QuestionList("Which of the following is/are the code editors in PHP?", "Notepad++", "Notepad", "Adobe Dreamweaver", "All of the above", "", "All of the above");
        final QuestionList question28 = new QuestionList("Which of the following is used to end a statement in PHP?", ". (dot)", "; (semicolon)", "! (exclamation)", "/ (slash)", "", "; (semicolon)");
        final QuestionList question29 = new QuestionList("Which of the following function in PHP can be used to test the type of any variable?", "showtype()", "gettype()", "settype()", "None of the above", "", "gettype()");
        final QuestionList question30 = new QuestionList("String values in PHP must be enclosed within -", "Double Quotes", "Single Quotes","Both (a) and (b)", "None of the above", "", "Both (a) and (b)" );


        questionLists.add(question1);
        questionLists.add(question2);
        questionLists.add(question3);
        questionLists.add(question4);
        questionLists.add(question5);
        questionLists.add(question6);
        questionLists.add(question7);
        questionLists.add(question8);
        questionLists.add(question9);
        questionLists.add(question10);
        questionLists.add(question11);
        questionLists.add(question12);
        questionLists.add(question13);
        questionLists.add(question14);
        questionLists.add(question15);
        questionLists.add(question16);
        questionLists.add(question17);
        questionLists.add(question18);
        questionLists.add(question19);
        questionLists.add(question20);
        questionLists.add(question21);
        questionLists.add(question22);
        questionLists.add(question23);
        questionLists.add(question24);
        questionLists.add(question25);
        questionLists.add(question26);
        questionLists.add(question27);
        questionLists.add(question28);
        questionLists.add(question29);
        questionLists.add(question30);

        return questionLists;
    }

    private static List<QuestionList> htmlQuestions(){

        final List<QuestionList> questionLists = new ArrayList<>();


        final QuestionList question1 = new QuestionList("HTML is stand for ?", "Hyper Text Markup Language", "Holistick Technical Method Library", "Hyper Tax Makes Line", "None of the above", "", "Hyper Text Markup Language");
        final QuestionList question2 = new QuestionList("HTML is a subset of ", "SGMD", "SGML", "SGMH", "None of the above", "", "SGML");
        final QuestionList question3 = new QuestionList("ALL HTML tags are enclosed in what?", "# and #", "? and !", "< and >", "{ and }", "", "< and >");
        final QuestionList question4 = new QuestionList("To create HTML page, you need ", "Web browser", "text editor", "Both [A] and [B]", "None of the above", "", "Both [A] and [B]");
        final QuestionList question5 = new QuestionList("<a> and </a> are the tags used for", "Adding image", "Aligning text", "Audio-voiced text", "Adding links to your page", "", "Adding links to your page");
        final QuestionList question6 = new QuestionList("To add a plain color background to your web page, use which of the following?", "<body bgcolor= “36,24,35”>", "<body color= “# FF000”>","<body bgcolor= “# FF000”>", "All of these;", "", "<body bgcolor= “# FF000”>" );
        final QuestionList question7 = new QuestionList("The BODY tag is usually used after ", "HTML tag", "EM tag", "TITLE tag", "HEAD tag", "", "HEAD tag");
        final QuestionList question8 = new QuestionList("Choose the correct HTML tag to make a text italic", "<i>", "<italic>", "<it>", "<il>", "", "<i>");
        final QuestionList question9 = new QuestionList("What does the <br> tag add to your webpage?", "Long break", "Paragraph break", "Line break", "None of the above", "", "Long break");
        final QuestionList question10 = new QuestionList("Adding a border to your image helps the visitor to recognize it as what?", "A frame", "A link", "A picture", "All of above", "", "A link");
        final QuestionList question11 = new QuestionList("The tag which allows you to nest other HTML tags within the description", "<CAPTION>", "<TD>", "<TR>", "None of above", "", "<CAPTION>");
        final QuestionList question12 = new QuestionList("The first tag inside <TABLE> tag is ?", "<HEAD>", "<CAPTION>","<TH>", "<TD>;", "", "<CAPTION>" );
        final QuestionList question13 = new QuestionList("WYSIWYG stands for ?", "What You See Is What You Get", "What you See Is What You Gain", "When You Start Is When You Go", "None of the above", "", "What You See Is What You Get");
        final QuestionList question14 = new QuestionList("Which tag tells the browser where the page starts and stops?", "<html>", "<body>", "<head>", "<title>", "", "<html>");
        final QuestionList question15 = new QuestionList("Which program do you need to write HTML?", "A graphics program", "Any text editor", "HTML -development suite 4", "All of the above", "", "Any text editor");
        final QuestionList question16 = new QuestionList("In HTML, tags that include both on and off tag are called?", "comment tag", "document tag", "container tag", "None of the above", "", "container tag");
        final QuestionList question17 = new QuestionList("Which tag will you add to specify a font for your whole page?", "<defaultfont>", "<targetfont>", "<basefont>", "<font>", "", "<defaultfont>");
        final QuestionList question18 = new QuestionList("The main container for <TR>, <TD> and <TH> is ", "<DATA>", "<GROUP>","<TABLE>", "None of the above;", "", "<TABLE>" );
        final QuestionList question19 = new QuestionList("When is the content of a table shown?", "Before the border loads", "After the table is loaded", "In pieces as it loads", "None of the above", "", "After the table is loaded");
        final QuestionList question20 = new QuestionList("The tag used for creating hypertext and hypermedia links is", "<HR>", "<BR>", "<PRE>", "<A>", "", "<A>");
        final QuestionList question21 = new QuestionList("What is the correct HTML for creating a hyperlink?", "<a>https://w.w.w.gkseries.com</a>", "<a name=”https://w.w.w.gkseries.com”> Gkseries.com</a>", "<a url=”https://w.w.w.gkseries.com> Gkseries.com</a>", "<a href=”https://www.gkseries.com”> Gkseries.com</a>", "", "<a href=”https://www.gkseries.com”> Gkseries.com</a>");
        final QuestionList question22 = new QuestionList("All normal webpages consists of", "Top and bottom", "Body and frameset", "Head and body", "None of the above", "", "Head and body");
        final QuestionList question23 = new QuestionList("<! Is a ", "Comment tag", "Underlined tag", "Underlined with italic tag", "None of the above", "", "Comment tag");
        final QuestionList question24 = new QuestionList("Choose the correct HTML tag for the largest heading", "<h1>", "<h2>","<h4>", "<h6>", "", "<h1>" );
        final QuestionList question25 = new QuestionList("To created a bulleted list, use ", "<ol>", "<ul>", "<il>", "None of the above", "", "<ul>");
        final QuestionList question26 = new QuestionList("What kind of list will <ol> tags create?", "Numbered list", "Bulleted list", "Unordered list", "None of the above", "", "LinkedList");
        final QuestionList question27 = new QuestionList("Increasing the cellpadding means ", "fail-fast", "Fail-fast", "Fail-safe", "None of the above", "", "fail-fast");
        final QuestionList question28 = new QuestionList("The tag which is used to establish the absolute base for relative URLs used in the documents hypertext links", "<BODY>", "<TITLE>", "<BASE>", "<BR>", "", "<BASE>");
        final QuestionList question29 = new QuestionList("The <BASE> tag is designed to appear only between ", "<BODY>", "<HEAD>", "<TITLE>", "<PRE>", "", "<HEAD>");
        final QuestionList question30 = new QuestionList("A much better approach to establish the base URL is to use the ______ element.", "HEAD", "BODY","BASE", "None of the above", "", "BASE" );


        questionLists.add(question1);
        questionLists.add(question2);
        questionLists.add(question3);
        questionLists.add(question4);
        questionLists.add(question5);
        questionLists.add(question6);
        questionLists.add(question7);
        questionLists.add(question8);
        questionLists.add(question9);
        questionLists.add(question10);
        questionLists.add(question11);
        questionLists.add(question12);
        questionLists.add(question13);
        questionLists.add(question14);
        questionLists.add(question15);
        questionLists.add(question16);
        questionLists.add(question17);
        questionLists.add(question18);
        questionLists.add(question19);
        questionLists.add(question20);
        questionLists.add(question21);
        questionLists.add(question22);
        questionLists.add(question23);
        questionLists.add(question24);
        questionLists.add(question25);
        questionLists.add(question26);
        questionLists.add(question27);
        questionLists.add(question28);
        questionLists.add(question29);
        questionLists.add(question30);
        return questionLists;
    }

    private static List<QuestionList> androidQuestions(){

        final List<QuestionList> questionLists = new ArrayList<>();


        final QuestionList question1 = new QuestionList("Android is ?", "an operating system", "a web browser", "a web server", "None of the above", "", "an operating system");
        final QuestionList question2 = new QuestionList("Under which of the following Android is licensed?", "OSS", "Sourceforge", "Apache/MIT", "None of the above", "", "Apache/MIT");
        final QuestionList question3 = new QuestionList("For which of the following Android is mainly developed?", "Servers", "Desktops", "Laptops", "Mobile devices", "", "Mobile devices");
        final QuestionList question4 = new QuestionList("Allowing is the first mobile phone released that ran the Android OS?", "HTC Hero", "Google gPhone", "T - Mobile G1", "None of the above", "", "T - Mobile G1");
        final QuestionList question5 = new QuestionList("Which of the following virtual machine is used by the Android operating system?", "JVM", "Dalvik virtual machine", "Simple virtual machine", "None of the above", "", "Dalvik virtual machine");
        final QuestionList question6 = new QuestionList("Android is based on which of the following language?", "Java", "C++","C", "All of these;", "", "Java");
        final QuestionList question7 = new QuestionList("APK stands for ", "Android Phone Kit", "Android Page Kit", "Android Package Kit", "All of these", "", "Android Package Kit");
            final QuestionList question8 = new QuestionList("What does API stand for?", "Application Programming Interface", "Android Programming Interface", "Android Page Interface", "Application Page Interface", "", "Application Programming Interface");
        final QuestionList question9 = new QuestionList("Which of the following converts Java byte code into Dalvik byte code?", "Dalvik converter", "Dex compiler", "Mobile interpretive compiler (MIC)", "None", "", "Dex compiler");
        final QuestionList question10 = new QuestionList("How can we stop the services in android?", "By using the stopSelf() and stopService() method", "By using the finish() method", "By using system.exit() method", "None of the above", "", "By using the stopSelf() and stopService() method");
        final QuestionList question11 = new QuestionList("What is an activity in android?", "android class", "android package", "A single screen in an application with supporting java code", "None of the above", "", "A single screen in an application with supporting java code");
        final QuestionList question12 = new QuestionList("How can we kill an activity in android?", "Using finish() method", "Using finishActivity(int requestCode)","Both (a) and (b)", "None of these;", "", "Both (a) and (b)" );
        final QuestionList question13 = new QuestionList("ADB stands for", "Android debug bridge", "Android delete bridge", "Android destroy bridge", "None of the above", "", "Android debug bridge");
        final QuestionList question14 = new QuestionList("On which of the following, developers can test the application, during developing the android applications?", "Third-party emulators", "Emulator included in Android SDK", "Physical android phone", "All of the above", "", "All of the above");
        final QuestionList question15 = new QuestionList("Which of the following kernel is used in Android?", "MAC", "Windows", "Linux", "Redhat", "", "Linux");
        final QuestionList question16 = new QuestionList("Which of the following is the first callback method that is invoked by the system during an activity life-cycle?", "onClick() method", "onCreate() method", "onRestart() method", "onStart() method", "", "onCreate() method");
        final QuestionList question17 = new QuestionList("Which of the following is not an activity lifecycle callback method?", "onClick() method", "onCreate() method", "onStart() method", "onBackPressed() method", "", "onBackPressed() method");
        final QuestionList question18 = new QuestionList("We require an AVD to create an emulator. What does AVD stand for?", "Android Virtual device", "Android Virtual display","Active Virtual display", "Active Virtual device", "", "Android Virtual device" );
        final QuestionList question19 = new QuestionList("Does android support other languages than java?", "Yes", "No", "Maybe", "Can't say", "", "Yes");
        final QuestionList question20 = new QuestionList("What is the use of content provider in Android?", "For storing the data in the database", "For sharing the data between applications", "For sending the data from an application to another application", "None of the above", "", "For sending the data from an application to another application");
        final QuestionList question21 = new QuestionList("AAPT stands for ", "Android Activity Packaging Tool", "Android Asset Packaging Tool", "Android Action Packaging Tool", "None of the above", "", "Android Asset Packaging Tool");
        final QuestionList question22 = new QuestionList("NDK stands for -", "Native Development Kit", "New Development kit", "Native Design Kit", "None of the above", "", "New Development kit");
        final QuestionList question23 = new QuestionList("Which of the following is contained in the src folder?", "XML", "Java source code", "Manifest", "None of the above", "", "Java source code");
        final QuestionList question24 = new QuestionList("Which of the following method is used to handle what happens after clicking a button?", "onClick", "onCreate","onSelect", "None of the above", "", "onClick" );
        final QuestionList question25 = new QuestionList("Which of the following android component displays the part of an activity on screen?", "View", "Manifest", "Intent", "Fragment", "", "Fragment");
        final QuestionList question26 = new QuestionList("Which of the following is the parent class of Activity?", "context", "object", "contextThemeWrapper", "None of the above  ", "", "contextThemeWrapper");
        final QuestionList question27 = new QuestionList("Which of the following is the parent class of service?", "context", "object", "contextThemeWrapper", "contextWrapper", "", "contextWrapper");
        final QuestionList question28 = new QuestionList("OHA in android stands for -", "Open Health Academy", "Open Handset Alliance", "Open Handset Application", "Open Handset Association", "", "Open Handset Alliance");
        final QuestionList question29 = new QuestionList("In which of the following tab an error is shown?", "CPU", "Memory", "ADB Logs", "Logcat", "", "Logcat");
        final QuestionList question30 = new QuestionList("In which year OHA (Open Handset Alliance) is announced?", "2005", "2007","2006", "None of these;", "", "2007" );


        questionLists.add(question1);
        questionLists.add(question2);
        questionLists.add(question3);
        questionLists.add(question4);
        questionLists.add(question5);
        questionLists.add(question6);
        questionLists.add(question7);
        questionLists.add(question8);
        questionLists.add(question9);
        questionLists.add(question10);
        questionLists.add(question11);
        questionLists.add(question12);
        questionLists.add(question13);
        questionLists.add(question14);
        questionLists.add(question15);
        questionLists.add(question16);
        questionLists.add(question17);
        questionLists.add(question18);
        questionLists.add(question19);
        questionLists.add(question20);
        questionLists.add(question21);
        questionLists.add(question22);
        questionLists.add(question23);
        questionLists.add(question24);
        questionLists.add(question25);
        questionLists.add(question26);
        questionLists.add(question27);
        questionLists.add(question28);
        questionLists.add(question29);
        questionLists.add(question30);

        return questionLists;
    }

    public static List<QuestionList> getQuestions(String selectedTopicName){
        switch (selectedTopicName){
            case "java":
                return javaQuestions();
            case "php":
                return phpQuestions();
            case "android":
                return androidQuestions();
            default:
                return htmlQuestions();
        }
    }


}
