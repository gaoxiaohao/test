package template;

/**
 * @author gxh
 */
public class TemplateA extends Template{

    int sum =0;
    int number=100000;
    @Override
    public void job() {
        for (int i = 0; i < number; i++) {
            sum+=i;
        }
    }
}
