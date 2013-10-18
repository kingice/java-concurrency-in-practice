/**
 * 
 */
package ro.tatacalu.jcip.ch03;

import java.io.IOException;
import java.math.BigInteger;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import ro.tatacalu.jcip.annotations.ThreadSafe;

/**
 * Caching the last result using a volatile reference to an immutable holder object.
 * 
 * @author tatacalu
 * 
 */
@ThreadSafe
public class VolatileCachedFactorizer implements Servlet {

    private volatile OneValueCache cache = new OneValueCache(null, null);

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        BigInteger i = extractFromRequest(req);
        BigInteger[] factors = cache.getFactors(i);
        if (factors == null) {
            factors = factor(i);
            cache = new OneValueCache(i, factors);
        }
        encodeIntoResponse(res, factors);
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
