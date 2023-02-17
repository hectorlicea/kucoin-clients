package cu.hl.kucoin.tracker.service;

import com.kucoin.sdk.KucoinRestClient;
import com.kucoin.sdk.rest.response.SymbolResponse;
import com.kucoin.sdk.rest.response.TickerResponse;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.io.IOException;
import java.util.List;

/**
 * @author hlicea
 * @since 9/6/2021
 */
@Service
public class TrackingKucoinServiceImpl implements TrackingKucoinService{

    private final KucoinRestClient restClient;

    public TrackingKucoinServiceImpl(KucoinRestClient restClient){
        this.restClient = restClient;
    }


    @Override
    public List<SymbolResponse> getSymbols() throws IOException {
        return restClient.symbolAPI().getSymbols();
    }

    @Override
    public TickerResponse getTicker(String symbol) throws IOException {
        Assert.notNull(symbol, "El symbolo no puede ser null");

        return restClient.symbolAPI().getTicker(symbol.toUpperCase());
    }
}
