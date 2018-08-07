/**
 * generated by Xtext 2.12.0
 */
package de.fraunhofer.ipa.ros.xtext.formatting2;

import com.google.inject.Inject;
import de.fraunhofer.ipa.ros.xtext.services.RosGrammarAccess;
import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.formatting2.AbstractFormatter2;
import org.eclipse.xtext.formatting2.IFormattableDocument;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.xbase.lib.Extension;
import ros.Artifact;
import ros.Node;
import ros.SpecBase;

@SuppressWarnings("all")
public class RosFormatter extends AbstractFormatter2 {
  @Inject
  @Extension
  private RosGrammarAccess _rosGrammarAccess;
  
  protected void _format(final ros.Package _package, @Extension final IFormattableDocument document) {
    EList<SpecBase> _spec = _package.getSpec();
    for (final SpecBase specBase : _spec) {
      document.<SpecBase>format(specBase);
    }
    EList<Artifact> _artifact = _package.getArtifact();
    for (final Artifact artifact : _artifact) {
      document.<Artifact>format(artifact);
    }
  }
  
  protected void _format(final Artifact artifact, @Extension final IFormattableDocument document) {
    document.<Node>format(artifact.getNode());
  }
  
  public void format(final Object artifact, final IFormattableDocument document) {
    if (artifact instanceof XtextResource) {
      _format((XtextResource)artifact, document);
      return;
    } else if (artifact instanceof Artifact) {
      _format((Artifact)artifact, document);
      return;
    } else if (artifact instanceof ros.Package) {
      _format((ros.Package)artifact, document);
      return;
    } else if (artifact instanceof EObject) {
      _format((EObject)artifact, document);
      return;
    } else if (artifact == null) {
      _format((Void)null, document);
      return;
    } else if (artifact != null) {
      _format(artifact, document);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(artifact, document).toString());
    }
  }
}
