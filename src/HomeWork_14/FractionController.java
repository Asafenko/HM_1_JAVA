package HomeWork_14;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/fractions")
public class FractionController {

    @PostMapping("/checkProper")
    public boolean checkProperFraction(@RequestBody Fraction fraction) {
        return fraction.isProperFraction();
    }

    @PostMapping("/reduce")
    public Fraction reduceFraction(@RequestBody Fraction fraction) {
        // Логика для сокращения дроби
        // ...
        return reducedFraction;
    }

    @PostMapping("/add")
    public Fraction addFractions(@RequestBody Fraction fraction1, @RequestBody Fraction fraction2) {
        // Логика для сложения дробей
        // ...
        return resultFraction;
    }

    @PostMapping("/subtract")
    public Fraction subtractFractions(@RequestBody Fraction fraction1, @RequestBody Fraction fraction2) {
        // Логика для вычитания дробей
        // ...
        return resultFraction;
    }

    @PostMapping("/multiply")
    public Fraction multiplyFractions(@RequestBody Fraction fraction1, @RequestBody Fraction fraction2) {
        // Логика для умножения дробей
        // ...
        return resultFraction;
    }

    @PostMapping("/divide")
    public Fraction divideFractions(@RequestBody Fraction fraction1, @RequestBody Fraction fraction2) {
        // Логика для деления дробей
        // ...
        return resultFraction;
    }
}