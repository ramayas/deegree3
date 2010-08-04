//$HeadURL$
package org.deegree.filter.function.geometry;

import java.util.List;

import org.deegree.commons.tom.TypedObjectNode;
import org.deegree.commons.tom.primitive.PrimitiveValue;
import org.deegree.feature.property.Property;
import org.deegree.filter.Expression;
import org.deegree.filter.FilterEvaluationException;
import org.deegree.filter.MatchableObject;
import org.deegree.filter.expression.Function;
import org.deegree.geometry.Geometry;
import org.deegree.geometry.multi.MultiPoint;
import org.deegree.geometry.primitive.Point;

/**
 * <code>IsPoint</code>
 * 
 * @author <a href="mailto:schmitz@lat-lon.de">Andreas Schmitz</a>
 * @author last edited by: $Author$
 * 
 * @version $Revision$, $Date$
 */
public class IsPoint extends Function {

    /**
     * @param exprs
     */
    public IsPoint( List<Expression> exprs ) {
        super( "IsPoint", exprs );
    }

    @Override
    public TypedObjectNode[] evaluate( MatchableObject f )
                            throws FilterEvaluationException {
        TypedObjectNode[] vals = getParams()[0].evaluate( f );

        if ( !( vals[0] instanceof Geometry ) && !( vals[0] instanceof Property )
             && !( ( (Property) vals[0] ).getValue() instanceof Geometry ) ) {
            throw new FilterEvaluationException( "The argument to the Is*** functions must be a geometry." );
        }
        Geometry geom = vals[0] instanceof Geometry ? (Geometry) vals[0] : (Geometry) ( (Property) vals[0] ).getValue();

        // TODO is handling of multi geometries like this ok?
        boolean isPoint = geom instanceof Point || geom instanceof MultiPoint;
        return new TypedObjectNode[] { new PrimitiveValue( Boolean.valueOf( isPoint ).toString() ) };
    }
}
