package cu.hl.kucoin.tracker.service;

import com.kucoin.sdk.rest.response.SymbolResponse;
import com.kucoin.sdk.rest.response.TickerResponse;

import java.io.IOException;
import java.util.List;

/**
 * @author hlicea
 * @since 9/6/2021
 */
public interface TrackingKucoinService {
    List<SymbolResponse> getSymbols() throws IOException;

    TickerResponse getTicker(String symbol) throws IOException;
}
