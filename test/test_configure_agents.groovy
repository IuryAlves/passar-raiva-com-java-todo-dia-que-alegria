import org.csanchez.jenkins.plugins.kubernetes.ContainerTemplate
import org.junit.*
import org.junit.runner.RunWith
import org.mockito.Mock
import org.powermock.api.mockito.PowerMockito
import com.lesfurets.jenkins.unit.BasePipelineTest
import org.powermock.core.classloader.annotations.PowerMockIgnore
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner


@RunWith(PowerMockRunner.class)
@PowerMockIgnore(["com.sun.org.apache.xerces.*", "javax.xml.*", "org.xml.*"])
@PrepareForTest([ContainerTemplate.class])
class CreateContainerTest extends BasePipelineTest {

    @Mock

    ContainerTemplate mockContainer

    @Test
    void testCreateContainer() {

        PowerMockito.whenNew(ContainerTemplate.class).withAnyArguments().thenReturn(mockContainer)
        def configureAgents = new configure_agents()
        configureAgents.createContainer('java')

    }
}
