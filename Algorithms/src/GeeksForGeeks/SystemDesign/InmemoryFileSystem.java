/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GeeksForGeeks.SystemDesign;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sv186040
 *
 * Explain the data structures and algorithms that you would use to design an
 * in-memory file system. Illustrate with an example in the code logic where
 * possible.
 *
 * Asked In: Amazon
 *
 * A file system, in its most simplistic version, consists of Files and
 * Directories. Each Directory contains a set of Files and Directories. Since
 * Files and Directories share so many characteristics, we’ve implemented them
 * such that they inherit from the same class, Entry.
 *
 *
 * Alternatively, we could have implemented Directory such that it contains
 * separate lists for files and subdirectories. This makes the nurnberOfFiles ()
 * method a bit cleaner, since it doesn’t need to use the instanceof operator,
 * but it does prohibit us from cleanly sorting files and directories by dates
 * or names.
 *
 *
 *
 * For data block allocation, we can use bitmask vector and linear search (see
 * “Practical File System Design”) or B+ trees (see Reference or Wikipedia).
 *
 */
abstract class Entry {

    protected Directory parent;
    protected long created;
    protected long lastUpdated;
    protected long lastAccessed;
    protected String name;

    public Entry(Directory parent, String name) {
        this.parent = parent;
        this.created = System.currentTimeMillis();
        this.lastUpdated = System.currentTimeMillis();
        this.lastAccessed = System.currentTimeMillis();
        this.name = name;
    }

    public Directory getParent() {
        return parent;
    }

    public boolean delete() {
        if (parent == null) {
            return false;
        }
        return parent.deleteEntry(this);
    }

    public abstract int size();

    public long getCreated() {
        return created;
    }

    public long getLastUpdated() {
        return lastUpdated;
    }

    public long getLastAccessed() {
        return lastAccessed;
    }

    public String getName() {
        return name;
    }

    public void changeName(String s) {
        name = s;
    }

}

class File extends Entry {

    private String content;
    private int size;

    public File(String n, Directory p, int sz) {
        super(p, n);
        size = sz;
    }

    public int size() {
        return size;
    }

    public String getContents() {
        return content;
    }

    public void setContents(String c) {
        content = c;
    }

}

class Directory extends Entry {

    protected List<Entry> contents;

    public Directory(String n, Directory p) {
        super(p, n);
        contents = new ArrayList<>();
    }

    public int size() {
        int size = 0;
        for (Entry e : contents) {
            size += e.size();
        }

        return size;
    }

    public int numberOfFiles() {
        int count = 0;
        for (Entry e : contents) {
            if (e instanceof Directory) {
                count++; // Directory counts as a file
                Directory d = (Directory) e;
                count += d.numberOfFiles();
            } else if (e instanceof File) {
                count++;
            }
        }
        return count;
    }

    public boolean deleteEntry(Entry entry) {
        return contents.remove(entry);
    }

    public void addEntry(Entry entry) {
        contents.add(entry);
    }

    protected List<Entry> getContents() {
        return contents;
    }

}

public class InmemoryFileSystem {

    public static void main(String[] args) {

    }
}
