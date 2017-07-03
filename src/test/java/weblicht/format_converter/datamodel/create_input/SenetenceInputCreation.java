/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weblicht.format_converter.datamodel.create_input;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.lappsgrid.serialization.lif.Annotation;
import weblicht.format_converter.datamodel.lif.annotation.xb.LifAnnotationInterpreter;

/**
 *
 * @author felahi
 */
public class SenetenceInputCreation {

    private String text = "Karen flew to New York.";
    private String urlType = "http://vocab.lappsgrid.org/Sentence";
    private List<LifAnnotationInterpreter> sentenceAnnotations = new ArrayList<LifAnnotationInterpreter>();

    public SenetenceInputCreation() {
        this.setSenetenceAnnotations();
    }

    private void setSenetenceAnnotations() {

        List<Annotation> annotations = this.setSentenceAnnotationList();
        for (Annotation annotation : annotations) {
            LifAnnotationInterpreter annotationInterpreter = new LifAnnotationInterpreter(annotation);
            sentenceAnnotations.add(annotationInterpreter);
        }
    }

    private List<Annotation> setSentenceAnnotationList() {
        List<Annotation> annotations = new ArrayList<Annotation>();
        Annotation annotation = setSenetenceAnnotation("s_0", new Long(0), new Long(23), urlType);
        annotations.add(annotation);
        return annotations;
    }

    private Annotation setSenetenceAnnotation(String senId, Long start, Long end, String urlType) {
        Map<String, String> map = new HashMap<String, String>();
        map.put("sentence", text);
        Annotation annotation = new Annotation();
        annotation.setId(senId);
        annotation.setStart(new Long(start));
        annotation.setEnd(new Long(end));
        annotation.setAtType(urlType);
        annotation.setFeatures(map);
        return annotation;
    }

    public List<LifAnnotationInterpreter> getSentenceAnnotations() {
        return sentenceAnnotations;
    }

}