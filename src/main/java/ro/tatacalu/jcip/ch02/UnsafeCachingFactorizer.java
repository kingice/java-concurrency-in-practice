/**
 * 
 */
package ro.tatacalu.jcip.ch02;

import java.io.IOException;
import java.math.BigInteger;
import java.util.concurrent.atomic.AtomicReference;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import ro.tatacalu.jcip.ch02.annotations.NotThreadSafe;

/**
 * @author tatacalu
 * 
 */
@NotThreadSafe
public class UnsafeCachingFactorizer implements Servlet {

    private final AtomicReference<BigInteger>   lastNumber  = new AtomicReference<BigInteger>();
    private final AtomicReference<BigInteger[]> lastFactors = new AtomicReference<BigInteger[]>();

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        BigInteger i = extractFromRequest(req);
        if (i.equals(lastNumber.get()))
            encodeIntoResponse(res, lastFactors.get());
        else {
            BigInteger[] factors = factor(i);
            lastNumber.set(i);
            lastFactors.set(factors);
            encodeIntoResponse(res, factors);
        }
    }

    // ---------- START Dummy Methods ------------------------------------------
    private BigInteger extractFromRequest(ServletRequest req) {
        return BigInteger.valueOf(10L);
    }

    private BigInteger[] factor(BigInteger input) {

        BigInteger[] ret = new BigInteger[2];

        ret[0] = BigInteger.valueOf(2L);
        ret[1] = BigInteger.valueOf(5L);

        return ret;
    }

    private void encodeIntoResponse(ServletResponse res, BigInteger[] factors) {
    }

    // ---------- END Dummy Methods ------------------------------------------

    // -------------------------------------------------------------------------

    @Override
    public void init(ServletConfig config) throws ServletException {
    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {
    }

}
