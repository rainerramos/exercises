import org.junit.Assert
import org.junit.Test

class ReverseStringClass{

    @Test fun reverseUsingSB(){
        Assert.assertEquals("bs niltok", ("kotlin sb"))
    }

    @Test
    fun reverseUsingLoop(){
        Assert.assertEquals("pool niltok", reverseUsingLoop("kotlin loop"))
    }
}