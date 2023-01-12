package guru.springframework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootWebApplication {

    @GetMapping("/welcome")
    public String welcome(){
        return "Welcome to first SpringBook Application";

    }
    public static void main(String[] args) {
        SpringApplication.run(SpringBootWebApplication.class, args);
    }
}

/* 
echo "# SpringCICD" >> README.md
git init
git add README.md
git commit -m "first commit"
git branch -M main
git remote add origin https://github.com/Arorian-Deepak/SpringCICD.git
git push -u origin main
*/