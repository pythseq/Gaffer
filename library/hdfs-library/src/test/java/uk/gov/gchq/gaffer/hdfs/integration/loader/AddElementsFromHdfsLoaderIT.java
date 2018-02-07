/*
 * Copyright 2017 Crown Copyright
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package uk.gov.gchq.gaffer.hdfs.integration.loader;

import uk.gov.gchq.gaffer.data.element.Element;
import uk.gov.gchq.gaffer.hdfs.operation.AddElementsFromHdfs;
import uk.gov.gchq.gaffer.integration.impl.loader.AbstractLoaderIT;

public class AddElementsFromHdfsLoaderIT extends AbstractLoaderIT<AddElementsFromHdfs> {
    @Override
    protected void configure(final Iterable<? extends Element> elements) {
        // Empty
    }

    @Override
    protected AddElementsFromHdfs createOperation(final Iterable<? extends Element> elements) {
        return null;
    }
}