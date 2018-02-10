/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Luis
 */
public class SortTest {
    
    public SortTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getDatos method, of class Sort.
     */
    @Test
    public void testGetDatos() {
        System.out.println("getDatos");
        Sort instance = new Sort();
        int[] expResult = {1,0,8,27,9};
        int[] result = instance.getDatos();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setDatos method, of class Sort.
     */
    @Test
    public void testSetDatos() {
        System.out.println("setDatos");
        int[] datos = {1,0,8,27,9};
        Sort instance = new Sort();
        instance.setDatos(datos);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of llenar method, of class Sort.
     */
    @Test
    public void testLlenar() {
        System.out.println("llenar");
        String texto = "";
        Sort instance = new Sort();
        instance.llenar(texto);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of bubbleSort method, of class Sort.
     */
    @Test
    public void testBubbleSort() {
        System.out.println("bubbleSort");
        int[] datos ={1,0,8,27,9};
        Sort instance = new Sort();
        instance.bubbleSort(datos);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of gnomeSort method, of class Sort.
     */
    @Test
    public void testGnomeSort() {
        System.out.println("gnomeSort");
        int[] datos = {1,0,8,27,9};
        Sort.gnomeSort(datos);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of merge method, of class Sort.
     */
    @Test
    public void testMerge() {
        System.out.println("merge");
        int[] datos ={1,0,8,27,9};
        int l = 0;
        int m = 0;
        int r = 0;
        Sort instance = new Sort();
        instance.merge(datos, l, m, r);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of sortMERGE method, of class Sort.
     */
    @Test
    public void testSortMERGE() {
        System.out.println("sortMERGE");
        int[] arr = {1,0,8,27,9};
        int l = 0;
        int r = 0;
        Sort instance = new Sort();
        instance.sortMERGE(arr, l, r);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of radixSort method, of class Sort.
     */
    @Test
    public void testRadixSort() {
        System.out.println("radixSort");
        Sort instance = new Sort();
        instance.radixSort();
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of partition method, of class Sort.
     */
    @Test
    public void testPartition() {
        System.out.println("partition");
        int[] datos = {1,0,8,27,9};
        int left = 0;
        int right = 0;
        Sort instance = new Sort();
        int expResult = 0;
        int result = instance.partition(datos, left, right);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of quickSort method, of class Sort.
     */
    @Test
    public void testQuickSort() {
        System.out.println("quickSort");
        int left = 0;
        int right = 0;
        Sort instance = new Sort();
        instance.quickSort(left, right);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
