/*
 * Copyright 2018 Crown Copyright
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
package uk.gov.gchq.gaffer.operation.function;

import uk.gov.gchq.gaffer.data.element.id.EntityId;
import uk.gov.gchq.koryphe.Since;
import uk.gov.gchq.koryphe.function.KorypheFunction;


/**
 * A {@code FromEntityId} takes an {@link EntityId} and unwraps the vertex.
 */
@Since("1.3.0")
public class FromEntityId extends KorypheFunction<EntityId, Object> {
    @Override
    public Object apply(final EntityId e) {
        if (null == e) {
            return null;
        }
        return e.getVertex();
    }
}
