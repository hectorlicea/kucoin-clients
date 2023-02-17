package cu.hl.kucoin.tracker.controller;

import cu.hl.kucoin.tracker.service.TrackingKucoinService;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

/**
 * @author hlicea
 * @since 9/7/2021
 */
@RestController
@RequestMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE)
public class KucoinMarketController {

    private final TrackingKucoinService service;

    public KucoinMarketController(TrackingKucoinService service){
        this.service = service;
    }

    @GetMapping("/symbols")
    public ResponseEntity<Object> symbols() throws IOException {
        return ResponseEntity.ok(service.getSymbols());
    }

    @GetMapping("/ticker/{symbol}")
    public ResponseEntity<Object> ticker(@PathVariable String symbol) throws IOException {
        return ResponseEntity.ok(service.getTicker(symbol));
    }
}
