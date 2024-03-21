package ut.com.atlassian.AdminPlugin;

import org.junit.Test;
import com.atlassian.AdminPlugin.api.MyPluginComponent;
import com.atlassian.AdminPlugin.impl.MyPluginComponentImpl;

import static org.junit.Assert.assertEquals;

public class MyComponentUnitTest
{
    @Test
    public void testMyName()
    {
        MyPluginComponent component = new MyPluginComponentImpl(null);
        assertEquals("names do not match!", "myComponent",component.getName());
    }
}