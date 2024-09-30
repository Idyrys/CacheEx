package kg.bakai.cacheex30_09_2024.controller;

import kg.bakai.cacheex30_09_2024.service.CacheService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    private final CacheService cacheService;

    public Controller(CacheService cacheService) {
        this.cacheService = cacheService;
    }

    @GetMapping
    public String getData(@RequestParam String lastName){
        return cacheService.getData(lastName);
    }

    @GetMapping("/getManual")
    public String getManualData(@RequestParam String lastName){
        return cacheService.getManualData(lastName);
    }

    @GetMapping("/update")
    public String update(@RequestParam String lastName){
        return cacheService.update(lastName);
    }


    @GetMapping("/evict")
    public void evict(){
        cacheService.evict();
    }
}
