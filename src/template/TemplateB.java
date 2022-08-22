package template;

/**
 * @author gxh
 */
public class TemplateB  extends Template{
    int sum =0;
    int number=800000;
    @Override
    public void job() {
        for (int i = 0; i < number; i++) {
            sum+=i;
        }
    }
}
