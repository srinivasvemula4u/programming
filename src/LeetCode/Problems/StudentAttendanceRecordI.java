/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetCode.Problems;

/**
 *
 * @author srivemul
 */
/*
You are given a string representing an attendance record for a student. 
The record only contains the following three characters:

'A' : Absent.
'L' : Late.
'P' : Present.
A student could be rewarded if his attendance record doesn't contain more than one 'A' (absent) or more than two continuous 'L' (late).

You need to return whether the student could be rewarded according to his attendance record.

Example 1:
Input: "PPALLP"
Output: True
Example 2:
Input: "PPALLL"
Output: False
 */
public class StudentAttendanceRecordI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }

    public boolean checkRecord(String s) {
        int absentCount = 0, lateCount = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'A') {
                absentCount++;
                if (absentCount > 1) {
                    return false;
                }
            } else if (i > 0 && s.charAt(i - 1) == s.charAt(i) && s.charAt(i) == 'L') {
                lateCount++;
                if (lateCount > 1) {
                    return false;
                }
            } else {
                lateCount = 0;
            }

        }
        return true;
    }

    boolean checkRecord2(String s) {
        return !s.matches(".*LLL.*|.*A.*A.*");
    }

}
