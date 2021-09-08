package service;

import dao.CalculatorDAO;
import org.junit.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.extension.Extensions;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class CalculatorServiceTest {
    /**
    CalculatorDAO mockCalcDao = Mockito.mock(CalculatorDAO.class);
    Mockito.when(mockCalcDao.add(7,3)).thenReturn(10);
    Mockito.verify(mockCalcDao).add(7,3);
     **/
    //@Mock
   // CalculatorDAO mockCalcDao;
    //Using the static mock method
    CalculatorDAO mockCalcDao = Mockito.mock(CalculatorDAO.class);
    @Test
    public void mockExample(){
        CalculatorService calculatorService = new CalculatorServiceImpl(mockCalcDao);
        assertEquals(calculatorService.toString(),"Using calculator service");
    }

    @Test
    public void testQuery(){
        assertNotNull(mockCalcDao);
        when(mockCalcDao.isAvailable()).thenReturn(true);
        CalculatorService calculatorService = new CalculatorServiceImpl(mockCalcDao);
        boolean check = calculatorService.query("* from t");
        assertTrue(check);
    }
}
