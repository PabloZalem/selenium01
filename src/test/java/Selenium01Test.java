import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Selenium01Test {
    @Test
    void nothing(){
        /*
Esse é um setup básico de como a automação faz o acesso a um site na web.
Onde antes de acessarmos o site na web é necessário fazer a configuração de permissão e de inicialização da
automação, em seguida, criamos um objeto onde passaremos no argumento entre parenteses os requisitos de
acesso para acessarmos a página web, opós isso, utilizamos o recurso de consulta do objeto criado onde
visualizamos o acesso a web e por fim, encerramos o acesso.
         */

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://vsr.testbench.com/login");
    }
}