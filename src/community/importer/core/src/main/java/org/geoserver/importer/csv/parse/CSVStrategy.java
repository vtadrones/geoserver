/* Copyright (c) 2001 - 2013 OpenPlans - www.openplans.org. All rights reserved.
 * This code is licensed under the GPL 2.0 license, available at the root
 * application directory.
 */
package org.geoserver.importer.csv.parse;

import java.io.IOException;

import org.opengis.feature.simple.SimpleFeature;
import org.opengis.feature.simple.SimpleFeatureType;

public interface CSVStrategy {
    public SimpleFeatureType getFeatureType();

    public CSVIterator iterator() throws IOException;

    public SimpleFeature createFeature(String recordId, String[] csvRecord);
}
