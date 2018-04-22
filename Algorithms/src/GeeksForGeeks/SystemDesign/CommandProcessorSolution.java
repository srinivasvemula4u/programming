///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package GeeksForGeeks.SystemDesign;
//
///**
// *
// * @author sv186040
// */
//import java.io.*;
//
//import java.util.*;
//
//import java.text.*;
//
//import java.math.*;
//
//import java.util.regex.*;
//
//import java.util.ArrayList;
//
//abstract class Entry {
//
//    protected Directory parent;
//
//    protected String name;
//
//    public Entry(Directory parent, String name) {
//
//        this.parent = parent;
//
//        this.name = name;
//
//    }
//
//    public Entry(String name) {
//
//        this.parent = null;
//
//        this.name = name;
//
//    }
//
//    public Directory getParent() {
//
//        return parent;
//
//    }
//
//    public abstract String getName();
//
//}
//
//class File extends Entry {
//
//    // For touch
//    public File(String n, Directory p) {
//
//        super(p, n);
//        p.getContents().add(this);
//    }
//
//    public String getName() {
//
//        return name;
//
//    }
//
//}
//
//class Directory extends Entry {
//
//    protected List<Entry> contents;
//
//    // int count;
//    public Directory(String name, Directory parent) {
//
//        super(parent, name);
//
//        contents = new ArrayList<>();
//
//        parent.getContents().add(this);
//
//        //count = -1;
//    }
//
//    public List<Entry> getContents() {
//
//        return contents;
//
//    }
//
//    public Directory(String name) {
//
//        super(name);
//
//        contents = new ArrayList<>();
//
//        //count = -1;
//    }
//
//    public String getName() {
//
//        return name;
//
//    }
//
//    public void listOfFiles() {
//
//        if (contents.size() == 0) {
//            return;
//        }
//
//        for (Entry e : contents) {
//
//            System.out.println(e.getName());
//
//        }
//
//    }
//
//    public void pwd() {
//
//        if (this != null) {
//
//            if (this.getParent() != null) {
//                this.getParent().pwd();
//            }
//
//            System.out.print("/" + this.getName());
//
//        }
//
//    }
//
//    public Entry changeDirectory(String name) {
//
//        if (name == null) {
//
//            return null;
//
//        } else if (name.equals("..")) {
//
//            if (this.getParent() != null) {
//                return this.getParent();
//            }
//
//        } else {
//
//            for (Entry e : contents) {
//
//                if (e instanceof Directory && e.getName().equals(name)) {
//                    return e;
//                }
//
//            }
//
//        }
//
//        return null;
//
//    }
//
//    protected boolean isAlreadyCreated(String name) {
//
//        for (Entry e : contents) {
//
//            if (e instanceof Directory && e.getName().equals(name)) {
//                return true;
//            }
//
//        }
//
//        return false;
//
//    }
//
//}
//
////Concrete class
//class CommandProcessorImpl extends CommandProcessor {
//
//    private static Entry entry;
//
//    protected CommandProcessorImpl() {
//
//        entry = new Directory("root");
//
//    }
//
//    public void createDirectory(String name) {
//
//        if (name.length() > 100) {
//
//            System.out.println("Invalid File or Folder Name");
//
//            return;
//
//        }
//
//        if (entry instanceof Directory) {
//
//            if (entry != null) { // Non root Directory 
//
//                if (!isAlreadyCreated(name)) {
//
//                    new Directory(name, (Directory) entry);
//
//                } else {
//
//                    System.out.println("Directory already exists");
//
//                }
//
//                // entry = temp;
//            }
//
//        }
//
//    }
//
//    private boolean isAlreadyCreated(String name) {
//
//        Directory d = (Directory) entry;
//
//        return d.isAlreadyCreated(name);
//
//    }
//
//    public void listAllFiles() {
//
//        if (entry instanceof Directory) {
//
//            Directory d = (Directory) entry;
//
//            d.listOfFiles();
//
//        }
//
//    }
//
//    public void pwd() {
//
//        if (entry instanceof Directory) {
//
//            Directory d = (Directory) entry;
//
//            d.pwd();
//
//        }
//
//    }
//
//    public void createFile(String name) {
//
//        if (name.length() > 100) {
//
//            System.out.println("Invalid File or Folder Name");
//
//            return;
//
//        }
//
//        if (entry instanceof Directory) {
//
//            Directory d = (Directory) entry;
//
//            new File(name, d);
//
//        }
//
//    }
//
//    public void changeDirectory(String str) {
//
//        if (entry instanceof Directory) {
//
//            Directory d = (Directory) entry;
//
//            Entry temp = d.changeDirectory(str);
//
//            if (temp != null) {
//                entry = temp;
//            }
//
//        }
//
//    }
//
//}
//// Abstact class
//
//abstract class CommandProcessor {
//
//    abstract public void createDirectory(String name);
//
//    abstract public void listAllFiles();
//
//    abstract public void pwd();
//
//    abstract public void createFile(String name);
//
//    abstract public void changeDirectory(String str);
//
//    public static CommandProcessor getObject() {
//        return new CommandProcessorImpl();
//    }
//
//    // public static CommandProcessor getCommandProcessor();
//}
//
//class CommandProcessorFactory {
//
//    private static CommandProcessor cmd;
//
//    public static CommandProcessor getCommandProcessor() {
//        if (cmd == null) {
//            cmd = CommandProcessor.getObject();
//        }
//        return cmd;
//    }
//}
//
//public class CommandProcessorSolution {
//
//    public static void main(String args[]) throws Exception {
//
//        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
//        Scanner scan = new Scanner(System.in);
//
//        CommandProcessor cmd = CommandProcessorFactory.getCommandProcessor();
//
//        while (true) {
//
//            String str = scan.nextLine();
//
//            String[] obj = str.split(" ");
//
//            int len = obj.length;
//
//            if ("mkdir".equals(obj[0])) {
//
//                if (len != 2) {
//
//                    System.out.println("Invalid Directory Name");
//
//                    continue;
//
//                }
//
//                cmd.createDirectory(obj[1]);
//
//            } else if ("cd".equals(obj[0])) {
//
//                if (len == 2) {
//                    cmd.changeDirectory(obj[1]);
//                } else {
//                    cmd.changeDirectory(null);
//                }
//
//            } else if ("touch".equals(obj[0])) {
//
//                if (len != 2) {
//
//                    System.out.println("Invalid Directory Name");
//
//                    continue;
//
//                } else {
//
//                    cmd.createFile(obj[1]);
//
//                }
//
//            } else if ("ls".equals(obj[0])) {
//
//                cmd.listAllFiles();
//
//            } else if ("pwd".equals(obj[0])) {
//
//                cmd.pwd();
//
//            } else if ("quit".equals(obj[0])) {
//
//                break;
//
//            } else {
//
//                System.out.println("Unrecognized Command");
//
//            }
//
//        }
//
//    }
//
//}
