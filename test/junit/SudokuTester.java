/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package junit;

import classes.Sudoku;
import org.junit.*;

/**
 *
 * @author shans
 */
public class SudokuTester {
    @Test
    public void testCreateSudoku() {
        
        Sudoku s = new Sudoku();
        Assert.assertNotNull(s);
    }
    
}
