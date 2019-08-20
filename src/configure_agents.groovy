import org.csanchez.jenkins.plugins.kubernetes.ContainerTemplate


ContainerTemplate createContainer(image) {
  ContainerTemplate container = new ContainerTemplate(image);
  return container
}
