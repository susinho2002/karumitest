import com.pickency.karumi.StringCalculator
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test

class StringCalculatorTest {

    private lateinit var stringCalculator : StringCalculator

    @Before
    fun setUp(){
        stringCalculator = StringCalculator()
    }


    @Test
    fun returnsZeroIfStringIsEmpty(){
        evaluateStringCalculator("", "" ,0)

    }
    

    @Test
    fun returnsTheNumberPassedAsParameterIfThereIsOnlyOne(){
        evaluateStringCalculator("11", "/n",11)


    }

    @Test
    fun returnsTheSumOfTheNumberSeparatedByComa(){
        evaluateStringCalculator("11,22","/n" ,33)

    }

    @Test
    fun returnsTheSumOfTheNumberSeparatedByComaToSmallNumbers(){
        evaluateStringCalculator("1/n2","/n", 3)

    }

    private fun evaluateStringCalculator(input : String, separator: String ,expectedResult: Int){
        val result = stringCalculator.add(input,separator)
        assertEquals(expectedResult, result )

    }
}